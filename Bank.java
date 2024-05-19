import java.util.*;
class Bank
{
        int id;
        String name;
        long acno;
        double bal;
        String email;
        long phno;
    public Bank()
    {
        id=123456;
        name = "Ravi";
        acno=987654321;
        bal = 2500.00;
        email = "ravi123@gmail.com";
        phno =8023547570L;

    }
    public Bank(int idno)
    {
        id=idno;
        name = "Ravi";
        acno=987654321;
        bal = 2500.00;
        email = "ravi123@gmail.com";
        phno = 8023547570L;

    }
    public Bank(String cname,String cemail)
    {
        id=123456;
        name = cname;
        acno=987654321;
        bal = 2500.00;
        email = cemail;
        phno = 8023547570L;

    }
    public Bank(String cname,long c_acno)
    {
        id=123456;
        name = "Ravi";
        acno=c_acno;
        bal = 2500.00;
        email = "ravi123@gmail.com";
        phno = 8023547570L;

    }
    public Bank(double c_bal)
    {
        id=123456;
        name = "Ravi";
        acno=987654321;
        bal = c_bal;
        email = "ravi123@gmail.com";
        phno = 8023547570L;

    }
    
    public Bank(long c_phno)
    {
        int id=123456;
        String name = "Ravi";
        long acno=987654321;
        double bal = 2500.00;
        String email = "ravi123@gmail.com";
        long phno = c_phno;

    }
    public  void display()
    {
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("account number: "+acno);
        System.out.println("balance: "+bal);
        System.out.println("email: "+email);
        System.out.println("phone number: "+phno);


    }
    public void deposit(double amount)
    {
        bal = bal +amount;
    }

    public void withdraw(double amount)
    {
        bal = bal - amount;
    }

}
class customer
{
    public static void main(String args[])
    {
        Bank cust1 = new Bank();
        Bank cust2 = new Bank(987654);
        Bank cust3 = new Bank(45000.00);
        Bank cust4 = new Bank("anubhav","anubhav12@gmail.com");
        Bank cust5 = new Bank("Rachin",576254824);
        cust1.display();
        System.out.println("***************************");
        cust1.deposit(1000);
        cust1.display();
        System.out.println("***************************");
        cust2.display();
        System.out.println("***************************");
        cust3.display();
        System.out.println("***************************");
        cust3.withdraw(1500);
        cust3.display();
        System.out.println("***************************");
        cust4.display();
        System.out.println("***************************");
        cust5.display();
        System.out.println("***************************");
        




    }
}