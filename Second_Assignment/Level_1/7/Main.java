import java.util.*;
class Main{
public static void main(String [] args){
double rk=6378.0;
double rm=rk/1.6;
double volumek=(4/3)*Math.PI*rk*rk*rk;
double volumem=(4/3)*Math.PI*rm*rm*rm;
System.out.printf("The volume of earth in cubic kilometers is %f and cubic miles is %f",volumek,volumem);
}
}

