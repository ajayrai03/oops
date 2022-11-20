public class tryCatch {
    
    public static void main(String[] args){
        
        try{
            int[] a={4,5,1};
            System.out.println(a[3]);
        }
        catch(NullPointerException e){
            System.out.println("your array is null!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("your array is out of bound!");
        }
        catch(Exception e){
            System.out.println("Something else went wrong!");
        }
        // String a="";
        // System.out.println(a.length());
    }
}
