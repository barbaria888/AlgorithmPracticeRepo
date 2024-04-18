    import java.util.*;
    import java.io.File;
     class cc {
        
        public static final String[] numNmaes={"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public static int processString_1(String str)
    {
        int t=0,o=0,n=str.length();
        for(int i=0;i<n;i++)if(Character.isDigit(str.charAt(i)))
        {
            t=str.charAt(i)-48;break;
        }
        for(int i=n-1;i>=0;i--)if(Character.isDigit(str.charAt(i)))
        {
            o=str.charAt(i)-48;break;
        }
        
        return t*10+o;

    }
    public static void main(String[] args){
     Scanner sc=null;
     try{
        sc=new Scanner(new File("input.txt"));

     }
     catch(Exception e){
        System.out.println("file not found");
        return;
     }
     long res_1=0;
     
     
     //long res_2=0;
     while(sc.hasNext()){
        String line = sc.nextLine();
        res_1 += processString_1(line);
        
     }
     sc.close();
     System.out.println(res_1);
     //System.out.println(res_2);
    }
   }