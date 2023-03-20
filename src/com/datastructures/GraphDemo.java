package com.datastructures;

import java.util.ArrayList;

public class GraphDemo extends Graph
{
    public static void main( String[] args) {
         int V = 5;
         ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; ++i) {
            adj.add(new ArrayList<Integer>());
        }
        Graph.addEdge(adj, 0, 1);
        Graph.addEdge(adj, 0, 4);
        Graph.addEdge(adj, 1, 2);
        Graph.addEdge(adj, 1, 3);
        Graph.addEdge(adj, 1, 4);
        Graph.addEdge(adj, 2, 3);
        Graph.addEdge(adj, 3, 4);
        Graph.printGraph(adj);
    }
}

