class insertionSort{
    void insertionSort(int dizi[])
    {
        int i,k,y;
        int n=dizi.length;
        for(k=1; k<n; k++)//boyutu kadar döngü
        {
            y=dizi[k];
            for(i=k-1; i>=0 && y<dizi[i]; i--)
                dizi[i+1]=dizi[i];
            dizi[i+1]=y;
            for (int m=0; m<n; ++m) 
                System.out.print(dizi[m] + " "); 
            System.out.println();
        }
    }

    void diziyiYazdir(int dizi[]) 
    { 
        int n = dizi.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(dizi[i] + " "); 
        System.out.println(); 
    } 
  
    // Algortimayı Test etme 
    public static void main(String args[]) 
    { 
        insertionSort ob = new insertionSort(); 
        int dizi[] = {20, 34, 13, 5, 9, 80, 1}; 
        ob.insertionSort(dizi); 
        System.out.println("Sıralı Dizi: "); 
        ob.diziyiYazdir(dizi); 
    } 
}
