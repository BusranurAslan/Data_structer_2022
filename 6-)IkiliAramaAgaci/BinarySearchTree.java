public class BinarySearchTree {  
  
      //İkili ağacın kökünü temsil eder
      public Node root;  
  
      public BinarySearchTree(){  
          root = null;  
      }  
  
     //insert() ikili arama ağacına yeni düğüm ekleyecek
      public void insert(int data) {  
          //yeni bir düğüm oluştur
          Node newNode = new Node(data);  
  
           //Ağacın boş olup olmadığını kontrol et
          if(root == null){  
              root = newNode;  
              return;  
            }  
          else {  
              //geçerli düğüm ağacın köküne işaret ediyor
              Node current = root, parent = null;  
  
              while(true) {  
                //parent, geçerli düğümün üst düğümünü takip eder.
                  parent = current;  
  
                   //veri mevcut veriden küçükse, düğüm ağacın soluna eklenir
                  if(data < current.data) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }  
                  //veri mevcut veriden büyükse, düğüm ağacın sağına eklenir  
                  else {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }  
              }  
          }  
      }  
  
      //minNode() minimum düğümü bulur
      public Node minNode(Node root) {  
          if (root.left != null)  
              return minNode(root.left);  
          else  
              return root;  
      }  
  
      //deleteNode(), verilen düğümü ikili arama ağacından siler
      public Node deleteNode(Node node, int value) {  
          if(node == null){  
              return null;  
           }  
          else {  
               //değer, düğümün verisinden küçüktür, değeri sol alt ağaçta arayın
              if(value < node.data)  
                  node.left = deleteNode(node.left, value);  
  
               //değer, düğümün verisinden büyükse, değeri sağ alt ağaçta arayın
              else if(value > node.data)  
                  node.right = deleteNode(node.right, value);  
  
               //Eğer,değer düğümün verilerine eşitse, yani silinecek düğümü bulduk
              else {  
                    //Silinecek düğümün alt öğesi yoksa, düğümü null olarak ayarlayın
                  if(node.left == null && node.right == null)  
                      node = null;  
  
                   //Silinecek düğümün yalnızca bir sağ çocuğu varsa
                  else if(node.left == null) {  
                      node = node.right;  
                  }  
  
                  //Silinecek düğümün yalnızca bir çocuğu kaldıysa
                  else if(node.right == null) {  
                      node = node.left;  
                  }  
  
                   //Silinecek düğümün iki alt düğümü varsa
                  else {  
                       //sonra sağ alt ağaçtan minimum düğümü bul
                      Node temp = minNode(node.right);  
                      //node ve temp arasında veri alışverişi
                      node.data = temp.data;  
                      //Düğüm yinelenen düğümü sağ alt ağaçtan sil
                      node.right = deleteNode(node.right, temp.data);  
                  }  
              }  
              return node;  
          }  
      }  
  
       //inorder() ikili arama ağacında inorder çaprazlama yapacak
      public void inorderTraversal(Node node) {  
  
           //Ağacın boş olup olmadığını kontrol et
          if(root == null){  
              System.out.println("ağaç boş mu?");  
              return;  
           }  
          else {  
  
              if(node.left!= null)  
                  inorderTraversal(node.left);  
              System.out.print(node.data + " ");  
              if(node.right!= null)  
                  inorderTraversal(node.right);  
  
          }  
      }  
    }