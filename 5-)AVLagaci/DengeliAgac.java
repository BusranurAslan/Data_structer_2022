class DengeliAgac
{
    private Node root;
    public DengeliAgac()
    {
        root = null;
    }
    //kökün boş olup olmadığını bulan fonk.
    public boolean isEmpty()
    {
        return root == null;// root null ise ture, değilse false değer dönderir
    }
    public void clear()//Ağacı temizler ağacı siler
    {
        root = null;//rootu siler
    }
    public void insert(int data)//
    {
        root = ekle(data, root);
    }
 
    private int height(Node t)
    {
        return t == null ? -1 : t.height;
    }
    private int max(int lhs, int rhs)
    {
        return lhs > rhs ? lhs : rhs;//sol ve sağ ağaç yüksekliği ele alınır
    }
    private Node ekle(int x, Node t)
    {
        if (t == null)//Ağaç yoksa kök boş ise
            t = new Node(x); //yeni bir node oluştur
        else if (x < t.data)
        {
            t.left = ekle(x, t.left);//t.left yeni alat ağacın kökü olur.
            if (height(t.left) - height(t.right) == 2)//sol alt ağacın yüksekliği sağ alt ağacın yüksekliği farkı 2 ise LL dengesizliği oluşur.
                if (x < t.left.data)//
                    t = RorateChild_LL(t);
                else
                    t = doubleWithLeftChild(t);
        } 
        else if (x > t.data)
        {
            t.right = ekle(x, t.right);
            if (height(t.right) - height(t.left) == 2)
                if (x > t.right.data)
                    t = RorateChild_RR(t);
                else
                    t = doubleWithRightChild(t);
        } else
            ;
        t.height = max(height(t.left), height(t.right)) + 1;
        return t;
    }
 
    private Node RorateChild_LL(Node k2)
    {
        Node k1 = k2.left;//swap işlemi değişim yedek ağaç tanımla
        k2.left = k1.right;// kökün solunu ağacın soluna ağacın sağını ata
        k1.right = k2;//ağacın sağına kökü ata
        k2.height = max(height(k2.left), height(k2.right)) + 1;//yükseklik hesapla
        k1.height = max(height(k1.left), k2.height) + 1;
        return k1;
    }
 
    private Node RorateChild_RR(Node k1)
    {
        Node k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = max(height(k1.left), height(k1.right)) + 1;
        k2.height = max(height(k2.right), k1.height) + 1;
        return k2;
    }
 
    private Node doubleWithLeftChild(Node k3)
    {
        k3.left = RorateChild_RR(k3.left);// sol sağacı sağa dönder
        return RorateChild_LL(k3);//oluşan ağacı sola dönder
    }
 
    private Node doubleWithRightChild(Node k1)
    {
        k1.right = RorateChild_LL(k1.right);
        return RorateChild_RR(k1);
    }
 
    public int countNodes()//ağaçtaki eleman sayısını verir
    {
        return NodeSayisi(root);
    }
    private int NodeSayisi(Node r)
    {//ağaçtaki eleman sayısını bulur hesaplar
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += NodeSayisi(r.left);
            l += NodeSayisi(r.right);
            return l;
        }
    }
 
    public boolean search(int val)//eleman varmı
    {
        return ara(root, val);
    }
 
    private boolean ara(Node r, int val)
    {//elamanı bulur
        boolean found = false;//bulunmadı
        while ((r != null) && !found)//eleman bulana kadar devam eder kökteki tüm elemanlar dolaşılına kadar
        {
            int rval = r.data;
            if (val < rval)//gelen veri kökün verisiniden küçükse
                r = r.left;//yeni ağacımız sol ağaç
            else if (val > rval)//gelen veri kökün verisiniden büyükse
                r = r.right;//yeni ağacımız sağa ağaç
            else
            {
                found = true;
                break;//found'a true değeri gönderilir
            }
            found = ara(r, val);
        }
        return found;
    }
 
    public void inorder()
    {
        inorder(root);
    }
 
    private void inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.left);
            System.out.print(r.data + " --> ");
            inorder(r.right);
        }
    }
 
    public void preorder()
    {
 
        preorder(root);
    }
 
    private void preorder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.data + " --> ");
            preorder(r.left);
            preorder(r.right);
        }
    }
 
    public void postorder()
    {
        postorder(root);
    }
 
    private void postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " --> ");
        }
    }
}
