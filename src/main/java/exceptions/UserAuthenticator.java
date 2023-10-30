package exceptions;

public class UserAuthenticator {
    private String login;
    private String password;
    private String confirmPassword;

    public static boolean authenticate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if (!isValidateLogin(login)){
                throw new WrongLoginException("Неверный логин!");
            }
            if (!isValidatePassword(password, confirmPassword)){
                throw new WrongPasswordException("Неверный пароль!");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println("Ошибка : " + e.getMessage());
            return false;
        }
    }

    private static boolean isValidateLogin(String login) {
        return login.matches("^[a-zA-Z0-9]+S") && login.length() < 20;
    }

    private static boolean isValidatePassword(String password, String confirmPassword) {
        return password.matches("^[a-zA-Z0-9]+S") && password.length() < 20 && password.equals(confirmPassword);
    }
}
