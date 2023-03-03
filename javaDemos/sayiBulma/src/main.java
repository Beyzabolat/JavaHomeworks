package src;

public class main {
        public static void main(String[] args) throws Exception {
            int[] sayilar =new int[]{1,2,3,4,5,6,7};
            int aranacak=7;
            boolean varMi=false;
            for(int sayi: sayilar){
                if(sayi==aranacak){
                    varMi=true;
                    break;
                }
            }
            if(varMi){
                System.out.println("sayi mevcuttur");
            }
            else{
                System.out.println("sayi mevcut degildir");
            }
        }
    }
    
