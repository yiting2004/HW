import java.util.*;

class Shop {
    public static int porkDumpling = 5000;
    public static int beefDumpling = 3000;
    public static int vegetableDumpling = 1000;
}

class Customer extends Thread {
    int dumplingCount;
    String dumplingKind;

    Customer() {

    }
    public void run() {
        int dumplingCount = (int) (Math.random() * 41 + 10);
        String dumplingKind = getDumplingKind();
        if (saleDumpling(dumplingKind, dumplingCount)) {
            System.out.println(getName() + " 點了 " + dumplingCount + " 顆 " + dumplingKind);
            System.out.println("目前剩餘:"+Shop.porkDumpling+"個豬肉水餃");
            System.out.println("目前剩餘:"+Shop.beefDumpling+"個牛肉水餃");
            System.out.println("目前剩餘:"+Shop.vegetableDumpling+"個蔬菜水餃");
        } else {
            System.out.println(getName() + " 點了 " + dumplingCount + " 顆 " + dumplingKind);
            System.out.println(getName() + " 點餐失敗，"+dumplingKind+"不夠");
        }
    }
    String getDumplingKind() {
        int num = (int) (Math.random() * 3);
        if (num == 0) {
            return "豬肉水餃";
        } else if (num == 1) {
            return "牛肉水餃";
        } else {
            return "蔬菜水餃";
        }
    }
    boolean saleDumpling(String dumplingKind, int dumplingCount) {
        if (dumplingKind.equals("豬肉水餃") && dumplingCount <= Shop.porkDumpling) {
            Shop.porkDumpling -= dumplingCount;
            return true;
        }else if (dumplingKind.equals("牛肉水餃") && dumplingCount <= Shop.beefDumpling) {
            Shop.beefDumpling -= dumplingCount;
            return true;
        }else if (dumplingKind.equals("蔬菜水餃") && dumplingCount <= Shop.vegetableDumpling) {
            Shop.vegetableDumpling -= dumplingCount;
            return true;
        }
            return false;
    }
}

public class A1113307_0512_1 {
    public static void main(String[] argv) {
        System.out.println("請輸入同時光顧顧客數量");
        Scanner sum = new Scanner(System.in);
        int customerCount = sum.nextInt();
        Customer[] customers = new Customer[customerCount];

        for (int i = 0; i < customerCount; i++) {
            customers[i] = new Customer();
            customers[i].start();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            
            }
        }
        
     
    }
}


