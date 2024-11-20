package BorkowiczDominik.AAC;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import jgraphalgos.WeightedEdge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {

    public static DirectedSparseGraph<Integer, WeightedEdge> parseFileToGraph(String filePath) throws IOException {
        DirectedSparseGraph<Integer, WeightedEdge> graph = new DirectedSparseGraph<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int numVertices = Integer.parseInt(br.readLine().trim());
            for (int i = 0; i < numVertices; i++) {
                graph.addVertex(i);
                String[] row = br.readLine().trim().split("\\s+");
                for (int j = 0; j < numVertices; j++) {
                    if (Integer.parseInt(row[j]) != 0) {

                        graph.addEdge(new WeightedEdge(1.0f), i , j );
                    }
                }
            }
        }
        return graph;
    }
}
