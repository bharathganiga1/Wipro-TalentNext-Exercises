public class type{
    public static void main(String[] args){
        char ans='1';
        int res=(int)ans;
        if(res>=97&&res<=122 ||res>=65&&res<=90){
            System.out.println("Alphabets");
        }else if(Character.isDigit(ans)){
            System.out.println("Number");
        }else{
            System.out.println("special characters");
        }
    }
}