public class Ten{
    public static void main(String[] args){
        int [] Arr={1,10,10,2};
        int count=0;
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]==10){
                count+=1;
                Arr[i]=0;
            }
        }
    }
}