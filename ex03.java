import java.util.ArrayList;
import java.util.List;

class CalculadoraEstatistica<T extends Number> {
    private List<T> elementos = new ArrayList<>();

    public void adicionar(T numero) {
        elementos.add(numero);
    }

    public double calcularMedia() {
        if (elementos.isEmpty()) {
            return 0.0;
        }
        double soma = 0.0;
        for (T n : elementos) {
            soma += n.doubleValue();
        }
        return soma / elementos.size();
    }

    public double calcularMaior() {
        if (elementos.isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }
        double maior = elementos.get(0).doubleValue();
        for (T n : elementos) {
            if (n.doubleValue() > maior) {
                maior = n.doubleValue();
            }
        }
        return maior;
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        CalculadoraEstatistica<Integer> calcInt = new CalculadoraEstatistica<>();
        calcInt.adicionar(10);
        calcInt.adicionar(20);
        calcInt.adicionar(30);
        System.out.println("Integer - Média: " + calcInt.calcularMedia());
        System.out.println("Integer - Maior: " + calcInt.calcularMaior());

        CalculadoraEstatistica<Double> calcDouble = new CalculadoraEstatistica<>();
        calcDouble.adicionar(2.5);
        calcDouble.adicionar(7.5);
        calcDouble.adicionar(9.0);
        System.out.println("Double - Média: " + calcDouble.calcularMedia());
        System.out.println("Double - Maior: " + calcDouble.calcularMaior());

    }
}
