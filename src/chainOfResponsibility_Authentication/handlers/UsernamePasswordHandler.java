package chainOfResponsibility_Authentication.handlers;

import chainOfResponsibility_Authentication.models.AuthenticationRequest;

/**
 *  Author: Thalys Henrique
 *  LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 *
 *  Authentication System App
 */

public class UsernamePasswordHandler extends AuthenticationHandler {

    private String usernameIsValid;
    private String isPassword;

    public UsernamePasswordHandler(String isUsername, String isPassword) {
        this.usernameIsValid = isUsername;
        this.isPassword = isPassword;
    }

    @Override
    protected boolean isAuthenticate(AuthenticationRequest authenticationRequest) {
        if(authenticationRequest.getUsername().equals(usernameIsValid)
                && authenticationRequest.getPassword().equals(isPassword)){
            return true;
        }
        return false;
    }

    @Override
    protected void doAuthenticate(AuthenticationRequest authenticationRequest) {
        System.out.println("User is authenticated!");
    }

    public String getUsernameIsValid() {
        return usernameIsValid;
    }

    public void setUsernameIsValid(String usernameIsValid) {
        this.usernameIsValid = usernameIsValid;
    }

    public String getIsPassword() {
        return isPassword;
    }

    public void setIsPassword(String isPassword) {
        this.isPassword = isPassword;
    }
}
