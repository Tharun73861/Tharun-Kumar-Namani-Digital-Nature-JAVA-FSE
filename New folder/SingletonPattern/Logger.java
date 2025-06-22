public class Logger {

    // Step 2: Private static instance of the same class
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Sample log method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
