import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if(a>=18){
System.out.printf("The person's age is %d and can vote.",a);
}
else{
System.out.printf("The person's age is %d and cannot vote.",a);
}
}
}
