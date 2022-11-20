public class string_to_int {
    public static void main(String[] args){

        String s="age: 47";
        s=s.replaceAll("\\D+", "");
        
        System.out.println(Integer.parseInt(s)+2);
    }
}
