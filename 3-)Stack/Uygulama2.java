public class Uygulama2 {

    public static void main(String [] args)
    {
        Stack yigin = new Stack(10);//Dizinin boyutunu belirledik 10 ayarladık size=10 oldu
        yigin.push(5);      //5
        yigin.push(10);     //10->5
        yigin.push(15);     //15->10->5
        yigin.push(24);     
        yigin.push(43);     //43->24->15->10->5
        yigin.push(65);     //65->43->24->15->10->5
        yigin.push(12);     //12->65->43->24->15->10->5
        
        //çıkarılanı yaz
        System.out.println("eleman : "+ yigin.pop());//65->43->24->15->10->5
        System.out.println("eleman : "+ yigin.pop());//43->24->15->10->5
        yigin.push(50);                              //50->43->24->15->10->5
        System.out.println("pop : "+ yigin.pop());  //43->24->15->10->5
        System.out.println("pop : "+ yigin.pop());  //24->15->10->5
        System.out.println("pop : "+ yigin.pop());  //15->10->5
        
        yigin.push(75);                             //75->15->10->5
        System.out.println("peek : "+ yigin.peek());
        //yigin.list();//Listele

        while(yigin.isEmpty())
        {
            System.out.print(+yigin.pop()+"-->");
            System.out.print("");
        }
        System.out.print("");
}
    
}