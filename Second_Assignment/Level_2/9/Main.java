import java.util.*;
public class Main{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int side1=sc.nextInt();
int side2=sc.nextInt();
int side3=sc.nextInt();
int perimeter=side1+side2+side3;
int round=5/perimeter;
if(round==0)
round=1;
System.out.println("The total number of rounds the athlete will run is "+round+" to complete 5 km");
}
}

