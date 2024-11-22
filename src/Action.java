import java.util.*;
import java.lang.System;

import static java.lang.System.*;

public class Action {
    static double MINIMAL_PRICE = 40;

    public static void main() {
        Vending_Machine machine = new Vending_Machine();
        //Вопрос мог ли я использовать, свой рандом ENUM не ломая логику
        //в Enum имя + цена + количество, так чтобы был каждый товар (ps при Random некоторые товары могут повторятся
        //Вопрос лучше так добавить несколько строк добавления товара, или же прописывать логику,
        // если при Random 1 товар два раза, то добавлять все count в один тип товара
        machine.addProduct((new Product("PEPSI", 90)));
        machine.addProduct((new Product("COLA", 85)));
        machine.addProduct((new Product("LEGENDA", MINIMAL_PRICE)));

        Scanner sc = new Scanner(in);
        try {
            while (true) {
                int cash = 0;
                out.println("Введите 0 для выхода из программы \n" +
                        "Введите 1 для пополнения баланса \n" +
                        "Введите 2 для просмотра, остатка товаров \n"+
                        "Введите 3 для покупки товара");
                int choice = sc.nextInt();
                switch (choice){
                    case 0:
                        break;
                    case 1:
                        out.println("Можете вводить монеты");
                        cash = sc.nextInt();
                        machine.addCash(cash);
                        break;
                    case 2:
                        machine.showAllProducts();
                        break;
                    case 3:
                        //для метода по покупке товара
                        break;
                    default:
                        throw new RuntimeException();

                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
