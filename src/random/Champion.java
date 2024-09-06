package random;

public enum Champion
{
    FOOTBALL("First winner on championship",1050),
    TENNIS("First winner on championship-Football",6700),
    POOLTABLE("First winner on championship-Pooltable",8000);
    public String title;
    public int price;

   Champion(String title, int price) {
       this.title = title;
       this.price = price;
    }


}
