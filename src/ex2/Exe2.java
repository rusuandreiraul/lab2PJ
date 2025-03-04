package ex2;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        String sir1, sir2;
        sir2="andrei ";
        Scanner scanner=new Scanner(System.in);
        sir1=scanner.nextLine();

        StringBuilder sb=new StringBuilder(sir2);
        sb.append(sir1);

        System.out.println(sb);

        sb.delete(0,6);

        System.out.println(sb);


    }
}
