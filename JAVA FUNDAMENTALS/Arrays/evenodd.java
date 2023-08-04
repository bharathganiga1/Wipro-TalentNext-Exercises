import java.util.Arrays;
public class evenodd{
    public static void main(String[] args){
        int [] Arr={1,3,4,2,7,5};
        int even=0;
        int m=0;
        int n=0;
        for(int elem:Arr){
            if(elem%2==0)//checking if even
                even+=1;
        }
        int [] even_arr=new int[even];
        int [] odd_arr=new int[Arr.length-even];
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]%2==0)
                even_arr[m++]=Arr[i];
            else
                odd_arr[n++]=Arr[i];
        }
        for(int elem:even_arr)
            System.out.print(elem+"   ");
        for(int elem:odd_arr)
            System.out.print(elem+"   ");
    }
}