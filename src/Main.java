import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String input;

        //Taking input as many time as it is available

        while((input=sc.nextLine())!=null)
        {            
            String[] inputArr=input.split("\\s");
            int[] inputInt= Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray();
            int p=inputInt[0];
            int a=inputInt[1];
            int b=inputInt[2];
            int c=inputInt[3];
            int d=inputInt[4];
            int n=inputInt[5];
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
