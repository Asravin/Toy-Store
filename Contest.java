import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Contest {

    public static ArrayList<Product> prod = new ArrayList<>();
    public static PriorityQueue<Product> elem = new PriorityQueue<>();
    public static int count = 0;

    public static boolean NFE(String str) throws NumberFormatException {
        try {
            Integer.parseInt(str);
            return true;

        }catch(NumberFormatException exc) {
            return false;
        }

    }

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        String text;
        int contest;

        while(true) {
            System.out.println("Введите название игрушки :");
            text = sc.nextLine();

            if(text.isEmpty()) {
                System.out.println("Неверная информация, повторите ввод: ");
                break;
            }

            System.out.println("Введите частоту выпаденяи игрушки: ");
            String val = sc.nextLine();

            if(NFE(val)) {
                contest = Integer.parseInt(val);
                
                if(contest <= 0) {
                    System.out.println("Неверная информация, повторите ввод: ");

                }else{
                    Product product = new Product(count, contest, text);

                    if(!prod.contains(product) || prod.size() == 0) {
                        count++;
                        prod.add(product);
                        System.out.println("Добавлена игрушка в коллекцию");

                    }else{
                        System.out.println("Эта игрушка уже в коллекции");
                    }
                }

            }else{
                System.out.println("Неверная информация, повторите ввод: ");
            }

            break;
        }
    }
}

