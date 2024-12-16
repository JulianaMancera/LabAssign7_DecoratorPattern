# LabAssign7_DecoratorPattern
## CIMB
CIMB is a digital bank that offers GSave and UpSave savings accounts.   As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account. 
- The typical savings account offers an interest rate of 1%. 
- The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.
- The GSave account offers an interest rate of 2.5%.
- Benefits include the "Standard Savings Account" plus access to "GCash transfer".
- The UpSave account offers the highest interest rate of 4.0%.
- Benefits include the "Standard Savings Account" plus "with Insurance". <br> <br>
**Develop a decorator pattern approach that will implement the given UML diagram:**
![image](https://github.com/user-attachments/assets/3354634b-de10-4419-bb7c-68ad271d40d0)

> [!CAUTION]
> The content of your `Cimb.java`should ONLY contain the following codes with the exception of inserting your own package name

### Description of the following methods

- **showAccountType()** - Either returns "Savings Account", "GSave" or "UpSave" <br>
- **getInterestRate()** - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave <br>
- **getBalance()** - Returns the balance of the account set. <br>
- **showBenefits()** - Either returns "Standard Savings Account" for Savings Account; <br>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;benefits offered by savings account + "GSave Transfer"; <br>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;benefits offered by savings account + "With Insurance"; <br>
- **computeBalanceWithInterest()** - returns new balance by computing the balance plus the interest depending on the interest rate. <br>
- **showInfo()** - Returns details of account number, account name, and balance. <br> <br>
**BankAcountDecorator** must be an interface.

>[!CAUTION]
> You are not allowed to insert other methods except what is stated in the diagram (setters and getters are allowed).

**You should display the following output:**
![image](https://github.com/user-attachments/assets/8d4b5cd9-f227-4bda-b1c2-9e4eba3047ba)
