import java.util.*;
public class arraylisttoarrayobj{
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(898);
        a.add(89);
        a.add(1);
        object b[]=new object(a.toArray());
        System.out.println(Arrays.toString(b));
    }
}