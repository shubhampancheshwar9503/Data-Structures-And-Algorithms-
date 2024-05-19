import java.util.LinkedList;
import java.util.Queue;

class Node {

    int data;
    Node next;

    Node(int data) {

        this.data = data;
        this.next = null;
    }

}

class Graph {

    int numVertices;
    int[] visitArr;
    Node[] adjList;

    Graph(int num) {

        numVertices = num;
        visitArr = new int[num];
        adjList = new Node[num];

        for (int i = 0; i < numVertices; i++) {

            visitArr[i] = 0;
            adjList[i] = null;
        }

    }

    void addEdge(int src, int dest) {

        Node newNode = new Node(dest);
        newNode.next = adjList[src];
        adjList[src] = newNode;

        newNode = new Node(src);
        newNode.next = adjList[dest];
        adjList[dest] = newNode;
    }

    void BFS(int startVertex) {

        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {

            startVertex = queue.poll();
            System.out.print(startVertex + " ");

            Node ptr = adjList[startVertex];
            while (ptr != null) {

                int adjVertex = ptr.data;
                if (!visited[adjVertex]) {

                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                }

                ptr = ptr.next;
            }

        }

    }

}

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph(11);
        graph.addEdge(0, 10);
        graph.addEdge(0, 7);
        graph.addEdge(0, 5);
        graph.addEdge(7, 5);
        graph.addEdge(7, 2);
        graph.addEdge(10, 5);
        graph.addEdge(2, 5);
        graph.addEdge(5, 1);
        graph.addEdge(1, 4);

        System.out.println("Breadth First Traversal Starting from Vertex 0 :");
        graph.BFS(0);
    }

}
