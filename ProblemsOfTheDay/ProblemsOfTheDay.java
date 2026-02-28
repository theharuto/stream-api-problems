package ProblemsOfTheDay;

import java.util.*;
import java.util.function.BinaryOperator;
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




//        String text = "Java is great and Java is powerful. Java streams are great and powerful! java";
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
//        String test = text.toLowerCase()
//                .replaceAll("[^a-z ]", "");
//
//        Stream.of(test.split("\\s+"))
//                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()
//                ))
//                .entrySet().stream()
//                .sorted(Map.Entry.<String,Long>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry::getKey))
//                .limit(3)
//                .map(Map.Entry::getKey)
//                .forEach(System.out::println);


        /**
         * Sort words by:
         * Word length (descending)
         * If length ties → frequency (descending)
         * If frequency ties → alphabetical (ascending)
         * input: "code decode recode codec codex decode code decode coder coder coder"
         * expected:
         * decode
         * recode
         * coder
         * codec
         * codex
         * code
         */
//        String input = "code decode2@ recode! codec codex decode code decode coder coder coder";
//        String text = input.toLowerCase().replaceAll("[^a-z ]",""); //normalizing the input
//
//        Stream.of(text.split(" "))
//               .collect(Collectors.groupingBy(Function.identity(),
//                       LinkedHashMap::new,
//                       Collectors.counting()))
//               .entrySet().stream()
//               .sorted(
//                     Comparator.comparing((Map.Entry<String,Long> e)-> e.getKey().length(),Comparator.reverseOrder())
//                             .thenComparing(Map.Entry::getValue, Comparator.reverseOrder())
//                             .thenComparing(Map.Entry::getKey)
//               )
//               .map(Map.Entry::getKey)
//               .forEach(System.out::println);


        //27-Feb-26
        /**
         * Highest Paid Employee Per Department
         *Using Streams:
         *
         * Group employees by department.
         *
         * For each department, find the employee with the highest salary.
         *
         * Return:
         *
         * Map<String, Employee>
         *
         *{
         *   IT=Employee[name=Bob, dept=IT, salary=90000],
         *   HR=Employee[name=David, dept=HR, salary=75000],
         *   Finance=Employee[name=Eve, dept=Finance, salary=80000]
         * }
         */
        record Employee(String name, String dept, int salary) {}
        List<Employee> employees = List.of(
                new Employee("Alice", "IT", 70000),
                new Employee("Bob", "IT", 90000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "HR", 75000),
                new Employee("Eve", "Finance", 80000)
        );
//        employees.stream()
//                .collect(Collectors.groupingBy(Employee::dept,
//                        Collectors.collectingAndThen(
//                                Collectors.maxBy(Comparator.comparingInt(Employee::salary)), //maxBy returns Optional, but we need Employee so we do collectingAndThen
//                                opt -> opt.orElse(null)
//                        )))
//                .forEach((k,v)-> System.out.println(k + "=" + v));

        //using toMap and BinaryOperator.maxBy as merge function
        employees.stream()
                .collect(Collectors.toMap(
                        Employee::dept,
                        Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparingInt(Employee::salary))
                ))
                .forEach((k,v)-> System.out.println(k + "=" + v));
    }
}
