import java.util.*;
interface printable{
}
class h implements printable{
    public void print(){
        System.out.println("Hello J");
    }
}
public class markerinterface{
    public static void main(String []args){
        h a=new h();
        a.print();
    }
}