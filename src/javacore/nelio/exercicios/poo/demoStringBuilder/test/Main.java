package javacore.nelio.exercicios.poo.demoStringBuilder.test;

import javacore.nelio.exercicios.poo.demoStringBuilder.domain.Comment;
import javacore.nelio.exercicios.poo.demoStringBuilder.domain.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/*
Treino com StringBuilder através do desafio proposto pelo curso de Java do Nélio Alves
 */

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:s");
        List<Comment> firstPostComments = new ArrayList<>(
                List.of(new Comment("Have a nice trip"),
                        new Comment("Wow that's awesome!")));
        Post post1 = new Post(
                formato.parse("2018-06-21 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wornderful country!",
                12, firstPostComments);

        List<Comment> secondPostComments = new ArrayList<>(
                List.of(new Comment("Good night"),
                        new Comment("May the force be with you")));
        Post post2 = new Post(
                formato.parse("2018-07-28 23:14:19"),
                "Good night guys", "See you tomorrow",
                5, secondPostComments);

        System.out.println(post1);
        System.out.println(post2);
    }
}
