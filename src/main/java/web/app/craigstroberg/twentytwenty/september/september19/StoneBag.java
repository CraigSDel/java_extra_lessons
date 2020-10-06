package web.app.craigstroberg.twentytwenty.september.september19;

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
