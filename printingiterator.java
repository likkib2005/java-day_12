import java.util.*;
class printingiterator
{
    public static void main(String args[])
    {
        LinkedHashSet<String>a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("students");
        a.add("rajesh");
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
}