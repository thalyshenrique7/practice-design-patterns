package singletonPattern.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Thalys Henrique
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 * Singleton Pattern
 */

public class Logger {

    private static Logger instance;
    private List<String> logMessages;

    public Logger() {
        logMessages = new ArrayList<>();
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void addMessageList(String message){
        logMessages.add(message);
    }

    public List<String> getAllMessages() {
        return logMessages;
    }
}
