package comparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Comparision {

    public static Movie[] sortByYear(Movie[] movies) {
        Arrays.sort(movies, (a, b) -> b.getYear() - a.getYear());
        return movies;
    }

    public static Movie[] sortByTitle(Movie[] movies) {
        Arrays.sort(movies, (a, b) -> {
            String titleA = a.getTitle().replaceFirst("^(?i)(A|An|The) ", "");
            String titleB = b.getTitle().replaceFirst("^(?i)(A|An|The) ", "");
            return titleA.compareToIgnoreCase(titleB);
        });
        return movies;
    }





}
