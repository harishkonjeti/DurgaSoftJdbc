package org.core.java.java8f.features.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;

}
public class StreamFunctions {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 55000, 28),
                new Employee(2, "Bob", "IT", 70000, 32),
                new Employee(3, "Charlie", "Finance", 80000, 45),
                new Employee(4, "David", "IT", 65000, 26),
                new Employee(5, "Eve", "HR", 72000, 41)
        );
//        System.out.println(employees);

        // Find the employees based on their age
        List<Employee> employeesByAge = employees.stream()
                .filter(e -> e.getAge() > 30)
                .collect(Collectors.toList());
        System.out.println("employeesByAge : " + employeesByAge);

        // Find the employees based on their salary
        List<Employee> employeesBySalary = employees.stream()
                .filter(e -> e.getSalary() > 70000)
                .collect(Collectors.toList());
        System.out.println("employeesBySalary : " + employeesBySalary);

        //Sort employees by age
        List<Employee> employeesByAgeSorted = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println("employeesByAgeSorted : " + employeesByAgeSorted);

        //Sort employees by age in reverse
        List<Employee> employeesByAgeSortedDesc = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println("employeesByAgeSortedDesc : " + employeesByAgeSortedDesc);

        //Sort employees by salary
        List<Employee> employeesBySalarySorted = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println("employeesBySalarySorted : " + employeesBySalarySorted);

        List<Employee> employeesBySalarySortedDesc = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .collect(Collectors.toList());
        System.out.println("employeesBySalarySortedDesc : " + employeesBySalarySortedDesc);

        //Sort employees by name
        List<Employee> employeesByNameSorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println("employeesByNameSorted : " + employeesByNameSorted);

        //Get employees names
        List<String> employeesNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("employeesNames : " + employeesNames);

        //Get employees average salary
        Double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("averageSalary : " + averageSalary);

        //Get employees max salary
        Double maxSalary = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .map(Employee::getSalary)
                .orElse(0.0);
        System.out.println("maxSalary : " + maxSalary);

        //Get employees min salary
        Double minSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .min()
                .orElse(0.0);
        System.out.println("minSalary : " + minSalary);

        //Get employees sum salary
        Double sumSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("sumSalary : " + sumSalary);

        //grouping employees by department
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("employeesByDepartment : " + employeesByDepartment);

        Map<String, List<String>> employeesNamesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("employeesNamesByDepartment : " + employeesNamesByDepartment);

        //partitioning employees by salary
        Map<Boolean, List<Employee>> partitionedBySalary = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary()>60000));
        System.out.println("partitionedBySalary : " + partitionedBySalary);

        //employee count by department
        Map<String, Long> empCountByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println("empCountByDept : " + empCountByDept);

        //all matching
        boolean allHighSalary = employees.stream()
                .allMatch(e -> e.getSalary()>50000);
        System.out.println("allHighSalary : " + allHighSalary);

        //any matchers
        boolean anyInHr = employees.stream()
                .anyMatch(employee -> employee.getDepartment().equalsIgnoreCase("Hr"));
        System.out.println("anyInHr : " + anyInHr);

        double sumOfSalaries = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println("sumOfSalaries : " + sumOfSalaries);

        // Concatenate all employee names into a single string
        String concatenatedNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated Names: " + concatenatedNames);

        // Find the oldest employee
        Employee oldestEmployee = employees.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .orElse(null);
        System.out.println("Oldest Employee: " + oldestEmployee);
    }
}
