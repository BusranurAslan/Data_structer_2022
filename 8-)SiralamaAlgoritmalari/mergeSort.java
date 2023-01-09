public class mergeSort {
private int[] list;
// siralancak listeyi alan inşa fonksiyonu

public mergeSort(int[] listToSort) {list = listToSort; }
// listeyi döndüren kapsülleme fonksiyonu

public int[] getList() { return list; }
// dışarıdan çağırılan sıralama fonksiyonu

public void sort() { list = sort(list); }
// Özyineli olarak çalışan ve her parça için kullanılan sıralama fonksiyonu

private int[] sort(int[] dizi) {
    if (dizi.length == 1) 
        return dizi;
    else 
    {
        // diziyi ikiye bölüyoruz ve solu oluşturuyoruz
        int[] left = new int[dizi.length/2];
        System.arraycopy(dizi, 0, left, 0, left.length);
        
        for(int i = 0;i< dizi.length ; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");

        //dizinin sağını oluşturuyoruz ancak tek sayı ihtimali var
        int[] right = new int[dizi.length-left.length];
        System.arraycopy(dizi, left.length, right, 0, right.length);

        for(int i = 0;i< dizi.length ; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");
        
        // her iki tarafı ayrı ayrı sıralıyoruz
        left = sort(left);
        right = sort(right);
        
        for(int i = 0;i< dizi.length ; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");
        
        // Sıralanmış dizileri birleştiriyoruz
        merge(left, right, dizi);

        

        return dizi;
    }
}

// birleştirme fonksiyonu
private void merge(int[] left, int[] right, int[] sonuc) {
    int x = 0; int y = 0; int k = 0;
    // iki dizide de eleman varken
    while (x < left.length && y < right.length)
    { //bölünecek eleman yoksa
        if (left[x] < right[y]) 
        { 
            sonuc[k] = left[x]; x++; 
        }
        else 
        { 
            sonuc[k] = right[y]; y++; 
        }
        k++;
    }
    int[] rest; int restIndex;
    if (x >= left.length) 
    { 
        rest = right; 
        restIndex = y; 
    }
    else 
    { 
        rest = left; 
        restIndex = x; 
    }
    for (int i=restIndex; i<rest.length; i++) 
    { 
        sonuc[k] = rest[i]; 
        k++; 
    }
}

public static void main(String[] args) {
    int[] dizi = {15, 19, 4, 3, 18, 6, 2, 12, 7, 9, 11, 16};
    System.out.println("Sırasıs:");
    for(int i = 0;i< dizi.length ; i++)
    {
        System.out.print(dizi[i] + " ");
    }
    mergeSort sortObj = new mergeSort(dizi);
    sortObj.sort();
    System.out.println("");
    System.out.println("Sıralı:");
    int [] sirali = sortObj.getList();
    for(int i = 0;i< sirali.length ; i++)
    {
        System.out.print(sirali[i] + " ");
    }
}
}
