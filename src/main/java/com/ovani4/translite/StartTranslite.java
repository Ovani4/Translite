package main.java.com.ovani4.translite;

import java.util.Locale;
import java.util.Scanner;

public class StartTranslite {
    Message newMessage = new Message();
    Scanner scan = new Scanner(System.in);
    public StartTranslite() {
        System.out.println("Введи ссылку");
        newMessage.setInPutMessage(scan.nextLine().toLowerCase(Locale.ROOT));
        System.out.println(newMessage.getInPutMessage());
    }
    private void PrintTransliteMessage(){
        System.out.println(newMessage.getOutPutMessage());
    }
    private void TransliteMessage(){
        String msgin = newMessage.getInPutMessage();
        System.out.println(msgin);
    }
}
