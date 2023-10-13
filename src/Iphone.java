import Telefone.Telefone;

public class Iphone {
        public static void main(String[] args) {
            Telefone newIphone = new Telefone();

            System.out.println("\nDesafio Iphone");

            System.out.println("\nIniciando Serviço de Controle de Volume");
            System.out.println("Volume inicial: " + newIphone.getVolume());

            newIphone.aumentarVolume();
            System.out.println("Volume após aumentar: " + newIphone.getVolume());

            newIphone.diminuirVolume();
            System.out.println("Volume após diminuir: " + newIphone.getVolume());

            System.out.println("Definindo Novo Volume ");
            newIphone.setVolume(60); // Definir o volume para 60
            System.out.println("Volume após definir: " + newIphone.getVolume());


            System.out.println("\nIniciando Serviço IPhone");
            newIphone.efetuarLigacao();
            System.out.println("Efetuando Ligacao!");

            newIphone.atenderLigacao();
            System.out.println("Atendendo Ligacao!");

            newIphone.iniciarCorreioDeVoz();
            System.out.println("Iniciando Correio de Voz");

            System.out.println("\nIniciando Serviço Navegador");
            newIphone.exibirPagina();
            System.out.println("Exibindo Página no Navegador");

            newIphone.atualizarPagina();
            System.out.println("Atualizando Página no Navagador");

            newIphone.adicionarNovaAba();
            System.out.println("Abrindo Nova Página no Navegador");

            System.out.println("\nIniciando Serviço de IPod");
            newIphone.selecionarMidia();
            System.out.println("Selecionando Midia!");

            newIphone.reproduzirMidia();
            System.out.println("Reproduzindo Midia!");

            newIphone.pausarMidia();
            System.out.println("Pausando Midia!");

            System.out.println("\nIniciando Serviço de SMS");
            newIphone.enviarSMS();
            System.out.println("Enviando SMS");

            newIphone.receberSMS();
            System.out.println("Recebendo SMS");

            System.out.println("\nIniciando Serviço de Fotos");
            newIphone.camera();
            System.out.println("Câmera iniciada!");

            newIphone.bibliotecaFotos();
            System.out.println("Biblioteca de fotos aberta.");

        }

}