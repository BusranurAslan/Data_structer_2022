class QuickSort 
{ 
    int partition(int dizi[], int low, int high) //Parçalama
    { 
        int pivot = dizi[high];  
        int i = (low-1); // en düşük elamanın indisi
        for (int j=low; j<high; j++) 
        { 
            // eğer şuanki eleman pivottan küçük yada eşit ise 
            if (dizi[j] <= pivot) 
            { 
                i++; 
                // swap işlemi dizi[i]  dizi[j] 
                int temp = dizi[i]; 
                dizi[i] = dizi[j]; 
                dizi[j] = temp; 
            } 
        // swap işlemi dizi[i+1] dizi[high] (pivot) 
        int temp = dizi[i+1]; 
        dizi[i+1] = dizi[high]; 
        dizi[high] = temp; 
        } 
        return i+1;
    }

    /* Quiksdrt algoritması yapıcısı
      dizi[] --> dizi, 
      low  --> en düşükten başla, 
      high  --> sona kadar git */
    //böl parçala sırala
    void sort(int dizi[], int low, int high) 
    { 
        if (low < high) //eleman kalıncaya kadar çalışır
        { 
            //dizi[pi] is sağdaki
            int pi = partition(dizi, low, high); 
  
            sort(dizi, low, pi-1); //soldakini sorala(Ağaç mantığı)
            sort(dizi, pi+1, high); //sağdakini sorala

        }
    } 

  //yazdırma
    static void printdiziay(int dizi[]) 
    { 
        int n = dizi.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(dizi[i]+" "); 
        System.out.println(); 
    } 

    //Çalışan yer
    public static void main(String args[]) 
    { 
        int dizi[] = {20, 77, 18, 9, 12, 5}; 
        int n = dizi.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(dizi, 0, n-1); 
  
        System.out.println("Sıralı dizi: "); 
        printdiziay(dizi); 
    } 
} 
