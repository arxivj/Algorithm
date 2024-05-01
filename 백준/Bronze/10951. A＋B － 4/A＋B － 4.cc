#include <stdio.h>

int main(){

    int i1, i2;
    
    while(scanf("%d %d", &i1, &i2) != EOF){
       printf("%d\n", i1+i2);
    }
}