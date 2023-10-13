package Telefone;

import Controller.ControleVolume;
import Controller.IControleVolume;
import Interfaces.Fotos.IFotos;
import Interfaces.Ipod.IIpod;
import Interfaces.Navegador.INavegador;
import Interfaces.Phone.IPhone;
import Interfaces.SMS.ISMS;

public class Telefone extends ControleVolume implements IPhone, INavegador, IIpod, ISMS, IFotos {
    private IControleVolume controleVolume; // Usar a interface IControleDeVolume

    public Telefone() {
        this.controleVolume = new ControleVolume(); // Inicializar o controle de volume
    }

    // Métodos para controlar o volume, delegando para a instância de
    // IControleDeVolume
    public void aumentarVolume() {
        controleVolume.aumentarVolume();
    }

    public void diminuirVolume() {
        controleVolume.diminuirVolume();
    }

    public int getVolume() {
        return controleVolume.getVolume();
    }

    @Override
    public void setVolume(int novoVolume) {
        controleVolume.setVolume(novoVolume);
    }


    // Métodos para utilizar a Interface IChamadaTelefonica
    @Override
    public void efetuarLigacao() {

    }

    @Override
    public void atenderLigacao() {

    }

    @Override
    public void iniciarCorreioDeVoz() {

    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void selecionarMidia() {

    }

    @Override
    public void reproduzirMidia() {

    }

    @Override
    public void pausarMidia() {

    }

    @Override
    public void receberSMS() {

    }

    @Override
    public void enviarSMS() {

    }

    @Override
    public void camera() {

    }

    @Override
    public void bibliotecaFotos() {

    }
}