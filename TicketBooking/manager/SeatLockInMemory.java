import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import TicketBooking.Entities.SeatLockDetail;

class SeatLockInMemory implements SeatLockManagerInterface {
    private Map<String, Map<String, SeatLockDetail>> seatLocks = new ConcurrentHashMap<>();
    private long lockDuration;

    public SeatLockInMemory(long lockDuration) {
        this.lockDuration = lockDuration;
    }

    @Override
    public boolean lockSeat(String seatId, String showId, String userId) {
        Seat seat = bookingRepository.getSeatDetails(seatId);
        if(seat.status == SeatStatus.BOOKED) {
            return false; // Seat already booked
        }
        Map<String, SeatLockDetail> locksForSeat = seatLocks.computeIfAbsent(showId, k -> new ConcurrentHashMap<>());
        synchronized (locksForSeat) {
            if(locksForSeat.containsKey(seatId)) {
                SeatLockDetail existingLock = locksForSeat.get(seatId);
                if(!existingLock.isExpired()) {
                    return false; // Seat is currently locked by another user
                }
            }
            SeatLockDetail lockDetail = new SeatLockDetail(seatId, userId, Instant.now().plusSeconds(lockDuration));
            locksForSeat.put(seatId, lockDetail);
            return true;
        }
        seatLocks.put(showId, locksForSeat);
    }

    @Override
    public void unlockSeat(String seatId, String showId, String userId) {
        Map<String, SeatLockDetail> lockedSeats = seatLocks.get(showId);
        synchronized(lockedSeats) {
            SeatLockDetail currentLockedSeat = lockedSeats.get(seatId);
            if(!currentLockedSeat.userId.equals(userId)) {
                throw new IllegalArgumentException("Seat is locked by another user");
            }
            lockedSeats.remove(seatId);
        }
    }

    @Override
    public isLocked(String seatId, String showId) {
        Map<String, SeatLockDetail> lockedSeats = seatLocks.get(showId);
        return lockedSeats.containsKey(showId);
    }
}