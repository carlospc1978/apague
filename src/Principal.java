import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();

        TransportOrder transportOrder = new TransportOrder();

        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setAttempty(1);
        errorMessage.setMessage("ex.getMessage()");
        errorMessage.setStackTrace("ex.getStackTrace().toString()");
        if(transportOrder.getErrorMessage()==null){
            transportOrder.setErrorMessage(new ArrayList<ErrorMessage>());
            System.out.println("aqui");
        }

        errorMessage.setAttempty(2);
        errorMessage.setMessage("ex.getMessage()");
        errorMessage.setStackTrace("ex.getStackTrace().toString()");
        if(transportOrder.getErrorMessage()==null){
            transportOrder.setErrorMessage(new ArrayList<ErrorMessage>());
            System.out.println("aqui");
        }

        transportOrder.getErrorMessage().add(errorMessage);
        System.out.println(errorMessage.getAttempty());

    }

}
