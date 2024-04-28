#include <stdio.h>

int main(){

    double a,b;

    scanf("%lf %lf", &a, &b);


    if(a>0 && b>0 && a<10 && b<10 ){
        double result= a/b;
        printf("%.9f", result);
    }

}