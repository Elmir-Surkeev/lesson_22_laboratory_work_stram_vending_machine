import java.util.*;

import static java.lang.System.*;

public class Action {
    static double MINIMAL_PRICE = 40;

    public static void main() {
        VendingMachine machine = new VendingMachine();
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
                machine.showAllProducts();
                int cash = 0;
                out.println("Введите 0 для выхода из программы \n" +
                        "Введите 1 для пополнения баланса \n" +
                        "Введите 2 для покупки товара");
                int choice = sc.nextInt();
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        out.println("Можете вводить монеты\n" +
                                "Текущий баланс = " + machine.getBalance());
                        cash = sc.nextInt();
                        machine.addCash(cash);
                        out.println("Вы пополнили до = " + machine.getBalance());
                        break;
                    case 2:
                        if (machine.getBalance() >= MINIMAL_PRICE) {
                            out.println("Вы можете купить (без ввода дополнительных монет)");
                            machine.filterProducts();
                            out.println("Введите название товара \n" +
                                    " (S) для выхода в меню или (A) для ввода монет");

                            String productName = sc.next();

                            try {
                                switch (productName) {
                                    case "S":
                                        break;
                                    case "A":
                                        out.println("Можете вводить монеты\n" +
                                                "Текущий баланс = " + machine.getBalance());
                                        cash = sc.nextInt();
                                        machine.addCash(cash);
                                        out.println("Вы пополнили до = " + machine.getBalance());
                                        break;
                                    case "PEPSI":
                                        machine.buyProduct(productName.toUpperCase());
                                        break;
                                    case "COLA":
                                        machine.buyProduct(productName.toUpperCase());
                                    case "LEGENDA":
                                        machine.buyProduct(productName.toUpperCase());
                                        break;
                                    default:
                                        machine.buyProduct(productName.toUpperCase());
                                }
                            }
                            catch (NumberFormatException e) {
                                out.println("Вы ввели некорректные данные.");
                            }
                        }
                        else {
                            double differenceForBuy = MINIMAL_PRICE - machine.getBalance();
                            out.println("Для минимальной покупки, требуется " + differenceForBuy + " сом");
                        }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
