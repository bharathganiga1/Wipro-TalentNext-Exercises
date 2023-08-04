public class middle{
    public static void main(String[] args){
        int [] A=new int [] {1,2,3};
        int [] B=new int [] {4,5,6};
        int [] RES=new int[2];
        RES[0]=A[1];
        RES[1]=B[1];
        for(int elem:RES){
            System.out.print(elem+"   ");
        }
    }
}