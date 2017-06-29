/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node newNode  = new Node();
    newNode.data = data;
    newNode.next = null;
    
    
    if(head == null){
        head = newNode;
    }else{
        if(position == 0){
           newNode.next = head;
           head = newNode; 
           return head;
        }
        int counter = 0;
        Node curr = head;
        Node prev = null;
        while(curr!=null){
           prev = curr;
           curr = curr.next;
           counter++;
           if(counter == position) break;
        }
        prev.next = newNode;
        newNode.next = curr;
    }
  
    return head;
}
