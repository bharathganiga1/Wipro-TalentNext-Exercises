public class interest{
    public static void main(String[] args){
        String gender=args[0];
        int age=Integer.parseInt(args[1]);
        if(gender.equalsIgnoreCase("female")){
            if(age>=1 && age<=58)
                System.out.println("8.2%");
            else if(age>=59 && age<=100)
                System.out.println("9.2%");
            else{
                System.out.println("Invalid command line arguments");
            }
        }else if(gender.equalsIgnoreCase("male")){
            if(age>=1 && age<=58)
                System.out.println("8.4%");
            else if(age>=59 && age<=100)
                System.out.println("10.5%");
            else{
                System.out.println("Invalid command line arguments");
            }
        }else{
            System.out.println("Invalid command line arguments");
        }
    }
}