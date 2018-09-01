/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smstoolsgui;

/**
 *
 * @author ramazan
 */
public class Message {
    private String sender,message;

    public Message(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public Message() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return sender + " - "+ message.substring(0, 5);
    }
    
}
