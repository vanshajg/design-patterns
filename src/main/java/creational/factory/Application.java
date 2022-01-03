package creational.factory;

import creational.factory.dialog.Dialog;
import creational.factory.dialog.MacDialog;
import creational.factory.dialog.WindowsDialog;

import java.util.Scanner;

public class Application  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Dialog d;
        if (c == 1) {
            d = new MacDialog();
        }else {
            d = new WindowsDialog();
        }
        d.render();
    }
}
