import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String input;

        //Taking input as many time as it is available

        while((input=sc.nextLine())!=null)
        {            
            String[] inputArr=input.split("\\s");
            int p=Integer.parseInt(inputArr[0]);
            int a=Integer.parseInt(inputArr[1]);
            int b=Integer.parseInt(inputArr[2]);
            int c=Integer.parseInt(inputArr[3]);
            int d=Integer.parseInt(inputArr[4]);
            int n=Integer.parseInt(inputArr[5]);
            double[] price=new double[n];
            double highest=0;

            //Calculating price from 1 up to n

            for(int k=1;k<=n;k++)
            {
                price[k-1]=p*(Math.sin(a*k+b)+Math.cos(c*k+d)+2);

            }
            
            // Finding the highest value

            for(int i=0;i<=n-2;i++)
            {
                for(int j=i+1;j<=n-1;j++)
                {
                    double decline = price[i]-price[j];
                    if(decline>highest)
                    {
                        highest=decline;
                    }
                }
            }


            System.out.println(String.format("%.6f", highest));

        }

    }
}
