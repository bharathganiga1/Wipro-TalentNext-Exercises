public class max2min2{
    public static void main(String[] args){
        int [] A=new int[] {10,8,3,4,5,6,55};
        int max1=A[0],max2=A[0],min1=A[0],min2=A[0];
        for(int elem:A){
            if(elem>max1){
                max2=max1;
                max1=elem;           
            }else if(elem>max2){
                max2=elem;
            }
            if(elem<min1){
                System.out.println("@@"+min1);
                min2=min1;
                min1=elem;
            }else if(elem<min2){
                min2=elem;
            }
        }
        System.out.println("1st maximum "+max1);
        System.out.println("2nd maximum "+max2);
        System.out.println("1st minimum "+min1);
        System.out.println("2nd minimum "+min2);
    }
}