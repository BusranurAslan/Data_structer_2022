public class Main {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();  
          //İkili ağaca düğümler ekleyin
          bt.insert(50);  
          bt.insert(30);  
          bt.insert(70);  
          bt.insert(60);  
          bt.insert(10);  
          bt.insert(90);  
  
          System.out.println("Eklemeden sonra ikili arama ağacı:");  
          //İkili ağacı görüntüler
          bt.inorderTraversal(bt.root);  
  
          Node deletedNode = null;  
          //Bir çocuğu olan düğüm 90'u siler 
          deletedNode = bt.deleteNode(bt.root, 90);  
          System.out.println("\n Düğüm 90'ı sildikten sonra ikili arama ağacı:");  
          bt.inorderTraversal(bt.root);  
  
          //Bir çocuğu olan düğüm 30'u siler 
          deletedNode = bt.deleteNode(bt.root, 30);  
          System.out.println("\nDüğüm 30'u sildikten sonra ikili arama ağacı:");  
          bt.inorderTraversal(bt.root);  
  
           //iki çocuğu olan düğüm 50'yi siler
          deletedNode = bt.deleteNode(bt.root, 50);  
          System.out.println("\nDüğüm 50'i sildikten sonra ikili arama ağacı:");  
          bt.inorderTraversal(bt.root);  
      }  
    }

