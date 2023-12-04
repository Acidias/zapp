import java.util.ArrayList;
import java.util.List; 
/**
 * Write a description of class CardTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CardTester
{
    public static void main(String[] args)
    {
        ArrayList<Card> cardlist = new ArrayList<Card>();
        
        Card c1 = new Card(1000, "Lynn", 5, 10);
        Card c2 = new Card(1001, "May", 3, 20);
        Card c3 = new Card(1002, "Nils", 10, 20);
        Card c4 = new Card(1003, "Olek", 2, 12);
        Card c5 = new Card(1004, "Pan", 3, 4);
        Card c6 = new Card(1005, "Quin", 1, 5);
        Card c7 = new Card(1006, "Raj", 10, 6);
        Card c8 = new Card(1007, "Sol", 7, 20);
        Card c9 = new Card(1008, "Tel", 16, 24);
        
        
        
        cardlist.add(c1);
        cardlist.add(c2);
        cardlist.add(c3);
        cardlist.add(c4);
        cardlist.add(c5);
        cardlist.add(c6);
        cardlist.add(c7);
        cardlist.add(c8);
        cardlist.add(c9);
        
        c9.convertPoints(1);
        c9.convertPoints(10);
        c9.convertPoints(1);
        
        System.out.println("Test: " + cardlist);
        
       
    }
}
