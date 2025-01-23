import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int fee=sc.nextInt();
int discountp=sc.nextInt();
int discount=(fee*discountp)/100;
System.out.printf("The discount amount is INR %d and final discounted fee is INR %d.",discount,fee-discount);
}
}
