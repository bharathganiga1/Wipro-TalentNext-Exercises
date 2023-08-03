public class Check{
    public static void main(String[] args){
        int len=args.length;
        if(len==0)
            System.out.println("No values");
        else if(len==1){
            System.out.println(args[0]);
        }
        else{
            for(int i=0;i<len-2;i++)
                System.out.print(args[i]+",");  
            System.out.println(args[len-2]+" and "+args[len-1]);
        }
    }
}