/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method.
   
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    
    if(head == null){
        head = newNode;
    }else{
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    /*
    Node currP = head; 
    while(currP!=null){
        System.out.println(currP.data); 
        currP.next;
    } */
  return head;
}
