package Card;

import Enum.Figure;
import Enum.Suit;
import Interface.Card;

public class Card32 extends ClassicCard implements Card {
  private Boolean isVisible;
  private String logo;

  public Card32(Figure figure, Suit suit) {
    super(figure, suit);
    this.logo = "<3";
    this.isVisible = false;
  }

  @Override
  public String getLogo(){
    return this.logo;
  }
  
  @Override
  public Boolean getIsVisible(){
    return this.isVisible;
  }

  @Override
  public void setIsVisible(){
    this.isVisible = !this.isVisible;
  }

}

