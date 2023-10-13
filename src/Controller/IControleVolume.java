package Controller;
public interface IControleVolume {
    public void aumentarVolume();
    public void diminuirVolume();
    public int getVolume();
    public void setVolume(int novoVolume); // Adicionando o método setVolume
}