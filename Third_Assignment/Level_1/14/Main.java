import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int temp=sc.nextInt();
        int c=1;
        while (temp != 0){
            c*=temp;
            temp--;
        }

            System.out.println("Factorial of the number is-:"+c);
    }
}