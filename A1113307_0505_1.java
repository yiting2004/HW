import java.io.IOException;
import java.util.*;
public class A1113307_0505_1 {
    public static void main(String []args)throws IOException{
        int [] number=new int [10];
        int count=0;
        int [] winning={9,15,24,30,37,41};
        System.out.println("請輸入6個號碼(1-49):");
        Scanner num=new Scanner(System.in);
        number[0]=num.nextInt();
        Scanner num2=new Scanner(System.in);
        number[1]=num2.nextInt();
        Scanner num3=new Scanner(System.in);
        number[2]=num3.nextInt();
        Scanner num4=new Scanner(System.in);
        number[3]=num4.nextInt();
        Scanner num5=new Scanner(System.in);
        number[4]=num5.nextInt();
        Scanner num6=new Scanner(System.in);
        number[5]=num6.nextInt();
        for(int k=0;k<6;k++){
            for(int i=0;i<winning.length;i++){
                if(number[k]==winning[i]&&number[k]<49&&number[k]>1){
                    count++;
                }
                if(number[k]<1||number[k]>49){
                    try{
                        if(number[k]>49||number[k]<1)
                        throw new Exception("號碼不可小於1或大於49");
                    }catch(Exception e){
                        System.out.println("例外:"+number[k]+"\t"+"號碼不可小於1或大於49");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("恭喜中"+count+"個號碼");    
    }
    
}
