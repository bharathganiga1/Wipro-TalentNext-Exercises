import java.util.*;
public class DuplicateItem {
    public static void main(String[] args) {
    System.out.println("enter size of an array :");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];

    System.out.println("enter elements of an array :");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }

    System.out.println("array elements are:");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+"\t");
    }
    System.out.println();
    int[] newArr=new int[n];
    int j=0;
    for(int i=0;i<n-1;i++)
    {
        if(arr[i]!=arr[i+1])
        {
            newArr[j++]=arr[i];
        }
    }
    newArr[j++]=arr[n-1];
    for(int i=0;i<j;i++)
    {
        arr[i]=newArr[i];
    }
    for(int i=0;i<j;i++)
    {
        System.out.print(arr[i]+"\t");
    }
}
}