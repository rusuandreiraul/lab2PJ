package ex4;

import javax.swing.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persoana {
    private String nume;
    private String cnp;
    private long varsta;

    public Persoana(String n, String c){
        nume=n;
        cnp=c;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public long getVarsta() {
        return varsta;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setVarsta(String cnp) {
        int secol = 0;
        char sex = cnp.charAt(0);

        if (sex == '1' || sex == '2') {
            secol = 1900;
        } else if (sex == '5' || sex == '6') {
            secol = 2000;
        }


        int an = secol + Integer.parseInt(cnp.substring(1, 3));
        int luna = Integer.parseInt(cnp.substring(3, 5));
        int ziua = Integer.parseInt(cnp.substring(5, 7));
            LocalDate dataNastere = LocalDate.of(an, luna, ziua);
            LocalDate dataCurenta = LocalDate.now();
            this.varsta = ChronoUnit.YEARS.between(dataNastere, dataCurenta);
    }


    public static boolean verificaCnp(String cnp){
            if(!cnp.matches("^[0-9]{13}$"))
                return false;


        if(cnp.length()==13 && (cnp.startsWith("1") || cnp.startsWith("2") || cnp.startsWith("5") || cnp.startsWith("6"))){
            return true;
        }
        return false;
    }
}

