#include <iostream>
#include <string>
using namespace std;

int main()
{
     string s = "array";
     cout<<s[4]<<endl;
     int len= s.size();
     //last element is ocuuped by "/o"
     //so [len-i]= 'y'
     s[len-1]='5';
     cout<<s[len-1]<<endl;
     cout<<s;



    return 0;
}