import java.util.ArrayList;
import java.util.List;

public class SMS {
    void receberSMS() {
        System.out.println("Recebendo SMS");
    }

    void enviarSMS() {
        System.out.println("Enviando SMS");
    }

    public void listaTodasSMSs() {
        List<String> smsList = new ArrayList<>();
        smsList.add(1, "Corpo da mensagem 1");
        smsList.add(2, "Corpo da mensagem 2");
        smsList.add(3, "Corpo da mensagem 3");
    }

    public String exibirLista() {
        return listaTodasSMSs();
    }
}
