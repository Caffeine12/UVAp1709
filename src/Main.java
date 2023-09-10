import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        //String input;
        int p, a, b, c, d, n;

        //Taking input as many time as it is available

        while(sc.hasNextInt())
        {          
            p=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            n=sc.nextInt();
            
            double maxDecline=0;
            double decline=0;
            
            double maxPrevious=p*(Math.sin(a+b)+Math.cos(c+d)+2);

            for(int k=2;k<=n;k++)
            {
                double currentValue=p*(Math.sin(a*k+b)+Math.cos(c*k+d)+2);

                // Determine max decline
                if(maxPrevious>currentValue)
                {
                    // update if the decline is the maximum decline
                    if(maxPrevious-currentValue>maxDecline)
                    {
                        maxDecline=maxPrevious-currentValue;
                    }
                }
                //Update highest point in the graph and calculate subsequent max decline
                else
                maxPrevious=currentValue;             
            }
            System.out.println(String.format("%.6f", maxDecline));
        }
    }
}
