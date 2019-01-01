#include <stdio.h>
int main()
{
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";

    
    int j;
    double d1;
    char s1[256];

    scanf("%i",&j);
    scanf("%lf",&d1);
    scanf(" %[^\n]s",s1);

    printf("%d",i+j);
    printf("\n%0.1lf\n",d+d1);
    printf("%s%s", s ,s1);

    return 0;
}
