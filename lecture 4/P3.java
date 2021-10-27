import java.util.*;
public class P3{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int mode;
        do{
            System.out.println("Enter mode (0 /1):");
             mode = sc.nextInt();
            if(mode == 1)
            {
                System.out.println("Enter mark:");
            int mark = sc.nextInt();
            if(mark >= 90)
            {
                System.out.println("This is Good");
            }else if(mark >=60 && mark <=89)
            {
                System.out.println("This is also Good");
            }else if(mark >= 0 && mark <= 59)
            {
                System.out.println("This is Good as well");
            } 
            }
        } while(mode == 1);
    }
}