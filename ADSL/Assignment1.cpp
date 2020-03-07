#include<iostream>
using namespace std;

class node
{
	public: 
		node *left, *right;
		int data;
};


class BTree
{
	private: 
		node *root;
	public:
		BTree()
		{
			root = NULL;
		}
		void create();
		void min();
		void max();
		void displayInOrder();
		void displayPreOrder();
		void displayPostOrder();
		void recInOrder(node *);
		node * insert();
};

void BTree::create()
{

	node *temp = new node;

	cout<<"Enter new node data , -1 for NULL";
	cin>>temp->data;
	temp->left = NULL;
	temp->right = NULL;
	
	if(root == NULL)
	{		
		root = temp;
		create();
	}
	else
	{
		node *trav = root;
		
		cout<<endl<<trav->data;
		trav->left = insert();
		cout<<endl<<trav->data;
		
		trav->right = insert();

	}


}

node * BTree::insert()
{
	node *temp = new node;
	cout<<endl<<"Enter new node data -1 for NULL";
	cin>>temp->data;
	temp->left = NULL;
	temp->right = NULL;
	if(temp->data == -1)
	{
		return NULL;
	}
	else
	{

		temp->left = insert();
		temp->right = insert();
		return temp;

	}

}

void BTree::min()
{}

void BTree::max()
{}

void BTree::displayInOrder()
{}

void BTree::displayPreOrder()
{}

void BTree::displayPostOrder()
{}

void BTree::recInOrder(node *root)
{
	if(root != NULL)
	{
		recInOrder(root->left);
		cout<<root->data<<endl;
		recInOrder(root->right);
	}
}

int main()
{
	BTree b;
	b.create();
	return 0;
}
