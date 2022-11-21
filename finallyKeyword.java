import java.util.Scanner;

public class finallyKeyword {
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
       try{
        System.out.println(scn.next());
       }
       catch(Exception e){
        System.out.println(e);
       }
       finally{
        scn.close();
       }
    }
}
