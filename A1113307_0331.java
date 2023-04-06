import java.util.*;
class animal{
    String name;
    double height;
    int weight;
    int speed;
    animal(){ 
    }
    void show(){
        System.out.println("name:"+name+" "+"height:"+height+"m"+" "+"weight:"+weight+"kg"+" "+"speed:"+speed+"m/min");
    }
    double distance(int x,double y){
        double far=1;
        far=x*y*this.speed;
        return far;
    }
    double distance(int x){
        double far=1;
        far=x*this.speed;
        return far;
    }
    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}
class human extends animal{ 
    String sex;
    human(){
        String sex;
    }
    void show(){
        System.out.print("sex:"+sex+" ");
        super.show();
    }
}
class snow extends human{
    String iceskill;
    snow(){
        String iceskill;
    }
    void show(){
        System.out.print("iceskill:"+iceskill+" ");
        super.show();
    }
    double distance(int x,double y){
        double far=1;
        far=x*y*this.speed*2;
        return far;
    }
    double distance(int x){
        double far=1;
        far=x*this.speed*2;
        return far;
    }
}

public class A1113307_0331 {
    public static void main(String [] args){
        int N1,N2,N3,N4,N5,N6;
        double n1,n2,n3,n4,n5,n6;
        animal.showinfo();
        animal 雪寶,驢子;
        human 阿克,漢斯,安那;
        snow 愛沙;
        雪寶=new animal();
        驢子=new animal();
        阿克=new human();
        漢斯=new human();
        安那=new human();
        愛沙=new snow();
        雪寶.name="雪寶";
        雪寶.height=1.1;
        雪寶.weight=52;
        雪寶.speed=100;
        驢子.name="驢子";
        驢子.height=1.5;
        驢子.weight=99;
        驢子.speed=200;
        阿克.name="阿克";
        阿克.height=1.9;
        阿克.weight=80;
        阿克.sex="男";
        阿克.speed=150;
        漢斯.name="漢斯";
        漢斯.height=1.8;
        漢斯.weight=78;
        漢斯.sex="男";
        漢斯.speed=130;
        安那.name="安那";
        安那.height=1.7;
        安那.weight=48;
        安那.sex="女";
        安那.speed=120;
        愛沙.name="愛沙";
        愛沙.height=1.7;
        愛沙.weight=50;
        愛沙.sex="女";
        愛沙.iceskill="Yes";
        愛沙.speed=120;
        雪寶.show();
        驢子.show();
        阿克.show();
        漢斯.show();
        安那.show();
        愛沙.show();
        System.out.println("請輸入雪寶的跑步時間:");
        Scanner num1=new Scanner(System.in);
        N1=num1.nextInt();
        System.out.println("請輸入雪寶的跑步加速度:");
        Scanner num2=new Scanner(System.in);
        n1=num2.nextDouble();
        System.out.println("請輸入驢子的跑步時間:");
        Scanner num3=new Scanner(System.in);
        N2=num3.nextInt();
        System.out.println("請輸入驢子的跑步加速度:");
        Scanner num4=new Scanner(System.in);
        n2=num4.nextDouble();
        System.out.println("請輸入阿克的跑步時間:");
        Scanner num5=new Scanner(System.in);
        N3=num5.nextInt();
        System.out.println("請輸入阿克的跑步加速度:");
        Scanner num6=new Scanner(System.in);
        n3=num6.nextDouble();
        System.out.println("請輸入漢斯的跑步時間:");
        Scanner num7=new Scanner(System.in);
        N4=num7.nextInt();
        System.out.println("請輸入漢斯的跑步加速度:");
        Scanner num8=new Scanner(System.in);
        n4=num8.nextDouble();
        System.out.println("請輸入安那的跑步時間:");
        Scanner num9=new Scanner(System.in);
        N5=num9.nextInt();
        System.out.println("請輸入安那的跑步加速度:");
        Scanner num10=new Scanner(System.in);
        n5=num10.nextDouble();
        System.out.println("請輸入愛沙的跑步時間:");
        Scanner num11=new Scanner(System.in);
        N6=num11.nextInt();
        System.out.println("請輸入愛沙的跑步加速度:");
        Scanner num12=new Scanner(System.in);
        n6=num12.nextDouble();
        if(n1==0){
            System.out.println("雪寶跑步距離:"+雪寶.distance(N1));
        }else{
            System.out.println("雪寶跑步距離:"+雪寶.distance(N1,n1));
        }
        if(n2==0){
            System.out.println("驢子跑步距離:"+驢子.distance(N2));
        }else{
            System.out.println("驢子跑步距離:"+驢子.distance(N2,n2));
        }
        if(n3==0){
            System.out.println("阿克跑步距離:"+阿克.distance(N3));
        }else{
            System.out.println("阿克跑步距離:"+阿克.distance(N3,n3));
        }
        if(n4==0){
            System.out.println("漢斯跑步距離:"+漢斯.distance(N4));
        }else{
            System.out.println("漢斯跑步距離:"+漢斯.distance(N4,n4));
        }
        if(n5==0){
            System.out.println("安那跑步距離:"+安那.distance(N5));
        }else{
            System.out.println("安那跑步距離:"+安那.distance(N5,n5));
        }
        if(n6==0){
            System.out.println("愛沙跑步距離:"+愛沙.distance(N6));
        }else{
            System.out.println("愛沙跑步距離:"+愛沙.distance(N6,n6));
        }
        
    }

}
