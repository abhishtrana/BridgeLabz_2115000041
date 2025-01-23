import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int number=sc.nextInt();
System.out.printf("Number of Possible Handshakes are-: %d",(number * (number - 1)) / 2);
}
}

