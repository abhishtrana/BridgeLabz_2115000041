import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
double base=sc.nextDouble();
double height= sc.nextDouble();
double basei=base/2.54;
double heighti=height/2.54;
double basef=basei/12;
double heightf=heighti/12;
System.out.printf("Your Area of triangel in Square cm is %f while in Square feet is %f and Square inches is %f",0.5*base*height,0.5*basef*heightf,0.5*basei*heighti);
}
}

