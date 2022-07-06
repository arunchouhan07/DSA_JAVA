#include <vector>
#include <iostream>
// The following header needs to be included to use std::reverse()
#include <algorithm>

using namespace std;

int main() {
  std::vector<int> values = {
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10
  };

  std::cout << "Before reversing: ";
  for(int x: values) {
    std::cout << x << ' ';
  }

  std::reverse(values.begin(), values.end());
  
  std::cout << "\nAfter reversing: ";
  for(int x: values) {
    std::cout << x << ' ';
  }
}