package ThreeWaterJugProblem;

import java.util.List;
import java.util.ArrayList;

/* 
    Nguyen Tuan Dang
    Faculty of Information Technology, Saigon University
    dangnt@sgu.edu.vn
*/

public class Path<T> {
    private List<T> path;
    
    public Path(){
        path = new ArrayList<>();
    }
    
    public void addVertex(T vertex) {
        path.add(vertex);
    }
    
    public List<T> getPath(){
        return path;
    }
    
    public void setPath(List<T> path){
        this.path.addAll(path);
    }

    public void printPath(){
        for (int i = 0; i < path.size(); i++){
            System.out.print(path.get(i).toString() + " ");
        }
        
        System.out.println();
    }    
}