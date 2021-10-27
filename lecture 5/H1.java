public class H1{
    public static void main(String args[])
    {
        int m = 5;
        int n = 9;
        for(int i = 1; i <=m;i++)
        {
            for(int j= 1 ;j <= m-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k <=m;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}