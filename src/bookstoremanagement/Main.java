package bookstoremanagement;
import java.util.*;
/**
 *
 * @author alyssaday
 */
public class Main {
    public static void main(String[] args) {
        Bookstore store = new Bookstore();
        ArrayList<Cart> cart = new ArrayList<Cart>();
        
     
        store.addBook("The Big Friendly Giant", "Roald Dahl", 8.99, 7);
        store.addBook("The Firekeeper's Daughter", "Angeline Boulley", 12.99, 3);
        store.addBook("Harry Potter: The Goblet of Fire", "J.K. Rowling", 14.99, 5);
        store.addBook("Green Eggs and Ham", "Dr. Suess", 5.99, 4);
        store.addBook("Diary of a Wimpy Kid", "Jeff Kinney", 6.99, 2);
        store.addBook("To Kill a Mockingbird", "Harper Lee", 6.99, 3);
        
        store.addDVD("Mr. and Mrs. Smith", "Doug Liman", 12.99, 5);
        store.addDVD("The Bee Movie", "Simon Smith",5.99, 10);
        store.addDVD("Spiderman: Into the Spider-Verse", "Peter Ramsey",14.99, 6);
        store.addDVD("Iron Man", "Marvel",6.99, 9);
        store.addDVD("Captain America", "Marvel",8.99, 12);
        store.addDVD("Black Panther", "Marvel",10.99, 8);
        
        store.addCD("Thriller", "Michael Jackson", 19.99, 12);
        store.addCD("Thank u, next", "Ariana Grande", 14.99, 7);
        store.addCD("Back in Black", "ACDC", 10.99, 6);
        store.addCD("The Miracle", "Queen", 11.99, 8);
        store.addCD("Wasteland", "Brent Faiyaz", 12.99, 10);
        store.addCD("Certified Lover Boy", "Drake", 10.99, 10);
        
        store.addMember("Alyssa","2528221245", "aday19@uncc.edu", true);
        store.addMember("Sofia", "1234567890", "sofia123@gmail.com", false);
        store.addMember("Ben", "9992224356", "benmail01@gmail.com", true);
        store.addMember("Chris", "4563781267", "chrissmith@uncc.edu", false);
        
        
        store.startPurchase();
    
                
                
              
                
                
                
                
            
        
            
           
        
          
            }
        }
    
    
    
    
       
    

