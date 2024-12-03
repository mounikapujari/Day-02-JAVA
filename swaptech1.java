import java.util.*;
public class swaptech1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int g=s.nextInt();
        int c=b;
        b=g;
        g=c;
        String res=String.format("after Swapping\n boy=%d \n girl=%d",b,g);
        System.out.println(res);
    }
}