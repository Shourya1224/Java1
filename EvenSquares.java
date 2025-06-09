import java.util.ArrayList;
import java.util.List;

public class EvenSquares {

    public static List<Integer> getEvenSquares(List<Integer> numbers) {
        List<Integer> evenSquares = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSquares.add(num * num);
            }
        }
        return evenSquares;
    }

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = getEvenSquares(input);
        System.out.println(result); 
    }
}
