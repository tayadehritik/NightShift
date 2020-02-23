#include<iostream>
using namespace std;

class node
{
	public:
		int data;
		node *left,*right;
		bool leftChild, rightChild;
};

class BinaryThreadedSearchTree
{
	private:
		node *root;
	public:
		BinaryThreadedSearchTree()
		{
			root = NULL;	
		}

		void insert(int data)
		{
			node *temp = new node;
			temp->data = data;
			temp->left = NULL;
			temp->right = NULL;
			if(root == NULL)
			{
				root = temp;	
			}
			else
			{
			
			
			}
		}
		void inorderSingleThread()
		{
			cout<<root->data;
		}

		node* leftMost(root)
		{
			node *curr = root;

		}
};


int main()
{
	BinaryThreadedSearchTree btree;
	btree.insert(10);
	btree.inorderSingleThread();
	return 0;
}
