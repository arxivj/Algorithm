#include <iostream>
#include <vector>

int main()
{
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int N;
    std::cin >> N;
    std::vector<int> repository(10000, 0);

    for(int i = 0; i < N; i++) {
        int num;
        std::cin >> num;
        repository[num - 1]++;
    }

    for(int i = 0; i <= 10000; i++) {
       for(int j = 0; j < repository[i]; j++){
           std::cout << i + 1 << '\n';
        }
    }

    return 0;
}
