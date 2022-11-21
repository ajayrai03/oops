package oop_intro;

interface waterBottleInterface{
    String color="blue";
    void fillUp();
}
public class interfaceExample implements waterBottleInterface{
  
    public static void main(String[] args){
        System.out.println(color);
        interfaceExample ex=new interfaceExample();
        ex.fillUp();

    }

    @Override
    public void fillUp() {
       System.out.println("It is filled");
        
    }
}
