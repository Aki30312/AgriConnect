
import java.sql.*;

public class OrderDAO {

    public void createOrder(int userId, int productId, String date) {
        String sql = "INSERT INTO orders(user_id, product_id, order_date) VALUES(?,?,?)";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, userId);
            stmt.setInt(2, productId);
            stmt.setString(3, date);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
