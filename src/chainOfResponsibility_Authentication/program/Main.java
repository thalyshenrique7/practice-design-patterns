package chainOfResponsibility_Authentication.program;

import chainOfResponsibility_Authentication.handlers.AuthenticationHandler;
import chainOfResponsibility_Authentication.handlers.BiometricAuthHandler;
import chainOfResponsibility_Authentication.handlers.TwoFactorAuthHandler;
import chainOfResponsibility_Authentication.handlers.UsernamePasswordHandler;
import chainOfResponsibility_Authentication.models.AuthenticationRequest;

/**
 *  Author: Thalys Henrique
 *  LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 *
 *  Authentication System App
 */

public class Main {
    public static void main(String[] args) {


        AuthenticationHandler usernamePasswordHandler = new UsernamePasswordHandler("jackboy", "123");
        AuthenticationHandler twoFactorAuthHandler = new TwoFactorAuthHandler("jackboy", "123");
        AuthenticationHandler biometricAuthHandler = new BiometricAuthHandler("jackboy");

        usernamePasswordHandler.setNextHandler(twoFactorAuthHandler);
        twoFactorAuthHandler.setNextHandler(biometricAuthHandler);

        AuthenticationRequest authenticationRequest = new AuthenticationRequest("jackboy", "123");

        usernamePasswordHandler.authenticate(authenticationRequest);

    }
}
