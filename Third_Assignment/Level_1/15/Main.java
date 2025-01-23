import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int temp=sc.nextInt();
        int c=1;
        for (;temp != 0 ;temp--){
            c*=temp;
        }
        System.out.println("Factorial of the number is-:"+c);
    }
}