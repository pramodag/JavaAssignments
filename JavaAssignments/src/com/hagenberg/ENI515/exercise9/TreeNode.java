package com.hagenberg.ENI515.exercise9;
public class TreeNode {
	public TreeNode() {
		left = right = null;
		data = null;
	}
	public void setLeft(TreeNode l) {
		left = l;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setRight(TreeNode r) {
		right = r;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setData(String d) {
		data = d;
	}
	public String getData() {
		return data;
	}
	private TreeNode left, right;
	private String data;
}