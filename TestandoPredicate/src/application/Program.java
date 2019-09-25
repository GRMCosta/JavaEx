package application;

import entitie.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        double min = 100.00;

        list.removeIf(p -> p.getPrice() >= min); //Predicate
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); // Consumer
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());//Function

        names.forEach(System.out::println);

        for(Product p: list){
            System.out.println(p);
        }
    }
}
