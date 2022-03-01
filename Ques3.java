package Week6;
import java.util.Random;
import java.util.LinkedList;

class Checker{
    public int NumberGen(LinkedList<Integer> e , int value){
        System.out.println("Value : " + value);
        int temp = -1;
        for(int b = 0; b < e.size(); b++){
            if(e.get(b) == value){
                temp = b;
            }
        }
        return temp;

    }
}

public class Ques3 {

    public static void main(String[] args) {
        int result;
        int temp;

        LinkedList<Integer> linkedList = new LinkedList();
        Random random = new Random();
        for(int i = 0; i < 500; i++) {
            temp = random.nextInt(1000,9999);
            linkedList.add(temp);
        }
        System.out.println(linkedList);

        Checker c = new Checker();
        result = c.NumberGen(linkedList , random.nextInt(1000,9999));
        System.out.println("The position is " + result);
    }
}
