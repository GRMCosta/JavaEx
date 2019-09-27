package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args){

        List<Product> list = Arrays.asList(new Product("Tv", 900.00),
                new Product("Mouse", 50.00),
                new Product("Tablet", 350.50),
                new Product("HD Case", 80.90),
                new Product("Computer", 850.00),
                new Product("Monitor", 290.00));


        double media = list.stream().mapToDouble(Product::getPrice).sum() / list.size();
        System.out.println("Average price: " + String.format("%.2f",media));

        Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        List<String> result = list.stream().filter(p -> p.getPrice() < media).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());
        result.forEach(System.out::println);



    }
}
