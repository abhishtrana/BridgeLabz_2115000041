import java.util.*;                                              
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
System.out.printf("The results of Int Operations are %f, %f, %f and %f",a + b *c, a * b + c, c + a / b, a % b + c);
}
}

