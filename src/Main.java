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

            for(int k=1;k<=n;k++)
            {
                price[k-1]=p*(Math.sin(a*k+b)+Math.cos(c*k+d)+2);

            }



            System.out.print(price[9]);

        }

    }
}
