import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int salary=sc.nextInt();
        int years=sc.nextInt();
        if(years >5){
            System.out.printf("Your Bonous Amount is -:%f",salary*0.05);
        }
        else{
            System.out.println("Sorry No Bonus For You!!");
        }
    }
}