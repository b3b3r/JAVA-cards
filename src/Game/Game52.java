package Game;

import java.util.ArrayList;

import Card.Card52;
import Enum.Figure;
import Enum.Suit;

public final class Game52 extends Game<Card52>{
  private final static Game52 instance = new Game52();
  public final static Game52 getInstance() { return instance; }
  
  private Game52(){
    super();
  }

  protected void generateGame(){
    for (Suit suit : Suit.values()) {
      for (Figure figure : Figure.values()) {
        Card52 card = new Card52(figure, suit);
        super.addCard(card);
      } 
    }
  }
  public ArrayList<String> getCards() {
    ArrayList<String> cards = new ArrayList<String>();
    for (Card52 card : super.cards) {
      cards.add(card.getCard());
    }
    return cards;
  }
}
