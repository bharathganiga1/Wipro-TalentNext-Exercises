import java.util.Arrays;
public class Sort{
    public static void main(String[] args){
        int [] A=new int [] {78,12,34,65};
        System.out.print("Array before sorting-->");
        for(int elem:A){
            System.out.print(elem+"    ");
        }
        System.out.println();
        Arrays.sort(A);
        System.out.print("Array After  sorting-->");
        for(int elem:A){
            System.out.print(elem+"    ");
        }
    }
}