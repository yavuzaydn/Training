package lamda;

//Function
//Consumer
//Predicate

import java.util.LinkedList;
import java.util.List;
import java.util.function.*;

public class Lamda {

    public void process() {
        Supplier<Integer> supplier1 = () -> 3;
        Supplier<Integer> supplier2 = () -> supplier();
        Supplier<Integer> supplier3 = this::supplier;
        Integer integer = supplier1.get();

        Function<Integer, Double> function1 = p1 -> 3d;
        Function<Integer, Double> function2 = p1 -> function(p1);
        Function<Integer, Double> function3 = this::function;
        Double f = function1.apply(1);

        BiFunction<Integer, Integer, Double> biFunction =(p1, p2) -> 3d;
        BiFunction<Integer, Integer, Double> biFunction2 = (p1, p2) -> biFunction(p1, p2);
        BiFunction<Integer, Integer, Double> biFunction3 = this::biFunction;
        Double bf = biFunction.apply(1, 1);

        Consumer<List<String>> consumer1 = list -> {list.clear();};
        consumer1.accept(new LinkedList<>());

        Predicate<String> predicate1 = p1 -> p1.equals("a");
        boolean a = predicate1.test("a");
    }

    public double function(int v1) {
        return (double) v1;
    }

    public double biFunction(int v1, int v2) {
        return v1 / (double) v2;
    }

    public int supplier() {
        return 3;
    }

    public void consumer(List<String> list) {
    }

    public boolean predicate(String v1) {
        return true;
    }
}
