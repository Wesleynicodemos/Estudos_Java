package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime dateAndTime;
    private String content;
    private Integer likes;
    private String title; 
    private Comment comment;

    DateTimeFormatter dateAndTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    List<Comment> comments = new ArrayList<>();

    public Post () {

    }

    public Post (LocalDateTime dateAndTime, String content, String title, Integer likes) {
        this.dateAndTime = dateAndTime;
        this.content = content;
        this.likes = likes;
        this.title = title;
    }

    public LocalDateTime getDateAndTime () {
        return dateAndTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Comment getComment() {
        return comment;
    }

    public void addComment (Comment comment) {
        comments.add(comment);
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();

      sb.append(title + "\n");
      sb.append(likes);
      sb.append(" likes - ");
      sb.append(dateAndTime.format(dateAndTimeFormatter) + "\n");
      sb.append(content + "\n");
      sb.append("comments:" + "\n");
      for (Comment comment : comments) {
        sb.append (comment.getComment() + "\n");
      }
      return sb.toString();

    }

}
