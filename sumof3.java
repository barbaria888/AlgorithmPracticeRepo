import java.util.ArrayList;
import java.util.Scanner;

class pcp {
    public static  int sum3(int[]arr)
    {int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                sum++;
            }
        }
        return sum;
    }
    public static void compareAverage(int [] nums)
    {

    }
     public static void main(String[] args) {
         int [] nums={1,2,3,4};
         System.out.println(sum3(nums));
         Scanner sc= new Scanner(System.in);
         ArrayList<Integer> s1 =new ArrayList<>(3);
         ArrayList<Integer> s2 =new ArrayList<>(3);
         for(int i=0;i<3;i++)
         {int n = sc.nextInt();
             s1.add(n);
         }
         for(int i=0;i<3;i++)
         {int n = sc.nextInt();
             s2.add(n);
             //sum+=n;
         }


     }
}
