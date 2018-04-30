public class Pen extends WritingMaterial {

    public Pen(String colour, String brand, int weight) throws Exception {
        super(colour, brand, weight);
    }

    @Override
    int setWeight(int weight) throws Exception  {
        return 0;
    }

}
