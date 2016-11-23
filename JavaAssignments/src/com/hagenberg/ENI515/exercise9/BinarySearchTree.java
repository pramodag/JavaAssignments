package com.hagenberg.ENI515.exercise9;
public class BinarySearchTree {
	public BinarySearchTree() {
		root = null;
	}

	public int getSize() {
		return getSize(root);
	}

	private int getSize(TreeNode node) {
		if (node == null)
			return 0;
		return 1 + getSize(node.getLeft()) + getSize(node.getRight());
	}

	public int getDepth() {
		return getDepth(root);
	}

	private int getDepth(TreeNode node) {
		if (node == null)
			return 0;
		int left = getDepth(node.getLeft());
		int right = getDepth(node.getRight());
		if (left > right)
			return 1 + left;
		return 1 + right;
	}

	public void add(String s) {
		if (root == null) {
			TreeNode node = new TreeNode();
			node.setData(s);
			node.setLeft(null);
			node.setRight(null);
			root = node;
		} else
			add(root, null, false, s);
	}

	private boolean add(TreeNode t, TreeNode parent, boolean right, String d) {
		if (t == null) {
			TreeNode n = new TreeNode();
			n.setData(d);
			n.setLeft(null);
			n.setRight(null);
			if (root == t) {
				root = n;
				return true;
			}
			if (right)
				parent.setRight(n);
			else
				parent.setLeft(n);
			return true;
		} else if (d.compareTo(t.getData()) < 0) {
			add(t.getLeft(), t, false, d);
		} else {
			add(t.getRight(), t, true, d);
		}
		return true;
		
	}

	public boolean remove(String s) {
		return false;
	}

	public boolean contains(String s) {
		return contains(root, s);
	}

	private boolean contains(TreeNode node, String s) {
		if (node == null)
			return false;
		if (node.getData().compareTo(s) == 0)
			return true;
		if (node.getData().compareTo(s) > 0)
			return contains(node.getLeft(), s);
		return contains(node.getRight(), s);
	}

	public void print() { // temporary
	}

	public String toString() {
		isFirst = true;
		StringBuffer sb = new StringBuffer();
		toStringInOrder(sb, root);
		sb.append('.');
		return sb.toString();
	}

	private void toStringInOrder(StringBuffer sb, TreeNode node) {
		if (node == null)
			return;
		toStringInOrder(sb, node.getLeft());
		if (!isFirst)
			sb.append(',');
		else
			isFirst = false;
		sb.append(node.getData());
		toStringInOrder(sb, node.getRight());
	}

	public String toStringPreOrder() {
		isFirst = true;
		StringBuffer sb = new StringBuffer();
		toStringPreOrder(sb, root);
		sb.append('.');
		return sb.toString();
	}

	private void toStringPreOrder(StringBuffer sb, TreeNode node) {
		if (node == null)
			return;
		if (!isFirst)
			sb.append(',');
		else
			isFirst = false;
		sb.append(node.getData());
		toStringPreOrder(sb, node.getLeft());
		toStringPreOrder(sb, node.getRight());
	}

	public String toStringPostOrder() {
		isFirst = true;
		StringBuffer sb = new StringBuffer();
		toStringPostOrder(sb, root);
		sb.append('.');
		return sb.toString();
	}

	private void toStringPostOrder(StringBuffer sb, TreeNode node) {
		if (node == null)
			return;
		toStringPostOrder(sb, node.getLeft());
		toStringPostOrder(sb, node.getRight());
		if (!isFirst)
			sb.append(',');
		else
			isFirst = false;
		sb.append(node.getData());
	}

	public String toStringIndented() {
		StringBuffer sb = new StringBuffer();
		toStringIndented(sb, root, 0);
		return sb.toString();
	}

	private void toStringIndented(StringBuffer sb, TreeNode node, int indent) {
		if (node == null)
			return;
		toStringIndented(sb, node.getRight(), indent + 2);
		for (int i = 0; i < indent; i++)
			sb.append(" ");
		sb.append(node.getData() + "\n");
		toStringIndented(sb, node.getLeft(), indent + 2);
	}

	public String toStringInorder() {
		return null;
	}

	public void reset() {
		root = null;
	}
	private TreeNode root;
	private boolean isFirst = true;
}
