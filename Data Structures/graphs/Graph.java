package Graph;

public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int nVerts;

    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for(int j = 0; j < MAX_VERTS; j++)
            for(int k = 0; k < MAX_VERTS; k++)
                adjMat[j][k] = 0;
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public int getAdjUnvisitedVertex(int v){
        for(int j = 0; j < nVerts; j++)
            if(adjMat[v][j] == 1 && !vertexList[j].wasVisited)
                return j;
        return -1;
    }

    public void displayVertex(int n){
        System.out.print(vertexList[n].label);
    }

    public void dfs(){
        Stack stack = new Stack();
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(0);

        while(!stack.isEmpty()){
            int v = getAdjUnvisitedVertex(stack.peek());
            if(v == -1)
                stack.pop();
            else{
                vertexList[v].wasVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        for(int j = 0; j < nVerts; j++)
            vertexList[j].wasVisited = false;
    }

    public void bfs(){
        Queue queue = new Queue();
        vertexList[0].wasVisited = true;
        displayVertex(0);
        queue.insert(0);
        int v2;

        while(!queue.isEmpty()){
            int v1 = queue.remove();
            while((v2 = getAdjUnvisitedVertex(v1)) != -1){
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                queue.insert(v2);
            }
        }
        for(int i  = 0; i < nVerts; i++)
            vertexList[i].wasVisited = true;
    }

    public void mst(){
        Stack stack = new Stack();
        vertexList[0].wasVisited = true;
        stack.push(0);
        while(!stack.isEmpty()){
            int currentVertex = stack.peek();
            int v = getAdjUnvisitedVertex(currentVertex);
            if(v == -1)
                stack.pop();
            else{
                vertexList[v].wasVisited = true;
                stack.push(v);
                displayVertex(currentVertex);
                displayVertex(v);
                System.out.print(" ");
            }
        }
        for(int j = 0; j < nVerts; j++)
            vertexList[j].wasVisited = false;
    }
}
