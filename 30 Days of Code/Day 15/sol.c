
Node* newNode(int data);

Node* insert(Node *head,int data)
{
    //Complete this function
    Node* curr = head;
    Node* new = newNode(data);
    if(curr!= NULL){
        curr = head;
        while(curr->next != NULL){
            curr = curr->next;
        }
        curr->next = new;
    }else{ 
        return new;
    }
   return head;
}

/*
 Node* insert(Node *head,int data) {
          Node* newhead = newNode(data);
          if(head != NULL) {
              Node *current = head;
              while(current->next != NULL) {
                  current = current->next;
              }
              current->next = newhead;
              return head;
          } else {
              return newhead;
          }
      }
      */
Node* newNode(int data){
    Node* new = malloc(sizeof(Node));
    new->data = data;
    new->next = NULL;
    return new;
}
