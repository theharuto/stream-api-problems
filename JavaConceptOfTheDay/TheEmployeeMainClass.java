//import java.util.*;

//void main() {
//    List<List<Integer>> list = Arrays.asList(
//            Arrays.asList(8,7,6,5,4,3),
//            Arrays.asList(1,2,3,4,55,6),
//            Arrays.asList(11,22,44,2,1,2),
//            new LinkedList<>(Arrays.asList(2,3,-1, null,null)),
//
//    );
//
//    List<Integer> finalList = list.stream().flatMap(Collection::stream).toList();
//    System.out.println(finalList);
//}


import java.util.*;

//https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/#google_vignette
public class TheEmployeeMainClass {
    static List<Employee> employeeList = new ArrayList<Employee>();

    public static void main(String[] args) {
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        /**
         * 1. How many male and female employees are there in the organization?
         */
        // Map<Boolean,List<Employee>> resultMap=  employeeList.stream()
        // .collect(Collectors.partitioningBy(e -> e.getGender().equalsIgnoreCase("Male"),Collectors.toList()));

        // int maleCount = resultMap.get(true).size();
        // int femaleCount = resultMap.get(false).size();
        // System.out.println("Male count : " + maleCount + " Female Count " + femaleCount);

        // Map<String, Long> resultMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        // System.out.println(resultMap.get("Male") + " " + resultMap.get("Female") );

        /**
         * 2. Print the name of all departments in the organization?
         */
        // List<String> deptNames = employeeList.stream().map(Employee::getDepartment).toList();
        // List<String> deptNames = employeeList.stream().map(Employee::getDepartment).distinct().toList(); //first time it gave duplicates
        // System.out.println(deptNames);

        // long deptCount = employeeList.stream().map(Employee::getDepartment)
        //                         // .distinct()
        //                         .count(); // this returns long, so for better safety use: long instread of int
        // System.out.println(deptCount);

        /**
         * 3. What is the average age of male and female employees?
         */
//        Map<String, Double> resultMap= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//        System.out.println(resultMap);

        /**
         * 4. Get the details of highest paid employee in the organization?
         */
//        Employee highestPaidEmployee = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElseThrow();
//        System.out.println(highestPaidEmployee);

        //using maxBy
//        Optional<Employee> highestPaidEmployee = employeeList.stream()
//                .collect(Collectors
////                        .maxBy((e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary()))); //or
//                            .maxBy(Comparator.comparingDouble(Employee::getSalary)));
//        System.out.println(highestPaidEmployee.orElseThrow());

        /**
         * 5. Get the names of all employees who have joined after 2015?
         */
//        List<String> employeesJoinedAfter2015 = employeeList.stream()
//                .filter(e -> e.getYearOfJoining() > 2015)
//                .map(Employee::getName)
//                .toList();
//        System.out.println(employeesJoinedAfter2015);

        /**
         * 6.  Count the number of employees in each department?
         */
//        Map<String , Long> numberOfEmployeesInEachDept = employeeList.stream()
//                .collect(Collectors
//                        .groupingBy(Employee::getDepartment, Collectors.counting()));
//        System.out.println(numberOfEmployeesInEachDept);

        /**
         * 7. What is the average salary of each department?
         */
//        employeeList.stream()
//                .collect(Collectors
//                        .groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
//                .forEach((dept,avg)-> System.out.println("Dept " + dept + " Avg " + avg));

        /**
         * 8. Get the details of youngest male employee in the product development department?
         */
//        Predicate<Employee> maleEmp = e -> e.getGender().equals("Male");
//        Predicate<Employee>  productDevelopmentEmp = e -> e.getDepartment().equals("Product Development");
//        Predicate<Employee> maleEmpAndProductDevelopment = maleEmp.and(productDevelopmentEmp);
//        Optional<Employee> res = employeeList.stream()
//                .filter(maleEmpAndProductDevelopment)
//                .min(Comparator.comparingInt(Employee::getAge));
////                .orElseThrow();
//
//        System.out.println(res.orElseThrow());

        /**
         * 9. Who has the most working experience in the organization?
         */
        //using min of year of joining
//        String name = employeeList.stream()
//                // Stream<Employee>
//                .min(Comparator.comparingInt(Employee::getYearOfJoining))
//                // terminal op → finds earliest-joining Employee → Optional<Employee>
//                .map(Employee::getName)
//                // Optional.map → Employee → String → Optional<String>
//                .orElseThrow();
//                // extract value or throw if empty
//
//        System.out.println(name);

        /**
         * 10. How many male and female employees are there in the sales and marketing team?
         */
//        employeeList.stream()
//                .filter(employee -> employee.getDepartment().equalsIgnoreCase("Sales And Marketing"))
//                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))            //returns a map
//                .forEach((k,v) -> System.out.println(k + " " + v));

        /**
         * 11.  What is the average salary of male and female employees?
         */
//        employeeList.stream()
//                .collect(Collectors
//                        .groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary) ))
//                .forEach((k,v)-> System.out.println(k + " " + v));

        /**
         * 12.  List down the names of all employees in each department?
         */
//        employeeList.stream()
//                .collect(Collectors
//                        .groupingBy(Employee::getDepartment, Collectors.toList()))
//                .forEach((k,v)-> System.out.println(k + " " + v));

        /**
         * 13. What is the average salary and total salary of the whole organization?
         */
//        DoubleSummaryStatistics result =  employeeList.stream()
//                .collect(Collectors
//                        .summarizingDouble(Employee::getSalary));
//        System.out.println(" Average Salary " + result.getAverage() + " Salary Sum " + result.getSum());
//        System.out.println(STR." Average Salary \{result.getAverage()} Salary Sum \{result.getSum()}"); // this is preview feature of 21 maybe removed

        /**
         * 14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
         */
//        employeeList.stream()
//                .collect(Collectors
////                        .partitioningBy(employee -> employee.getAge() <= 25, Collectors.counting()))
//                        .partitioningBy(employee -> employee.getAge() <= 25))
//                .forEach((k,v)-> System.out.println(k + " " + v));

        /**
         * 15. Who is the oldest employee in the organization? What is his age and which department he belongs to?
         */
//        employeeList.stream()
//                .max(Comparator.comparingInt(Employee::getAge))
////                .map(employee -> System.out.println(employee.getAge() + " " + employee.getDepartment())); // Optional.map expects a function : printing does not return a value so
//                .ifPresent(e-> System.out.println(e.getName()+ " " + e.getAge() + " " + e.getDepartment()));

    }


}
