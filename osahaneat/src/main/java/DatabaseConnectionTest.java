import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/osahaneat";
        String username = "root";
        String password = "";

        try {
            // Thử kết nối đến cơ sở dữ liệu
            Connection connection = DriverManager.getConnection(url, username, password);

            // Nếu không có ngoại lệ, kết nối thành công
            System.out.println("Kết nối đến cơ sở dữ liệu thành công.");

            // Đóng kết nối
            connection.close();
        } catch (SQLException e) {
            // Nếu có ngoại lệ, in ra thông báo lỗi
            System.out.println("Lỗi khi kết nối đến cơ sở dữ liệu: " + e.getMessage());
        }
    }
}
