public class TekListe {
    TekNode temp2;
    TekNode head = null;
    TekNode tail = null;

    void basaEkle(int x) {
        TekNode eleman = new TekNode();
        eleman.data = x;
        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("liste yapisi olusturuldu, ilk eleman eklendi");
        } else {
            eleman.next = head;
            head = eleman;
            System.out.println("Basa eleman eklendi");
        }
    }

    void sonaEkle(int x) {
        TekNode eleman = new TekNode();
        eleman.data = x;
        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("liste yapisi olusturuldu, ilk eleman eklendi");
        } else {
            eleman.next = head;
            tail.next = eleman;
            tail = eleman;
            System.out.println("Sona eleman eklendi");
        }
    }

    void arayaEkle(int indis, int x) {
        TekNode eleman = new TekNode();
        eleman.data = x;
        if (head == null && indis == 0) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("liste yapisi olusturuldu, ilk eleman eklendi");
        } else if (head != null && indis == 0) {
            eleman.next = head;
            head = eleman;
            System.out.println(indis + "indisinci sıraya yeni eleman eklendi");
        } else {
            int n = 0;
            TekNode temp = head;
            while (temp != null) {
                n++;
                temp2 = temp;
                temp = temp.next;
            }
            if (n == indis) {
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println("eleman eklendi");
            } else {
                temp = head;
                temp2 = head;
                int i = 0;
                while (i != indis) {
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println(indis + ".siraya yeni eleman eklendi");
            }
        }
    }

    void bastanSil() {
        if (head == null) {
            System.out.println("liste boş, silinecek nesne yok");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("listede kalan son elemanda silindi...");
        } else {
            head = head.next;
            System.out.println("bastaki eleman silindi");
        }
    }

    void sondanSil() {
        if (head == null) {
            System.out.println("liste bos, silinecek nesne yok");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("listede kalan son elemanda silindi ");
        } else {
            TekNode temp = head;
            TekNode temp2 = head;
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
            temp.next = null;
            tail = temp2;
            System.out.println("sondan eleman silindi");
        }
    }

    void aradanSil(int indis) {
        if (head == null)
            System.out.println("liste boş, silinecek bir şey yok!!!");
        else if (head.next == null && indis == 0) {
            head = null;
            tail = null;
            System.out.println("listede kalan son elemanda silindi");
        } else {
            int i = 0;
            TekNode temp = head;
            TekNode temp2 = head;
            while (temp != null) {
                i++;
                temp = temp.next;
            }
            if (i == indis) {
                temp2.next = null;
                tail = temp2;
                System.out.println("listedeki son siradaki eleman silindi");
            } else {
                temp = head;
                temp2 = head;
                int j = 0;
                while (j != indis) {
                    temp2 = temp;
                    temp = temp.next;
                    j++;
                }
                temp2.next = temp.next;
                System.out.println("aradaki nesne silindi");
            }
        }
    }

    void yazdir() {
        if (head == null) {
            System.out.println("liste yapisi bos!!");
        } else {
            TekNode temp = head;
            System.out.println("bas-->");
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("son.");
        }
    }

}
