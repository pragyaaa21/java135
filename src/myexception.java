import java.util.Scanner;
public class myexception {
    public static void main(String[] args) {
        int x,y,z=0;
        Scanner sc = new Scanner(System.in);
        try{
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
            System.out.println("Exception not occured");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
        finally{
            System.out.println("Exception occured");
        }
    }
}