import java.util.Scanner;
public class Electricty
{
 public static void main(String[] args)
  {
    int units;
    double billtopay = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number of units");
  units = sc.nextInt();
  if (units <= 100) 
  {
   billtopay = units * 10;
  }
  else if(units <= 200)
  {
   billtopay = 100*10+(units-100)*15;
  }
  else if(units <= 300)
  {
   billtopay = 100*10+100*15+(units-200)*20;
  }
  else if(units > 300)
  {
   billtopay = 100*10+100*15+100*20+(units-3000)*25;
  }
  System.out.println("the electricty bill for"+units+"is:"+billtopay);
    }
}  




import java.util.Scanner;
public class Net
{
  public static void main(String[] args)
  {
   double basic;
   double hra = 0;
   double da = 0;
   double gs = 0;
   double income = 0;
   double net = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the basic salary");
    basic = sc.nextInt();
    hra=0.1*basic;
    da=0.73*basic;
    gs=basic+da+hra;
    income=0.3*gs;
    net=gs-income;

  System.out.println("empolyee's net salary is:"+net);
  }
}