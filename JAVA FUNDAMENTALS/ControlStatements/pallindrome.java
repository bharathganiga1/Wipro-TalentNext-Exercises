public class pallindrome{
    public static void main(String[] args){
        int num=Integer.parseInt(args[0]);
        int rev=0;
        int num1=num;
        while(num1!=0){
            int rem=num1%10;
            rev=rev*10+rem;
            num1=num1/10;
        }
        if(num==rev)
            System.out.println(num+" is pallindrome");
        else{
            System.out.println(num+" is not pallindrome");
        }
    }
}