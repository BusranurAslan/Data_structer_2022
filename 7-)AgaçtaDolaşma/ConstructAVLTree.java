public class ConstructAVLTree {
    private Node rootNode;       
  
    //kurucu, rootNode'a boş değer ayarlamak için
    public ConstructAVLTree()  
    {  
        rootNode = null;  
    }  
      
    //AVL Ağacını boş yapmak için removeAll() yöntemini oluştur
    public void removeAll()  
    {  
        rootNode = null;  
    }  
      
    // AVL Ağacının boş olup olmadığını kontrol etmek için checkEmpty() yöntemini oluşturun
    public boolean checkEmpty()  
    {  
        if(rootNode == null)  
            return true;  
        else   
            return false;  
    }  
      
    // AVL Ağacına öğe eklemek için insertElement() öğesini oluşturun
    public void insertElement(int element)  
    {  
        rootNode = insertElement(element, rootNode);  
    }  
      
    //AVL Ağacının yüksekliğini elde etmek için getHeight() yöntemini oluşturun  
    private int getHeight(Node node )  
    {  
        return node == null ? -1 : node.h;  
    }  
      
    //sol ve sağ düğümden maksimum yüksekliği elde etmek için maxNode() yöntemini oluşturun  
    private int getMaxHeight(int leftNodeHeight, int rightNodeHeight)  
    {  
    return leftNodeHeight > rightNodeHeight ? leftNodeHeight : rightNodeHeight;  
    }  
      
      
     //AVL Ağacına yinelemeli olarak veri eklemek için insertElement() yöntemini oluşturun 
    private Node insertElement(int element, Node node)  
    {  
        // düğümün boş olup olmadığını kontrol edin  
        if (node == null)  
            node = new Node(element);  
         //verilen elemanın kök düğümün elemanından küçük olması durumunda bir düğüm ekle
        else if (element < node.element)  
        {  
            node.leftChild = insertElement( element, node.leftChild );  
            if( getHeight( node.leftChild ) - getHeight( node.rightChild ) == 2 )  
                if( element < node.leftChild.element )  
                    node = rotateWithLeftChild( node );  
                else  
                    node = doubleWithLeftChild( node );  
        }  
        else if( element > node.element )  
        {  
            node.rightChild = insertElement( element, node.rightChild );  
            if( getHeight( node.rightChild ) - getHeight( node.leftChild ) == 2 )  
                if( element > node.rightChild.element)  
                    node = rotateWithRightChild( node );  
                else  
                    node = doubleWithRightChild( node );  
        }  
        else  
            ;     // eleman ağaçta zaten mevcutsa hiçbir şey yapmayacağız
        node.h = getMaxHeight( getHeight( node.leftChild ), getHeight( node.rightChild ) ) + 1;  
          
        return node;  
          
    }  
      
    // sol çocuk ile ikili ağaç düğümünün dönüşünü gerçekleştirmek için rotateWithLeftChild() yöntemi oluşturuluyor       
    private Node rotateWithLeftChild(Node node2)  
    {  
        Node node1 = node2.leftChild;  
        node2.leftChild = node1.rightChild;  
        node1.rightChild = node2;  
        node2.h = getMaxHeight( getHeight( node2.leftChild ), getHeight( node2.rightChild ) ) + 1;  
        node1.h = getMaxHeight( getHeight( node1.leftChild ), node2.h ) + 1;  
        return node1;  
    }  
  
    // sağ alt öğe ile ikili ağaç düğümünün dönüşünü gerçekleştirmek için rotateWithRightChild() yöntemi oluşturuluyor    
    private Node rotateWithRightChild(Node node1)  
    {  
        Node node2 = node1.rightChild;  
        node1.rightChild = node2.leftChild;  
        node2.leftChild = node1;  
        node1.h = getMaxHeight( getHeight( node1.leftChild ), getHeight( node1.rightChild ) ) + 1;  
        node2.h = getMaxHeight( getHeight( node2.rightChild ), node1.h ) + 1;  
        return node2;  
    }  
  
    // ikili ağaç düğümünün çift dönüşünü gerçekleştirmek için doubleWithLeftChild() yöntemini oluşturun. Bu yöntem önce sol çocuğu sağ çocuğuyla, ardından node3'ü yeni sol çocuğuyla döndürür.  
    private Node doubleWithLeftChild(Node node3)  
    {  
        node3.leftChild = rotateWithRightChild( node3.leftChild );  
        return rotateWithLeftChild( node3 );  
    }  
  
   // ikili ağaç düğümünün çift dönüşünü gerçekleştirmek için doubleWithRightChild() yöntemini oluşturun. Bu yöntem önce sağ çocuğu sol çocuğuyla ve ardından node1'i yeni sağ çocuğuyla döndürür.
    private Node doubleWithRightChild(Node node1)  
    {  
        node1.rightChild = rotateWithLeftChild( node1.rightChild );  
        return rotateWithRightChild( node1 );  
    }      
  
    //AVL Ağacındaki toplam düğüm sayısını almak için getTotalNumberOfNodes() yöntemini oluşturun  
    public int getTotalNumberOfNodes()  
    {  
        return getTotalNumberOfNodes(rootNode);  
    }  
    private int getTotalNumberOfNodes(Node head)  
    {  
        if (head == null)  
            return 0;  
        else  
        {  
            int length = 1;  
            length = length + getTotalNumberOfNodes(head.leftChild);  
            length = length + getTotalNumberOfNodes(head.rightChild);  
            return length;  
        }  
    }  
  
    //AVL Ağacında bir öğe bulmak için searchElement() yöntemi oluşturun 
    public boolean searchElement(int element)  
    {  
        return searchElement(rootNode, element);  
    }  
  
    private boolean searchElement(Node head, int element)  
    {  
        boolean check = false;  
        while ((head != null) && !check)  
        {  
            int headElement = head.element;  
            if (element < headElement)  
                head = head.leftChild;  
            else if (element > headElement)  
                head = head.rightChild;  
            else  
            {  
                check = true;  
                break;  
            }  
            check = searchElement(head, element);  
        }  
        return check;  
    }  
    // AVL Ağacını inorder formunda dolaşmak için inorderTraversal() yöntemini oluştur  
    public void inorderTraversal()  
    {  
        inorderTraversal(rootNode);  
    }  
    private void inorderTraversal(Node head)  
    {  
        if (head != null)  
        {  
            inorderTraversal(head.leftChild);  
            System.out.print(head.element+" ");  
            inorderTraversal(head.rightChild);  
        }  
    }  
  
    // AVL Ağacını preorder formunda dolaşmak için preorderTraversal() yöntemini oluştur
    public void preorderTraversal()  
    {  
        preorderTraversal(rootNode);  
    }  
    private void preorderTraversal(Node head)  
    {  
        if (head != null)  
        {  
            System.out.print(head.element+" ");  
            preorderTraversal(head.leftChild);               
            preorderTraversal(head.rightChild);  
        }  
    }  
      
    // AVL Ağacını postorder formunda dolaşmak için postorderTraversal() yöntemini oluştur 
    public void postorderTraversal()  
    {  
        postorderTraversal(rootNode);  
    }  
      
    private void postorderTraversal(Node head)  
    {  
        if (head != null)  
        {  
            postorderTraversal(head.leftChild);               
            postorderTraversal(head.rightChild);  
            System.out.print(head.element+" ");  
        }  
    }     
}
