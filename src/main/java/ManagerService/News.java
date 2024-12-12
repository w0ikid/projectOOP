package ManagerService;

import java.util.List;
import java.util.ArrayList;

public class News {

    private List<String> newList;
    
    public News() {
        this.newList = new ArrayList<>();
    }

    public List<String> getNewList() {
        return this.newList;
    }
    
    public void setNewList(List<String> newList) {
        this.newList = newList;
    }

    public void addNews(String news) {
        this.newList.add(news);
    }

    public void removeNews(String news) {
        this.newList.remove(news);
    }

    public String getLatestNews() {
        if (newList.isEmpty()) {
            return "Нет новостей.";
        }
        return newList.get(newList.size() - 1);
    }

    public void clearNews() {
        this.newList.clear();
    }

    public void displayNews() {
        if (newList.isEmpty()) {
            System.out.println("Нет новостей для отображения.");
        } else {
            for (String news : newList) {
                System.out.println(news);
            }
        }
    }
}
