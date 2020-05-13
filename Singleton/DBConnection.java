package Singleton;

public class DBConnection {
    
    private static DBConnection connection;

    private DBConnection(){}
    public static DBConnection getInstance(){
        if ( connection == null){
            connection = new DBConnection();
        }
        return connection;
    }
}