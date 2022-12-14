#include<bits/stdc++.h>
using namespace std;
int main()
{
int arr[]={12,22,33,12,33,7,98,6,7};
int n=sizeof(arr)/sizeof(arr[0]);
int count=0;
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j+1]){ 
            cout<<arr[i]<<" ";
            cout<<endl;
        }         
        
         

    
    }
}
  
  





  return 0;
}
