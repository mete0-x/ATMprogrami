
import java.util.Scanner;

public class main {
public static void main(String[] args) {
 /*

While döngüsü yardımıyla bir tane ATM programı 

işlemler
1.İşlem : Bakiye Öğrenme 
2.İşlem : Para Çekme
3.İşlem : Para Yatırma 
Çıkış : q

*/
Scanner scanner = new Scanner(System.in);

int bakiye = 1000;
String islemler ="1.Bakiye Öğrenme :\n"
                +"2.Para Çekme :\n"
                +"3.Para Yatırma :\n"
                +"4.Çıkış : q ";

    System.out.println("*****************************************************");
    System.out.println(islemler);
    System.out.println("*****************************************************");


     while(true){

         System.out.println("İşlemleri şeçiniz :");
         String islem = scanner.nextLine();

         if(islem.equals("q")){

             System.out.println("Programdan çıkılıyor...");
             break;
}
         else if(islem.equals("1")){

             System.out.println("Bakiye :"+bakiye);
}
          else if(islem.equals("2")){
             System.out.println("Çekmek istediğiniz tutar :");
             int tutar = scanner.nextInt();
             scanner.nextLine();

           if (bakiye - tutar < 0){

               System.out.println("Yeterli Bakiyeniz Yok .Bakiyeniz :"+bakiye);
}
             else{

             bakiye -= tutar;
               System.out.println("Yeni Bakiyeniz :"+bakiye);
}
}
           else if(islem.equals("3")){
             System.out.println("Yatırmak istediğiniz tutar :");
             int tutar = scanner.nextInt();
             scanner.nextLine();

             bakiye += tutar;
             System.out.println("Yeni Bakiyeniz :"+bakiye);
     
}
            else{

             System.out.println("Yanlış Bir İşlem Girdiniz :");
}

}
    
}





    
}
