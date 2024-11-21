import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.lang.System;
import static java.lang.System.in;
import static java.lang.System.out;

public class Action {
    static List<Products> products = Collections.singletonList(new Products());
    public static void main() {
        Scanner sc = new Scanner(in);

        out.println("Продукты доступные в автомате");
        out.println(products.toString());

        while (true) {
            out.println("Вставьте купюру монету (Принимаются только 5, 10, 20, 50, 100)\n" +
                        "Автомат сдачи не выдает");
            int cash = sc.nextInt();
            out.println("на счету " + cash);
            if (cash >= 40){
                out.println("Введите 1 чтобы закинуть еще монет");
                int choice = sc.nextInt();
                switch (choice){
                    case 0:
                        return;
                    case 1:
                        cash += sc.nextInt();
                        break;
                    case 2:
                        products.stream();
                        buyProduct(cash);
                        break;
                }
            }
        }
    }
    public static void buyProduct(int cash) {

    }
}
