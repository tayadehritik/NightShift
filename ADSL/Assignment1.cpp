#include<iostream>
using namespace std;

class node
{
	private: 
		node *left, *right;
		int data;
};


class BTree
{
	private: 
		node *root;
	public:
		void create();
		void min();
		void max();
		void displayInOrder();
		void displayPreOrder();
		void displayPostOrder();

};

void BTree::create()
{}

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


int main()
{
	return 0;
}
