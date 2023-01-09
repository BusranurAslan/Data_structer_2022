import java.util.Scanner;
public class AVLTreeExample {
      //main() yöntemi başlar 
      public static void main(String[] args)  
      {     
     //kullanıcıdan girdi almak için Scanner nesnesi oluşturuluyor 
     Scanner sc = new Scanner(System.in);  
  
    // AVL Ağacını yapmak için ConstructAVLTree sınıf nesnesinin nesnesini yarat
     ConstructAVLTree obj = new ConstructAVLTree();   

     char choice;   // seçim için bir karakter tipi değişkeni başlat
       
    // Switch kullanarak AVL Ağacının işlemini gerçekleştirin
     do      
     {  
         System.out.println("\nBir işlem secin:\n");  
         System.out.println("1. Bir dügüm ekleyin");  
         System.out.println("2. Dugum ara");  
         System.out.println("3. AVL Ağacındaki toplam düğüm sayısını alın");  
         System.out.println("4. AVL Ağacı boş mu?");  
         System.out.println("5. AVL Ağacından tüm düğümleri kaldır");  
         System.out.println("6. AVL Ağacını Gönderi Sırasında Görüntüle");  
         System.out.println("7. AVL Ağacını Ön Sırada Görüntüle");  
         System.out.println("8. AVL Ağacını Sırayla Görüntüle");  

         //seçimi kullanıcıdan al  
         int ch = sc.nextInt();              
         switch (ch)  
         {  
             case 1 :   
                 System.out.println("Lütfen AVL Ağacına eklemek için bir öğe girin");  
                 obj.insertElement( sc.nextInt() );                       
                 break;                            
             case 2 :   
                 System.out.println("Aranacak tamsayı öğesini girin");  
                 System.out.println(obj.searchElement( sc.nextInt() ));  
                 break;                                            
             case 3 :   
                 System.out.println(obj.getTotalNumberOfNodes());  
                 break;       
             case 4 :   
                 System.out.println(obj.checkEmpty());  
                 break;       
             case 5 :   
                 obj.removeAll();  
                 System.out.println("\nAğaç başarıyla Temizlendi");  
                 break;  
             case 6 :   
                 System.out.println("\nAVL Ağacını postOrder a gore göster");  
                 obj.postorderTraversal();  
                 break;  
             case 7 :   
                 System.out.println("\nAVL agacini Pre order a göre göster");  
                 obj.preorderTraversal();  
                 break;  
             case 8 :   
                 System.out.println("\nAVL Agacini In order a göre goster");  
                 obj.inorderTraversal();  
                 break;  
             default :   
                 System.out.println("\n ");  
                 break;      
         }  
         System.out.println("\n Devam etmek için 'y' veya 'Y'ye basın\n");  
         choice = sc.next().charAt(0);                          
     } while (choice == 'Y'|| choice == 'y');      
}
}
