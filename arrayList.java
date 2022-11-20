import java.util.ArrayList;

public class arrayList {
    
    public static void main(String[] args){
        String[] fruits=new String[4];
        fruits[0]="mango";
        fruits[1]="apple";
        fruits[2]="strawberry";
        fruits[3]="watermelon";
        System.out.println(fruits[1]);

        ArrayList fruitList=new ArrayList<>();
        fruitList.add("mango");
        fruitList.add("apple");
        fruitList.add("strawberry");
        fruitList.add("watermelon");
        fruitList.remove("apple");
        System.out.println(fruitList.contains("apple"));
        fruitList.clear();
        System.out.println(fruitList);

    }
}
