package Game;

import java.util.ArrayList;

import Card.Card32;
import Enum.Figure;
import Enum.Suit;

public final class Game32 {
  private final static Game32 instance = new Game32();
  public final static Game32 getInstance() { return instance; }
  private ArrayList<Card32> cards;
  
  private Game32(){
    this.cards = generateGame();
  }

  private ArrayList<Card32> generateGame(){
    ArrayList<Card32> cards = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Figure figure : Figure.values()) {
        if (Card32.is32(figure)) {
        Card32 card = new Card32(figure, suit);
        cards.add(card);
        }
      } 
    }
    return cards;
  }
  
  public ArrayList<String> getCards() {
    ArrayList<String> cards = new ArrayList<>();
    for (Card32 card : this.cards) {
      cards.add(card.getCard());
    }
    return cards;
  }

  public Card32 getCard(int index){
    return this.cards.get(index);
  }

  public int getSize(){
    return this.cards.size();
  }
}
