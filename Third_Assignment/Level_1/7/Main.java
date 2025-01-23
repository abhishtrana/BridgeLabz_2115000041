import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
if(a >=3 && a <= 6 ){
if((a == 3) && (b < 20)){
System.out.println("Not Spring Season");
}
else if((a==6) && (b>20)){
System.out.println("Not Spring Season");
}
else{
System.out.println("Spring Season");
}
}
else
System.out.println("Not Spring");
}
}
