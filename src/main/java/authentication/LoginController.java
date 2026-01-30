package authentication;

import util.AlertUtil;
import util.ValidationUtil;
import util.DatabaseChecker;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (!ValidationUtil.isValidUsername(username)) {
            AlertUtil.showError("Username is required!");
            return;
        }

        if (!ValidationUtil.isValidPassword(password)) {
            AlertUtil.showError("Password must be at least 4 characters!");
            return;
        }

        boolean authenticated = DatabaseChecker.checkCredentials(username, password);

        if (authenticated) {
            String role = DatabaseChecker.getUserRole(username);
            AlertUtil.showInfo("Login successful. Role: " + role);
        } else {
            AlertUtil.showError("Invalid username or password!");
        }
    }
}
