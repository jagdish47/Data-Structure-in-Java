#include<iostream>
using namespace std;

bool isSortedRecursion(int arr[], int size, int start){

    if(arr[start] < arr[start-1]){
        return false;
    }
    else if(arr[start] == size-1){
        return true;
    }

    isSortedRecursion(arr, size, start+1);

}

int main(){

    int arr[] = {1, 2, 10, 4, 5};
    int size = *(&arr + 1) - arr;
    int start = 1;

    bool ans = isSortedRecursion(arr, size, start);

    cout<<ans;
    return 0;
}