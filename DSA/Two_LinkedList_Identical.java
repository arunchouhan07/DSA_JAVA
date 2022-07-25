class Node {
    int data;
    Node next;
    
    public Node(int data){
       this.data = data;
        this.next = null;
    }
}*/

class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
       while(head1!=null && head2!=null){
           if(head1.data!=head2.data){
               return false;
           }
           head1=head1.next;
           head2=head2.next;
       }
       return (head1==null && head2==null)? true:false;
    }
}