package homework_worker;
import java.util.TreeSet;
public class Test {
    public static void main(String[] args) {
        TreeSet<Worker> worker = new TreeSet<>();
        worker.add(new Worker("xixi",20,3000));
        worker.add(new Worker("sasa",23,34000));
        worker.add(new Worker("fafa",10,5340));
        worker.add(new Worker("eart",34,34000));
        worker.add(new Worker("vrhd",25,3000));
        for (Worker w : worker) {
            System.out.println(w);
        }
    }
}

