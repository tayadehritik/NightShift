//============================================================================
// Name        : Dict.cpp
// Author      : Hritik
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include<string.h>
using namespace std;

class node
{
public:
		node *right;
		char word[20];
		char meaning[20];
		node *left;
		node()
		{
			left = NULL;
			right = NULL;
		}
};

class DictTree
{
	private:
			node *root;

	public:
			DictTree()
			{
				root = NULL;
			}
			void insert(char word[20], char mean[20])
			{
				node *temp = new node;
				strcpy(temp->word, word);
				strcpy(temp->meaning, mean);
				if(root != NULL)
				{
					node *current, *parent;
					current = root;
					parent = root;
					while(current != NULL)
					{
						parent = current;
						if(strcmp( temp->word, current->word) > 0 )
						{
							current = current->right;
						}
						else if(strcmp(temp->word, current->word) < 0 )
						{
							current = current->left;
						}
					}

					if(strcmp(temp->word, parent->word) > 0)
					{
						parent->right = temp;
						cout<<"right";
					}
					else if(strcmp(temp->word, parent->word) < 0)
					{
						parent->left = temp;
						cout<<"left";
					}




				}
				else
				{
					root = temp;
				}
			}
			void displayInOrder(node *temp)
			{
				node *trav = temp;
				if(trav!=NULL)
				{
					displayInOrder(trav->left);
					cout<<endl<<trav->word;
					cout<<endl<<trav->meaning;
					displayInOrder(trav->right);
				}

			}
			void updateMeaning(char newword[20], char newmean[20])
			{
				node *trav = root;
				node *curr = root;
				bool flag = false;
				while(trav != NULL)
				{
					curr = trav;
				
					if(strcmp(newword, trav->word)>0)
					{
						trav = trav->right;
					}
					else if(strcmp(newword, trav->word)<0)
					{
						trav = trav->left;
					}
					else if(strcmp(newword, trav->word) == 0)
					{
						cout<<endl<<"Word found and updated";
						strcpy(trav->meaning,newmean);
						flag = true;
						break;
					}
				}
				if(!flag)
				{
					cout<<endl<<"Word not found";
				}

			
			}

			node* getroot()
			{
				return root;
			}


};



int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	DictTree tree;
	while(true)
	{
		int ch;
		cout<<endl<<"1. Insert 2. Display  3.Update";
		cin>>ch;
		switch(ch)
		{
		case 1:	 cout<<endl<<"Enter word and it's meaning to insert";
				 char word[20], meaning[20];
				 cin>>word>>meaning;
				 tree.insert(word, meaning);
				 break;
		case 2:  tree.displayInOrder(tree.getroot());
				 break;

		case 3:	 cout<<endl<<"Enter word to update and its new meaning";
			 char nword[20], nmeaning[20];
			 cin>>nword>>nmeaning;
			 tree.updateMeaning(nword, nmeaning);
			 break;
		default: cout<<endl<<"wrong choice";
		}
	}

	return 0;
}
