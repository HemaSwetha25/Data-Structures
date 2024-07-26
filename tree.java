import java.util.*;
class Bst{
    
    Node root=null;
    
    
    class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data=val;
            left=null;
            right=null;
        }
    }
    
    
    
    public void Append(int data){
        Node newNode=new Node(data);
        
        if(root==null){
            root=newNode;
        
            
        }else{
            Node temp=root;
            while(true){
                if(data < temp.data)
                {
                    if(temp.left != null)
                    {
                        temp = temp.left;
                    }
                    else
                    {
                        temp.left = newNode;
                        break;
                    }
                }
                else{
                
                    if(temp.right != null)
                    {
                        temp = temp.right;
                    }
                    else
                    {
                        temp.right = newNode;
                        break;
                    }
                
                }
                }
            }
    }
            
    public void display(Node temp){
        if(temp!=null){
            
            
            display(temp.left);
            display(temp.right);
            System.out.print(temp.data+" ");
            
        }
    }
}
public class tree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Bst obj=new Bst();
        int data;
        while ((data = sc.nextInt()) != -1) {
            obj.Append(data);
        }
    
        obj.display(obj.root);
    }
}