public class Maxmin{
    public static void main(String[] args){
        int [] my_arr=new int[] {-101,30,45,100};
        int n=my_arr.length;
        int max=my_arr[0];
        int min=my_arr[0];
        for(int elem:my_arr){
            if(elem>max)
                max=elem;
            else if(elem<min)
                min=elem;
        }
        System.out.println("Maximum element is "+max);
        System.out.println("Manimum element is "+min);
    }
}