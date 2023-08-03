public class Lastnumber{
    public static void main(String [] args){
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);

        Lastnumber obj=new Lastnumber();
        boolean res= obj.lastnumber(num1,num2);
        System.out.println(res);
    }
     boolean lastnumber(int num1,int num2){
        if( num1%10 == num2%10 )
            return true;
        return false;
    
     }
}