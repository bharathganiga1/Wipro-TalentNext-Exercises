/** Given the following table containing information about employees of an organization, develop a small java application, which accepts employee id from the command prompt and displays the following details as output: 

Expected Output format: (assuming that your class name is Project1)
If you execute the command java Project1 1003, the output should be -
Emp No. Emp Name Department Designation Salary
1003     Rahul    Acct       Clerk       29000
If you execute the command java Project1 123, the output should be -
There is no employee with empid : 123
*/




public class project1{
    public static int row=-1;
    public static int Da_row;
    public static int salary;
    public static String[][] empTable=new String[][] {
        {"EmpNo","EmpName","JoinDate","DesignationCode","Department","Basic","HRA","IT"},
        {"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
        {"1002","Shushma","23/08/2012","c","PM","30000","12000","9000"},
        {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
        {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
        {"1005","Ranjan","16/07/2005","m","Engg","20000","20000","20000"},
        {"1006","Suman","01/01/2000","e","Manufacturing","23000","9000","4400"},
        {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}
    };
    public static String[][] DaTable=new String [][] {
        {"DesignationCode","Designation","DA"},
        {"e","Engineer","20000"},
        {"c","Consultant","32000"},
        {"k","Clerk","12000"},
        {"r","Receptionist","15000"},
        {"m","Manager","40000"}
    };
    
    public static void main(String[] args){
        int ip=Integer.parseInt(args[0]);
        for(int i=1;i<empTable.length;i++){
            int temp=Integer.parseInt(empTable[i][0]);
            if(ip==temp){
                row=i;
                System.out.println(i);
            }
        }
        if(row==-1){
            System.out.println("There is no employee with EmpId:"+ip);
        }
        Da_row=find_DA(empTable[row][3].charAt(0));
        salary=Integer.parseInt(empTable[row][5])+Integer.parseInt(empTable[row][6])-Integer.parseInt(empTable[row][7])+Integer.parseInt(DaTable[Da_row][2]);
        System.out.println(empTable[0][0]+"    "+empTable[0][1]+"   "+empTable[0][4]+"   "+DaTable[0][1]+"     "+"Salary");
        System.out.println(empTable[row][0]+"     "+empTable[row][1]+"     "+empTable[row][4]+"         "+DaTable[Da_row][1]+"        "+salary);
    }
    static int find_DA(char key){
        switch(key){
            case 'e':Da_row=1;
                break;
            case 'c':Da_row=2;
                break;
            case 'k':Da_row=3;
                break;
            case 'r':Da_row=4;
                break;
            case 'm':Da_row=5;
                break;
            default:Da_row=-1;
                break;
        }
        return Da_row;
    }
}