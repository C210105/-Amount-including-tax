/*
    税込み金額を計算するプログラムです
    割引：１５％
    税込み：８％
*/

public class Main {
    public static void main(String[] args) {
        
        int price = 3500;
        System.out.println("定額：" + price + "円です。");

        int discountPrice = price - ((15 * price) / 100);//割引１５％を計算する
        System.out.println("割引価格：" + discountPrice + "円です。");

        int amount = discountPrice + ((8 * discountPrice) / 100);//税込み８％計算する
        System.out.println("税込み金額:" + amount + "円です。");
    }
}
