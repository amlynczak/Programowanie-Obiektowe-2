import java.io.*;

public class Main{
    public static void readFromFile(String filename, Driver[] drivers)throws FileNotFoundException{
        BufferedReader f = new BufferedReader(new FileReader(filename));

        String line;
        int i = 0;

        try{
            while((line = f.readLine())!=null){
                i++;
                String[] data = line.split(";");
                //System.out.println(data[0] + " "+data[1]+" "+ data[2]+ " " + data[3]);
                Double litry = Double.parseDouble(data[2]);
                Double kilometry = Double.parseDouble(data[3]);
                Driver tmp = new Driver(data[0], data[1], litry, kilometry);

                /*Driver[] drivers_tmp = drivers;
                drivers = new Driver[drivers.length + 1];
                for(int j=0; j<drivers_tmp.length; j++){
                    drivers[j] = drivers_tmp[j];
                    //System.out.println(drivers[j].info());
                }*/
                drivers[i-1] = tmp;
            }
        }catch( Throwable e ) {
            System.out.println( "Blad odczytu pliku!"+e );
        }
    }

    public static void saveFile(Driver[] drivers)throws FileNotFoundException{
        PrintWriter zapis = new PrintWriter("usage_report.txt");
        for(Driver driver:drivers){
            try{
                zapis.println(driver.info());
            }catch(Exception e){
                System.out.println(e);
                zapis.println(e);
            }finally{
                zapis.close();
            }
        }
    }

    public static void main(String[] args)throws FileNotFoundException, Exception{
        Driver[] drivers = new Driver[10];
        readFromFile("dane.csv", drivers);

        saveFile(drivers);
    }
};