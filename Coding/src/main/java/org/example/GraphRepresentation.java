package org.example;

import java.util.ArrayList;

public class GraphRepresentation {
    public static void main(String[] args) {
        // Graph represented using adjacency matrix -
        int n = 3, m = 3;
        int adj[][] = new int[n+1][n+1];

        // edge 1---2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // for weighted graph instead of storing 1 store the weight between the edge
        // directly in the matrix

        // edge 2---3
        adj[2][3] = 1;
        adj[3][2] = 1;

        // edge 1---3
        adj[1][3] = 1;
        adj[3][1] = 1;

        // Graph representation using adjacency list -
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i<=n; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        // edge 1---2
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        // for directed graph lets say we have edge only from 1--->2
        // we would just do - adjList.get(1).add(2); and not adjList.get(2).add(1);

        // edge 2---3
        adjList.get(2).add(3);
        adjList.get(3).add(2);

        // edge 1---3
        adjList.get(1).add(3);
        adjList.get(3).add(1);

        // printing all connected edges for each node
        for(int i = 1; i<=n; i++) {
            for(int j = 0; j<adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
