public class Sum{
    public static void main(String[] args){
        int sum=0;
        int start=-1;
        int end=-1;
        int [] Arr={1,6,4,7,9};
        for(int i=0;i<Arr.length-1;i++){
            if(Arr[i]==6){
                start=i;
                for(int j=i;j<Arr.length;j++){
                    if(Arr[j]==7)
                        end=j;
                }
            }
        }
        for(int i=0;i<Arr.length;i++){
            if(i<start||i>end){
                sum=sum+Arr[i];
            }
        }
        System.out.println(sum);
    }
}