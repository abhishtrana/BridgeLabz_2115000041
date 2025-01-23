import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

boolean temp1=false;
boolean temp2=false;
boolean temp3=false;
if(a > b && a > c){
temp1=true;}
else if(b > a && b > c){
temp2=true;}
else if(c>a && c > b){
temp3=true;}
System.out.printf("Is the first number the largest? %B %nIs the second number the largest?%B %nIs the third number the largest?%B",temp1,temp2,temp3);
}
}
