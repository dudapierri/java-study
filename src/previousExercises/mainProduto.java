package previousExercises;

import java.util.ArrayList;

public class mainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular",6200.30,50);
        Produto produto2 = new Produto("notebook",10500,1000);
        Produto produto3 = new Produto("Fone de ouvido",200,10000);
        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);

        System.out.println(lista.size());
        System.out.println(lista.get(0).getNome());

        ProdutoPerecivel banana = new ProdutoPerecivel("banana",2.0, 3,"25/03/2024");
        System.out.println(banana.getNome());
        System.out.println(banana.getPreco());
        System.out.println(banana.getDataDeValidade());
        System.out.println(banana.getQuantidade());

        for (Produto produto: lista){
            System.out.println(produto);
        }


        System.out.println(produto1);
    }
}
