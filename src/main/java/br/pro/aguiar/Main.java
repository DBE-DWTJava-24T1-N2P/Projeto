package br.pro.aguiar;
import br.pro.aguiar.models.Produto;

import javax.swing.*;

public class Main extends Thread {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa.");
        Produto prod;
        try {
            String nome = JOptionPane.showInputDialog("Informe o nome do produto:");
            prod = new Produto(nome, 35.69, 0.01, 80);
            var valorComDesconto = prod.getPrecoComDesconto();
            System.out.println(valorComDesconto);
            System.out.println(prod);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim do programa.");
    }
}