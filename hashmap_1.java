import java.util.*;
class hashmap_1
{
    public static void main(String args[])
    {
        HashMap<String,String>a=new HashMap<>();
        a.put("Sno","01");
        a.put("Sname","likitha");
        a.put("city","banglore");
        System.out.println(a);
        //modifying value for key//
        a.put("Sno","90");
        System.out.println(a);
        a.remove("Sname");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}