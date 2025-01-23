import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int height=sc.nextInt();
float inches=(float)height/(float)2.54;
float feet=inches/12;
System.out.printf("Your Height in cm is %d while in feet is %f and inches is %f.",height,feet,inches);
}
}


