import java.util.*;
class stringhashset_1
{
    public static void main(String args[])
    {
        LinkedHashSet<String>a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("students");
        a.add("krishna");
        System.out.println(a);
        a.remove("Hello");
    }
}