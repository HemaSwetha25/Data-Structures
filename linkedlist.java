class linked{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    
    }
        linkedlist(){
             head=null;
             tail=null;
        }
        public void append(int val){
            Node newnode =new Node(val);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        public void display(){
             Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        
}
public class linkedlist {
    public static void main(String[] args){
        linked l=new linked();
        l.append(20);
        l.append(30);
        l.append(40);
        l.append(50);
        l.append(60);
        l.display();
        

    }
    
}
