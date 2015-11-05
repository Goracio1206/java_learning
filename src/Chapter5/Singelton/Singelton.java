package Chapter5.Singelton;

/**
 * Created by Admin on 05-Nov-15.
 */
public class Singelton {

    private static Singelton instance = null;

    public void singeltonTrue() {}

    public Singelton getSingelton(){
        if (instance == null ){
            System.out.println("Crating Singeton");
            instance = new Singelton();
        }
        return instance;
    }
}
