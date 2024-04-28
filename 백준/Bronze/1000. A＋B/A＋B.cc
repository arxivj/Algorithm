#include <stdio.h>

int main(){

int A, B;

// # 두 정수 A,B를 입력받는다
scanf("%d %d", &A, &B); // 메모리 주소를 전달 (입력이므로)

// # 입력받은 정수가 범위에 맞는지 검증한다
if( A > 0 && B > 0 && A < 10 && B < 10 ){
    int result = A + B;
    printf("%d", result); // 단순 변수명 (출력이므로)
} else printf("0<A, B<10 사이의 정수를 입력하세요.");

}