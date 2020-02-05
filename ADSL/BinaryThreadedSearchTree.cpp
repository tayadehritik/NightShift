#include<iostream>
using namespace std;

class node
{
    public:
        node *right, *left;
        int lbit, rbit;
        int data;
};

class BTree
{
    public:
    node *root;
    BTree()
    {
        root = NULL;
    }

    void create(int data)
    {
        node *temp = new node;
        temp->data = data;
        temp->lbit = 0;
        temp->rbit = 0;

        if(root = NULL)
        {
            node *dummy = new node;
            dummy->data = -1;
            dummy->lbit = 1;
            dummy->rbit = 1;
            temp->left = dummy;
            temp->right = dummy;
            root = temp;
        }
        else
        {
            insert(root, temp);
        }
        
    }

    void insert(node *temp, node *trav)
    {

    }

    void displayInOrder(node *root)
    {

    }

    void displayPreOrder(node *root)
    {

    }

    void displayPostOrder(node *root)
    {

    }

};


int main()
{
    BTree tree;
    return 0;
}