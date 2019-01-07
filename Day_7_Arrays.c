//Day 7: Arrays

#include <stdio.h>
int main()
{
    int n,arr[100],i;
    scanf("%d",&n);
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
     for(i=n-1;i>-1;i--)
        printf("%d ",arr[i]);
}
