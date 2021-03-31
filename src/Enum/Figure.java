package Enum;

public enum Figure {
  TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), 
  EIGHT("8"), NINE("9"), TEN("10"), VALET("V"), QUEEN("Q"), KING("K"), ACE("AS");

  private String label;
  private Figure(String label){
    this.label = label;
  }

  public String getLabel() {
    return this.label;
  }
}
