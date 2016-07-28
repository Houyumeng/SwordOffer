package chapter2;

public class ConstructBinaryTree {
	public BinaryTreeNode construct(int[] preorder,int[] inorder){
		if(preorder==null||inorder==null){
			return null;
		}
		if(preorder.length!=inorder.length){
			throw new Exception("�����쳣");
		}
		BinaryTreeNode root = new BinaryTreeNode();
		root.data=preorder[startPreorder];
		
	}
}
class BinaryTreeNode{
	int data;
	BinaryTreeNode treeLeft;
	BinaryTreeNode treeRight;
}
package Problem6;

import utils.BinaryTreeNode;

import java.util.Arrays;

/**
 * Created by liujia on 14-8-26.
 */
public class ConstructCore {
	/*
	�����������ǰ�����������������,�ؽ������������ͷ�ڵ�
	ex:12473568,47215386
	 */
	public BinaryTreeNode constructCore(int[] preorder,int[] inorder) throws Exception
	{
		boolean isHave =false;
		if(preorder==null || inorder==null)
		{
		   return null;
		}
		if(preorder.length!=inorder.length)
		{
			throw new Exception("���Ȳ�һ�����Ƿ�����");
		}
		BinaryTreeNode root=new BinaryTreeNode();
		for(int i=0;i<inorder.length;i++)
		{
			if(inorder[i]==preorder[0])
			{
				isHave =true;
				root.value=inorder[i];
				root.leftNode=constructCore(Arrays.copyOfRange(preorder,1,i+1)
						,Arrays.copyOfRange(inorder,0,i));
				root.rightNode=constructCore(Arrays.copyOfRange(preorder,i+1,preorder.length)
						,Arrays.copyOfRange(inorder,i+1,inorder.length));
			}
		}
		if(!isHave)
		{
			throw new Exception("���������ڵ㣭�Ƿ�����");
		}
		return root;
	}
}
