package NewsService;

public class NewsDetails {

    private String content;
    private String author;
    private String publishDate;

    public NewsDetails(String content, String author, String publishDate) {
        this.content = content;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getFullDetails() {
        return "Автор: " + this.author + "\n" +
               "Дата публикации: " + this.publishDate + "\n" +
               "Содержание: " + this.content;
    }
}
