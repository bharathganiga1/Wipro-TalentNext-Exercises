public class PrintPrimeNumbers {
    public static void main(String[] args) {
    String primenumber="";
    for(int i=10;i<=99;i++)
    {
    int counter=0;
    for(int j=i;j>=1;j--)
    {
    if(i%j==0)
    {
    counter=counter+1;
    }
    }
    if(counter==2)
    {
    primenumber=primenumber+i+" ";
    }
    }
    System.out.println("primenumbers between 10 to 99 is :");
    System.out.println(primenumber);
    }
   }