import java.util.ArrayList;
public class Gaussian {
    ArrayList<ArrayList<Double>> tabela = new ArrayList<>();
    ArrayList<Double> wagi = new ArrayList<>();
    ArrayList<Double> wartosci = new ArrayList<>();
    Gaussian(){}

    void wypisz(int n) {
        if (n == 2) {
            wagi.add(1.0000000000000000);
            wagi.add(1.0000000000000000);
            wartosci.add(-0.5773502691896257);
            wartosci.add(0.5773502691896257);
        } else if (n == 4) {
            wagi.add(0.6521451548625461);
            wagi.add(0.6521451548625461);
            wagi.add(0.3478548451374538);
            wagi.add(0.3478548451374538);
            wartosci.add(-0.3399810435848563);
            wartosci.add(0.3399810435848563);
            wartosci.add(-0.8611363115940526);
            wartosci.add(0.8611363115940526);
        } else if (n == 6) {
            wagi.add(0.3607615730481386);
            wagi.add(0.3607615730481386);
            wagi.add(0.4679139345726910);
            wagi.add(0.4679139345726910);
            wagi.add(0.1713244923791704);
            wagi.add(0.1713244923791704);
            wartosci.add(0.6612093864662645);
            wartosci.add(-0.6612093864662645);
            wartosci.add(-0.2386191860831969);
            wartosci.add(0.2386191860831969);
            wartosci.add(-0.9324695142031521);
            wartosci.add(0.9324695142031521);
        } else if (n == 8) {
            wagi.add(0.3626837833783620);
            wagi.add(0.3626837833783620);
            wagi.add(0.3137066458778873);
            wagi.add(0.3137066458778873);
            wagi.add(0.2223810344533745);
            wagi.add(0.2223810344533745);
            wagi.add(0.1012285362903763);
            wagi.add(0.1012285362903763);
            wartosci.add(-0.1834346424956498);
            wartosci.add(0.1834346424956498);
            wartosci.add(-0.5255324099163290);
            wartosci.add(0.5255324099163290);
            wartosci.add(-0.7966664774136267);
            wartosci.add(0.7966664774136267);
            wartosci.add(-0.9602898564975363);
            wartosci.add(0.9602898564975363);
        } else if (n == 10) {
            wagi.add(0.2955242247147529);
            wagi.add(0.2955242247147529);
            wagi.add(0.2692667193099963);
            wagi.add(0.2692667193099963);
            wagi.add(0.2190863625159820);
            wagi.add(0.2190863625159820);
            wagi.add(0.1494513491505806);
            wagi.add(0.1494513491505806);
            wagi.add(0.0666713443086881);
            wagi.add(0.0666713443086881);
            wartosci.add(-0.1488743389816312);
            wartosci.add(0.1488743389816312);
            wartosci.add(-0.4333953941292472);
            wartosci.add(0.4333953941292472);
            wartosci.add(-0.6794095682990244);
            wartosci.add(0.6794095682990244);
            wartosci.add(-0.8650633666889845);
            wartosci.add(0.8650633666889845);
            wartosci.add(-0.9739065285171717);
            wartosci.add(0.9739065285171717);
        } else if (n == 16) {
            wagi.add(0.1894506104550685);
            wagi.add(0.1894506104550685);
            wagi.add(0.1826034150449236);
            wagi.add(0.1826034150449236);
            wagi.add(0.1691565193950025);
            wagi.add(0.1691565193950025);
            wagi.add(0.1495959888165767);
            wagi.add(0.1495959888165767);
            wagi.add(0.1246289712555339);
            wagi.add(0.1246289712555339);
            wagi.add(0.0951585116824928);
            wagi.add(0.0951585116824928);
            wagi.add(0.0622535239386479);
            wagi.add(0.0622535239386479);
            wagi.add(0.0271524594117541);
            wagi.add(0.0271524594117541);
            wartosci.add(-0.0950125098376374);
            wartosci.add(0.0950125098376374);
            wartosci.add(-0.2816035507792589);
            wartosci.add(0.2816035507792589);
            wartosci.add(-0.4580167776572274);
            wartosci.add(0.4580167776572274);
            wartosci.add(-0.6178762444026438);
            wartosci.add(0.6178762444026438);
            wartosci.add(-0.7554044083550030);
            wartosci.add(0.7554044083550030);
            wartosci.add(-0.8656312023878318);
            wartosci.add(0.8656312023878318);
            wartosci.add(-0.9445750230732326);
            wartosci.add(0.9445750230732326);
            wartosci.add(-0.9894009349916499);
            wartosci.add(0.9894009349916499);
        }
        tabela.add(wagi);
        tabela.add(wartosci);
        //System.out.println(tabela);
    }
}