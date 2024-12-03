import java.util.*;
public class swaptech2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        String res=String.format("after Swapping\n boy=%d \n girl=%d",a,b);
        System.out.println(res);
    }
}