import java.util.*;

class Record{
	//Owner owner;
	ArrayList<Node> nodeList = new ArrayList<Node>();

	void createGenesisNode(String data){
		if(nodeList.size() != 0){
			System.out.println("Genesis Node already created!");
		}
		else{
			nodeList.add(new Node(null,data));
			System.out.println(data);
		}
	}

	void createNode(Node parent, String data){

		if(valueLimitExceeded(parent,data)){
			System.out.println("Parent value exceeded");
		}
		else{
			nodeList.add(new Node(parent,data));
		}
	}

	void createMultipleNodes(Node parent,int numberOfNodes, String[] data){

		for(int i=0;i<numberOfNodes;i++){
			createNode(parent,data[i]);
		}
	}

	Boolean valueLimitExceeded(Node parent,String data){

		double sum = 0;
		ArrayList<Node> children = parent.children;
		for(Node child : children){
			sum+= Integer.parseInt(child.data);
		}
		sum+= Integer.parseInt(data);
		if(sum > Integer.parseInt(parent.data)){
			return false;
		}
		else{
			return true; 
		}
	}
}
	// encryptNode();
	// DecryptNode();
	// editNode();
	// verifyOwner();
	// transferNodeOwnership();
	// findNodeChainLength();
	// findGenesisNodeChainLength();
	// MergeNode();
