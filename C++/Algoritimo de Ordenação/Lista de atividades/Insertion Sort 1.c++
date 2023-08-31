/**
Insertion Sort:

Exercício 1:
Como parte de um sistema de rastreamento de ativos em um armazém industrial, você precisa ordenar uma lista de códigos de produtos.
Implemente o Insertion Sort em C++ para ordenar os seguintes códigos: ["P123", "P354", "P011", "P789", "P234"].
Ilustre cada inserção e discuta como essa ordenação pode beneficiar o controle de estoque em um ambiente de alta demanda.

Exercício 2:
Em um ambiente de manufatura, é necessário ordenar uma lista de números de série de produtos acabados para facilitar o processo de
empacotamento. Utilize o Insertion Sort para ordenar os números de série a seguir: ["SN456", "SN123", "SN789", "SN234", "SN567"].
Mostre o array após cada inserção e explique como esse método de ordenação pode ser eficiente para pequenos lotes de produtos.

Exercício 3:
Imagine um sistema de monitoramento de dispositivos em uma planta industrial. Desenvolva uma versão do Insertion
Sort que seja capaz de ordenar uma lista encadeada de leituras de temperatura. Ordenar as seguintes
leituras: [28.5°C, 23.8°C, 32.1°C, 26.7°C, 29.3°C]. Apresente a lista após cada inserção e discuta como essa abordagem pode auxiliar na
detecção de anomalias térmicas.
*/

#include <iostream>
#include <vector>
#include <list>
#include <string>

// Função de Insertion Sort para ordenar um vetor de strings
void insertionSort(std::vector<std::string>& arr) {
    int n = arr.size();
    for (int i = 1; i < n; ++i) {
        std::string key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            --j;
        }
        arr[j + 1] = key;
    }
}

// Função de Insertion Sort para ordenar uma lista encadeada de leituras de temperatura
void insertionSort(std::list<double>& arr) {
    for (auto it = arr.begin(); it != arr.end(); ++it) {
        double key = *it;
        auto j = it;
        while (j != arr.begin() && *std::prev(j) > key) {
            *j = *std::prev(j);
            --j;
        }
        *j = key;
    }
}

int main() {
    // Insertion Sort para códigos de produtos
    std::vector<std::string> productCodes = {"P123", "P354", "P011", "P789", "P234"};
    insertionSort(productCodes);
    
    std::cout << "Códigos de produtos ordenados: ";
    for (const std::string& code : productCodes) {
        std::cout << code << " ";
    }
    std::cout << std::endl;
    
    // Insertion Sort para números de série de produtos acabados
    std::vector<std::string> serialNumbers = {"SN456", "SN123", "SN789", "SN234", "SN567"};
    insertionSort(serialNumbers);
    
    std::cout << "Números de série ordenados: ";
    for (const std::string& number : serialNumbers) {
        std::cout << number << " ";
    }
    std::cout << std::endl;
    
    // Insertion Sort modificado para leituras de temperatura em uma lista encadeada
    std::list<double> temperatureReadings = {28.5, 23.8, 32.1, 26.7, 29.3};
    insertionSort(temperatureReadings);
    
    std::cout << "Leituras de temperatura ordenadas: ";
    for (double temp : temperatureReadings) {
        std::cout << temp << "°C ";
    }
    std::cout << std::endl;
    
    return 0;
}
