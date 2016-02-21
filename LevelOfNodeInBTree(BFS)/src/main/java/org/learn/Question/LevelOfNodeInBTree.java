
package org.learn.Question;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOfNodeInBTree {
	public static void  levelOfNodeInBTree(Node root, Node inputNode) {
		if (root == null) {
			System.out.println("Tree is empty");
			return ;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		//level delimiter
		queue.offer(null);
		int level = 0;
		boolean found = false;
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			//Level change
			if (null == node) {
				if (!queue.isEmpty()) {
					//level delimiter
					queue.offer(null);
				}	
				level ++;
			} else {
				if( inputNode.data == node.data) {
					found = true;
					break;
				}
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
		}
		if(found) {
			System.out.printf("Found data %d at level %d \n",inputNode.data,level);
		} else {
			System.out.printf("Node could not found in binary tree");			
		}
		
		return;
	}
}
