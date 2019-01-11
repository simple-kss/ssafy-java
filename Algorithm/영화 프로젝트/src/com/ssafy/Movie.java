package com.ssafy;

public class Movie {
	private String title;
	private String director;
	private int grade;
	private String genre;
	private String summary;
	
	
	public Movie(String title, String director, int grade, String genre, String summary) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
		this.summary = summary;
	}
	
	
	public Movie(String title, String director, int grade, String genre) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
	}


	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public String toString() {
		String str;
		str = String.format("%-30s\t|%-14s\t|%-3d\t|%-8s\t|%-30s\t", title, director, grade, genre, summary);
		return str;	
	}
	
	
	
	

}
