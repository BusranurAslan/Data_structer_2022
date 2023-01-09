public class Main {
    public static void main(String[] args) {
    
        DBList d=new DBList();
        d.ekle("Sultanbeyli");   
        d.ekle("Sancaktepe");
        d.ekle("Kadıköy");
        d.ekle("Kartal");
        d.ekle("Pendik");
        d.listele();
        d.sil("Sancaktepe");
        System.out.println();
        d.listele();
    }
}