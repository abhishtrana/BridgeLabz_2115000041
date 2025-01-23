import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int temp=1;
        while (a >= temp){
            if(temp%2 == 0){
                System.out.println(temp+" is Even");
            }else {
                System.out.println(temp+" is Odd");
            }
            temp++;
        }
    }
}