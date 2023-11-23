import java.util.*;
public class Bank {
    String name;
    String fatherName;
    long phoneNo;
    long  balance;

    public Bank(String name , String fatherName , long phoneNo , long balance){
        this.name = name ;
        this.fatherName = fatherName;
        this.phoneNo = phoneNo;
        this.balance = balance;
    }
public void check(int money){
    System.out.println("the money is "+money);
}

    
}
