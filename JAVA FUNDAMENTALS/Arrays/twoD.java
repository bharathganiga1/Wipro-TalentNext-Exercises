public class twoD{
    public static void main(String[] args){
        int n=args.length;
        int [][] Arr=new int [2][2];//2d array
        int index=0;
        if(n!=4){
            System.out.println("Please enter 4 integer values");
            return;
        }
        System.out.println("Ip Array--->");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                Arr[i][j]=Integer.parseInt(args[index++]);
                System.out.print(Arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Reverse Array--->");
        for(int i=1;i>=0;i--){
            for(int j=1;j>=0;j--){
                System.out.print(Arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}