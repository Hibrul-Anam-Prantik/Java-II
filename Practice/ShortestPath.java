package Practice;

public class ShortestPath {
    public static void main(String[] args) {
        String path = "NS";
        PathChecker pc = new PathChecker();
        System.out.println(pc.ShortestPath(path));
    }
}

class PathChecker {
    public String path;
    double ShortestPath( String path) {
        this.path = path;
        int x = 0, y = 0;
        for ( int i = 0; i < path.length(); i++) {
            
            switch (path.charAt(i)) {
                case 'N':
                    y ++;
                    break;
                case 'S':
                    y --;
                    break;
                case 'W':
                    x --;
                    break;
                case 'E':
                    x ++;
                    break;
                default:
                    break;
            }
        }
        
        return Math.sqrt(x*x + y*y);
    }
}