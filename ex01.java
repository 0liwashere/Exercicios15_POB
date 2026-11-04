class Caixa<T> {
    private T conteudo;

    public void guardar(T elemento) {
        this.conteudo = elemento;
    }

    public T recuperar() {
        return conteudo;
    }

    public boolean isVazia() {
        return conteudo == null;
    }

    public void limpar() {
        this.conteudo = null;
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        Caixa<Integer> caixaInt = new Caixa<>();
        Caixa<String> caixaStr = new Caixa<>();
        Caixa<Produto> caixaProd = new Caixa<>();

        caixaInt.guardar(42);
        caixaStr.guardar("Olá, Java!");
        caixaProd.guardar(new Produto("Teclado", 150.00));

        int numero = caixaInt.recuperar();
        String texto = caixaStr.recuperar();
        Produto produto = caixaProd.recuperar();

        System.out.println("Integer: " + numero);
        System.out.println("String: " + texto);
        System.out.println("Produto: " + produto);

        System.out.println("Caixa de Integer vazia? " + caixaInt.isVazia());
        caixaInt.limpar();
        System.out.println("Caixa de Integer vazia após limpar? " + caixaInt.isVazia());
    }
}
