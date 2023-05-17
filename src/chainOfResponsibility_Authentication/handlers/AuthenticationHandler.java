package chainOfResponsibility_Authentication.handlers;

import chainOfResponsibility_Authentication.models.AuthenticationRequest;

/**
 *  Author: Thalys Henrique
 *  LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 *
 *  Authentication System App
 */

public abstract class AuthenticationHandler {

    private AuthenticationHandler nextHandler;
    protected abstract boolean isAuthenticate(AuthenticationRequest authenticationRequest);
    protected abstract void doAuthenticate(AuthenticationRequest authenticationRequest);

    public void authenticate(AuthenticationRequest authenticationRequest){
        if(isAuthenticate(authenticationRequest)){
            doAuthenticate(authenticationRequest);
        } else if(nextHandler != null){
            nextHandler.authenticate(authenticationRequest);
        } else {
            System.out.println("Authentication Handler not found");
        }
    }

    public void setNextHandler(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
