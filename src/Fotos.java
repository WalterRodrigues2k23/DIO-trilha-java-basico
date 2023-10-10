import java.util.ArrayList;
import java.util.List;

public class Fotos {
    void camera() {
        System.out.println("Câmera iniciada.");
    }

    String bibliotecaFotos() {
        List<String> fotosList = new ArrayList<>();
        fotosList.add(1, "Foto 1");
        fotosList.add(2, "Foto 2");
        fotosList.add(3, "Foto 3");
    }
}
