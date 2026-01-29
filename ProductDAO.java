import java.sql.*;

public class ProductDAO {

    public void addProduct(String name, double price, int quantity) {
        String sql = "INSERT INTO products(name, price, quantity) VALUES(?,?,?)";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setDouble(2, price);
            stmt.setInt(3, quantity);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getProducts() {
        String sql = "SELECT * FROM products";
        try {
            Connection conn = DatabaseConnection.connect();
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
