public class Kuyruk {
  // private değişkenler
  private int maxBoyut;
  private long[] kuyrukDizi;
  private int front;
  private int rear;
  private int elemanSayisi;
   
  // constructor
  // kuyruk degisken_ismi = new kuyruk (eleman_sayisi);
  public Kuyruk (int boyut){
    maxBoyut = boyut;
    kuyrukDizi = new long [maxBoyut];
    front = 0;
    rear = -1;
    elemanSayisi = 0;
  }
   
  // metodlar
   
  // kuyruk boş mu?
  public boolean bosMu() {
    if (elemanSayisi == 0) return true;
    else return false;
  }
   
  // kuyruk dolu mu?
  public boolean doluMu() {
    if (elemanSayisi == maxBoyut) return true;
    else return false;
  }
   
  // kuyruğa eleman ekleme
  public void insert (long eklenecekEleman){
    if (rear == maxBoyut -1)//kuyruk dolduysa 
        rear = -1;
    rear++;
    kuyrukDizi [rear] = eklenecekEleman;
    elemanSayisi++;
  }
   
  // kuyruktan eleman çekme
  public long remove(){
    long cikarilacak = kuyrukDizi [front++];
    if (front == maxBoyut) front = 0;
    elemanSayisi--;
    return cikarilacak;
  }
   
  public long cikart() {
    if (front >= rear) { // kuyruk bitmediyse
        // çıkartılacak değeri geçici değişkenimize atıyoruz.
        long d = kuyrukDizi[rear++];
        // çıkartılacak değerin yerini 0'a eşitliyoruz.
        kuyrukDizi[rear - 1] = 0;

        if(rear > front) // son elemana kadar çıkarttığımızda
        {
            // yeni eleman ekleyebilmemiz için
            // ön ve rearyı sıfırlıyoruz.
            rear = 0;
            front = -1;
        }

        return d; // geçici değişkenimizi gönderiyoruz.
    }
        return elemanSayisi;
}
  // kuyruğun sonundaki eleman
  public long kuyrukNerde() {
    return kuyrukDizi[front];
  }
   
  // kuyruğun boyutu
  public int kuyrukBoyutu() {
    return elemanSayisi;
  }
}