public class ControleVolume {
    private int volume = 50;

    public void aumentarVolume() {
        if(volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if(volume > 0) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int novoVolume) {
        if (novoVolume >= 0 && novoVolume <= 100) {
            volume = novoVolume;
        }
    }
}
