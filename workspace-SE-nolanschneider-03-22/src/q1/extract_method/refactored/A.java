package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
	   ex(nodes,p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
	   ex(edgeList,p);
      // other implementation
      return null;
   }

   
   <T extends Graph> void  ex(List<T> objs,String p) {
	for (T obj : objs) {
		if (obj.contains(p))
			System.out.println(obj);
	}
	// other implementation
	// return null;
}
}
class Graph {
	String name;
	boolean contains(String p) {
		return name.contains(p);
	}
}
class Node extends Graph{
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge extends Graph{
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}