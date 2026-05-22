package src.treetype;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "_" + color + "_" + texture;
        TreeType type = treeTypes.get(key);
        if (type == null) {
            type = new TreeType(name, color, texture);
            treeTypes.put(key, type);
        }
        return type;
    }

    public int getTotalTypes() {
        return treeTypes.size();
    }
}