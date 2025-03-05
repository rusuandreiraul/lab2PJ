package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] judete = new String[50];
        Scanner scanner = new Scanner(new File("lab2/src/ex1/judete_in.txt"));
        int idx = 0;

        while (scanner.hasNext()) {
            judete[idx] = scanner.next();
            idx++;
        }
        scanner.close();


        String[] judeteCitite = Arrays.copyOf(judete, idx);
        Scanner scanner1=new Scanner(System.in);
        String judetCautat=scanner1.next().trim();
        if(idx< judeteCitite.length)
        judeteCitite[idx++]=judetCautat;

        String[] judeteFinal = Arrays.copyOf(judeteCitite, idx);

        int poz= Arrays.binarySearch(judeteFinal, judetCautat);

        Arrays.sort(judeteCitite);

        for (String judet : judeteFinal) {
            System.out.println(judet);
        }

        if(poz>0){
            System.out.println("judetul introdus de la tastatura se afla la pozitia: " + poz);
        }
    }
}
