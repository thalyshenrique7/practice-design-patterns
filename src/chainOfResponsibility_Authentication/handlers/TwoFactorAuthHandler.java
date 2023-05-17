package chainOfResponsibility_Authentication.handlers;

import chainOfResponsibility_Authentication.models.AuthenticationRequest;

/**
 *  Author: Thalys Henrique
 *  LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 *
 *  Authentication System App
 */

public class TwoFactorAuthHandler extends AuthenticationHandler {

    private String usernameTwoFactor;
    private String passwordTwoFactor;

    public TwoFactorAuthHandler(String usernameTwoFactor, String passwordTwoFactor) {
        this.usernameTwoFactor = usernameTwoFactor;
        this.passwordTwoFactor = passwordTwoFactor;
    }

    @Override
    protected boolean isAuthenticate(AuthenticationRequest authenticationRequest) {
        if(authenticationRequest.getUsername().equals(usernameTwoFactor)
                && authenticationRequest.getPassword().equals(passwordTwoFactor)){
            return true;
        }
        return false;
    }

    @Override
    protected void doAuthenticate(AuthenticationRequest authenticationRequest) {
        System.out.println("Two factor auth is valid and user was authenticated successful!");
    }

    public String getUsernameTwoFactor() {
        return usernameTwoFactor;
    }

    public void setUsernameTwoFactor(String usernameTwoFactor) {
        this.usernameTwoFactor = usernameTwoFactor;
    }

    public String getPasswordTwoFactor() {
        return passwordTwoFactor;
    }

    public void setPasswordTwoFactor(String passwordTwoFactor) {
        this.passwordTwoFactor = passwordTwoFactor;
    }
}
