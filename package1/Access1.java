package package1;

public class Access1 {
    // default,public,private,protected

    //.1 default - accessible in same package
    // int hours=3;
    // int minutes=47;

    // 2. public - accessible in everywhere
    // public int hours=3;
    // public int minutes=47;
    
    //3.private -accessible in same file only

    // private int hours=3;
    // private int minutes=47;

    // 4. protected - accessible in same package but by building relationship of    child and parent we can access it

    protected int hours=3;
    protected int minutes=47;
}
