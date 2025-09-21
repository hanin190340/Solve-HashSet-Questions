import java.util.HashSet;
import java.util.Set;

class DataValidator {
    public static void main(String[] args) {
        String [] items = {"A","B","A","D"};
        System.out.println(hasDuplicates(items));
    }

    public static boolean hasDuplicates(String[] items) {
        Set<String> seenItems = new HashSet<>();
        for (String set : items) {
            if (!seenItems.add(set)) {
                return true;
            }
        }
        return false;
    }
}
