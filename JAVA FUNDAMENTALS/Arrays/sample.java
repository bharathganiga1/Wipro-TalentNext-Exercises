public class sample{
    public static void main(String[] args){
        int [] a=new int[] {6,5,3,5,6,3};
        int len=a.length;
        int sum=0;
        for(int i:a)
            sum+=i;
        System.out.println("sum is "+sum);
        System.out.println("average is "+sum/len);
    }
}