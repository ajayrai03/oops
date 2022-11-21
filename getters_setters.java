public class getters_setters {
    String name;
    int age;
    public static void main(String[] args){

        getters_setters a=new getters_setters();
        // a.age=38;
        // a.name="pablo narula";
        // System.out.println(a.age);
        // System.out.println(a.name);

        // setter - set the value passed
        a.setName("pablo narula");
        a.setAge(38);

        // getter -get the value

        System.out.println(a.getName());
        System.out.println(a.getAge());
    

        a.printDetails();
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }


    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void printDetails(){
        System.out.println(getName()+", "+getAge());
        
    }
}
