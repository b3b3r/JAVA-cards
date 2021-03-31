package Enum;

public enum Suit {
  SPADES("\\u2660"), CLUBS("\\u2663"), HEARTS("\\u2665"), DIAMONDS("\\u2666");

  private String label;
  private Suit(String label){
    this.label = label;
  }

  public String getLabel(){
    String str = this.label.split(" ")[0];
    str = str.replace("\\","");
    String[] arr = str.split("u");
    String text = "";
    for(int i = 1; i < arr.length; i++){
        int hexVal = Integer.parseInt(arr[i], 16);
        text += (char)hexVal;
    }
    return text;
  }
}
