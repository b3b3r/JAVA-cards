package Card;

import Enum.Figure;
import Enum.Suit;

public class Card32 extends ClassicCard {
  public Card32(Figure figure, Suit suit) {
    super(figure, suit, "<3");
  }
  public static Boolean is32(Figure figure){
    Boolean isValid = true;

    switch (figure) {
      case TWO :
      case THREE:
      case FOUR:
      case FIVE:
      case SIX:
        isValid = false;
        break;
      default:
        isValid = true;
        break;
    }

    return isValid;
  }
}
