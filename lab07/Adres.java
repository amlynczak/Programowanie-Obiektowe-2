public class Adres implements AdresFormatter{
    private String ulica;
    private String miasto;
    private int nr_domu;
    private int nr_lokalu;
    private String kod;

    public Adres(String ul, String m, String code, int nrd, int nrl){
        ulica = ul;
        miasto = m;
        kod = code;
        nr_domu = nrd;
        nr_lokalu = nrl;
    }

    public String getFormattedAddress(){
        StringBuilder tmp = new StringBuilder();
        tmp.append("Zamieszkały: ul.");
        tmp.append(ulica);
        tmp.append(" ");
        tmp.append(nr_domu);
        if(nr_lokalu != 0){
            tmp.append("/");
            tmp.append(nr_lokalu);
        }
        tmp.append(", ");
        tmp.append(kod);
        tmp.append(" ");
        tmp.append(miasto);

        String ret = tmp.toString();

        return ret;
    }
};