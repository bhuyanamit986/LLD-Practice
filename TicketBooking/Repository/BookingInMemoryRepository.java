public class BookingInMemoryRepository implements BookingRespositoryInterface {
    private ConncurrentHashMap<String, User> users = new ConncurrentHashMap<>();
    private ConcurrentHashMap<String, Movie> movies = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Theaters> theaters = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Show> shows = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, List<Booking>> bookings = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Payment> payments = new ConcurrentHashMap<>();

    // Users
    public List<User> getUsers() {
        return users.keySet().stream().collect(Collectors.toList());
    }

    public User getUserDetails(userId) {
        return users.get(userId);
    }

    public void saveUser(String userId, User user) {
        users.put(userId, user);
    }

    // Movies
    public Movie getMovieDetails(String movieId) {
        return movies.get(movieId);  
    }
    public void saveMovie(String movieId, User user) {
        return movies.put(movieId, user);
    }

    // Theaters
    public Theater getTheaterDetails(String theaterId) {
        return theaters.get(theaterId);
    }
    public void saveTheater(String theaterId, Theater theater) {
        theaters.put(theaterId, theater);
    }

    // Shows
    public Show getShowDetails(String showId) {
        return shows.get(showId);
    }
    public void saveShow(String showId, Show show) {
        shows.put(showId, show)
    }

    // Bookings
    public Booking getBookingDetails(String bookingId) {
        return bookings.get(bookingId);
    }
    public void saveBooking(String bookingId, Booking booking) {
        bookings.put(bookingId, booking)
    }

    // PaymentDetails
    public Payment getPaymentDetails(String paymentId) {
        return payments.get(paymentId);
    }
    public void savePaymentDetail(String paymentId, Payment payment) {
        payments.put(paymentId, payment);
    }
}