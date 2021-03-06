package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {


    public static <T,R> ArrayList map(ArrayList<T> list, Function<T, R> object){
        ArrayList<R> newList = new ArrayList<>();
        for(T t : list){
        newList.add(object.apply(t));
        }
        return newList;
    }

}
