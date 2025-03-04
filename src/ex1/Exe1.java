package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] judete = new String[50];
        Scanner scanner = new Scanner(new File("src/ex1/judete_in.txt"));
        int idx = 0;

        while (scanner.hasNext()) {
            judete[idx] = scanner.next();
            idx++;
        }
        scanner.close();


        String[] judeteCitite = Arrays.copyOf(judete, idx);

        Arrays.sort(judeteCitite);

        for (String judet : judeteCitite) {
            System.out.println(judet);
        }
    }
}
