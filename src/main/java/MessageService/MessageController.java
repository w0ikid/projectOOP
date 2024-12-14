package MessageService;

import java.util.List;
import java.util.ArrayList;

public class MessageController {

    private List<String> messages;

    public MessageController() {
        this.messages = new ArrayList<>();
    }

    public List<String> getMessages() {
        return this.messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public void addMessage(String message) {
        this.messages.add(message);
    }

    public void removeMessage(String message) {
        this.messages.remove(message);
    }

    public void displayMessages() {
        if (messages.isEmpty()) {
            System.out.println("Нет сообщений.");
        } else {
            for (String message : messages) {
                System.out.println(message);
            }
        }
    }

    public String getMessageByIndex(int index) {
        if (index >= 0 && index < messages.size()) {
            return messages.get(index);
        } else {
            return "Сообщение не найдено.";
        }
    }

    public void clearMessages() {
        this.messages.clear();
    }

    public void getMessageCount() {
        System.out.println("Количество сообщений: " + messages.size());
    }
}
