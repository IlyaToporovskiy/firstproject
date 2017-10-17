import Sladosty.Candy;
import Sladosty.ChupaChups;
import Sladosty.Jellybean;
import Sladosty.KinderSurprise;
/**
 * @autor Ilya Toporovskiy
 * @date 17.10.2017
 *
 * задача на нахождение  веса и цены подарка + вывод на консоль
 */
public class Podarok {

     double sumWeight = 0;
     double sumPrice= 0;

    public static void main(String[] args) {

        Jellybean mentos = new Jellybean("Mentos Pure Fresh Mint", 2.50, 3.69, "мятный бальзам");
        KinderSurprise bigEgg = new KinderSurprise("Большой киндер", 3.15, 7.69, "собачка");
        ChupaChups xxl = new ChupaChups("XXL", 1.35, 1.2, "малиновая");
        Candy[] box = {mentos, bigEgg, xxl};
        for (Candy someCandy : box) {
            System.out.println(someCandy.toString());

        }
        double sumWeight ;
        double sumPrice;

        sumWeight = mentos.weight+ bigEgg.weight+xxl.weight; // Общий суммарный вес подарков
        sumPrice = mentos.price+ bigEgg.price+xxl.price; // Общая цена
        System.out.println("Общий суммарный вес подарков  "+sumWeight + " грамм");
        System.out.println("Общая цена "+sumPrice + " руб.");
    }
}
