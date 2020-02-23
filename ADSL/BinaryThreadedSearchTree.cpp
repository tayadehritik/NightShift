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
			
				node *trav = root;
				node *curr = root;

				while(trav!=NULL)
				{
					curr = trav;
					if(temp->data < trav->data)
					{
						trav = trav->left;
					}	
					else
					{
						trav = trav->right;
					}
				}

				if(temp->data < curr->data)
				{
					curr->left = temp;
				}
				else
				{
					curr->right = temp;
				}
			
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
	btree.insert(11);
	btree.display(btree.getroot());
	return 0;
}
