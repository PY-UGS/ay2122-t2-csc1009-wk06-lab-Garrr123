package Week6;

import kotlin.reflect.jvm.internal.ReflectProperties;

import java.util.*;

class Sorter{
    public void addnSort(LinkedList<Integer> e , int value){
        System.out.println("Before : " + e);
        int Temp = 0;

        for(int b = 0; b < e.size(); b++){
            if (e.get(b) > value && value < e.get(b + 1)){
                e.add(b , value);
                Temp = 1;
                break;
            }else if(value == e.get(b)){
                e.add(b , value);
                Temp = 1;
                break;
            }
        }
        if(Temp == 0){
            e.add(value);
        }
        System.out.println("After : " +  e);
    }
}

public class Ques1 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();

        for(int i = 1; i < 12; i = i + 2) {
            linkedList.add(i);
        }

        Sorter e = new Sorter();
        System.out.println("Enter a value : ")
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        e.addnSort(linkedList , a);



    }
}
