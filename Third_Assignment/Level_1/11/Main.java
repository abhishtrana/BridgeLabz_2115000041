import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double temp=0.0;
        while (true){
            double d=sc.nextDouble();
            if(d <= 0){
                break;
            }
            temp+=d;
        }
        System.out.println("The total sum is -:" + temp);
    }
}