import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book[] = new Book[6];
        book[0] = new ProgrammingBook("A001", "JavaBook", 5000, "John", "java", "Java");
        book[1] = new ProgrammingBook("A002", "JsBook", 10, "Ash", "js", "JS");
        book[2] = new ProgrammingBook("A003", "HtmlBook", 7000, "Unknown", "html", "HTML");
        book[3] = new FictionBook("A004", "BookA", 8000, "Khanh", "vien tuong 1");
        book[4] = new FictionBook("A005", "BookB", 70, "Unknown2", "vien tuong 2");
        book[5] = new FictionBook("A006", "BookC", 60, "Unknown3", "vien tuong 2");


        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Tổng tiền của 6 cuốn sách");
            System.out.println("2. Số sách ProgrammingBook có language là Java");
            System.out.println("3. Đếm số sách Fiction có category là Viễn tưởng 1");
            System.out.println("4. Đếm số sách Fiction có giá <100");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tổng tiền của 6 cuốn sách : " + totalPrice(book));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Số sách ProgrammingBook có language là Java: " + findName(book, "java"));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Đếm số sách Fiction có category là Viễn tưởng 1: " + findCategory(book, "vien tuong 1"));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Đếm số sách Fiction có giá <100: " + findPrice(book));
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }


    public static int totalPrice(Book arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].getPriceFL();
        }
        return total;
    }

    public static int findName(Book arr[], String name) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof ProgrammingBook) {
                if (((ProgrammingBook) arr[i]).getLanguage().equals(name)) {
                    count++;
                }
            }

        }
        return count;
    }

    public static int findCategory(Book arr[], String name) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof FictionBook) {
                if (((FictionBook) arr[i]).getCategory().equals(name)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int findPrice(Book arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof FictionBook) {
                if (arr[i].getPriceFL() < 100) {
                    count++;
                }
            }
        }
        return count;
    }
}