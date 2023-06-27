import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Contest {

    private List<Toy> list = new ArrayList<>();
    private int count;
    
    

    public List<Toy> getToy() {
        return list;
     }

    public int getCount() {
        System.out.println("Количество розыгрываемых игрушек: " + count);
        return count;
    }

 
    public List<Toy> addToy(Toy product) {
        list.add(product);
        count++;
        return list;
    }


    public void writeContest() {
        try(FileWriter f = new FileWriter("save.txt", true)) {
            String text = list.get(0).getProduct();
            f.write(text + "\n");
            f.close();
        
        }catch(Exception e) {
            System.out.println("Ошибка");
        }
    }
    public void readContest() {
        try{
            FileReader r = new FileReader("save.txt");
            BufferedReader reader = new BufferedReader(r);
            String text = reader.readLine();

            while(text != null) {
                System.out.println(text);
                text = reader.readLine();
        }

        }catch(Exception e) {
            System.out.println("Ошибка");
        }
    }

    public void contestToy() {
        int victory = 30;
        System.out.println("Испытай удачу!");
        Random random = new Random();
        int number = random.nextInt(50);

        if(number > victory) {
            System.out.println("Вы проиграли!");

        }else if(number < victory) {
            System.out.println("Вы победили!");
            writeContest();
            deleteToy(list.get(0));
        }
    }
    
   
    public List<Toy> deleteToy(Toy product) {
        list.remove(product);
        count--;
        return list;

    }
   

    
    



   
}
