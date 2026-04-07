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

    public void saveUser(User user) {
        users.put(user.id, user);
    }

    // Movies
    public Movie getMovieDetails(String movieId) {
        return movies.get(movieId);  
    }
    public void saveMovie(User user) {
        return movies.put(movie.id, user);
    }

    // Theaters
    public Theater getTheaterDetails(String theaterId) {
        return theaters.get(theaterId);
    }
    public void saveTheater(Theater theater) {
        theaters.put(theater.id, theater);
    }

    // Shows
    public Show getShowDetails(String showId) {
        return shows.get(showId);
    }
    public void saveShow(Show show) {
        shows.put(show.id, show)
    }

    // Bookings
    public Booking getBookingDetails(String bookingId) {
        return bookings.get(bookingId);
    }
    public void saveBooking(Booking booking) {
        bookings.put(booking.id, booking)
    }

    // PaymentDetails
    public Payment getPaymentDetails(String paymentId) {
        return payments.get(paymentId);
    }
    public void savePaymentDetail(Payment payment) {
        payments.put(payment.id, payment);
    }
}