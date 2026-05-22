package TreeMemoryOptimization.src.forest;
import java.util.ArrayList;
import java.util.List;
import TreeMemoryOptimization.src.TreeType;

// cria árvores usando a fábrica e armazena apenas as coordenadas
public class Forest {
    private List<Tree> trees = new ArrayList<>();
    private TreeTypeFactory factory = new TreeTypeFactory();
 
    // Planta uma árvore: obtém ou reutiliza o Flyweight e cria um novo contexto Tree
    public Tree plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = factory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
        return tree;
    }
}