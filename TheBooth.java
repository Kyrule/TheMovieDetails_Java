/**
 * 
 */
package net.movie;
import java.util.Scanner;
/**
 * @author khai
 *
 */
public class TheBooth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String nameMovie = null,ratingMovie = null;
		int yearMovie = 0;int runtimeMovie = 0;
		System.out.print("Movie name: ");
		nameMovie=s.nextLine();		
		System.out.print("Movie rating(pg,pg13,g): ");
		ratingMovie=s.nextLine();
		System.out.print("Movie year(yyyy): ");
		yearMovie = s.nextInt();
		System.out.print("Movie runtime(mins): ");
		runtimeMovie = s.nextInt();
		TheMovie movie=new TheMovie(nameMovie, ratingMovie, yearMovie, runtimeMovie);
		System.out.println(movie);

	}

}
