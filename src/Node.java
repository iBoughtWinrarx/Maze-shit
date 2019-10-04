public class Node {
    public int i;
    public int j;
    public boolean isWall = false;
    public boolean isBall = false;
    public boolean visited = false;

    public Node(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
