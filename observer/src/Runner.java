import observer.Apple;
import observer.Company;
import observer.Facebook;
import observer.Google;

public class Runner {

    public static void main(String[] args) {

        Company facebook = new Facebook();
        Company google = new Google();
        Company apple = new Apple();

        BusinessMan businessMan = new BusinessMan();

        businessMan.watchCompany(facebook);
        businessMan.watchCompany(google);
        businessMan.watchCompany(apple);
    }
}
