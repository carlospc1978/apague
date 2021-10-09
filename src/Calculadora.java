import java.util.ArrayList;
import java.util.Arrays;

public class Calculadora {

    public double Somar (double... a){
//        double soma = 0;

        double sum = Arrays.stream(a).sum();

        return sum;
    }

    public Long nomes (String... noms){
        return Arrays.stream(noms).count();
    }


}
