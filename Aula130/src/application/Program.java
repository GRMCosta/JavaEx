package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();
        double totalTaxes = 0;

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i=1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Inividual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualincome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expeditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name,anualincome,healthExpenditures));
            }
            else{
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name,anualincome,numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp: list
             ) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
            totalTaxes += tp.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + totalTaxes);



    }
}
