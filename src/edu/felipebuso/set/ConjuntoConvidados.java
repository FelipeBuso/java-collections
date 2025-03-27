package edu.felipebuso.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;
        for(Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

//        conjuntoConvidados.adicionarConvidado("Alice", 1234);
//        conjuntoConvidados.adicionarConvidado("Bob", 1235);
//        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
//        conjuntoConvidados.adicionarConvidado("David", 1236);
//
//        System.out.println("Convidados no conjunto:");
//        conjuntoConvidados.exibirConvidados();
    }
}
