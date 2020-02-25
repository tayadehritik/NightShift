//============================================================================
// Name        : BTree.cpp
// Author      : Aut1
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class node
{
public: int data;
		node *left, *right;
		node(int x)
		{
			data = x;
			left = NULL;
			right = NULL;
		}
};

class tree
{
public:
		node *root;

		tree()
		{
			root = NULL;
		}

		void create()
		{
			if(root == NULL)
			{
				cout<<endl<<"Enter data for node";
				int data;
				cin>>data;
				if(data == -1)
				{
					cout<<endl<<"False data";
				}
				else
				{
					node *temp = new node(data);
					root = temp;


				}
			}
			else
			{
				insert(root);
			}

		}

		 void insert(node *root)
		 {
			 node *trav;
			 trav = root;
			 cout<<endl<<"current node =  "<<trav->data;
			 int flag = 0;
			 cout<<endl<<"insert 1.left 2.right";
			 cin>>flag;


			 if(trav->left == NULL || trav->right == NULL)
			 {
				 cout<<endl<<"Enter data for new node";
				 int data;
				 cin>>data;
				 node *newnode = new node(data);
				 if(flag == 1)
				 {
					 trav->left = newnode;
				 }
				 else if(flag == 2)
				 {
					 trav->right = newnode;
				 }
			 }
			 else
			 {
				 if(flag == 1)
				 {
					 insert(trav->left);

				 }
				 else if(flag == 2)
				 {
					 insert(trav->right);
				 }
			 }




		 }
		 void display(node *temp)
		 {
			 if(temp != NULL)
			 {
				 display(temp->left);
				 cout<<temp->data;
				 display(temp->right);
			 }
		 }
		 node* getroot()
		 {
			 return root;
		 }
};


int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	tree t;
	t.create();


	t.insert(t.getroot());

	t.insert(t.getroot());

	t.display(t.getroot());

	return 0;
}
