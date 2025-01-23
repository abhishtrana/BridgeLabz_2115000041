import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int price= sc.nextInt();
int quantity= sc.nextInt();
int ans= price*quantity;
System.out.printf("The total purchase price is INR %d if the quantity %d and unit price is INR %d.",ans,quantity,price);
}
}

