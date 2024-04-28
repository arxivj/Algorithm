#include <stdio.h>

int main(){

int x,y, res;

scanf("%d %d", &x, &y);

if( x>0 && y>0 && x<=9 && y<= 9){
    res = x - y;
    printf("%d", res);  
}

}