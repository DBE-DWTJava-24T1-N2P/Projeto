package br.pro.aguiar.models;

public class Produto {
    String nome;
    double preco;
    double desconto;
    int quantidade;

    public Produto(String nome, double preco, double desconto, int quantidade) throws Exception {
        boolean nomeCorreto = nome.length() > 3;
        if (nomeCorreto)
            this.nome = nome;
        else
            throw new Exception("O nome precisa ter mais do que 3 letras!");
        boolean descontoCorreto = desconto <= 0.4 && desconto >= 0.0;
        if (descontoCorreto)
            this.desconto = desconto;
        else
            throw new Exception("O desconto tem que ser entre 0 e 40%!");

        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, String precoStr) throws Exception {
        this(nome, Double.parseDouble(precoStr), 0.0, 1);
    }

//    static Produto gerarProduto(String nome, String precoStr) throws Exception {
//        double preco = Double.parseDouble(precoStr);
//        return this(nome, preco, 0.0, 1);
//    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public double getPrecoComDesconto() {
        return preco - preco * desconto;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: {" +
                " nome: '" + nome + '\'' +
                ", preco: " + preco +
                ", desconto: " + desconto +
                ", quantidade: " + quantidade +
                " }";
    }
}
