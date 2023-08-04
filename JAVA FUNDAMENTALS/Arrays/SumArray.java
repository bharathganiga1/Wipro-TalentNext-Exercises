public class SumArray {
    public static void main(String[] args) {
    int[] arr=new int[]{10,3,6,1,2,7,9};
    int n=arr.length;
    int sum=0;
    int a=6;
    int b=7;
    boolean add=true;
    for(int i=0;i<n;i++)
    {
        if(arr[i]!=a &&add==true)
        {
            sum=sum+arr[i];
        }
        else if(arr[i]==a)
        {
            add=false;
        }
        else if(arr[i]==b)
        {
            add=true;
        }
    }
    System.out.println("sum= "+sum);
    }
}
   