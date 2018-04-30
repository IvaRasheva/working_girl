public class Marker extends WritingMaterial {

    private final int markerCartridgeThickness;
    private final boolean isPermanent;

    public Marker(String colour, String brand, int weight,
                  int markerCartridgeThickness, boolean isPermanent) throws Exception {

        super(colour, brand, weight);
        this.markerCartridgeThickness = markerCartridgeThickness;
        this.isPermanent = isPermanent;
    }

    @Override
    int setWeight(int weight) throws Exception {

        if (weight > 500 | weight <= 0){
            throw new Exception("Invalid weight \n");
        } else return weight;
    }

    public int getMarkerCartridgeThickness() {
        return markerCartridgeThickness;
    }

    public boolean isPermanent() {
        return isPermanent;
    }
}
