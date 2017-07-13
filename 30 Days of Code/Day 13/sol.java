// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book{
  
    // Declare the price instance variable
    private int price;
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    public MyBook(String tt, String au, int price){
        super(tt,au);
        this.price = price;
    }
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    public void display(){
        System.out.println("Title: "+ super.title);
        System.out.println("Author: "+ super.author);
        System.out.println("Price: "+ price);
    }
}
// End class
