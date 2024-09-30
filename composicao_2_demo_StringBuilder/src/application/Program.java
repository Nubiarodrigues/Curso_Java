package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {

		LocalDateTime sdf = LocalDateTime.parse("2018-06-21T13:05:44");

		// comentários post 1
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that´s awesome!");

		// comentários post 2
		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the force be with you!");

		// Post 1
		Post p1 = new Post(sdf, "Traveling to New Zealand", "I´m going to visit this wonderful country!", 12);

		// adicionando comentários ao post 1
		p1.addComment(c1);
		p1.addComment(c2);

		Post p2 = new Post(sdf.parse("2018-07-28T23:14:19"), "Good night guys", "See you tomorrow!", 5);

		// adicionando comentários ao post 2
		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println(p2);

	}

}
