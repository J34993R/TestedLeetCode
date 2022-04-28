package src.Array;

import java.util.ArrayList;
import java.util.List;

public class _0118 {

    public List<List<Integer>> generate(int numRows) {
        /*
        ACCEPTED
        Runtime: 0 ms, faster than 100% of Java online submissions for Pascal's Triangle.
        Memory Usage: 42.2 MB, less than 22.09% of Java online submissions for Pascal's Triangle.
         */
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numRows; i++){
            List<Integer> lista = new ArrayList<>();
            for (int j = 0; j < i+1;j++){
                if (j == 0 || j == i){
                    lista.add(1);
                }else {
                    lista.add(graph.get(i-1).get(j-1) + graph.get(i-1).get(j));
                }
            }
            graph.add(lista);
        }

        return graph;
    }
}
