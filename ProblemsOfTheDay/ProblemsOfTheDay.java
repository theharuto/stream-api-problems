package ProblemsOfTheDay;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProblemsOfTheDay {
    static void main() {

        //24-feb-26
        /**
         * Return the index of the vowel in a String
         */
//        String vowel = "abcdeiouAEIOU";

        //using IntStream
//        int[] vowelIndices = IntStream.range(0, vowel.length())
//                .filter(i-> "AEIOUaeiou".indexOf(vowel.charAt(i)) != -1)
//                .toArray();
//        System.out.println(Arrays.toString(vowelIndices));

        //using set
//        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O');
//        int[] vowelIndices = IntStream.range(0,vowel.length())
//                .filter(i-> set.contains(vowel.charAt(i)))
//                .map(i -> i+1) //for 1 based indexing
//                .toArray();
//        System.out.println(Arrays.toString(vowelIndices));


        /**
         * Reversing Each word in its place in a sentence
         */
//        String sentence = "ehT   drow ot esrever";
//        String reversed = Arrays.stream(sentence.split("\s+"))
//                .map(
//                        word -> word.chars().mapToObj(c-> String.valueOf((char)c )).reduce("",(a,b)-> b + a)
//                ) //for each word the reverse login by chars()
//                .collect(Collectors.joining(" ")); // or reduce()
//        System.out.println(reversed);





    }
}
