public class Main {
public static void main (String[] args ) {
          sayiBulmaca();
        }
        public static void sayiBulmaca(){
            int[] sayilar =new int[]{1,2,3,4,5,6,7};
            int aranacak=6;
            boolean varMi=false;
            for(int sayi: sayilar){
                if(sayi==aranacak){
                    varMi=true;
                    break;
                }
            }
            String mesaj=" ";
            if(varMi){
                mesaj="sayi mevcut:"+aranacak;
               mesajVer(mesaj);
            }
            else{
                mesajVer("sayi mevcut degildir: "+aranacak);
            }
        }
        public static void mesajVer(String mesaj) {
            System.out.println(mesaj);
        }
    }
    
    
    
    

