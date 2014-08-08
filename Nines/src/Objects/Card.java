/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;

/**
 *
 * @author cerwin
 */
public class Card {
    private enum Suits{hearts, diamonds, clubs, spades, joker};
    private Suits suit;
    private static int faceValue;

    public Card(Suits aSuit, int value) {
        suit = aSuit;
        faceValue = value;
    }
    
    public Card(int aSuit, int value){
        switch(aSuit){
            case 0: suit = Suits.hearts;
            case 1: suit = Suits.diamonds;
            case 2: suit = Suits.clubs;
            case 3: suit = Suits.spades; 
            case 4: suit = Suits.joker;
        }
        faceValue = value;
    }
    
    public int getActualValue() {
        int returnValue = 0;
        if (faceValue <= 10) {
            returnValue = faceValue;
        }
        else {
            switch (faceValue) {
                case 1:     returnValue = -1;
                case 11:    returnValue = 10;
                case 12:    returnValue = 10;
                case 13:    returnValue = 0;
                case 14:    returnValue = -2;
            }
        }
        return returnValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
    
    public String getFaceValueAsString() throws Exception {
        String faceValueString = "";
        if (faceValue < 11) {
            return Integer.toString(faceValue);
        }
        else {
            switch (faceValue) {
                case 1:     faceValueString = "Ace";
                case 11:    faceValueString = "Jack";
                case 12:    faceValueString = "Queen";
                case 13:    faceValueString = "King";
                case 14:    faceValueString = "Joker";
                defaut:     throw new RuntimeException("invalid face value");
            }
        }
        return faceValueString;
    }
    
    public String getSuit() throws RuntimeException {
        switch (suit) {
            case hearts:    return "Hearts";
            case clubs:     return "Clubs";
            case diamonds:  return "Diamonds";
            case spades:    return "Spades";
            case joker:     return "Joker";
            default:        throw new RuntimeException("invalid suit encountered");
        }
    }
    
    
    
}
