public class Truba implements Instrument {

    private double diameter = 13;

    public void setDiameter(double diameter) { this.diameter = diameter; }

    public double getDiameter() { return diameter; }

    @Override
    public void play() { System.out.println("Труба играет. " + toString()); }

    @Override
    public String toString() { return "Диаметр трубы: " + diameter + " мм"; }

}
