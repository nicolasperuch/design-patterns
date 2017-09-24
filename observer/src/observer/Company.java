package observer;

public class Company implements Observer{

    private String companyName;
    private String companyValue;

    public String getCompanyValue() {
        return companyValue;
    }

    public void setCompanyValue(String companyValue) {
        this.companyValue = companyValue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void update() {
        System.out.println("\nCompany Name: " + getCompanyName() +
                            "\nCompany Value: " + getCompanyValue());
    }
}
