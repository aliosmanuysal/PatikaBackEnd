import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static final String DB_URL ="jdbc:mysql://localhost/jdbcdatabase";
    public static final String DB_USERNAME="root";
    public static final String DB_PASSWORD ="mysql";


    public static void main(String[] args) {
        Connection connection = null;
        String sql= "SELECT * FROM employees";
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("ID : " + resultSet.getInt("id"));
                System.out.println("AD : "+ resultSet.getString("name"));
                System.out.println("Position : "+resultSet.getString("position"));
                System.out.println("Salary : " +resultSet.getInt("salary"));
                System.out.println("--------------------------");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}