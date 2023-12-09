package LLD4Example1Singleton;

public class DatabaseConnection {
    private static DatabaseConnection INSTANCE = null;
    private DatabaseConnection(){}

    public static DatabaseConnection getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DatabaseConnection();
        }
        return INSTANCE;
    }
}
