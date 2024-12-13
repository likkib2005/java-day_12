import java.util.*;
class hashmap
{
    public static void main(String args[])
    {
        HashMap<String,String>a=new HashMap<>();
        a.put("Sno","01");
        a.put("Sname","likitha");
        System.out.println(a);
        //printing hashmap keyvalue//
        if(a.containsKey("Sno"))
        {
            String d=a.get("Sno");
            System.out.println(d);
        }
    }
}