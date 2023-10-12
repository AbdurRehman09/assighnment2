import java.util.*;
class merge{
    List<int[]>intervals;
    public merge(List<int[]>in){
        intervals=in;
    }
    public void merging() {
        for (int i = 0; i < intervals.size() - 1; i++) {
            int[] a1 = intervals.get(i);
            if (intervals.get(i + 1) != null) {
                int[] a2 = intervals.get(i + 1);
                if (a1[a1.length - 1] > a2[0]) {
                    int temp = a2[a2.length - 1];
                    intervals.remove(i + 1);
                    a1[a1.length - 1] = temp;
                }
            }
        }
    }
    public void Display()
    {
        Iterator<int[]>it=intervals.iterator();
        while(it.hasNext())
        {
            int[]temp=it.next();
            int i=0;
            System.out.print("[");
            while(i<temp.length)
            {

                if(i!=temp.length-1)
                {
                    System.out.print(temp[i]+",");
                }
                else
                {
                    System.out.print(temp[i]);
                }
                i++;
            }
            System.out.println("]");
        }
    }
}
public class q3  {
    public static void main(String[] args) {
        List<int[]> intervals = new ArrayList<>();

        intervals.add(new int[]{1, 3});
        intervals.add(new int[]{17, 20});
        intervals.add(new int[]{8, 10});
        intervals.add(new int[]{2, 6});
        intervals.add(new int[]{15, 18});
        intervals.sort(Comparator.comparingInt(interval->interval[0]));
        merge intervalMerger = new merge(intervals);

        intervalMerger.Display();

        System.out.println("---------");
        intervalMerger.merging();
        intervalMerger.Display();

    }

}

