public class Uygulama {
    public static void main(String[] args) {
        TekListe tyList = new TekListe();
        //Tek listede açtığımız basa ekle fonksiyonunu kullandık
        tyList.basaEkle(10);
        tyList.basaEkle(20);
        tyList.basaEkle(5);
        tyList.basaEkle(30);
        //araya ekleme fonksiyonu ile araya sayı ekleme işlemimizi gerçekleştirdik
        tyList.arayaEkle(3, 9);
        //bastanSil() fonku ilk elemanı silmek için kullandık
        tyList.bastanSil();
        //sondanSil() fonku son elemanı silmek için kullandık
        tyList.sondanSil();
        //aradanSil() fonku belirtilen indisteki elemanı silmek için kullanılır elemanı 
        tyList.aradanSil(2);
        tyList.yazdir();

        System.out.println("baştaki düğümün elemanı: " + tyList.head.data);
        System.out.println("sondaki düğümün elemanı: " + tyList.tail.data);

    }
}