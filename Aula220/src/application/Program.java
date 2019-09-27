package application;

import entities.People;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<People> people = Arrays.asList(new People("Maria", "maria@gmail.com", 3200.00),
                new People("Alex", "alex@gmail.com", 1900.00),
                new People("Marco", "marco@gmail.com", 1700.00),
                new People("Bob", "bob@gmail.com", 3500.00),
                new People("Anna", "anna@gmail.com", 2800.00));

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        List<String> emails = people.stream().filter(p -> p.getSalary() > salary).map(p -> p.getEmail()).sorted(comp).collect(Collectors.toList());
        System.out.println("Email of people whose salary is more than " + salary + " :");
        emails.forEach(System.out::println);

        System.out.print("Enter letter: ");
        char letter = sc.next().charAt(0);

        double sum = people.stream().filter(p -> p.getName().charAt(0) == letter).map(p -> p.getSalary()).reduce((double) 0,(x , y) -> (x + y));
        System.out.println("Sum of salary of people whose name starts with " + letter + " : " + String.format("%.2f", sum));
    }
}
