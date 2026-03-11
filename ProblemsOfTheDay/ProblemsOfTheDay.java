package ProblemsOfTheDay;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
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
//        record Employee(String name, String dept, int salary) {}
//        List<Employee> employees = List.of(
//                new Employee("Alice", "IT", 70000),
//                new Employee("Bob", "IT", 90000),
//                new Employee("Charlie", "HR", 60000),
//                new Employee("David", "HR", 75000),
//                new Employee("Eve", "Finance", 80000)
//        );
//        employees.stream()
//                .collect(Collectors.groupingBy(Employee::dept,
//                        Collectors.collectingAndThen(
//                                Collectors.maxBy(Comparator.comparingInt(Employee::salary)), //maxBy returns Optional, but we need Employee so we do collectingAndThen
//                                opt -> opt.orElse(null)
//                        )))
//                .forEach((k,v)-> System.out.println(k + "=" + v));

        //using toMap and BinaryOperator.maxBy as merge function
//        employees.stream()
//                .collect(Collectors.toMap(
//                        Employee::dept,
//                        Function.identity(),
//                        BinaryOperator.maxBy(Comparator.comparingInt(Employee::salary))
//                ))
//                .forEach((k,v)-> System.out.println(k + "=" + v));


        //02-Mar-26
        /**
         * You are given this input:
         * "electronics:mobile:500 electronics:laptop:1500 kitchen:knife:200 kitchen:oven:800 electronics:tablet:900"
         *  Expected Output
         * For the input above, result should be:
         * electronics → Product(laptop, 1500)
         * kitchen     → Product(oven, 800)
         */
//        record  Product(String item, int price){}
//        String input = "electronics:mobile:500 electronics:laptop:1500 kitchen:knife:200 kitchen:oven:800 electronics:tablet:900";
//        Map<String , List<Product>> categoryAndProductMap =

//                Stream.of(input.split(" "))
//                .map(s-> s.split(":"))
//                .collect(Collectors.groupingBy(s-> s[0].toLowerCase(),
//                        Collectors.collectingAndThen(Collectors.toList(), list-> list.stream()
//                                .map(s-> new Product(s[1],Integer.parseInt(s[2]))
//                                )
//                                .toList())));


        // using Collectors.mapping - downstream
//        Stream.of(input.split(" "))
//                .map(s-> s.split(":"))
//                        .collect(Collectors.groupingBy(
//                            arr -> arr[0],
//                                 Collectors.mapping( arr-> new Product(arr[1], Integer.parseInt(arr[2])),
//                                       Collectors.toList()
//
//                        )));
//
//
//        System.out.println(categoryAndProductMap);


        //10-Mar-26
        /**
         * Problem 1: Filter and Sort Employees by Salary
         *
         * You are given a list of employees. Each employee has:
         *
         * name
         *
         * department
         *
         * salary
         *
         * Task
         *
         * Using Java Stream API:
         *
         * Filter employees with salary > 50,000
         *
         * Sort them by salary in descending order
         *
         * Return only their names
         *
         *expected output
         * [Karan, Amit, Sneha]
         *
         */

//        record Employee(String name, String dept, int salary) {}
//
//        List<Employee> employees = List.of(
//                new Employee("Amit", "IT", 60000),
//                new Employee("Riya", "HR", 45000),
//                new Employee("Karan", "IT", 75000),
//                new Employee("Sneha", "Finance", 52000),
//                new Employee("Arjun", "IT", 48000)
//        );
//
//        employees.stream().filter(u-> u.salary() > 50_000)
//                .sorted(Comparator.comparingInt(Employee::salary).reversed())
//                .map(Employee::name)
//                .forEach(System.out::println);


        /**
         * Problem: Most Frequent Word in Sentences
         *
         * You are given a list of sentences. Each sentence may contain multiple words separated by spaces.
         *
         * Task
         *
         * Using Java Stream API:
         *
         * Split all sentences into individual words.
         *
         * Convert all words to lowercase.
         *
         * Ignore punctuation (. , ! ?).
         *
         * Count the frequency of each word.
         *
         * Return the top 3 most frequent words sorted by frequency (descending).
         *
         * expected output :
         * [java=3, streams=2, powerful=3]
         */
//        List<String> sentences = List.of(
//                "Java! streams are powerful",
//                "Streams make? Java powerful",
//                "Java streams simplify code",
//                "Powerful code comes from practice"
//        );
//
//       Map<String, Long> highFreqString =
//               sentences.stream()
//                .flatMap(
//                        sentence -> Stream.of(
//                                sentence.toLowerCase().replaceAll("[^a-z ]","").split(" ") //normalizing
//                        )
//                )
//                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
//                .limit(3)
//               .collect(Collectors.toMap(  //here we get the entry from the entry set not the map
//                       e-> e.getKey(),
//                       e-> e.getValue(),
//                       (e1,e2)-> e1
//
//               ));
//
////               .forEach((k) -> System.out.println(k.getKey() + " " + k.getValue()));
//        System.out.println(highFreqString);


        //11-Mar-26
        /**
         * Problem 1: Department Wise Highest Paid Employee
         * Task
         *
         * Using Java Streams:
         *
         * Group employees by department
         *
         * For each department find the employee with the highest salary
         *
         * Return result as:
         *
         * Map<String, Employee>
         * Expected Output
         * {
         * IT=Employee{name='Karan', salary=75000},
         * HR=Employee{name='Riya', salary=45000},
         * Finance=Employee{name='Meera', salary=80000}
         * }
         * Concepts Tested
         *
         * groupingBy
         *
         * maxBy
         *
         * Optional handling
         *
         * collectingAndThen
         */

        record Employee (
            String name,
            String department,
            int salary
        ){}
        List<Employee> employees = List.of(
                new Employee("Amit", "IT", 60000),
                new Employee("Riya", "HR", 45000),
                new Employee("Karan", "IT", 75000),
                new Employee("Sneha", "Finance", 52000),
                new Employee("Arjun", "IT", 48000),
                new Employee("Meera", "Finance", 80000)
        );

        Map<String, Employee> highestPaidEmployeePerDept =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::department,
//                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::salary, Comparator.reverseOrder())), //it is already maxBy so didn't have to reverseOrder()
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::salary)),
                                        opt-> opt.orElse(null)))) //maxBy returns Optional but we need Employee so we use collectingAndThen
                        ;

        System.out.println(highestPaidEmployeePerDept);
    }
}
