import java.util.ArrayList;

public class forEachLoop {
    
    public static void main(String[] args){
        String[] cars={"toyota","thar","nexon"};
        // for(int i=0;i<cars.length;i++){
        //     System.out.println(cars[i]);
        // }
        
        // for each illustration

        for(String car:cars){
            System.out.println(car);
        }

        // arrayList

        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        for(int a:al){
            System.out.println(a);
        }
    }
}
