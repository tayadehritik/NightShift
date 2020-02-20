//============================================================================
// Name        : LinearProbing.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class LinPro
{
private:
		int n;
		int arr[13];


public:

		LinPro(int N)
		{
			n = N;
			for(int i=0;i<n;i++)
			{
				arr[i] = NULL;
			}

		}
		void insertKey(int key)
		{
			int hashval = hashFunc(key);
			int i = 0;
			while((hashval == hashFunc(arr[hashval+i]))&& i < n)
			{
				i++;
			}


			if(checkFull())
			{
				cout<<"\n"<<"Array full "<<hashval;

			}
			else
			{

				if(arr[(hashval+i)%n] != NULL)
				{
					while(i<n && arr[(hashval+i)%n] != NULL)
					{
						i++;
					}
					arr[(hashval+i)%n] = key;
				}
				else
				{
					arr[(hashval+i)%n] = key;
				}
			}

		}
		void searchKey(int key)
		{

			int hashval = hashFunc(key);
			int i=0;


			if(arr[(hashval+i)%n] == key)
			{
				cout<<endl<<"Key found at "<<(hashval+i)%n;
			}
			else
			{
				bool flag = false;
				while(i<n)
				{
					if(arr[(hashval+i)%n] == key)
					{
						cout<<endl<<"Key found at "<<(hashval+i)%n;
						flag = true;
						break;
					}
					i++;
				}
				if(flag == false)
				{
					cout<<endl<<"Key not found";
				}

			}


		}
		void deleteKey(int key)
		{

			int hashval = hashFunc(key);
			int i=0;


			if(arr[(hashval+i)%n] == key)
			{
				cout<<endl<<"Key found at "<<(hashval+i)%n<<" and deleted"<<endl;
				arr[(hashval+i)%n] = NULL;

			}
			else
			{
				bool flag = false;
				while(i<n)
				{
					if(arr[(hashval+i)%n] == key)
					{
						cout<<endl<<"Key found at "<<(hashval+i)%n<<" and deleted"<<endl;
						arr[(hashval+i)%n] = NULL;
						flag = true;
						break;
					}
					i++;
				}
				if(flag == false)
				{
					cout<<endl<<"Key not found";
				}

			}
		}
		int hashFunc(int key)
		{
			return key%n;
		}

		void printarr()
		{
			for(int i=0;i<n;i++)
			{
				cout<<"\t"<<arr[i];
			}
		}
		bool checkFull()
		{
			bool flag = true;
			for(int i=0;i<n;i++)
			{
				if(arr[i] == NULL)
				{
					return false;
				}
			}
			return true;
		}
};

int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!

	LinPro abc(10);

	abc.insertKey(18);
	abc.insertKey(41);
	abc.insertKey(22);
	abc.insertKey(32);
	abc.insertKey(44);
	abc.insertKey(59);
	abc.insertKey(79);
	/*
	abc.insertKey(18);
	abc.insertKey(41);
	abc.insertKey(22);
	abc.insertKey(44);
	abc.insertKey(59);
	abc.insertKey(32);
	abc.insertKey(31);
	abc.insertKey(73);
	*/
	abc.printarr();

	abc.searchKey(32);

	abc.deleteKey(41);
	abc.printarr();
	return 0;
}
