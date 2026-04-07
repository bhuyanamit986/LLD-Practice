public interface BookingRespositoryInterface {
    
    // Users
    public List<User> getUsers(String userId) {}
    public User getUserDetails(String userId) {}
    public void saveUser(User user) {}

    // Movies
    public Movie getMovieDetails(String movieId) {}
    public void saveMovie(Movie movie) {}

    // Theaters
    public Theater getTheaterDetails(String theaterId) {}
    public void saveTheater(Theater theater) {}

    // Shows
    public Show getShowDetails(String showId) {}
    public void saveShow(Show show) {}

    // Bookings
    public Booking getBookings(String bookingId) {}
    public void saveBooking(Booking booking) {}

    // PaymentDetails
    public Payment getPaymentDetails(String paymentId) {}
    public void savePaymentDetail(Payment payment) {}
    
    
}