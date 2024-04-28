# 문제
# 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

# 입력
# 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

# 출력
# 첫째 줄에 A+B를 출력한다.


# 두 정수 A,B를 입력받는다
A, B = map(int,input().split())

# 입력받은 정수가 범위에 맞는지 검증한다  (0 < A, B < 10)
if A > 0 and B < 10:
    result = A + B
    print(result)
else: print("0 < A, B < 10에 맞게 입력하세요.")
