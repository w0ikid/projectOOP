package MessageService;

import core.model.User;

public class Message {
    
    private User sender;
    private User receiver;
    private String content;
    
    public User getSender() {
        return this.sender;
    }
    
    public void setSender(User sender) {
        this.sender = sender;
    }
    
    public User getReceiver() {
        return this.receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
    
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
