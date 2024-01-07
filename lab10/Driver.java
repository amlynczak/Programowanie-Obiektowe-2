public class Driver{
    private String fname;
    private String lname;
    private Double liters;
    private Double mileage;

    public Driver(String imie, String nazwisko, Double litry, double przebieg){
        fname = imie;
        lname = nazwisko;
        liters = litry;
        mileage = przebieg;
    }

    public String info()throws Exception{
        String tmp = fname+" "+lname+", spalanie: "+usage();
        return tmp;
    }

    public Double usage()throws Exception{
        if((liters == 0 && mileage != 0)){
            throw new Exception("niezuzyte paliwo przy przejechanch kilometrach");
        }else if((liters != 0 && mileage == 0)){
            throw new Exception("nieprzejechane kilometry przy zuzytym paliwie");
        }
        return (liters/mileage)*100.0;
    }

};

