import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if(a>=1){
System.out.printf("The sum of %d natural numbers is %d.",a,a*(a+1)/2);
}
else{
System.out.printf("The number %d is not a natural number",a);}
}
}


