public enum Season {
    Spring(7), Summer(28) {
        public void getDesctiption() {
            System.out.println("Жаркое время года");
        }
    },
    Autumn(10), Winter(-23);

    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }
    public double getAvgTemp() {
        return avgTemp;
    }
    public void setAvgTemp(double avgTemp) {
        this.avgTemp = avgTemp;
    }
    public void getDescription() {
        System.out.println("Холодное время года");
    }
    @Override
    public String toString() {
        return "(#" + ordinal() + ") {" + "avgTemp = " + avgTemp + "°C" + '}';
    }
    private double avgTemp;
}
