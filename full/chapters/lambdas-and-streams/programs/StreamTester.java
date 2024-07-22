import java.util.stream.*;
import java.util.*;

public class StreamTester {
    public static void main(String[] args) {
        String[] array = {"vegetarian", "acquit", "unfair", "insert", "favorable", "origin"};   
        var words = Stream.of(array);
        words
            .filter(e -> e.length() >= 8)
            .sorted()
            .forEach(e -> System.out.println(e));
    
        List<String> list = new ArrayList<>();
        list.add("vegetarian");
        list.add("acquit");
        list.add("unfair");
        list.add("insert");
        list.add("favorable");
        list.add("origin");   
        words = list.stream();

        words
            .map(e -> e + e)
            .forEach(e -> System.out.println(e));


        words = list.stream();
        IntStream lengths = words.mapToInt(e -> e.length());
        System.out.println(lengths.max().orElseThrow());

        IntStream numbers = IntStream.of(3, 14, 7, 1, 2);
        System.out.println(numbers.sum());
        
    }
}