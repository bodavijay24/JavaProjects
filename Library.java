/*create a simple Library tool to help analyze completed books in a small, personal library. The tool will print out the books that a user has fully read. We will store the books and their completion status in a HashMap.

print out the books that have a completion status of true.
@BodaVijay
*/

import java.util.HashMap;
public class Library{
  
 public Library(){
   
 }
 public void getFinishedBooks(HashMap<String,Boolean> library){
   if (library.size()<1){
     System.out.println("Library is empty");
     
   }
   else{
     for (String book:library.keySet()){
       if(library.get(book)==true){
         System.out.println(book);
       }
     }
   }
 }
  public static void main(String[] args){
    HashMap<String,Boolean> myBooks=new HashMap<String,Boolean>();
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);
    Library library=new Library();
   library.getFinishedBooks(myBooks);
  }
}