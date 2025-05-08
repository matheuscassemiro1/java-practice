package javacore.nelio.exercicios.poo.demoStringBuilder.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private int likes;
    private List<Comment> comment = new ArrayList<>();

    private static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Post(Date moment, String title, String content, int likes, List<Comment> comment) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.comment.addAll(comment);
    }

    public Date getDate() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(this.getTitle())
                .append('\n')
                .append(this.getLikes())
                .append(" Likes - ")
                .append(formatoData.format(getDate()))
                .append("\n")
                .append("Comments: \n");
                for (Comment c : getComment()){
                    retorno.append(c.getText())
                            .append("\n");
                }
        return retorno.toString();
    }

    public int getLikes() {
        return likes;
    }

    public List<Comment> getComment() {
        return comment;
    }
}
