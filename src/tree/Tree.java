package src.tree;
import src.treetype.TreeType;

// armazena o estado extrinseco + referência ao Flyweight
public class Tree {
    private int x;
    private int y;
    private TreeType type; // referência compartilhada ao Flyweight

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    // passa para o Flyweight, passando o estado extrínseco
    public void draw() {
        type.draw(x, y);
    }
}

