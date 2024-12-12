#include <iostream>
#include <vector>
#include <string>

int main()
{
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int N;
    int sum = 0;

    std::cin >> N;

    std::string input;
    std::cin >> input;

    for ( char c : input ) {
        sum += c - '0';
    }

    std::cout << sum << std::endl;


    return 0;
}
