import java.util.Scanner;
import java.lang.Math;
public class GausLegendre {

    int n;
    double x;
    double a = 1.3;
    double b = 2.5;
    double roznicaPrzedzialu = (b - a)/2;
    double sumaPrzedzialu = (b + a)/2;
    GausLegendre(int n){
        this.n = n;
    }

    void licz(){
        double wynik = 0;
        double wynikKoncowy = 0;
        Gaussian g1 = new Gaussian();
        g1.wypisz(n);
        for (int i = 0; i < n; i++) {
            x = ((roznicaPrzedzialu * g1.wartosci.get(i)) + sumaPrzedzialu);
            //System.out.println(x);
            wynik += g1.wagi.get(i) * liczWzor(x);
            wynikKoncowy = roznicaPrzedzialu * wynik;
        }
        System.out.println("Wynik: " + wynikKoncowy);
    }

    double liczWzor(double x){
        //double wynik = (x-1) / (Math.pow(x,2) + x);
        double wynik = (Math.sqrt(Math.pow(x, 2) + 0.4)) / (1.2 + (Math.sqrt(0.7 * Math.pow(x, 2) + 1.3)));
        //System.out.println(wynik);
        return wynik;
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dla jakiego n chcesz obliczyc przyblizona wartosc calki?: ");
        n = scan.nextInt();
        GausLegendre g1 = new GausLegendre(n);
        g1.licz();
    }
}