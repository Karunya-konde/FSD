package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.repositary.CommentRepository;
import com.example.demo.repositary.PostRepository;

@SpringBootApplication
public class SpringBootRestDataPcApplication {
	private PostRepository postRepository;
	private CommentRepository commentRepository;


	public SpringBootRestDataPcApplication(PostRepository postRepository,CommentRepository commentRepository) {
		super();
		this.commentRepository = commentRepository;
		this.postRepository = postRepository;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDataPcApplication.class, args);
	}
	@Component
	class CourseCommand implements CommandLineRunner
	{

		@Override
		public void run(String... args) throws Exception {
			Post tempPost = new Post();
			StringBuffer comment = new StringBuffer();
			comment.insert(0, "this is a comment");
			Comment tempComment = new Comment();
			tempPost.setPost("yaaay");
			tempComment.setComment(comment);
			postRepository.save(tempPost);
			commentRepository.save(tempComment);
			
		}
		
	}

}
