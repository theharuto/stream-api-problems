package ProblemsOfTheDay;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProblemsOfTheDay {
    static void main() {

        //24-feb-26
        /**
         * Return the index of the vowel in a String
         */
        String vowel = "abcdeiouAEIOU";

        //using IntStream
//        int[] vowelIndices = IntStream.range(0, vowel.length())
//                .filter(i-> "AEIOUaeiou".indexOf(vowel.charAt(i)) != -1)
//                .toArray();
//        System.out.println(Arrays.toString(vowelIndices));

//        using set
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


        //25-Feb-26
        /**
         * Fibonacci numbers
         */
//        int a =0,b=1;
//        System.out.println(a + " " + b);
//        for( int i=0; i< 10; i++){
//            int c = a + b;
//            System.out.println(" " + c);
//            a = b;
//            b = c;
//        }
//        int[] a = new int[10+2];
//        a[0] = 0;
//        a[1] = 1;
//        System.out.println(a[0] + " " + a[1]);
////        int[] arr =
//                IntStream.range(2,10+2)
//                .map(i-> a[i]  = a[i-2] + a[i-1])
//                .forEach(System.out::println);
//                .toArray();
//        System.out.println(Arrays.toString(arr));
        //a - has full numbers, while arr - has numbers except the first two


        //26-Feb-26
//        record Employee(String name, String dept, long salary){}
//        List<Employee> employees = List.of(
//                new Employee("Alice", "IT", 70000),
//                new Employee("Bob", "IT", 40000),
//                new Employee("Charlie", "HR", 60000),
//                new Employee("David", "HR", 45000),
//                new Employee("Eve", "IT", 90000)
//        );
        /**
         * Group employees by department.
         *
         * For each department:
         *
         * Keep only employees earning more than 50,000
         *
         * Convert names to uppercase
         *
         * Sort names alphabetically
         *
         * Return result as:
         *
         * Map<String, List<String>>
         *
         * expected
         * {
         *   "IT" = ["ALICE", "EVE"],
         *   "HR" = ["CHARLIE"]
         * }
         */
//       Map<String, List<String>> deptEmployeeName = employees.stream().filter(employee -> employee.salary() > 50_000)
//                .collect(Collectors.groupingBy(Employee::dept, Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        list -> { return
//                            list.stream().map(e->e.name().toUpperCase())
//                                    .sorted()
//                                    .toList();
//                        }
//                )));
//        System.out.println(deptEmployeeName);




        String text = "Java is great and Java is powerful. Java streams are great and powerful!";
        /**
         * Using Streams:
         *
         * Ignore case
         *
         * Remove punctuation
         *
         * Count frequency of each word
         *
         * Return the top 3 most frequent words sorted by:
         *
         * frequency (descending)
         *
         * then alphabetically (ascending)
         *
         * expected output
         * ["java", "and", "great"]
         */
        Stream.of(text.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry::getKey))
                .limit(3)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);




    }
}
