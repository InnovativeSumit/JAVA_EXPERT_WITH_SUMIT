#include<bits/stdc++.h>
#include <iostream>
#include <algorithm>
using namespace std;
int main()
{

    int num,num2 ;
    cout<<"Enetr a number";
    cin>>num;
    string s= to_string(num);

    sort(s.begin(), s.end());
    num2 = stoi(s); // // converts the sorted string back to integer
    cout<<"sorted form: "<<num2;

    

return 0;
}