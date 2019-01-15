package com.basic;

public class Movie {
	String title;
	String director;
	int grade;
	String genre;
	String summary;
	
	public void movieInfo() {
		System.out.println("* 제목:" + title + "\t감독:" + director
				+ "\t등급:" + grade + "\t장르:" + genre
				+ "\n줄거리:" + summary);
	}

}
