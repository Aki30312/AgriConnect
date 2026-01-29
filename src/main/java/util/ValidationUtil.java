package util;

public class ValidationUtil {

        // Check if username is valid (non-empty)
        public static boolean isValidUsername(String username) {
            return username != null && !username.trim().isEmpty();
        }

        // Check if password is valid (length >= 4)
        public static boolean isValidPassword(String password) {
            return password != null && password.length() >= 4;
        }

        // Validate email format
        public static boolean isValidEmail(String email) {
            return email != null && email.contains("@") && email.contains(".");
        }
    }


