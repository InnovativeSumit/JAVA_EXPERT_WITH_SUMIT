// #include <bits/stdc++.h>
// using namespace std;
// // void
// // return
// // parametarised
// // non-parametarised

// // void name(string na)
// // {
// //     cout << "Hello world!\n" << na << endl;
// // }

// // int main()
// // {
// //     string na;
// //     cout << "Enter your name: ";
// //     cin >> na;
// //     name(na);
// //     return 0;
// // }
// // int sum ( int a , int b){
// //     return a+b;
// // }

// // int main(){
// //     int a,b,res;
// //     cout << "Enter your num 1: ";
// //     cin >> a;
// //     cout << "Enter your num 2: ";
// //     cin >> b;
// //     res=sum(a,b);
// //     cout<<"The result is: "<<res<<endl;
// //     return 0;

// // }







// // PASS BY REFERENCES
// #include <iostream>
// using namespace std;

// int maxx(int num1, int num2) {
//     if (num1 >= num2) return num1;
//     else return num2;
// }

// int main() {
//     int num1, num2;
//     cin >> num1 >> num2;
//     int maximum = maxx(num1, num2);
//     cout << maximum;
//     return 0;
// }







// // PASS  BY value_compare
// #include <iostream>
// using namespace std;

// // pass by value
// void doSomething(int num) {
//     cout << num << endl;
//     num += 5;
//     cout << num << endl;
//     num += 5;
//     cout << num << endl;
// }

// int main() {
//     int num = 10;
//     doSomething(num);
//     cout << num << endl;
//     return 0;
// }







// // PASS BY REFERENCE
// #include <iostream>
// #include <string>
// using namespace std;

// // pass by reference
// void doSomething(string &s) {
//     s[0] = 't';
//     cout << s << endl;
// }

// int main() {
//     string s = "raj";
//     doSomething(s);
//     cout << s << endl;
//     return 0;
// }






// //PASS BY REFERENCE 
// #include <iostream>
// using namespace std;

// // pass by reference
// void doSomething(int arr[], int n) {
//     arr[0] += 100;
//     cout << "Value inside function: " << arr[0] << endl;
// }

// int main() {
//     int n = 5;
//     int arr[n];
//     for (int i = 0; i < n; i = i + 1) {
//         cin >> arr[i];
//     }

//     doSomething(arr, n);

//     cout << "Value inside main: " << arr[0] << endl;
//     return 0;
// }








// //PASS BY REFERENEC 
// #include <iostream>
// using namespace std;

// // pass by reference
// void doSomething(int &num) {
//     cout << num << endl;
//     num += 5;
//     cout << num << endl;
//     num += 5;
//     cout << num << endl;
// }

// int main() {
//     int num = 10;
//     doSomething(num);
//     cout << num << endl;
//     return 0;
// }





