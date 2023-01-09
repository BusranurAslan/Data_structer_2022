public class Stack {
    private int[] elements;//stack tanımlama dizi mantığı
    private int top;
    private int max;    //----------------------------
                        //push-->ekle,  pop()-->Çıkar
    Stack(int size)     //----------------------------
    {
        elements = new int[size];//dizi tanımlama Main class dan gelecek
        top = 0;        //0 dan başlatacaz dizi için
        max = size;     //main den gelen size boyutu kadar eleman eklenecek
    }
    public void push(int element)//ekleme metodu
    {
        if(!isFull()){//dolmamışsa
            elements[top] = element;    //dizi eleman olarak eklenecek
            top++;                      //her eklendikten sonra indis 1 artırılır
        }
    }
    
    public int pop()
    {
        top--;                      //çıkardıktan sonra indis 1 azaltılır.
        return elements[top];       //elemanı geri döndürür
    }
    
    public int peek()           //dizinin  en üst elemanını getirir
    {
        return elements[top];
    }
    
    public boolean isEmpty()    //stack in boş olup olmadığı bilgisi alınır.
    {
        if(top > 0) return true;//top değeri sorgulanarak yapılır.
        else return false;      //boş ise false değer döndürülür
    }
    
    public boolean isFull() //stack in dolu olup olmadığı bilgisini verir
    {
        if(top == max) return true;//top değeri sorgulanarak yapılır.
        else return false;         //dolu ise false değer döndürülür
    }
    
    public int size()   //stack boyutu
    {
        return top;
    }
    
    public void list()  //listeleme
    {
        for(int i = max - 1; i >= 0; i--) //sondan başlanarak 
        {                                   //stacteki elemanlar çekilir.
            if(elements[i] != 0)                    
                System.out.print(elements[i] + " ");
        }
    }
}