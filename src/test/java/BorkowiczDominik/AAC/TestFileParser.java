package BorkowiczDominik.AAC;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import jgraphalgos.WeightedEdge;
import org.junit.Test;

import java.io.IOException;

public class TestFileParser {
    @Test
    public void testParseFileToGraph() throws IOException {
        DirectedSparseGraph<Integer, WeightedEdge> graph = FileParser.parseFileToGraph("src/test/resources/5x5_example_matrix.txt");
        assert graph.getVertexCount() == 5;
        assert graph.getEdgeCount() == 10;
//        ((HashMap) graph.edges).values().forEach(x->System.out.println(x));
    }
}
