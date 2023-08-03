public class sumofnumber{
    public static void main(String[] args){
        String num=args[0];
        int len=num.length();
        int sum=0;
        for(int i=0;i<len;i++){
            sum=sum+ Character.getNumericValue(args[0].charAt(i));         
        }
        System.out.println(sum);       
    }
}