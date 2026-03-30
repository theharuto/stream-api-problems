# 📘 Java 8 Practice

---

## 1. Sort Map by Value (Descending)

**Problem :**
Given a `Map<String, Integer>`, sort the map by values in descending order using Java 8 Streams and return a `LinkedHashMap` preserving the order.

**Input :**

```java
{""=4, "indexOff"=123, "fdsd"=8, "dfgs"=2, "gte"=3}
```

**Expected output :**

```java
{indexOff=123, fdsd=8, =4, gte=3, dfgs=2}
```

<details>
<summary>Solution</summary>

```java
Map<String,Integer> sorted = map.entrySet().stream()
    .sorted((e2, e1) -> e1.getValue() - e2.getValue())
    .collect(Collectors.toMap(
        e -> e.getKey(),
        e -> e.getValue(),
        (e1, e2) -> e1,
        LinkedHashMap::new
    ));
```

</details>

---

## 2. Stream Laziness Demonstration

**Problem :**
Demonstrate that intermediate operations (`filter`, `map`, `sorted`) in Java Streams are lazy and only executed when a terminal operation is invoked.

**Input :**

```java
List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
```

**Expected output :**

```
(No output unless terminal operation like forEach is called)
```

<details>
<summary>Solution</summary>

```java
Stream<Integer> stream = numbers.stream()
    .filter(n -> {
        System.out.println("FILTER: " + n);
        return n > 3;
    })
    .map(n -> {
        System.out.println("MAP: " + n);
        return n * 2;
    })
    .sorted();

// No terminal operation → nothing executes
```

</details>

---

## 3. Find Anagrams in List

**Problem :**
Given a list of words, find all words that are anagrams of a target word.

**Input :**

```java
words = ["listen", "silent", "enlist", "google", "inlets"]
target = "silent"
```

**Expected output :**

```java
["listen", "silent", "enlist", "inlets"]
```

<details>
<summary>Solution</summary>

```java
int[] targetArr = "silent".chars().sorted().toArray();

List<String> result = words.stream()
    .filter(word -> Arrays.equals(
        word.chars().sorted().toArray(),
        targetArr))
    .toList();
```

</details>

---

## 4. Check Palindrome (Using Streams)

**Problem :**
Check if a given string is a palindrome using Java 8 Streams.

**Input :**

```java
"maddam"
```

**Expected output :**

```java
true
```

<details>
<summary>Solution</summary>

```java
boolean isPalindrome = IntStream.range(0, s.length() / 2)
    .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
```

</details>

---

## 5. First Non-Repeating Character

**Problem :**
Find the first non-repeating character in a string using Java Streams.

**Input :**

```java
"hello"
```

**Expected output :**

```java
h
```

<details>
<summary>Solution</summary>

```java
s.chars()
    .mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(
        Function.identity(),
        LinkedHashMap::new,
        Collectors.counting()
    ))
    .entrySet().stream()
    .filter(e -> e.getValue() == 1)
    .findFirst()
    .map(Map.Entry::getKey)
    .ifPresent(System.out::println);
```

</details>

---

## 6. Reverse a String Using Streams

**Problem :**
Reverse a string using Java 8 Streams.

**Input :**

```java
"hello"
```

**Expected output :**

```java
"olleh"
```

<details>
<summary>Solution</summary>

```java
String rev = s.chars()
    .mapToObj(c -> String.valueOf((char)c))
    .reduce("", (a, b) -> b + a);
```

</details>

---

## 7. Reverse a List

**Problem :**
Reverse a list using Java Streams.

**Input :**

```java
[1,2,3,4,5]
```

**Expected output :**

```java
[5,4,3,2,1]
```

<details>
<summary>Solution</summary>

```java
List<Integer> reversed = IntStream.range(0, list.size())
    .map(i -> list.get(list.size() - 1 - i))
    .boxed()
    .toList();
```

</details>

---

## 8. Extract Numbers from String

**Problem :**
Extract all numbers from a string and return them as a list.

**Input :**

```java
"a12,b34,b56,78"
```

**Expected output :**

```java
[12, 34, 56, 78]
```

<details>
<summary>Solution</summary>

```java
List<Integer> list = Arrays.stream(
        s.replaceAll("\\D+", " ").trim().split("\\s+"))
    .map(Integer::parseInt)
    .toList();
```

</details>

---

## 9. Find Non-Duplicate Elements in Array

**Problem :**
Find all elements that appear only once in an array.

**Input :**

```java
[1,2,3,4,5,5,5,5,1]
```

**Expected output :**

```java
[2,3,4]
```

<details>
<summary>Solution</summary>

```java
Arrays.stream(arr).boxed()
    .collect(Collectors.groupingBy(
        Function.identity(),
        Collectors.counting()
    ))
    .entrySet().stream()
    .filter(e -> e.getValue() == 1)
    .map(Map.Entry::getKey)
    .forEach(System.out::println);
```

</details>

---

## 10. Move All Zeroes to Left

**Problem :**
Given a binary array, move all `0`s to the left and `1`s to the right.

**Input :**

```java
[1,0,1,0,0,0,0]
```

**Expected output :**

```java
[0,0,0,0,0,1,1]
```

<details>
<summary>Solution</summary>

```java
List<Integer> result = Arrays.stream(arr).boxed()
    .collect(Collectors.collectingAndThen(
        Collectors.partitioningBy(i -> i == 0),
        map -> {
            List<Integer> list = new ArrayList<>();
            list.addAll(map.get(true));
            list.addAll(map.get(false));
            return list;
        }
    ));
```

</details>

---

## 11. Factorial Using Streams

**Problem :**
Calculate factorial of a number using Java Streams.

**Input :**

```java
5
```

**Expected output :**

```java
120
```

<details>
<summary>Solution</summary>

```java
int fact = IntStream.rangeClosed(1, n)
    .reduce(1, (a, b) -> a * b);
```

</details>

---

## 12. Sum of Digits in Each Number

**Problem :**
Given a list of integers, return a list where each element is the sum of digits of the original number.

**Input :**

```java
[123, 23, 6845, 3763]
```

**Expected output :**

```java
[6, 5, 23, 19]
```

<details>
<summary>Solution</summary>

```java
List<Integer> result = list.stream()
    .map(num -> String.valueOf(num)
        .chars()
        .map(c -> c - '0')
        .sum())
    .toList();
```

</details>

---

# ⚠️ Brutal Feedback (Important)

You’re doing **a lot right**, but there are gaps:

### ❌ Problems in your current approach:

* You’re **writing solutions without formalizing problems** → bad for interviews
* Overusing `reduce()` → readability suffers, not always idiomatic
* Using `e1.getValue() - e2.getValue()` → **integer overflow risk** (use `Comparator`)
* Mixing **learning + experimentation in same file** → cognitive noise

### ✅ What you should fix:

* Always think in:

  ```
  Input → Transformation → Output
  ```
* Prefer:

  ```java
  Comparator.comparing(Map.Entry::getValue).reversed()
  ```
