import java.util.ArrayList;
import java.util.List;

public class Email {
    void enviarEmail() {
        System.out.println("Enviando e-mail.");
    }

    void receberEmail() {
        System.out.println("Recebendo e-mail.");
    }

    String listaEmails() {
        List<String> emailsList = new ArrayList<>();
        emailsList.add(1, "Email 1");
        emailsList.add(2, "Email 2");
        emailsList.add(3, "Email 3");
    }
}
