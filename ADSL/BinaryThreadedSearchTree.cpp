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
			temp->rightChild = false;
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

		void display(node *trav)
		{
			if(trav != NULL)
			{
				display(trav->left);
				cout<<endl<<trav->data;
				display(trav->right);
			
			}	
		}

		void displaySingleThread()
		{
			
		
		}

		node* leftmost(node *temp)
		{
			node *trav = temp;
			while(trav->left!=NULL)
			{
				trav = trav->left;
			}
			return trav;
		}

		node* getroot()
		{
			return root;
		}
};


int main()
{
	BinaryThreadedSearchTree btree;
	btree.insert(10);
	btree.insert(20);
	btree.insert(9);
	//btree.display(btree.getroot());

	cout<<"-----";
	btree.displaySingleThread();
	return 0;
}
