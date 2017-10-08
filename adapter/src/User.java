import cable.Cable;

public class User {

    private Cable cable;

    public User (Cable cable){
        this.cable = cable;
    }

    public void userAction (){
        cable.connect();
    }

}
