class toh
{
    public static void Toh(int n,char from_rod,char to_rod,char aux_rod)
    {
        if(n==1)
        {
                System.out.println(" Move disk 1 from rod "+ from_rod + " to rod " + to_rod);
            return;
        }
        Toh(n-1, from_rod,aux_rod,to_rod);
        System.out.println("Move disk "+n+" from rod"+ from_rod + " to rod " + to_rod);
        Toh(n-1,aux_rod,to_rod,from_rod);
    }
    public static void main(String[] args) {
Toh(5,'1','3','2');

    }
}