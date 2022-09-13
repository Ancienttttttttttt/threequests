public class Main {

    public static void main(String[] args) {

        Instrument[] i = new Instrument[3];
        i[0] = new Gitara();
        i[1] = new Drum();
        i[2] = new Truba();

        for (Instrument instrument : i) {
            instrument.play();
        }

    }
}


