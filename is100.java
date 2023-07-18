
import java.util.HashMap;
import java.util.Map;

public class is100 {
    public static void main(String[] args) {
        Map<Short, String> map = new HashMap<>();
        for(short i = 0; i <100; i++)
        {
            map.put(i, String.valueOf(i));
            map.remove(i-1);
        }
        System.out.println(map.size());
    }
}
//输出100，因为short != int,所以remove是无效删除。
