import java.util.Scanner; 
public class Node {
    int element;  
    int h;  //boy için
    Node leftChild;  
    Node rightChild;  
      
    //boş düğüm oluşturmak için varsayılan kurucu
    public Node()  
    {  
        leftChild = null;  
        rightChild = null;  
        element = 0;  
        h = 0;  
    }  
    //  parametreli yapıcı
    public Node(int element)  
    {  
        leftChild = null;  
        rightChild = null;  
        this.element = element;  
        h = 0;  
    }       
}
