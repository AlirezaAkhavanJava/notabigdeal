package Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Action {

    private static final List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Reza", "Golzar", 2.0, List.of("Project Papet", "Project Ahmagh")));
        employees.add(new Employee("Dominic", "Toretto", 20000.0, List.of("Project Bank", "Project Papet")));
        employees.add(new Employee("John", "Wick", 14_000_000.0, List.of("Project Bank", "Project Dog")));
    }

    public static void operation() {


        List<Employee> after_raise = employees.stream()
                .map(employee ->
                        new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.20 /* 20% raise */,
                                employee.getProjects())

                )
                .toList();

        Stream.of(after_raise)
                .forEach(System.out::println);

        String projects = employees.stream()
                .map(Employee::getProjects)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.joining(" , "));
        System.out.println(projects);


        double sumOfSalaries = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println(sumOfSalaries);


    }


    static void main() {
        operation();
    }
}
