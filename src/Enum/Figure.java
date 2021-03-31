package Enum;

public enum Figure {
  TWO("two"), THREE("three"), FOUR("four"), FIVE("five"), SIX("six"), SEVEN("seven"), 
  EIGHT("eight"), NINE("nine"), TEN("ten"), VALET("valet"), QUEEN("queen"), KING("king"), ACE("ace");

  private String label;
  private Figure(String label){
    this.label = label;
  }

  public String getLabel() {
    return this.label;
  }
}
