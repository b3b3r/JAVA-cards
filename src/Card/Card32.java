package Card;

import Enum.Figure;
import Enum.Suit;

public class Card32 extends ClassicCard {
  public Card32(Figure figure, Suit suit) {
    super(figure, suit, "<3");
  }
  public static Boolean is32(Figure figure){
    return figure.getorder() <= 8;
  }
}
