public class Main
{
    public static void main(String[] args)
    {
        DengeliAgac agac = new DengeliAgac();
        System.out.println("Dengeli Ağaç \n");
        //düğümler oluşturulur
        agac.insert(52);
        agac.insert(14);
        agac.insert(560);
        agac.insert(82);
        agac.insert(91);
        agac.insert(18);
        agac.insert(5);

        System.out.println("\nPre-order  :");
        agac.preorder();
        System.out.println("\nIn-order   :");
        agac.inorder();
        System.out.println("\nPost-order :");
        agac.postorder();
        
    }
}