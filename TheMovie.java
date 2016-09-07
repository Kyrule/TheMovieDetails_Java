/**
 * 
 */
package net.movie;

/**
 * @author khai
 *
 */
public class TheMovie {
	
	private String nameMovie="";
	private String ratingMovie=""; // g general audience, pg, pg13
	private int yearMovie=0;
	private int runtimeMovie=0;
	

	public String getNameMovie() {
		return nameMovie;
	}


	public void setNameMovie(String nameMovie) {
		this.nameMovie = nameMovie;
	}


	public String getRatingMovie() {
		return ratingMovie;
	}


	public void setRatingMovie(String ratingMovie) {
		this.ratingMovie = ratingMovie;
	}


	public int getYearMovie() {
		return yearMovie;
	}


	public void setYearMovie(int yearMovie) {
		this.yearMovie = yearMovie;
	}


	public int getRuntimeMovie() {
		return runtimeMovie;
	}


	public void setRuntimeMovie(int runtimeMovie) {
		this.runtimeMovie = runtimeMovie;
	}


	@Override
	public String toString() {
		return "TheMovie [nameMovie=" + nameMovie + ", ratingMovie="
				+ ratingMovie + ", yearMovie=" + yearMovie + ", runtimeMovie="
				+ runtimeMovie + "]";
	}

	

	public TheMovie(String nameMovie, String ratingMovie, int yearMovie,
			int runtimeMovie) {
		super();
		this.nameMovie = nameMovie;
		this.ratingMovie = ratingMovie;
		this.yearMovie = yearMovie;
		this.runtimeMovie = runtimeMovie;
	}


}
