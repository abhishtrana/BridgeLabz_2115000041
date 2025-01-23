import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c = a;
a=b;
a=c;
System.out.printf(" The swapped numbers are  %d and %d",b,a);
}
}

