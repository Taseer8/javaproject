package com.xworkz.javafeature.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MovieDto implements Comparable<MovieDto> {
	private String title ;
	private Double rating;
	private Integer releaseYear;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	@Override
	public String toString() {
		return "MovieDto [title=" + title + ", rating=" + rating + ", releaseYear=" + releaseYear + "]";
	}
	@Override
	public int compareTo(MovieDto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
