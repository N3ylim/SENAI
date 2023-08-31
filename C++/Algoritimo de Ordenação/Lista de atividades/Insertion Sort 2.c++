/**
**Insertion Sort:**

Exercício 4:
Na indústria automotiva, a montagem de componentes requer precisão na sequência de etapas. Implemente o Insertion Sort 
para ordenar uma lista de IDs de componentes na ordem desejada para montagem. Ordenar os IDs: ["C123", "C789", "C234", "C567", "C011"]. Mostre o array 
após cada inserção e discuta como esse algoritmo pode ser aplicado para otimizar o processo de montagem.

*Exercício 5:
Em um sistema de controle de qualidade de alimentos, é necessário ordenar uma lista de amostras de produtos por peso. Modifique o Insertion 
Sort para ordenar os pesos a seguir: [150g, 125g, 175g, 130g, 160g]. Mostre o array após cada inserção e explique como essa ordenação pode 
ser útil para garantir que os produtos estejam dentro das especificações.

*Exercício 6:
Como parte de um projeto de pesquisa em ciências ambientais, você precisa ordenar uma lista de medições de poluentes (em ppm). Utilize o 
Insertion Sort para ordenar as seguintes medições: [2.5 ppm, 1.8 ppm, 3.0 ppm, 2.2 ppm, 2.8 ppm]. Ilustre o processo de ordenação e discuta como essa 
abordagem pode contribuir para a análise de qualidade do ar.
*/

#include <iostream>
#include <vector>
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

// Função de Insertion Sort modificada para ordenar um vetor de strings
void modifiedInsertionSort(std::vector<std::string>& arr) {
    int n = arr.size();
    for (int i = 1; i < n; ++i) {
        std::string key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] < key) {
            arr[j + 1] = arr[j];
            --j;
        }
        arr[j + 1] = key;
    }
}

// Função de Insertion Sort para ordenar um vetor de doubles
void insertionSort(std::vector<double>& arr) {
    int n = arr.size();
    for (int i = 1; i < n; ++i) {
        double key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            --j;
        }
        arr[j + 1] = key;
    }
}

int main() {
    // Insertion Sort para IDs de componentes
    std::vector<std::string> componentIDs = {"C123", "C789", "C234", "C567", "C011"};
    insertionSort(componentIDs);
    
    std::cout << "IDs de componentes ordenados: ";
    for (const std::string& id : componentIDs) {
        std::cout << id << " ";
    }
    std::cout << std::endl;
    
    // Insertion Sort modificado para pesos de produtos
    std::vector<std::string> productWeights = {"150g", "125g", "175g", "130g", "160g"};
    modifiedInsertionSort(productWeights);
    
    std::cout << "Pesos de produtos ordenados: ";
    for (const std::string& weight : productWeights) {
        std::cout << weight << " ";
    }
    std::cout << std::endl;
    
    // Insertion Sort para medições de poluentes
    std::vector<double> pollutionMeasurements = {2.5, 1.8, 3.0, 2.2, 2.8};
    insertionSort(pollutionMeasurements);
    
    std::cout << "Medições de poluentes ordenadas: ";
    for (double measurement : pollutionMeasurements) {
        std::cout << measurement << " ppm ";
    }
    std::cout << std::endl;
    
    return 0;
}
