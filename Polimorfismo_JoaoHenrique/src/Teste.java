import java.util.List;
import java.util.ArrayList;

import ProdPlan.Item;
import ProdPlan.Parte;

public class Teste {
    /**
     * MÉTODO principal que dispara os testes.
     * 
     * @param args o de sempre.
     */
    public static void main(String[] args) {
        Parte[] partes = criaPartes();
        Item[] itens = criaItens(partes);
        listaPartes("*** Partes utilizadas na producao ****", partes);
        listaItens("*** Itens solicitados ***", itens);
    }

    private static Parte[] criaPartes() {
        Parte[] partes = new Parte[8];
        partes[0] = new ProdPlan.Motor(112, "motor m112", "motor de avanco do cabecote", 100.0f, 1.2f, 1.1f, 1250);
        partes[1] = new ProdPlan.Motor(114, "motor m114", "motor auxiliar", 60.0f, 0.6f, 0.8f, 1250);
        partes[2] = new ProdPlan.Motor(111, "motor m111", "motor de ventilador", 70.0f, 1.0f, 1.0f, 3000);
        partes[3] = new ProdPlan.Motor(110, "motor m110", "motor principal", 120.0f, 1.8f, 1.5f, 1250);
        partes[4] = new ProdPlan.Parafuso(231, "parafuso p1", "parafuso de fixacao do cabecote", 2.5f, 100.0f, 8.0f);
        partes[5] = new ProdPlan.Parafuso(232, "parafuso p2", "parafuso de fixacao do motor", 2.5f, 80.0f, 6.0f);
        partes[6] = new ProdPlan.Parafuso(233, "parafuso p3", "parafuso de fixacao do ventilador", 2.0f, 60.0f, 6.0f);
        partes[7] = new ProdPlan.Parafuso(234, "parafuso p4", "parafuso de uso geral", 3.0f, 120.0f, 12.0f);
        return partes;
    }

    /**
     * MÉTODO estático do tipo void que escreve na saída padrão o conteúdo de um
     * vetor de objetos Parte devidamente convertidos para String.
     * 
     * @param titulo texto a ser mostrado antes da listagem
     * @param partes vetor de objetos Parte a ser listado
     */
    static void listaPartes(String titulo, Parte[] partes) {
        System.out.println(titulo);
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i].toString());
        }
        System.out.println("\n");
    }

    /**
     * MÉTODO estático que cria um vetor de objetos Item a ser usado nos testes
     * 
     * @param partes vetor de objetos Parte a partir do qual serao criados os
     *               objetos Item que formarão o vetor
     * @return vetor de objetos Item
     */
    static Item[] criaItens(Parte[] partes) {
        String[] pedidoPartes = {"112", "232", "234", "111"};
        int[] qtdPartes = {10, 50, 30, 5};
        List<Item> itens = new ArrayList<Item>();
        for (int i = 0; i < pedidoPartes.length; i++) {
            for (int j = 0; j < partes.length; j++) {
                if (pedidoPartes[i].equals(String.valueOf(partes[j].getCod()))) {
                    Item item = new Item((Parte) partes[j], qtdPartes[i]);
                    itens.add(item);
                }
            }
        }
       return itens.toArray(new Item[itens.size()]); 
    }

    /**
     * MÉTODO estático que escreve na saída padrão o conteúdo de um vetor de objetos
     * Item, devidamente convertidos para String.
     * 
     * @param titulo texto apresentado antes da listagem.
     * @param itens  vetor de objetos Item a ser listado.
     */
    static void listaItens(String titulo, Item[] itens) {
                // *** Itens solicitados ***
        System.out.println(titulo);
        float total = 0.0f;
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i].toString());
            total += itens[i].calculaValor();
        }
        System.out.println("Valor total:" + total);
    }

}
