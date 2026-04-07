public interface BookingRespositoryInterface {
    
    // Users
    public List<User> getUsers(String userId) {}
    public User getUserDetails(String userId) {}
    public void saveUser(String userId, User user) {}

    // Movies
    public Movie getMovieDetails(String movieId) {}
    public void saveMovie(String movieId, Movie movie) {}

    // Theaters
    public Theater getTheaterDetails(String theaterId) {}
    public void saveTheater(String theaterId, Theater theater) {}

    // Shows
    public Show getShowDetails(String showId) {}
    public void saveShow(String showId, Show show) {}

    // Bookings
    public Booking getBookings(String bookingId) {}
    public void saveBooking(String bookingId, Booking usebookingr) {}

    // PaymentDetails
    public Payment getPaymentDetails(String paymentId) {}
    public void savePaymentDetail(String paymentId, Payment payment) {}
    
    
}