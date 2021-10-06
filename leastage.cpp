#include <iostream>
using namespace std;

int main() {
    /* the youngest is the one with the least age
    Baaba's age is stored in the first index
    followed by Efe's age and then Fiifi's age */
    
    // array of type int with size 3 to store the ages
    int ages[3];
    string names[3] = {"Baaba", "Efe", "Fiifi"};
    
    // taking user inputs and storing in the array

    cout << "Enter the age of Baaba: ";
    cin >> ages[0];

    cout << "Enter the age of Efe: ";
    cin >> ages[1];

    cout << "Enter the age of Fiifi: ";
    cin >> ages[2];

    /* loop to find the youngest 
    the loop compares the values for the least age and stores
    index of the least age to determine who is the young person */

    int index = 0; int leastAge = ages[index];

    for (int i =1; i < 3; i ++) {
        if (leastAge > ages[i]) {
            leastAge = ages[i];
            index = i;
        }
    }

    cout << "The youngest person is: " 
         << names[index] << " who is aged: "
         << leastAge << endl;

    return 0;

}
