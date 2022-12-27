import java.util.*;
public class Grad{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        double TOI[]=new double[]{3.0,3.0,3.0,3.0,3.0,5.0,6.0};
        double Hin[]=new double[]{2.5,2.5,2.5,2.5,2.5,4.0,4.0};
        double ET[]=new double[]{4.0,4.0,4.0,4.0,4.0,4.0,10.0};
        double BM[]=new double[]{1.5,1.5,1.5,1.5,1.5,1.5,1.5};
        double HT[]=new double[]{2.0,2.0,2.0,2.0,2.0,4.0,4.0};
        String names[]=new String[]{"TOI","Hindu","ET","BM","HT"};
        double n=sc.nextDouble();
        double sum[]=new double[5];
        for(int i=0;i<7;i++){
            sum[0]+=TOI[i];
            sum[1]+=Hin[i];
            sum[2]+=ET[i];
            sum[3]+=BM[i];
            sum[4]+=HT[i];
        }
        
        for(int i=0;i<5;i++){
            for(int j=4;j>i;j--){
                if(sum[i]+sum[j]==n){
                    System.out.println("{ "+names[i]+" , "+names[j]+ " } ");
                    
                }
            }
        }
    
 

    }
}
