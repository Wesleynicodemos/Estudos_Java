package application;

import java.time.LocalDateTime;

import entities.Post;
import entities.Comment;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDateTime dateTime = LocalDateTime.of(2025, 8, 30, 10, 44, 0);
        String title = "Aprendendo Java";
        String content = "Está sendo legal.";
        int likes = 12;
        Comment comment = new Comment("Que massa, mano");

        Post post = new Post(dateTime, content, title, likes); 

        Comment  newComment = new Comment("Boa Sorte! XD");

        post.addComment(comment);
        post.addComment(newComment);

        System.out.println(post);

       


        

    }
}
