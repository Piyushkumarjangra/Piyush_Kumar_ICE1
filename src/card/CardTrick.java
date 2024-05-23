/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * modifier = Piyush Kumar;
 * Student ID - 991717611
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int randValue = rand.nextInt(13)+1;
            int randSuit = rand.nextInt(4);
            c.setValue(randValue);
            c.setSuit(Card.SUITS[randSuit]);
            magicHand[i] = c;
            System.out.println(c.getValue() + " " + c.getSuit());
        }
        
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter a card value (1-13): ");
        int cardInput = s1.nextInt();
        
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs )");
        int suitInput = s1.nextInt();
        
        Boolean result = false;
        for(Card card: magicHand){
            if((card.getValue() == cardInput) && (card.getSuit().equals(Card.SUITS[suitInput]))){
                result = true;
                break;
            }
            
        
        
    }
        if(result == true){
            System.out.println("Congratulations, your card in the magic hands");
        }
        else{
                System.out.println("Sorry, your card is not in the magic hand");
        }
        
    }
    
}
