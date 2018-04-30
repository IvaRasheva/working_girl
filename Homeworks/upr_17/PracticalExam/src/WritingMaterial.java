public abstract class WritingMaterial {
    private String colour;
    private final String brand;
    private final int weight;
    private final boolean isWriting = true;

    WritingMaterial(String colour, String brand, int weight) throws Exception {
        this.colour = setColour(colour);
        this.brand = brand;
        this.weight = setWeight(weight);
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }

    abstract int setWeight(int weight) throws Exception;

    private String setColour(String colour) throws Exception {

        if (colour.equalsIgnoreCase("blue") || colour.equalsIgnoreCase("green") ||
                colour.equalsIgnoreCase("red") || colour.equalsIgnoreCase("black")){
            return colour;
        } else {
            throw new Exception("Invalid colour \n");
        }
    }

}
