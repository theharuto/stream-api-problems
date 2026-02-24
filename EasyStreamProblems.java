import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

//Ques 6, 16, 25, 26, 28, 29, 30, 31, 38, 40, 41, 42 -redo, 47
public  class EasyStreamProblems {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 65));

        /**
         * 1. to find the sum of all elements in a list using Java Stream API
         */
//    int sum = integerList.stream().mapToInt(Integer::intValue).sum();
//    System.out.println("Sum " + sum);
        //mapToInt requires a Function
        //sum() is not an immediate terminal operator after stream()

        /**
         * 2. find and print the maximum element
         */
//    int maxElement = integerList.stream().max((a,b) -> a-b); // this thorws exception :  Optional<Integer> cannot be converted to int

//    int maxElement = integerList.stream()
//                .max(Comparator.comparing(Integer::intValue)) // .max(Integer::compare)
//                                .orElseThrow();

//    int maxElement = integerList.stream()
//            .mapToInt(Integer::intValue)
//            .max() // this returns an Optional so handle according or recieve as Optional
//            .orElseThrow();
//    System.out.println("Max element " + maxElement);

        //max() requires a Comparator as arg if they aren't primitives

        /**
         * 3. filter out all the even numbers from a list
         */
//    Predicate<Integer> isEvenPredicate = t -> t % 2 ==0;
//    List<Integer> evenList = integerList.stream()
//                                                .filter(isEvenPredicate)
//                            .collect(Collectors.toList()); //.toList();
//    evenList.forEach(System.out::println);


        /**
         * 4. count the number of strings containing a specific character ‘a’
         */
//    List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
//    char searchChar = 'a';
//    long count = strings.stream()
//            .filter(s -> s.contains(String.valueOf(searchChar)))
//            .count();
//    System.out.println(count);

        /**
         * 5. Write a program to convert a list of strings to uppercase using Java Stream API.
         */
//    List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
//    strings.stream().map(String::toUpperCase).forEach(System.out::println);

        /**
         * 6. Given a list of integers, write a program to calculate the average of all the numbers using Java Stream API.
         */
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//    double res = numbers.stream()
//            .collect(Collectors
//                    .averagingInt(Integer::intValue));
//    System.out.println(res);
//    OptionalDouble res = numbers.stream()
//                    .mapToDouble(Integer::intValue)
//                            .average();
//    res.ifPresent(System.out::println);

        /**
         * 7. Write a program to sort a list of strings in alphabetical order using Java Stream API.
         */
//    List<String> strings = Arrays.asList("banana", "orange", "apple", "grape");
//    strings.stream()
//            .sorted()
//            .toList()
//            .forEach(System.out::println);

        /**
         * 8. Given a list of strings, write a program to concatenate all the strings using Java Stream API.
         */
//    List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
//    String s = strings.stream()
////            .collect(Collectors.joining(", ","[","]"));
//            .collect(Collectors.joining("\n","{\n","\n}"));
//    System.out.println(s);

        /**
         * 9. Write a program to find the longest string in a list of strings using Java Stream API.
         */
//    List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
//    strings.stream()
////            .max(Comparator.comparing(String::length))
//            .max((a,b)-> a.length() - b.length())
//            .ifPresent(System.out::println);

        /**
         *10. Given a list of integers, write a program to find and print the second largest number using Java Stream API.
         */
//    List<Integer> numbers = Arrays.asList(4, 2, 8, 6, 10);
////    numbers.stream()
////            .sorted(Comparator.reverseOrder())
////            .skip(1)
////            .limit(1)
////            .forEach(System.out::println);
//    numbers.stream()
//            .sorted(Comparator.reverseOrder())
//            .skip(1)
//            .findFirst()
//            .ifPresent(System.out::println);

        /**
         * 11. Write a program to remove all the duplicate elements from a list using Java Stream API.
         */
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);
//    numbers.stream()
//            .distinct()
//            .forEach(System.out::println);

        /**
         * 12. Given a list of strings, write a program to find and print the shortest string using Java Stream API.
         */
//    List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//    strings.stream()
////            .min(Comparator.comparing(String::length)) // or
////            .max(Comparator.comparing(String::length).reversed()) //or
//            .max((a,b)-> b.length() - a.length()) //or use min with a - b type
//            .ifPresent(System.out::println);

        /**
         * 13. Write a program to convert a list of integers to a list of their squares using Java Stream API.
         */
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//    numbers.stream()
//            .map(x -> x * x)
//            .forEach(System.out::println);

        /**
         * 14. Given a list of strings, write a program to find and print the strings starting with a specific prefix ‘a’ using Java Stream API.
         */
//    List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "pomegranate");
        // for just 'a'
//    strings.stream()
//            .filter(s -> s.startsWith("a"))
////            .forEach(System.out::println); //or
//            .toList()
//            .forEach(System.out::println);

        //for all first letters
//    strings.stream()
//            .collect(Collectors
//                    .toMap(s -> s.substring(0,1),
//                            Function.identity(),
//                            (existing, replace)-> existing + ", " + replace))
//            .forEach((k, v) -> System.out.println(k + " " + v));
        //or
//    strings.stream()
//            .collect(Collectors.groupingBy(s -> s.charAt(0)))
//            .forEach((k, v) -> System.out.println(k + " " + v));

        /**
         * 15. Write a program to find the product of all elements in a list of integers using Java Stream API.
         */
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//    int prod = numbers.stream()
//            .reduce(1, (a,b)-> a*b); // it returns the value
//    System.out.println(prod);
//    numbers.stream()
//            .reduce((a,b)-> a*b) //returns an Optional<Integer>
//            .ifPresent(System.out::println);

        /**
         *16. Given a list of integers, write a program to find and print the prime numbers using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
//        numbers.stream()
//                .filter(EasyStreamProblems::isPrime)
//                .forEach(System.out::println);

        /**
         * 17. Write a program to check if a list of strings contains a specific string using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        String target = "banana";
//        boolean res = strings.stream()
//                .anyMatch(s -> s.equalsIgnoreCase(target));
//        System.out.println(res);

        /**
         * 18. Given a list of strings, write a program to find and print the strings with length greater than a specified value 5 using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        int minLength = 5;
//        strings.stream()
//                .filter(s -> s.length() >= minLength)
//                .forEach(System.out::println);

        /**
         * 19. Write a program to filter out all the elements divisible by 3 and 5 from a list of integers using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
//        numbers.stream()
//                .filter(integer -> integer % 3 == 0 && integer % 5 == 0)
//                .forEach(System.out::println);

        /**
         * 20. Given a list of strings, write a program to find and print the strings with the maximum length using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        strings.stream()
//                .max(Comparator.comparing(String::length))
//                .ifPresent(System.out::println);

        /**
         * 21. Write a program to reverse a list of strings using Java Stream API.
         */
//        List<String> strings = Arrays.asList("pear", "banana", "kiwi", "orange", "apple");
//        IntStream.range(0, strings.size())
//                .mapToObj(i-> strings.get(strings.size()- 1 -i))
//                .toList()
//                .forEach(System.out::println);

        /**
         * 22. Given a list of integers, write a program to find and print the distinct odd numbers using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        numbers.stream()
//                .distinct()
//                .filter(integer -> integer % 2 !=0)
//                .forEach(System.out::println);

        /**
         * 23. Write a program to remove all null values from a list of strings using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", null, "banana", null, "kiwi", "orange", null, "pear");
//        strings.stream()
//                .filter(Objects::nonNull)
//                .forEach(System.out::println);

        /**
         * 24. Given a list of integers, write a program to find and print the sum of all odd numbers using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int sum = numbers.stream()
//                .filter(integer -> integer %2 != 0)
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(sum);

        /**
         * 25. Write a program to find the intersection of two lists of strings using Java Stream API.
         */
//        List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");

        //approach 1: list contains method O (m * n )
//        list1.stream()
//                .filter(list2 :: contains)
//                .forEach(System.out::println);
        //approach 2: set contains method O(m + n )
//        Set<String > set = new HashSet<>(list2);
//        list1.stream()
//                .filter(set::contains)
//                .forEach(System.out::println);

        /**
         * 26. Given a list of strings, write a program to find and print the strings containing only vowels using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "oai", "eioundAi", "AEioua", "Aeious", "");
//        strings.stream()
//                .filter(s-> s.matches("[aeiouAEIOU]+")) // + = one or more
////                .filter(s-> s.matches("[aeiouAEIOU]*")) //  * = zero or more - this will accept the empty string too
//                .forEach(System.out::println);

        /**
         *27. Write a program to convert a list of strings to a comma-separated string using Java Stream AP
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        String s = strings.stream()
//                .collect(Collectors.joining(", ", "{ "," }"));
//        System.out.println(s);


        /**
         * 28. Given a list of integers, write a program to find and print the index of the first occurrence of a specific number using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);
//        int targetNumber = 7;
        //1
//        int index = numbers.indexOf(targetNumber);
//        System.out.println(index);

        //2
//        long index = numbers.stream()
//                .takeWhile(integer -> !integer.equals(targetNumber))
//                .count();
//        System.out.println(index);

        //3
//        OptionalInt index =
//                IntStream.range(0, numbers.size())
//                        .filter(i -> numbers.get(i) == targetNumber)
//                        .findFirst();
//
//        index.ifPresentOrElse(
//                i -> System.out.println("Index: " + i),
//                () -> System.out.println("Not found")
//        );


        /**
         * 29. Write a program to find the union of two lists of integers using Java Stream API.
         */
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
//
//        Stream.concat(list1.stream(), list2.stream())
//                .distinct()
//                .forEach(System.out::println);

        /**
         * 30. Given a list of strings, write a program to find and print the strings containing duplicate characters using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "strawberry", "watermelon");
//        strings.stream()
//                .filter(
//                        s -> s.chars().distinct().count() != s.length()
//                )
//                .forEach(System.out::println);

        /**
         * 31. Write a program to check if all elements in a list of strings are of the same length using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        List<String> strings = Arrays.asList("apple", "banan", "kiwis", "orang", "pears");
////        int firstStringLength = strings.getFirst().length();
////        boolean res = strings.stream()
////                .allMatch(s -> s.length() == firstStringLength);
        //approach 2
//        boolean res = strings.stream()
//                        .map(String::length)
//                                .distinct()
//                                        .count() == 1;
//        System.out.println(res);


        /**
         *  32. Given a list of integers, write a program to find and print the difference between the maximum and minimum numbers using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(10, 5, 7, 18, 3, 15);
//        IntSummaryStatistics res = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .summaryStatistics();
//        System.out.println("Difference between min and max " + (res.getMax() - res.getMin()));

        //approach 2
//        OptionalInt max = numbers.stream()
//                        .mapToInt(Integer::intValue)
//                                .max();
//        OptionalInt min = numbers.stream()
//                        .mapToInt(Integer::intValue)
//                                .min();
//        int res = max.getAsInt() - min.getAsInt();
//        System.out.println(res);


        /**
         * 33. Write a program to remove all whitespace from a list of strings using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "ba  nana", "kiwi", "oran ge", "pear");
//        strings.stream()
////                .map(s -> s.replaceAll("\\s+", ""))
//                .map(s -> s.replace(" ", "")) // this works for multiple whitespaces
//                .forEach(System.out::println);

        /**
         * 34. Given a list of strings, write a program to find and print the strings containing a specific substring using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        String substring = "an";
//        strings.stream()
//                .filter(s -> s.contains(substring))
//                .forEach(System.out::println);

        /**
         * 35. Write a program to find the mode of a list of integers using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 3, 4, 4, 4, 5, 5);
//        Map<Integer,Long> map = numbers.stream()
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //just for one
//        map.entrySet().stream()
//                .max(Comparator.comparing(Map.Entry::getValue))
////                .ifPresent(System.out::println);
//                .ifPresent(i -> System.out.println(i.getKey()));

//        long max = map.values().stream()
//                .mapToLong(Long::longValue)
//                .max()
//                .orElse(0);
//
//        //for multiple mode values
//        map.entrySet().stream()
//                .filter(i -> i.getValue() == max)
//                .map(Map.Entry::getKey)
//                .forEach(System.out::println);


        /**
         * 36. Given a list of strings, write a program to find and print the strings with the minimum length using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        strings.stream()
//                .min(Comparator.comparing(String::length))
//                .ifPresent(System.out::println);

        /**
         * 37. Write a program to find the frequency of each element in a list of integers using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
//        Map<Integer,Long> freqMap = numbers.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(freqMap);

        /**
         * 38. Given a list of strings, write a program to find and print the strings with the maximum number of vowels using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        Function<String, Integer> vowelCount = s -> {
//            for (int i = 0; i < s.length(); i++) {
//                if( s.charAt(i) ==  )
//            }
//        }

        /**
         * 39. Write a program to check if a list of integers is sorted in ascending order using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4);
//        boolean isEqual = numbers.stream().sorted().toList().equals(numbers);
//        System.out.println(isEqual);


        /**
         * 40. Given a list of strings, write a program to find and print the strings with the minimum number of vowels using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        Map<String, Long> map =strings.stream()
//                .collect(Collectors.toMap(
//                        Function.identity(),
//                        s -> s.chars().filter( c->"AEIOUaeiou".indexOf(c) != -1).count()
//                ));
////        long minVowelFreq = map.entrySet().stream().min(Comparator.comparingLong(Map.Entry::getValue)) // alternatively
////                .map(e-> e.getValue()).orElse(0L);
//
//        long minVowelFreq = map.values().stream().mapToLong(Long::longValue).min().orElse(0);
//
//        map.entrySet().stream()
//                .filter(e-> e.getValue() == minVowelFreq)
//                .map(e-> e.getKey())
//                .forEach(System.out::println);



        /**
         * 41. Write a program to find the median of a list of integers using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5);
//        numbers.stream()
//                .mapToInt(Integer::intValue)
//                .sorted()
//                .skip((numbers.size() -1 )/2)
//                .limit(numbers.size() % 2 == 0 ? 2 : 1)
//                .average()
//                .ifPresent(System.out::println);

        /**
         * 42. Given a list of strings, write a program to find and print the strings containing a specific character at least twice using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        char targetChar = 'a';
//
//
//        //better one
//        strings.stream()
//                .filter(s -> s.chars()
//                        .filter(c-> c==targetChar)
//                        .count() >= 2)
//                .forEach(System.out::println);



//        strings.stream()
//         .filter(s -> {
//            int count=0;
//            for( Character c : s.toLowerCase().toCharArray()){
//                if( c==targetChar)
//                    count++;
//                if(count >= 2)
//                    return true;
//            }
//            return false;
//        })
//                .forEach(System.out::println);
        //-------------------
//                .filter(s -> s.matches( "\{targetChar}{2,}"))
//                .filter(s -> {  //this is for Vowels that appear twice
//                    int count=0;
//                    for( Character c : s.toLowerCase().toCharArray()){
//                        if( c=='a' || c == 'e' || c== 'o'||c=='u' || c=='i')
//                            count++;
//                        if(count >= 2)
//                            return true;
//                    }
//                    return false;
//                })
        //--------------


        /**
         * 43. Write a program to find the kth smallest element in a list of integers using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
//        int k = 3; // Find the 3rd smallest element
//        numbers.stream()
//                .sorted()
//                .skip(k-1)
////                .limit(1)//or use findFirst
//                .findFirst()
//                .ifPresent(System.out::println);

        /**
         * 44. Given a list of strings, write a program to find and print the strings with the maximum number of consonants using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
//        //better one
//       Map<String,Long> map = strings.stream()
//                .collect(Collectors.toMap(
//                        s-> s,
//                        s -> s.chars().filter(c-> "AEIOUaeiou".indexOf(c) == -1).count()
//                )); //will get a map here, processing on it further
//
//        long maxConsonants =  map.values().stream().mapToLong(Long::longValue)
//                .max()
//                .orElse(0L);
//
//        map.entrySet().stream()
//                .filter(e-> e.getValue() == maxConsonants)
//                .map(s-> s.getKey())
//                .forEach(System.out::println);
        //or
//        strings.stream()
//                .filter(s-> s.chars().filter(c-> "AEIOUaeiou".indexOf(c) == -1).count()
//                == maxConsonants)
//                .forEach(System.out::println);





//        Map<String, Integer> freq = strings.stream()
//                                            .distinct()
//                                            .collect(Collectors.toMap(
//                                                    Function.identity(),
//                                            s-> {
//                                                        int count=0;
//                                                        for( char c : s.toLowerCase().toCharArray()){
//                                                            if (c != 'a' || c != 'e' || c != 'i' || c!= 'o' || c != 'u')
//                                                                count++;
//                                                        }
//                                                        return count;
//                                            }));
//
//
//        freq.entrySet().stream()
//                .max(Comparator.comparingInt(Map.Entry::getValue))
//                .ifPresent(System.out::println);


        /**
         * 45. Write a program to check if a list of strings is palindrome using Java Stream API.
         */
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi","banana", "apple");
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "banana","banana", "apple");
//        int n = strings.size();
//       boolean isListPalindrome=  IntStream.range(0,strings.size()/2)
//                .mapToObj(i->strings.get(i).equals(strings.get(n-1-i)))
//                .allMatch(a->a);
//                .forEach(System.out::println);

        //better approach
//        boolean isListPalindrome=  IntStream.range(0,strings.size()/2)
//                .allMatch(i->strings.get(i).equals(strings.get(n-1-i)));
//
//        System.out.println(isListPalindrome);

        //Blog solution
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "banana", "apple");
//        boolean isPalindrome = strings.stream()
//                .skip(strings.size() / 2)
//                .allMatch(s -> s.equals(strings.get(strings.size() - 1 - strings.indexOf(s))));
//        System.out.println("Is the list a palindrome? " + isPalindrome);

        /**
         * 46. Given a list of integers, write a program to find and print the elements with the highest frequency using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5,5);
//        Map<Integer,Long> map = numbers.stream()
//                .collect(Collectors.groupingBy(
//                        i-> i,
//                        Collectors.counting()
//                ));
//        long maxFreq = map.values().stream().mapToLong(Long::longValue).max().orElse(0);
//        map.entrySet().stream()
//                .filter(e-> e.getValue() == maxFreq)
//                .map(e->e.getKey())
//                .forEach(System.out::println);

        /**
         * 47. Write a program to remove all non-numeric characters from a list of strings using Java Stream API.
         */
//        List<String> strings = Arrays.asList("a1b2c3", "1a2b3c", "123abc");
//        strings.stream()
////                .map(s -> s.replaceAll("[^0-9]+", "")) // mean not a digit [^0-9]+
////                .map(s -> s.replaceAll("[a-zA-Z]+", ""))
//                .map(s -> s.replaceAll("\\D+", ""))
//                .forEach(System.out::println);


        /**
         * 48. Given a list of strings, write a program to find and print the strings containing only digits using Java Stream API.
         */
//        List<String> strings = Arrays.asList("123", "abc", "456", "789", "def","1");
//        strings.stream()
//                .filter(s -> s.matches("\\d+"))
//                .forEach(System.out::println);

        //blog solution
//        List<String> strings = Arrays.asList("123", "abc", "456", "789", "def");
//        Predicate<String> containsOnlyDigits = s -> s.matches("\\d+");
//        List<String> digitStrings = strings.stream().filter(containsOnlyDigits).collect(Collectors.toList());
//        System.out.println("Strings containing only digits: " + digitStrings);


        /**
         * 49. Write a program to find the kth largest element in a list of integers using Java Stream API.
         */

        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
//        int k = 3; // Find the 3rd largest element
//        numbers.stream()
//                .distinct()
////                .sorted(Comparator.reverseOrder())
//                .sorted( (a,b)-> b-a)
//                .skip(k-1)
//                .findFirst()
//                .ifPresent(System.out::println);

        /**
         * 50. Given a list of integers, write a program to find and print the elements with the lowest frequency using Java Stream API.
         */
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
//        Map<Integer,Long> map = numbers.stream()
//                .collect(Collectors.groupingBy(integer -> integer,Collectors.counting()));
//
//        long min =map.values().stream().mapToLong(Long::longValue).min().orElse(0);
//
//        map.entrySet().stream()
//                .filter(e-> e.getValue() == min)
//                .map(e-> e.getKey())
//                .forEach(System.out::println);



    }


    //for 16th question
//  static   boolean isPrime(int n) {
//        if (n <= 1) return false;
//
//        for (int i = 2; i * i <= n; i++) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }



}