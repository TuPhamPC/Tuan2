package singleton;
// Ví dụ sử dụng Singleton Pattern để tạo một đối tượng Logger trong 1 ứng dụng
public class Logger {
    private static Logger instance;
    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}