import java.time.LocalDate;

public abstract class EDUCATIONCENTER{
    private String name;
    private String locatedCountry;
    private LocalDate locolDateFoundationYear;

    public EDUCATIONCENTER(String name, String locolDateCountry, LocalDate locolDateFoundationYear){
        this.name = name;
        this.locatedCountry = locolDateCountry;
        this.locolDateFoundationYear = locolDateFoundationYear;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String locolDateCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public LocalDate locolDateFoundationYear() {
        return locolDateFoundationYear;
    }

    public void setLocolDateFoundationYear(LocalDate locolDateFoundationYear) {
        this.locolDateFoundationYear = locolDateFoundationYear;
    }

    @Override
    public String toString() {
        return "EDUCATIONCENTER:  " +
                "       name: " + name + '\n' +
                "       locatedCountry: " + locatedCountry + '\n' +
                "       locolDateFoundationYear:  " + locolDateFoundationYear +
                '}';
    }
}
