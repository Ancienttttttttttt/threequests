public class Drum implements Instrument {

    private String size = "24″ x 15″";

    public void setSize(String size) { this.size = size; }

    public String getSize() { return size; }

    @Override
    public  void play() { System.out.println("Барабан играет. " + toString()); }

    @Override
    public String toString() { return "Размер барабанов: " + size; }

}
