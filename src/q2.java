import java.util.*;
class NR{
    private Map<Character,Boolean>streamarr;
    public  NR()
    {
        streamarr=new HashMap<>();
    }
    public void  add(char c)
    {
        if(streamarr.size()==0)
        {
            streamarr.put(c,true);
        }
        else {
            if (streamarr.containsKey(c))
            {
                streamarr.remove(c);

            } else
            {
                streamarr.put( c,true);
            }
        }
    }
    public char getnr()
    {
        Iterator<Map.Entry<Character,Boolean>>it=streamarr.entrySet().iterator();
        if (it.hasNext())
        {
            Map.Entry<Character,Boolean>temp=it.next();
            Character a=temp.getKey();
            return a;
        }
        else
        {
            return '-';
        }
    }
    public void  printMap()
    {
        Iterator<Map.Entry<Character,Boolean>>it=streamarr.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Character,Boolean>temp=it.next();
            Character a=temp.getKey();
            Boolean b=temp.getValue();
            System.out.println(a+"->"+b+",");
        }
    }
}
public class q2 {
    public static void main(String[] args) {
        NR stream = new NR();
        stream.add('a');
        stream.add('b');
        stream.add('a');
        stream.add('c');
        stream.printMap();
        System.out.println("First non-repeating element: "+stream.getnr());
        System.out.println("------"); // Output: 'b'

        stream = new NR();
        stream.add('a');
        stream.add('b');
        stream.add('a');
        stream.add('b');
        stream.add('c');
        stream.printMap();
        System.out.println("First non-repeating element: "+stream.getnr());
        System.out.println("------");
        stream = new NR();
        stream.add('a');
        stream.add('b');
        stream.add('b');
        stream.add('c');
        stream.printMap();
        System.out.println("First non-repeating element: "+stream.getnr());
        System.out.println("------");
        // Output: 'a'
    }

}
