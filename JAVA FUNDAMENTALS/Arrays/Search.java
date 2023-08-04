import java.util.Arrays;
public class Search{
    public static void main(String[] args){
        int [] my_arr=new int[] {1,4,34,56,7};
        int key=56;
        int result=my_search(my_arr,key);
        if(result==-1)
            System.out.println("-1");
        else{
            System.out.println(result);
        }       
    }
    static int my_search(int[] a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }       
        }
        return -1;
    }
}