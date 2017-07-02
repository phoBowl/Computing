/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    if(head == null){
        return null;
    }else if(head.next == null && position == 0){
        return null;
    }else if(head.next!=null && position == 0){
        head = head.next;
        return head;
    }else{
       Node curr = head;
       Node prev = null;
       int counter = 0;
       while(curr!=null){
           if(counter == position) break;
           prev = curr;
           curr = curr.next;
           counter++;
       }
       curr = curr.next;
       prev.next = curr;
    }
     return head;
}
