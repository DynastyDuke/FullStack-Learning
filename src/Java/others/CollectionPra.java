package Java.others;
import java.util.*;
public class CollectionPra {
    public static void collection() {

        List<String> fruits = new ArrayList<>(List.of("apple","banana","orange","grape"));

        System.out.println(fruits.size());
        System.out.println(fruits.contains("watermelon"));

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()){
            if (it.next().equals("banana")){
                it.remove();
            }
        }
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
    }

    public static void immutableCollection(){


    }

    public static void listPra(){
        List<String> m = new ArrayList<>(
                List.of("炭治郎","彌豆子","善逸","伊之助","蜜璃"));
        m.add(2,"甘露寺");
        m.set(1,"時透無一郎");
        m.remove(m.size()-1);
        Collections.sort(m);
        System.out.println(m);
    }

    public static void linkedPra(){
//TODO
        LinkedList<String> todos = new LinkedList<>();

        todos.addLast("買菜");
        todos.addLast("寫作業");
        todos.addLast("運動");
        todos.addFirst("澆花");
        todos.removeFirst();
    }

    public static void setPra(){

        String[] visitors = {"Alice","Bob","Alice","Charlie","Bob","Alice"};

        Set<String> hs = new HashSet<>(Arrays.asList(visitors));
        System.out.println("HashSet: " + hs.size() + " peoples, visitor: " + hs);

        Set<String> lhs = new LinkedHashSet<>(Arrays.asList(visitors));
        System.out.println("LinkedHashSet" + lhs);

        Set<String> ts = new TreeSet<>(Arrays.asList(visitors));
        System.out.println("TreeSet" + ts);
    }

    public static void unionInterSet(){

        //TODO
        Set<String> basketball = new HashSet<>(List.of("小明","小華","小美","阿強"));
        Set<String> boardgame = new HashSet<>(List.of("小華","阿強","阿傑","小芳"));

        Set<String> union = new HashSet<>(basketball);
        union.addAll(boardgame);
        System.out.println("Union: " + union);

        Set<String> inter = new HashSet<>(basketball);
        inter.addAll(boardgame);
        System.out.println("Inter: " + inter);

    }


    public static void main(String[] args) {
        setPra();
    }
}
