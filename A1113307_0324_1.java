import java.util.*;
class animal{
    String name;
    double height;
    double weight;
    double speed;
    void show(){
        System.out.println("name:"+this.name+" "+"height:"+this.height+"m"+" "+"weight:"+this.weight+"kg"+" "+"speed:"+this.speed+"m/min");
    }
    double distance(double x,double y){
        return x*y*this.speed;
    }
    double distance(double x){
        return x*this.speed;
    }
}
public class A1113307_0324_1{
    public static void main(String [] args ){
        double min,acc;
        animal Olaf,Donkey,Anna,Aisa;
       
        Olaf=new animal();
        Donkey=new animal();
        Anna=new animal();
        Aisa=new animal();
        System.out.println("Please input Olaf's time:");
        Scanner num1=new Scanner(System.in);
        min=num1.nextDouble();
        System.out.println("Please input Olaf'sacceleration:");
        Scanner num2=new Scanner(System.in);
        acc=num2.nextDouble();
        Olaf.name="雪寶";
        Olaf.height=1.1;
        Olaf.weight=52;
        Olaf.speed=100;
        Olaf.show();
        System.out.println("Olaf distance:"+Olaf.distance(min,acc));
        System.out.println("Please input Donkey's time:");
        Scanner num3=new Scanner(System.in);
        min=num3.nextDouble();
        System.out.println("Please input Donkey'sacceleration:");
        Scanner num4=new Scanner(System.in);
        acc=num4.nextDouble();
        Donkey.name="驢子";
        Donkey.height=1.5;
        Donkey.weight=99;
        Donkey.speed=200;
        Donkey.show();
        System.out.println("Donkey distance:"+Donkey.distance(min,acc));
        System.out.println("Please input Anna's time:");
        Scanner num5=new Scanner(System.in);
        min=num5.nextDouble();
        Anna.name="安那";
        Anna.height=1.7;
        Anna.weight=48;
        Anna.speed=120;
        Anna.show();
        System.out.println("Anna distance:"+Anna.distance(min));
        System.out.println("Please input Aisa's time:");
        Scanner num6=new Scanner(System.in);
        min=num6.nextDouble();
        System.out.println("Please input Aisa's acceleration:");
        Scanner num7=new Scanner(System.in);
        acc=num7.nextDouble();
        Aisa.name="愛沙";
        Aisa.height=1.7;
        Aisa.weight=50;
        Aisa.speed=120;
        Aisa.show();
        System.out.println("Aisa distance:"+Aisa.distance(min,acc));
    }
}
