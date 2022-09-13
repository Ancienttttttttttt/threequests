public class Gitara implements Instrument {

    private int strNumber = 5;

    public void setStrNumber(int strNumber) { this.strNumber = strNumber; }

    public int getStrNumber() { return strNumber; }

    @Override
    public void play() { System.out.println("Гитара играет. " + toString()); }

    @Override
    public String toString() { return "Кол-во струн: " + strNumber; }

}
