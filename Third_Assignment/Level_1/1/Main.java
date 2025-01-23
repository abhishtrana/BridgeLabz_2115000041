import java.util.*;
class Main{
public static void main(String [] args){
boolean temp=false;
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
if(a%5 == 0)
temp = true;
System.out.printf("Is the number %d divisible by 5?%B",a,temp);
}
}

