package TicketBooking.Entities;
import java.time.Instant;

class SeatlockDetail {
    String seatId;
    String userId;
    private Instant expireTime;

    public SeatlockDetail(String seatId, String userId, Instant expireTime) {
        this.seatId = seatId;
        this.userId = userId;
        this.expireTime = expireTime;
    }

    public boolean isExpired() {
        return Instant.now().isAfter(expireTime);
    }


}