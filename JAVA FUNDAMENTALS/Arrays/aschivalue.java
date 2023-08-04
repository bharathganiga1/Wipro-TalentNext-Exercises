/**program to print the aschivalue */
public class aschivalue{
    public static void main(String[] args){
        int [] my_arr=new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int elem:my_arr){
            System.out.print((char)elem+" ");//getting aschi value using char() method
        }
    }
}