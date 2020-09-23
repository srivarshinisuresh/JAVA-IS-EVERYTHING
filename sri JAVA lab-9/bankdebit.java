/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex9;

import java.util.Scanner;

/**
 *
 * @author POOJHA KEERTHI
 */
public class bankdebit {
    public static void main(String[] args)
    {
      debittransaction obj=new debittransaction();
      try
      {
          obj.check();
      }
      catch(PinException e)
      {
          System.out.println("Error: "+e);
      }
      catch(BalanceException e)
      {
          System.out.println("Error: "+e);
      }
    }
      
}
class debittransaction
{
    void check() throws PinException, BalanceException
    {
      System.out.println("Welcome! S.S.Poojha Keerthi");
      System.out.println("Enter Your PIN");
      Scanner sc=new Scanner(System.in);
      int pin=sc.nextInt();
      int p=2606;
      int balance=30000;
      if(pin==p)
      {
          System.out.println("Enter Amount to Debit");
          int amount=sc.nextInt();
          if(amount<=balance)
          {
          System.out.println("Please Collect Cash Before Leaving the Bank");
          System.out.println("*****Transaction Successful*****");
          System.out.println("### Have A Nice Day ###");
          }
          else
          {
              throw new BalanceException("Amount entered exceded balance");
          }
      }
      else
      {
        throw new PinException("Invalid Password");
      }
    }
}
 class PinException extends Exception
            {
               String pin;
               PinException(String pin1)
               {
                   super(pin1);
               }
            }
class BalanceException extends Exception
{
    BalanceException(String balan)
    {
        super(balan);
    }
}