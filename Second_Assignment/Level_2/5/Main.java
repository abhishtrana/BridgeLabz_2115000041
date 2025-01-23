import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
double fahrenheit=sc.nextDouble();
System.out.printf("The %f fahrenheit is %f celsius",fahrenheit,(fahrenheit - 32)*5/9);
}
}

