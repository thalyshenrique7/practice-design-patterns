package chainOfResponsibility_Authentication.handlers;

import chainOfResponsibility_Authentication.models.AuthenticationRequest;

/**
 *  Author: Thalys Henrique
 *  LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 *
 *  Authentication System App
 */

public class BiometricAuthHandler extends AuthenticationHandler {

    private boolean fingerIsValid = false;
    private String usernameIsValid;

    public BiometricAuthHandler(String usernameIsValid) {
        this.usernameIsValid = usernameIsValid;
    }

    @Override
    protected boolean isAuthenticate(AuthenticationRequest authenticationRequest) {
        if(authenticationRequest.getUsername().equals(usernameIsValid)){
            fingerIsValid = true;
            return fingerIsValid;
        }
        return false;
    }

    @Override
    protected void doAuthenticate(AuthenticationRequest authenticationRequest) {
        System.out.println("Biometric is valid and user was authenticated!");
    }

    public boolean isFingerIsValid() {
        return fingerIsValid;
    }

    public String getUsernameIsValid() {
        return usernameIsValid;
    }
}
