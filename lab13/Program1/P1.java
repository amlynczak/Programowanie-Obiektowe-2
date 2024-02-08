import java.io.IOException;
import java.io.File;
import java.nio.file.*;

public class P1{
    public static void main(String[] args){
        try{
            System.out.println("Podaj nazwe folderu wejsciowego: ");
            String inputDir = System.console().readLine();

            System.out.println("Podaj nazwe folderu wyjsciowego: ");
            String outputDir = System.console().readLine();

            File input = new File(inputDir);

            File[] folders = input.listFiles(File::isDirectory);

            if(folders != null){
                for(File folder : folders){
                    Path source = Paths.get(folder.getPath());
                    Path dest = Paths.get(outputDir, folder.getName());

                    Files.createDirectories(dest);
                }
            }else{
                System.out.println("nie ma co kopiowac, folder nie istnieje");
            }
        }catch(IOException e){
            System.out.println("blad podczas kopiowania: \n"+e);
        }
    }
}