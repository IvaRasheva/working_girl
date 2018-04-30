import java.util.ArrayList;
import java.util.List;

public class ProgramStartClass {

    public static void main(String[] args) throws Exception  {

        Marker[] markers = new Marker[20];
        List<Marker> blueMarkers = new ArrayList<>();

        Marker mr1 = null;
        Marker mr2 = null;
        Marker mr3 = null;
        Marker mr4 = null;
        Marker mr5 = null;
        Marker mr6 = null;
        Marker mr7 = null;
        Marker mr8 = null;
        Marker mr9 = null;
        Marker mr10 = null;
        Marker mr11 = null;
        Marker mr12 = null;
        Marker mr13 = null;
        Marker mr14 = null;
        Marker mr15 = null;
        Marker mr16 = null;
        Marker mr17 = null;
        Marker mr18 = null;
        Marker mr19 = null;
        Marker mr20 = null;

        try {

            mr1 = new Marker("blue", "CC", 400, 4, true);
            mr2 = new Marker("red", "CT", 300, 3, true);
            mr3 = new Marker("green", "CC", 400, 4, true);
            mr4 = new Marker("red", "CT", 300, 1, false);
            mr5 = new Marker("blue", "CC", 402, 4, true);
            mr6 = new Marker("red", "CT", 300, 7, true);
            mr7 = new Marker("blue", "CC", 202, 4, false);
            mr8 = new Marker("black", "CT", 300, 5, true);
            mr9 = new Marker("black", "CT", 300, 2, false);
            mr10 = new Marker("blue", "CC", 420, 4, true);
            mr11 = new Marker("blue", "CC", 400, 4, true);
            mr12 = new Marker("red", "CT", 300, 3, true);
            mr13 = new Marker("green", "CC", 400, 4, true);
            mr14 = new Marker("red", "CT", 323, 1, false);
            mr15 = new Marker("blue", "CC", 400, 4, true);
            mr16 = new Marker("red", "CT", 300, 7, true);
            mr17 = new Marker("blue", "CC", 445, 4, false);
            mr18 = new Marker("black", "CT", 300, 5, true);
            mr19 = new Marker("black", "CT", 300, 2, false);
            mr20 = new Marker("blue", "CP", 345, 2, true);
        } catch (Exception ex){

            System.out.println("Sorry, invalid input");
            System.exit(1);
        }

        markers[0] = mr1;
        markers[1] = mr2;
        markers[2] = mr3;
        markers[3] = mr4;
        markers[4] = mr5;
        markers[5] = mr6;
        markers[6] = mr7;
        markers[7] = mr8;
        markers[8] = mr9;
        markers[9] = mr10;
        markers[10] = mr11;
        markers[11] = mr12;
        markers[12] = mr13;
        markers[13] = mr14;
        markers[14] = mr15;
        markers[15] = mr16;
        markers[16] = mr17;
        markers[17] = mr18;
        markers[18] = mr19;
        markers[19] = mr20;

        for (Marker mr : markers){
            if (mr.getColour().equalsIgnoreCase("blue")){
                blueMarkers.add(mr);
            }
        }

        System.out.println("We have " + blueMarkers.size() + " blue markers");

    }
}
