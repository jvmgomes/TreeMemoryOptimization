package TreeMemoryOptimization;
import TreeMemoryOptimization.src.Tree;
import TreeMemoryOptimization.src.TreeType;
import TreeMemoryOptimization.src.Forest;

// Problema: renderizar milhares de árvores sem duplicar dados compartilhados (name, color, texture)
public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        System.out.println("=== Plantando árvores ===\n");

        // Mesma espécie plantada em posições diferentes: flyweight reutiliza
        forest.plantTree(1,  1,  "Carvalho", "Verde",     "textura_carvalho.png");
        forest.plantTree(5,  3,  "Carvalho", "Verde",     "textura_carvalho.png"); // reutiliza
        forest.plantTree(9,  7,  "Carvalho", "Verde",     "textura_carvalho.png"); // reutiliza

        // Pinheiro, novo TreeType criado
        forest.plantTree(2,  8,  "Pinheiro", "Verde Escuro", "textura_pinheiro.png");
        forest.plantTree(6,  2,  "Pinheiro", "Verde Escuro", "textura_pinheiro.png"); // reutiliza
        forest.plantTree(4,  4,  "Pinheiro", "Verde Escuro", "textura_pinheiro.png"); // reutiliza

        // Cerejeira, terceiro tipo
        forest.plantTree(3,  5,  "Cerejeira", "Rosa",     "textura_cerejeira.png");
        forest.plantTree(7,  9,  "Cerejeira", "Rosa",     "textura_cerejeira.png"); // reutiliza

        // Desenha todas as árvores
        forest.draw();

        // Mostra o ganho de memória do padrão
        System.out.println("\n=== Estatísticas de Memória ===");
        System.out.println("Total de árvores na floresta : " + forest.getTotalTrees());
        System.out.println("Total de TreeTypes (Flyweights): " + forest.getTotalTypes());
        System.out.println("Sem Flyweight seriam criados  : " + forest.getTotalTrees() + " objetos com dados duplicados");
        System.out.println("Com Flyweight foram criados   : " + forest.getTotalTypes() + " objetos únicos (estado intrínseco compartilhado)");
    }
}
