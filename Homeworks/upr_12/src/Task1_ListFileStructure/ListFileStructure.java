package Task1_ListFileStructure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFileStructure {
    public static void main(String[] args) throws IOException {
        Path printDir = Paths.get("F:\\SwiftAcademy\\Lectures and HW");

        File testDir = new File(String.valueOf(printDir));
        File[] files = testDir.listFiles();

        assert files != null;
        listFolder(files);
    }

    private static void listFolder(File[] files){
        for (File f : files){
            if (f.isDirectory()){
                File testFolder = new File(f.getPath());
                File [] folder = testFolder.listFiles();
                assert folder != null;
                for (File file : folder){
                    System.out.println(file.getAbsolutePath());
                }
            } else
                System.out.println(f.getAbsolutePath());
        }
    }
}
