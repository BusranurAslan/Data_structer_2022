public class LinearSearch{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    //dizinin içerisine girer
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 50;    //50'i bulmak istersek
        System.out.println(key+" indeximiz: "+linearSearch(a1, key));    
    }    
}    