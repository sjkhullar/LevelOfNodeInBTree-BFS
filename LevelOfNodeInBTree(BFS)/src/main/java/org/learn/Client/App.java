package org.learn.Client;

import org.learn.Question.LevelOfNodeInBTree;
import org.learn.Question.Node;

public class App 
{
    public static void main( String[] args )
    {  
       //root level 0
       Node A = Node.createNode(100);
       //Level 1
       Node B = Node.createNode(50);
       Node C = Node.createNode(150);
       //Level 2
       Node D = Node.createNode(25);
       Node E = Node.createNode(75);
       Node F = Node.createNode(125);
       Node G = Node.createNode(175);
       //Level 3
       Node H = Node.createNode(120);
       Node I = Node.createNode(140);
             
       //connect Level 0 and 1
       A.left = B;
       A.right = C;
       //connect level 1 and level 2
       B.left = D;
       B.right = E;
       C.left = F;
       C.right = G;
       //Connect level 2 and level 3
       F.left = H;
       F.right = I;       
       
       //Pass root node and input node
       LevelOfNodeInBTree.levelOfNodeInBTree(A,A);      
       LevelOfNodeInBTree.levelOfNodeInBTree(A,C);  
       LevelOfNodeInBTree.levelOfNodeInBTree(A,F);      
       LevelOfNodeInBTree.levelOfNodeInBTree(A,H);   
    }
}