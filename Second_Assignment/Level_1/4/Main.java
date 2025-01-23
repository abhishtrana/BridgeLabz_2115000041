class Main{
public static void main(String [] args){
int cost=129;
int sell=191;
int profit=sell - cost;
float profit_percentage=((float)profit/(float)cost)*100;
System.out.printf("The Cost Price is INR %d and Selling Price is INR %d. %nThe Profit is INR %d and the Profit Percentage is %f.",cost,sell,profit,profit_percentage);
}
}

