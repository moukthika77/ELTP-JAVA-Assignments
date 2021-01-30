package com.psl.learning.collections;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Use Comparable interface to sort the movies according to their language. 
//Also use Comparator interface to sort the movies according to the director.
//Public void sortByLanguage(List<Movie> movieList)
//Public void sortByDuration(List<Movie> movieList)
//Public void SortByLanguageAndReleaseDate(List<Movie> movieList) If language is same then arrange by releasedate
@SuppressWarnings("unused")
class Movie 
{
	String name,language,director,producer;
	Date releaseDate;
	int duration;
	public Movie(String name, String language, String director,String producer, Date releaseDate, int duration) {
		super();
		this.name = name;
		this.language = language;
		this.director = director;
		this.producer = producer;
		this.releaseDate = releaseDate;
		this.duration = duration;
	}
}
class durationComparator implements Comparable<Movie>
{

	public int compareTo(Movie m1,Movie m2) {
		// TODO Auto-generated method stub
		if(m1.duration==m2.duration)
		return 0;
		else if(m1.duration>m2.duration)
			return 1;
		else
			return -1;
		
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class languageComparator implements Comparable<Movie>
{

	public int compareTo(Movie m1,Movie m2)
	{
		return m1.language.compareTo(m2.language);
	}
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class Movies {
public static void main(String[] args) {
	List<Movie> movies=new ArrayList<Movie>();
	movies.add(new Movie("movie1", "Hindi", "Sam", "Karan",Date.valueOf("2020-01-25"), 200));
	movies.add(new Movie("movie2", "Telugu", "SSR", "Sam",Date.valueOf("2020-01-25"), 210));
	movies.add(new Movie("movie3", "Hindi", "Sames", "Kar",Date.valueOf("2020-01-25"), 220));
	System.out.println("Sorting by duration:");
	//Collections.sort(movies,new durationComparator());
	System.out.println("sorting by language :");
	//Collections.sort(movies, new languageComparator());
	
	
}

}
