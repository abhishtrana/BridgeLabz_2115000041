import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
boolean temp=false;
if(a < b && a < c)
temp=true;
System.out.printf(" Is the first number the smallest? %B",temp);
}
}

