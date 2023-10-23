package bookstoremanagement;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author alyssaday
 */
public class Bookstore {
    
    private ArrayList<Books> books = new ArrayList<Books>();
    private ArrayList<CD> cds = new ArrayList<CD>();
    private ArrayList<DVD> dvds = new ArrayList<DVD>();
    private ArrayList<Member> members = new ArrayList<Member>();
    private ArrayList<Cart> cart = new ArrayList<Cart>();
    
    
    


public void startPurchase(){ 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("************ Welcome to Alyssa's Bookstore ************");
        
        System.out.println("Enter your name:");
        String memName = sc.next();
        System.out.println("Welcome " + memName + "!");
        System.out.println("Please select from the following menu of options, by typing a number:");
        System.out.println("\t 1. Complete a purchase");
        System.out.println("\t 2. Register for membership");
        System.out.println("\t 3. See whats inside your cart");
        System.out.println("\t 4. Exit");
        int choice = sc.nextInt();
        
        switch (choice) {

        case 1:
            System.out.println("Which item would you like to purchase?");
            System.out.println("\t 1. Book");
            System.out.println("\t 2. CD");
            System.out.println("\t 3. DVD");
            int item = sc.nextInt();
            
            switch (item) {
                case 1: 
                   System.out.println("Choose a book you'd like from our inventory!");
                    for(int i = 0; i < books.size(); i++) {
                        System.out.println(i + ": " + books.get(i).getTitle() + ": " + books.get(i).getArtist() + " " + "$" + books.get(i).getPrice());  
                    }
                    int bookChoice = sc.nextInt();                   
                    Books book1 = books.get(bookChoice);
                    cart.add(book1);
                    
                    System.out.println("Thank you! " + book1.getTitle() + ": " + book1.getArtist() + " " +  " has been added to your cart!");
                    break;
                    
                    
                case 2:
                    System.out.println("Choose a CD you'd like from our inventory!");
                    for(int i = 0; i < cds.size(); i++) {
                        System.out.println(i + ": " + cds.get(i).getTitle() + ": " + cds.get(i).getArtist() + " " + cds.get(i).getPrice());
                    }
                    int cdChoice = sc.nextInt();
                    CD cd1 = cds.get(cdChoice);
                    cart.add(cd1);
                    
                    System.out.println("Thank you! " + cd1.getTitle() + ": " + cd1.getArtist() + " " + "has been added to your cart!");
                    break;
                    
                case 3:
                    System.out.println("Choose a DVD you'd like from our inventory!");
                    for(int i = 0; i < dvds.size(); i++) {
                        System.out.println(i + ": " + dvds.get(i).getTitle() + ": " + dvds.get(i).getArtist() + " " + "$" + dvds.get(i).getPrice());
                    }
                    int dvdChoice = sc.nextInt();                    
                    DVD dvd1 = dvds.get(dvdChoice);
                    cart.add(dvd1);
                    System.out.println("Thank you! " + dvd1.getTitle() + ": " + dvd1.getArtist() + " " + " has been added to your cart!");
                    break;
                    
                    
                    
                    
                   
                    
                    
                    
                    
                    
            }
        case 2:
            System.out.println("Let's get you registered for a membership!");
            System.out.println("Choose membership type:");
            System.out.println("\t 1. Regular Membership");
            System.out.println("\t 2. Premium membership");
            int membership = sc.nextInt();
            
            switch(membership) {
                
                case 1:
                   System.out.println("Please enter your name");
                   String newName = sc.next();
                   
                   System.out.println("Please enter your phone number");
                   String newPhone = sc.next();
                   
                  
                   
            }
            break;
        case 3:
            for (int i = 0; i < cart.size(); i++) {
                System.out.println(i + ": " + cart.get(i).getTitle() + ": " + cart.get(i).getArtist() + " " + "$" + cart.get(i).getPrice());
            }
            for (int i = 0; i < cart.size(); i++) {
                
                cart.get(i).getPrice();
            }
            
            break;
        case 4:
            
            
            
        }
        
        
            
}

public void addBook(String bookTitle, String bookArtist, double bookPrice, int newInventory) {
    
    Books newBook = new Books(bookTitle, bookArtist, bookPrice, newInventory);
    books.add(newBook);
}

public void addCD(String cdTitle, String cdArtist, double cdPrice, int newInventory) {
    
    CD newCD = new CD(cdTitle, cdArtist, cdPrice, newInventory);
    cds.add(newCD);
}

public void addDVD(String dvdTitle, String dvdArtist, double dvdPrice, int newInventory) {
    
    DVD newDVD = new DVD(dvdTitle, dvdArtist, dvdPrice, newInventory);
    dvds.add(newDVD);
}

public void addMember(String memberName, String memberPhone, String memberEmail, boolean isPremiumMember) {
    
   Member newMember = new Member(memberName, memberPhone, memberEmail, isPremiumMember);
   members.add(newMember);
}

    



}
            




    
    
    

