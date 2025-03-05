package ex4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exe4 {

    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("n: ");
        n=s.nextInt();
        Persoana []persoane=new Persoana[n];
        for(int i=0; i<n; i++){
            System.out.println("Introdu nume: ");
            String nume=s.next();
            boolean result;
            String cnp;
            do {
                System.out.println("Introdu CNP: ");
                cnp= s.next();
                result = Persoana.verificaCnp(cnp);
            }while(result==false);

            persoane[i]=new Persoana(nume, cnp);
            persoane[i].setVarsta(cnp);
        }

        for(int i=0; i<persoane.length; i++){
            System.out.println("nume: " + persoane[i].getNume() + " CNP: " + persoane[i].getCnp() + " varsta: " + persoane[i].getVarsta());

        }

    }
}
