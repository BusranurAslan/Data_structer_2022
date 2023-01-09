public class Main {

    public static void main(String[] args) {
        // 3 elemanlık kuyruğumuz
        Kuyruk kuyrugumuz = new Kuyruk(3);

        // insertme ve gözatma testleri
        kuyrugumuz.insert(1);
        System.out.println("İlk Eleman: " + kuyrugumuz.kuyrukNerde());
        kuyrugumuz.insert(2);
        System.out.println("İlk Eleman: " + kuyrugumuz.kuyrukNerde());
        kuyrugumuz.insert(3);
        System.out.println("İlk Eleman: " + kuyrugumuz.kuyrukNerde());

        // çıkarma ve gözatma testleri
        System.out.println("\n Çıkan eleman: " + kuyrugumuz.remove());
        System.out.println("Öndeki eleman: " + kuyrugumuz.kuyrukNerde());
        System.out.println("Çıkan eleman: " + kuyrugumuz.remove());
        System.out.println("Öndeki eleman: " + kuyrugumuz.kuyrukNerde());
        System.out.println("Çıkan eleman: " + kuyrugumuz.remove());

        // insertme ve gözatma testleri 2
        kuyrugumuz.insert(1);
        System.out.println("\nÖndeki eleman: " + kuyrugumuz.kuyrukNerde());
        kuyrugumuz.insert(2);
        System.out.println("Öndeki eleman: " + kuyrugumuz.kuyrukNerde());
        kuyrugumuz.insert(3);
        System.out.println("Öndeki eleman: " + kuyrugumuz.kuyrukNerde());

        // çıkarma ve gözatma testleri 2
        System.out.println("\nÇıkan eleman: " +kuyrugumuz.remove());
        System.out.println("Öndeki eleman: " +kuyrugumuz.kuyrukNerde());
        System.out.println("Çıkan eleman: " +kuyrugumuz.remove());
        System.out.println("Öndeki eleman: " +kuyrugumuz.kuyrukNerde());
        System.out.println("Çıkan eleman: " +kuyrugumuz.remove());

        // Bu aşamaya geldiğimizde kuyruğumuz boş olduğu için
        // kuyruk boş hatasını gösterecek.
        System.out.println("Öndeki eleman: " + kuyrugumuz.kuyrukNerde());
    }
}