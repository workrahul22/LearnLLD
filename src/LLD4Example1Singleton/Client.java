package LLD4Example1Singleton;

public class Client {

    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // another way to use singleton
        DatabaseConnectionEnum db3 = DatabaseConnectionEnum.INSTANCE;
        DatabaseConnectionEnum db4 = DatabaseConnectionEnum.INSTANCE;
    }
}
