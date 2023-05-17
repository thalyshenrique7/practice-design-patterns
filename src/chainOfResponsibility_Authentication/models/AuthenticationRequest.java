package chainOfResponsibility_Authentication.models;

/**
 *  Author: Thalys Henrique
 *  LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 *
 *  Authentication System App
 */

public class AuthenticationRequest {

    private String username;
    private String password;

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
