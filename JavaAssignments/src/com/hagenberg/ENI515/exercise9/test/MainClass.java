package com.hagenberg.ENI515.exercise9.test;
import com.hagenberg.ENI515.exercise9.BinarySearchTree;
public class MainClass {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add("50");
		bst.add("20");
		bst.add("60");
		bst.add("32");
		bst.add("90");
		bst.add("43");
		bst.add("6");
		bst.add("50");
		bst.add("2");
		System.out.println(bst);
		System.out.println("Size: " + bst.getSize());
		System.out.println("Depth: " + bst.getDepth());
		System.out.println("formated to string");
		System.out.println(bst.toStringIndented());
		System.out.println("Inorder: "+bst.toString());
		System.out.println("PreOrder: "+bst.toStringPreOrder());
		System.out.println("Inorder: "+bst.toStringPostOrder());
//		int indent = 30;
//		String s = String.format("[%"+indent+"s]%n", "");
//		System.out.println(s);
		System.out.println("Tree contains 65 :"+bst.contains("65"));
	}
}
