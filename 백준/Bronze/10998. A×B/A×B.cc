#include <stdio.h>

int main(){
    int x,y;

    scanf("%d %d",&x, &y);

    if(x>0 && y>0 && x<10 && y<10){
        printf("%d", x*y);
    }

}