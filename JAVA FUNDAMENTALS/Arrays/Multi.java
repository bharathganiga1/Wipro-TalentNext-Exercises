public class Multi{
    public static void main(String[] args){
        int n=args.length;
        int [][] Arr=new int [3][3];
        int index=0;
        if(n!=9){
            System.out.println("Please enter 9 integer values");
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Arr[i][j]=Integer.parseInt(args[index++]);
                System.out.print(Arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}