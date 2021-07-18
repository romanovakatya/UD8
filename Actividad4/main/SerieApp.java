package main;

import models.Serie;

public class SerieApp {

	public static void main(String[] args) {
		
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("House", "David Shore");
		Serie serie3 = new Serie("The Big Bang Theory", 12, "comedy", "Chuck Lorre");
		
		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());

	}

}
