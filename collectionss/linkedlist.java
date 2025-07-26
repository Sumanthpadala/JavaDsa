package collectionss;
class Linkedlist{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public Linkedlist.Node head;
        public void addfirst(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public void printlist(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void addlast(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        public void insert(int data,int pos){
            Node temp=head;
            Node newnode=new Node(data);
            int cur_pos=1;
            if(pos<1){
                System.out.println("invalid");
            }
            if(pos==1){
                newnode.next=head;
                head=newnode;
            }
            while(temp!=null && cur_pos<pos-1){
                temp=temp.next;
                cur_pos++;
            }
            newnode.next=temp.next;
            temp.next=newnode;

        }
        public void deletefirst(){
            if(head==null){
                System.out.println("linkedlist is empty");
                return;
            }
            head=head.next;
        }
        public void deletelast(){
            if(head==null){
                System.out.println("not valid");
                return;
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
        public void deletepos(int pos){
            int cur_pos=1;
            Node temp=head;
            if(pos<1){
                System.out.println("invalid");
            }
            if(pos==1){
                head=null;
                return;
            }
            while(temp!=null && cur_pos<pos-1){
                temp=temp.next;
                cur_pos++;
            }
            temp.next=temp.next.next;
           

        }
      
    public static void main(String[] args) {
        Linkedlist obj=new Linkedlist();
        obj.addfirst(10);
        obj.addlast(20);
        obj.addlast(30);
        obj.insert(50,2);
        obj.addfirst(40);
        obj.deletepos(3);
        obj.printlist();
   }
}