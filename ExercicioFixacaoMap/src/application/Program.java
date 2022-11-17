package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> elections = new LinkedHashMap<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.valueOf(fields[1]);

                if (elections.containsKey(name)) {
                    Integer votesSoFar = elections.get(name);
                    elections.put(name, votes + votesSoFar);
                } else {
                    elections.put(name, votes);
                }
                line = br.readLine();
            }

            for (String key : elections.keySet()) {
                System.out.println(key + ": " + elections.get(key));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
