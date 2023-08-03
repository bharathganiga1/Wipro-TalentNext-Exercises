public class Upperlower{
    public static void main(String[] args){
        char ip='X';
        char res='x';
        boolean flag=Character.isLowerCase(ip);
        if(flag){
            res=Character.toUpperCase(ip);
            System.out.println(ip+"-->"+res);
        }else{
            res=Character.toLowerCase(ip);
            System.out.println(ip+"-->"+res);
        }
            
    }
}