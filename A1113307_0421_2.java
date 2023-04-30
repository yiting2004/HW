import java.util.*;
public class A1113307_0421_2 {
    public static void main(String[] args){
        String date;
        System.out.println("請輸入YYYY/MM/DD或MM/DD/YYYY格式的年月日:");
        Scanner day=new Scanner(System.in);
        date=day.next();
        if(date.matches("[0-9]{4}[/]{1}[0,1]{1}[0-9]{1}[/]{1}[0-9]{2}")||date.matches("[0,1]{1}[0-9]{1}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")){
           System.out.println(date);
        }else{
            System.out.println("不符合規定格式，重輸");
        }
    }
}
