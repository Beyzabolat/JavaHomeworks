import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "bugün çok hava güzel";
       /* System.out.println("eleman sayısı:" + mesaj.length());// karakterin uzunluğunu bulur.
        System.out.println("5. eleman:" + mesaj.charAt(4));//istenilen karakteri bulur.
        System.out.println(mesaj.concat(" yaşasın"));//belirtilen yerden itibaren eklenen girdiyi oraya koyar.
        System.out.println(mesaj.startsWith("b"));//boolean ile çalışır, girilen karakterle başlayıp başlamamasına göre true false döndürür.
        char[] karakterler = new char[5];
        System.out.println(mesaj.lastIndexOf('e'));
        System.out.println(mesaj.indexOf('a'));*/

        String yenimesaj = mesaj.replace(' ', '-');//belirtilen yerlere yeni belirtilen karakterleri koyar.
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(2, 5));//belirtilen noktadan itibaren çıktıyı alır.

        for (String kelime : mesaj.split(" ")) {//belirtilen karaktere denk gelince alta geçer.
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase(Locale.ROOT));
        System.out.println(mesaj.toUpperCase(Locale.ROOT));
        System.out.println(mesaj.trim());//cümlein başındaki ve sonundaki boslukları attı.

    }
}
