package comparison;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ComparisonTests {

    @Test
    public void testSortByYear() {
        String[] movieGenres = {"drama", "romantic"};
        Movie movie1 = new Movie("Titanic", 2002, movieGenres);
        Movie movie2 = new Movie("The Other Zoey", 2000, movieGenres);
        Movie movie3 = new Movie("Awareness", 1999, movieGenres);
        Movie movie4 = new Movie("The fault in our stars", 2008, movieGenres);

        Movie[] movies = {movie1, movie2, movie3, movie4};

        Comparision comparison = new Comparision();

        Movie[] result = comparison.sortByYear(movies);

        Movie[] expectedMovies = {movie4, movie1, movie2, movie3};

        assertArrayEquals(expectedMovies, result);
    }
    @Test
    public void testSortByTitle() {
        String[] movieGenres = {"drama", "romantic"};
        Movie movie1 = new Movie("A", 2002, movieGenres);
        Movie movie2 = new Movie("F", 2000, movieGenres);
        Movie movie3 = new Movie("E", 1999, movieGenres);
        Movie movie4 = new Movie("C", 2008, movieGenres);

        Movie[] movies = {movie1, movie2, movie3, movie4};

        Comparision comparison = new Comparision();

        Movie[] result = comparison.sortByTitle(movies);

        Movie[] expectedMovies = {movie1, movie4, movie3, movie2};

        assertArrayEquals(expectedMovies, result);
    }



}
