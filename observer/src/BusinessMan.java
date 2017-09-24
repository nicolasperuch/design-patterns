import com.sun.xml.internal.ws.util.StringUtils;
import observer.Company;
import observer.Google;
import observer.Observer;

public class BusinessMan {

    private Observer observer;

    public void watchCompany(Company company){
        observer = company;
        observer.update();
    }
}
