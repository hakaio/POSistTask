import java.util.*;

class Node{
	ArrayList<Node> children;
	Date timestamp = new Date();
	String data;
	static Integer nodeNumber = 0;
	String nodeId;
	Node referenceNodeId;
	Node childReferenceNodeId;
	Node genesisReferenceNodeId;
	String HashValue;

	Node(Node parent, String data){

		referenceNodeId = parent;
		this.data = data;
		nodeNumber++;
	}

}