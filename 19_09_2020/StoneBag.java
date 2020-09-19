public class StoneBag{
  private char[] stones;

  public StoneBag(char[] stones){
    this.stones = stones;
  }

  public char[] getStones(){
    return stones;
  }

  public String toString(){
    return new String(stones);
  }
}
