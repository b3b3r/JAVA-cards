package Game;

import java.util.ArrayList;

import Card.Card32;
import Enum.Figure;
import Enum.Suit;

public final class Game32 extends Game<Card32>{
  private final static Game32 instance = new Game32();
  public final static Game32 getInstance() { return instance; }
  
  private Game32(){
    super();
  }

  protected void generateGame(){
    for (Suit suit : Suit.values()) {
      for (Figure figure : Figure.values()) {
        if (Card32.is32(figure)) {
        Card32 card = new Card32(figure, suit);
        super.addCard(card);
        }
      } 
    }
  }

  public ArrayList<String> getCards() {
    ArrayList<String> cards = new ArrayList<String>();
    for (Card32 card : super.cards) {
      cards.add(card.getCard());
    }
    return cards;
  }

}
