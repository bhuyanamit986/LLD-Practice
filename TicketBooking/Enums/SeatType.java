enum SeatType {
    REGULAR(200),
    PLATINUM(250),  
    GOLD(350);

    private int price;

    public SeatType(int price) {
        this.price = price;
    }

    public getSeatPrice() {
        return price;
    }
}