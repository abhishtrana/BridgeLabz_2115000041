import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int temp=sc.nextInt();
        int res=temp*(temp+1)/2;
        int c=0;
        while (temp != 0){
            c+=temp;
            temp--;
        }
        if(res == c){
            System.out.println("Formula and while loop answers match.");
        }
        else {
            System.out.println("Formula and while loop do not match.");
        }
    }
}