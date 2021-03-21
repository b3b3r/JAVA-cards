package Card;

public class Card52 extends ClassicCard implements ICarte {
  private Figure figure;
  private Suit suit;
  private Boolean isVisible;
  private String logo;

  public Card52(Figure figure, Suit suit) {
    this.figure = figure;
    this.suit = suit;
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

  @Override
  public Figure getFigure(){
    return this.figure;
  }

  @Override
  public Suit getSuit(){
    return this.suit;
  }

  public String getCard(){
    return this.figure.toString() + " of " + this.suit.toString();
  }
}
