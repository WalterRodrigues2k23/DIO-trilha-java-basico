package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getcodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();       
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidados("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidados("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidados("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidados("Convidado 4", 1236);

        System.out.println("");
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        System.out.println("");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        System.out.println("");
        conjuntoConvidados.exibirConvidados();
    }

}
