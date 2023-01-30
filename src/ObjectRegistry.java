import java.util.HashMap;
import java.util.Map;

public class ObjectRegistry {

    private static Map<String,Object> regsitryMap = new HashMap<String,Object>();

    public static void putObject(String objName,Object obj)
    {
        regsitryMap.put(objName,obj);
    }

    public static Object getObject(String name)
    {
        return regsitryMap.get(name);
    }
}
