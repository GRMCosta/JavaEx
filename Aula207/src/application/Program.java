package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
        Map<String, Integer> candidates = new LinkedHashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {


            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String cand = fields[0];
                int votes = Integer.parseInt(fields[1]);
                if(candidates.containsKey(cand)){
                    candidates.put(cand, votes + candidates.get(cand));
                }
                else{
                    candidates.put(cand, votes);
                }

                line = br.readLine();
            }
            for (String key : candidates.keySet()) {
                System.out.println(key + " : " + candidates.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
