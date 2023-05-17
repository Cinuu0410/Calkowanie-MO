import java.util.ArrayList;
import java.util.Arrays;

public class Numeryczne {
    double a;
    double b;
    double n;
    double h;
    double wzor;

    Numeryczne(double a, double b, int n)
    {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    void metodaTrapezow(){
        double punkt;
        double suma = 0;
        double wynik;
        h = (b - a) / n;
        for (int i = 1; i <= n - 1; i++) {
            punkt = a + ((i / n) * (b - a));
            //System.out.println(punkt);
            liczZeWzoru(punkt);
            //System.out.println(wzor);
            suma += wzor;
        }
        wynik = h * (liczZeWzoru(a)/2 + suma + liczZeWzoru(b)/2);
        System.out.println("Metoda trapezów: \nWynik: " + wynik);
    }

    void metodaSimpsona(){
        ArrayList<Double> punkty = new ArrayList<>();
        punkty.add(a);
        double wynik;
        double punkt;
        double punktti;
        double suma1 = 0;
        double suma2 = 0;
        for (int i = 1; i <= n - 1; i++) {
            punkt = a + ((i / n) * (b - a));
            //System.out.println(punkt);
            punkty.add(punkt);
            liczZeWzoru(punkt);
            //System.out.println(wzor);
            suma2 += 2 * wzor;
        }
        punkty.add(b);
        h = (punkty.get(1) - punkty.get(0)) / 2;

        for (int i = 0; i <= n - 1; i++) {
            punktti = (punkty.get(i+1) + punkty.get(i)) / 2;
            //System.out.println(punktti);
            liczZeWzoru(punktti);
            suma1 += 4 * wzor;
        }
        wynik = (h/3) * (liczZeWzoru(a) + suma1 + suma2 + liczZeWzoru(b));
        System.out.println("Metoda Simpsona: \nWynik: " + wynik);
    }

    double liczZeWzoru(double x){
        //wzor = Math.pow(x, 2);
        wzor = (Math.sqrt(Math.pow(x, 2) + 0.4)) / (1.2 + (Math.sqrt(0.7 * Math.pow(x, 2) + 1.3)));
        return wzor;
    }

    public static void main(String[] args) {
        //Numeryczne c1 = new Numeryczne(1, 4, 3);
        Numeryczne c1 = new Numeryczne(1.3, 2.5, 4);
        c1.metodaTrapezow();
        c1.metodaSimpsona();
    }
}
