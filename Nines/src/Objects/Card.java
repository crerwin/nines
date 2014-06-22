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
    private enum suit{hearts, diamonds, clubs, spades};
    private int actualValue;
    private int faceValue;

    /**
     * @return the actualValue
     */
    public int getActualValue() {
        return actualValue;
    }

    /**
     * @param actualValue the actualValue to set
     */
    public void setActualValue(int actualValue) {
        this.actualValue = actualValue;
    }

    /**
     * @return the faceValue
     */
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
                case 11:    faceValueString = "Jack";
                case 12:    faceValueString = "Queen";
                case 13:    faceValueString = "King";
                case 14:    faceValueString = "Ace";
                case 15:    faceValueString = "Joker";
                defaut:     throw new RuntimeException("invalid face value");
            }
        }
        return faceValueString;
    }

    /**
     * @param faceValue the faceValue to set
     */
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
    
    
    
}
