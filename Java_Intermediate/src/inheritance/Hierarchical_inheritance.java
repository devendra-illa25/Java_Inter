package inheritance;

//Hierarchical inheritance :One super class and Two sub classes
class Bank   //Ex‐1
{
  int accno=23456;
  String accname="John";
  double availbal=2000;
  public void details()
  {
     System.out.println("Acc name : "+accname+" Acc no : "+accno);
   }
}
class Deposit extends Bank
{
    double amt=6000.5;
    public void deposit()
    {
availbal = availbal + amt;
System.out.println("Amount deposited : "+availbal);
    }
}
class Withdrawl extends Bank
{
  double wamt=3000;
  public void witamt()
  {
availbal = availbal‐wamt;
System.out.println("Withdrawl amount : " +availbal);
   }
}
public class Hierarchical_inheritance
{
   public static void main(String args[])
   {
Deposit d1 = new Deposit();
d1.details();
d1.deposit();
      Withdrawl w1 = new Withdrawl();
w1.details();
w1.witamt();
   }
}
