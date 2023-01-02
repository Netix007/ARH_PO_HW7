import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Database newDatabase = new Database(Collections.EMPTY_LIST);
        Scanner scanner = new Scanner(System.in);
        boolean f = true;
        while(f) {
            System.out.println("ВЫБЕРИТЕ КАКОЙ ОТЧЕТ ВЫ ХОТИТЕ СФОРМИРОВАТЬ");
            System.out.println("=======================");
            System.out.println("1. ОТЧЕТ ЗА МЕСЯЦ");
            System.out.println("2. ОТЧЕТ ЗА ГОД");
            System.out.println("0. ОТЧЕТ НЕ НУЖЕН");
            System.out.print("Пожалуйста, выберите пункт меню: ");
            if (scanner.hasNextInt()) {
                int no = scanner.nextInt();
                scanner.nextLine();

                try {
                    switch (no) {
                        case 0:
                            System.out.println("Возвращайтесь");
                            f = false;
                            break;
                        case 1:
                            new Report(newDatabase.getTransactionsYear(9)).saveToFile();
                            System.out.println("Отчет сформирован.");
                            break;
                        case 2:
                            new Report(newDatabase.getTransactionsYear(2022)).saveToFile();
                            System.out.println("Отчет сформирован.");
                            break;

                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Укажите корректный пункт меню.");
                scanner.nextLine();
            }
        }
    }

}
