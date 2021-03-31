package Card;

import Enum.Figure;
import Enum.Suit;
import Interface.Card;

public abstract class ClassicCard implements Card {
  private Boolean isVisible;
  private String logo;
  private Figure figure;
  private Suit suit;
  
  public ClassicCard(Figure figure, Suit suit, String logo){
    this.figure = figure;
    this.suit= suit;
    this.logo = logo;
    this.isVisible = false;
  }
  
  @Override
  public String getCard(){
    return this.figure.getLabel() + this.suit.getLabel();
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

  public Figure getFigure(){
    return this.figure;
  }

  public Suit getSuit(){
    return this.suit;
  }
}
