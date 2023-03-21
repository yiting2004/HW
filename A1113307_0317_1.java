import java.util.*;
public class A1113307_0317_1{
    public static void main(String[] args){
        int [][] array;
        int n,m;
        System.out.println("請輸入n:");
        Scanner num1=new Scanner(System.in);
        n=num1.nextInt();
        System.out.println("請輸入m:");
        Scanner num2=new Scanner(System.in);
        m=num2.nextInt();
        if(n<=m){
            array=new int [m][m];
             for(int k=1;k<=n;k++){
                for(int j=1;j<=m;j++){
                    array[k-1][j-1]=k*j;
                    System.out.print(array[k-1][j-1]+" ");
                }
                System.out.print("\n");
             }
             for(int [] sum: array){
                for(int asum:sum){
                    if(asum==0){
                        break;
                    }
                    System.out.print(asum+" "); 
                }
                System.out.print("\n");
            }

        }
        else if(n>m){
            array=new int [n][n];
            for(int k=1;k<=n;k++){
                for(int j=1;j<=m;j++){
                    array[k-1][j-1]=k*j;
                    System.out.print(array[k-1][j-1]+" ");
                }
                System.out.print("\n");
            }
            for(int [] sum: array){
                for(int asum:sum){
                    if(asum==0){
                        break;
                    }
                    System.out.print(asum+" ");   
                }
                System.out.print("\n");
            }
        }
    }
}
