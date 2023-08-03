public class Order{
    public static void main(String[] args){
        char first=args[0].charAt(0);
        char second=args[1].charAt(0);
        if ((int)first<(int)second){
            System.out.print(first+",");
            System.out.println(second);
        }
        else{
            System.out.print(second+",");
            System.out.println(first);
        }
        
    }
}