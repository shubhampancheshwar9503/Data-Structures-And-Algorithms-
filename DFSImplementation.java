public class Main {

    static int[] visited = new int[7];
    static int[][] A = {

        {0, 1, 1, 1, 0, 0, 0},
        {1, 0, 1, 0, 0, 0, 0},
        {1, 1, 0, 1, 1, 0, 0},
        {1, 0, 1, 0, 1, 0, 0},
        {0, 0, 1, 1, 0, 1, 1},
        {0, 0, 0, 0, 1, 0, 0},
        {0, 0, 0, 0, 1, 0, 0}
    };

    public static void main(String[] args) {

        DFS(4);
    }

    static void DFS(int i) {

        System.out.print(i + " ");
        visited[i] = 1;
        for (int j = 0; j < 7; j++) {

            if (A[i][j] == 1 && visited[j] == 0) {

                DFS(j);
            }

        }

    }

}
