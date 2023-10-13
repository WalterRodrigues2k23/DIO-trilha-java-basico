package Controller;
public class ControleVolume implements IControleVolume {
    private int volume; // Atributo para armazenar o volume

    public ControleVolume() {
        this.volume = 50; // Volume inicial
    }

    @Override
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    @Override
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int novoVolume) {
        if (novoVolume >= 0 && novoVolume <= 100) {
            volume = novoVolume;
        }
    }
}