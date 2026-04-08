import java.util.Optional;

interface SeatLockManagerInterface {
    boolean lockSeat(String seatId, String showId, String userId);
    void unlockSeat(String seatId, String showId, String userId);
    boolean isLocked(String seatId, String showId);
    Optional<String> getLockedBy(String seatId, String showId);
}