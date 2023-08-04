public class Only14{
    public static void main(String[] args){
        int n=args.length;
        int [] Arr=new int [n];
        boolean flag=true;
        for(int i=0;i<n;i++){
            Arr[i]=Integer.parseInt(args[i]);
            if(Arr[i]!=1 && Arr[i]!=4)
                flag=false;
        }
        if(flag==true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}