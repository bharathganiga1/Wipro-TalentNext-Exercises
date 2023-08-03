public class Floyds{
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("Please Enter an integer number!");
            return;
        }
        int num=Integer.parseInt(args[0]);
        int size=1;
        for(int i=1;i<=num;i++){
            while(size>0){
                System.out.print("*"+"  ");
                size-=1;
            }
            System.out.println();
            size=i+1;
        }

    }
}