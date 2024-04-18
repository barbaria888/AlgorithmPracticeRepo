import java.util.Arrays;

class Sn {//"LLGRL"
    public static boolean isRobotBounded(String instructions) {
        if((instructions.length()<1))
        {
            return false;
        }
        if((!instructions.contains("L"))&&((instructions.contains("R"))))
        {
            return true;
        }
        if((instructions.contains("L"))&&!instructions.contains("R"))
        {
            return true;
        }
    return false;}

    public static void main(String[] args) {
        System.out.println(isRobotBounded("GL"));
    }

}


class asd901{
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
String s ="sa";
        s.toLowerCase();
        /*
for(int i=0;i<matrix.length;i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}*/
        int j = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] == 0) {

                System.out.println(matrix[i][j]);
                j++;
                //set matrix zero from the starting
            }
            if ((i == (matrix[i].length - 1)) && (j < matrix[i].length - 1)) {
                j++;
            }

        }


    }}
class ir
{
    public static void main(String[] args) {

    int [] digits=new int[]{4,3,2,1};
    int n=digits.length;
    int num=0;
    int j=1;
        for(int i= n - 1;i>=0;i--)
    {

        num += digits[i]*(10*(j++));
    }
        num++;
        int arr[]=new int[n];
        int k=n-1;
        while(num!=0)
        {
            arr[k--] = num%10;
            num/=10;
        }
        System.out.println(Arrays.toString(arr));
}
}