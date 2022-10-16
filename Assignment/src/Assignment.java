import java.util.Scanner;
//scan使用時は上記をimportしないとエラーが出る
//java.util.Scannerパッケージ利用の宣言

public class Assignment {
    public static void main(String[] args) {

        System.out.println("Please Enter a number");

        /*キーボードから入力された文字列や数値を受け取ってプログラムの中で処理するときに使用する */
        Scanner scan = new Scanner(System.in)
        ;
        int inputNumber=scan.nextInt();

        System.out.println("You entered this value " + inputNumber);

        
    }
}
