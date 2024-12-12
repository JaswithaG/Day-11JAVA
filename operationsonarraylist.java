import java.util.*;
class operationsonarraylist{
    public static void main(String []args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(18);
        a.add(73);
        a.add(17);
        a.add(9);
        //adding at particular index
        a.add(1,81);
        //modifying 
        a.set(2,13);
        System.out.println(a);
    }
}