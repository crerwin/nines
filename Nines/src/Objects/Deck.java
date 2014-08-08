/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;
import java.util.ArrayDeque;
/**
 *
 * @author cerwin
 */
public class Deck {
    private ArrayDeque<Card> cards = new ArrayDeque<>();
    
    public Deck() {
        for(int i = 0; i <= 3; i++){
            for(int j = 1; j <= 13; j++){
                cards.add(new Card(i, j));
            }
        }
        cards.add(new Card(4, 14));
        cards.add(new Card(4, 14));
    }
    
    public Card getLast() {
        // for the discard deck (see what's showing, deck 
        // is upside down, so it's actually the last card
        return cards.getLast();
    }
    
    public void addCard(Card card) {
        cards.add(card);
    }
    
    public Card takeCard() {
        return cards.remove();
    }
    
    public int size() {
        return cards.size();
    }
    
    public boolean isEmpty(){
        return cards.isEmpty();
    }
    
    
}
