import api.People;
import java.util.ServiceLoader;

public class Main {
    public static void main(String [] args){
        ServiceLoader<People> serviceLoader = ServiceLoader.load(People.class);
        for(People p : serviceLoader){
            System.out.println(p.echo(""));
        }
    }
}
