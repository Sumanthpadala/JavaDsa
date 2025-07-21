package javapro;
class linkedlist{
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public linkedlist.Node head;
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newnode;
        newnode.next=null;
    }
    public void printlist(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+ "->");
            cur=cur.next;

        }
        System.out.println("NULL");
    }
    public void Lenght(){
       int count=0;
       Node cur=head;
       while(cur!=null){

        count+=1;
        cur=cur.next;
       }
       System.out.println(count);
    }
    public static void main(String []args){
        linkedlist list=new linkedlist();
        list.addfirst("a");
        list.addfirst("b");
        list.addlast("c");
        list.printlist();
        list.Lenght();
    }
}