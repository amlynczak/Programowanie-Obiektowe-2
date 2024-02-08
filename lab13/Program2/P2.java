import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;
import java.io.*;

public class P2{
    public static void main(String[] args)throws FileNotFoundException, IOException{
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("poll_data.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        }

        //System.out.println(records);

        int rep = 0;
        int dem = 0;
        int amIn = 0;
        int dec = 0;

        ListIterator<List<String>> row = records.listIterator();

        while(row.hasNext()){
            List<String> tmp = row.next();
            ListIterator<String> column = tmp.listIterator();

            while(column.hasNext()){
                String party = column.next();
                if(party.equals("AMERICAN INDEP")) amIn++;
                if(party.equals("DECLINED")) dec++;
                if(party.equals("DEMOCRAT")) dem++;
                if(party.equals("REPUBLICAN")) rep++;
            }
        }

        PrintWriter zapis = new PrintWriter("ogol.txt");

        zapis.println("rozklad glosow (ogolny): ");
        zapis.println("Republicanie: "+rep+"\nDemokraci: "+dem+"\nAmerican Independent: "+amIn+"\nodmowilo: "+dec);
        zapis.close();

        //-----------glosujacy wedlug wieku(ilosc)------------------//

        row = records.listIterator();

        int w18_20 = 0;
        int w21_30 = 0;
        int w31_40 = 0;
        int w41_50 = 0;
        int w51_60 = 0;
        int w61_70 = 0;
        int w70p = 0;


        while(row.hasNext()){
            List<String> tmp = row.next();
            ListIterator<String> column = tmp.listIterator();

            while(column.hasNext()){
                String age = column.next();
                switch(age){
                    case "18-20":
                        w18_20++;
                    case "21-30":
                        w21_30++;
                    case "31-40":
                        w31_40++;
                    case "41-50":
                        w41_50++;
                    case "51-60":
                        w51_60++;
                    case "61-70":
                        w61_70++;
                    case "71+":
                        w70p++;
                }
            }
        }

        zapis = new PrintWriter("glosujacy_wiek.txt");

        zapis.println("ile osob z danej grupy wiekowej glosowalo: ");
        zapis.println("18-20: "+w18_20+"\n21-30: "+w21_30+"\n31-40: "+w31_40+"\n41-50: "+w41_50+"\n51-60: "+w51_60+"\n61-70: "+w61_70+"\n70+: "+w70p);
        zapis.close();

    }
}