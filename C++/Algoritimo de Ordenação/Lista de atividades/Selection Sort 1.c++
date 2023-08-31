/**
Selection Sort:

Exercício 1:
Você faz parte de uma equipe de análise de desempenho de equipamentos industriais. Precisa ordenar uma lista de
tempos de operação (em horas) para identificar os equipamentos mais e menos eficientes. Implemente o Selection Sort
para ordenar os tempos a seguir: [120, 90, 150, 80, 110]. Mostre o array após cada iteração
de seleção e discuta como essa ordenação pode ajudar a otimizar o uso dos recursos da fábrica.

Exercício 2:
Em um sistema de controle de qualidade, você precisa ordenar uma lista de resultados de testes em ordem crescente de qualidade.
Modifique o Selection Sort para que ele, a cada iteração, encontre o melhor e o pior resultado e os coloque nas extremidades do array.
Ordene os resultados: [Pass, Fail, Pass, Pass, Fail]. Mostre o array após cada troca e discuta como essa abordagem pode destacar
rapidamente os produtos com problemas de qualidade.

Exercício 3:
No contexto de análise de dados de produção, é necessário ordenar uma matriz de taxas de defeito em diferentes linhas de produção.
Implemente o Selection Sort para ordenar as taxas de defeito por linha: [0.02, 0.08, 0.04; 0.05, 0.12, 0.09; 0.03, 0.06, 0.07]. 
Apresente a matriz após cada iteração e explique como essa ordenação pode ser útil na identificação de problemas em linhas de produção específicas.
*/

#include <iostream>
#include <vector>
#include <algorithm>

// Função de Selection Sort para ordenar um vetor de inteiros
void selectionSort(std::vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n - 1; ++i) {
        int minIndex = i;
        for (int j = i + 1; j < n; ++j) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        std::swap(arr[i], arr[minIndex]);
    }
}

// Função de Selection Sort para ordenar um vetor de doubles
void selectionSort(std::vector<double>& arr) {
    int n = arr.size();
    for (int i = 0; i < n - 1; ++i) {
        int minIndex = i;
        for (int j = i + 1; j < n; ++j) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        std::swap(arr[i], arr[minIndex]);
    }
}

// Função de Selection Sort modificada para encontrar o melhor e pior resultado
void modifiedSelectionSort(std::vector<std::string>& arr) {
    int n = arr.size();
    for (int i = 0; i < n / 2; ++i) {
        auto minmax = std::minmax_element(arr.begin() + i, arr.end() - i);
        int minIndex = minmax.first - arr.begin();
        int maxIndex = minmax.second - arr.begin();
        
        std::swap(arr[i], arr[minIndex]);
        if (i == maxIndex) {
            maxIndex = minIndex;
        }
        std::swap(arr[n - i - 1], arr[maxIndex]);
    }
}

int main() {
    // Selection Sort para tempos de operação
    std::vector<int> operationTimes = {120, 90, 150, 80, 110};
    selectionSort(operationTimes);
    
    std::cout << "Tempos de operação ordenados: ";
    for (int time : operationTimes) {
        std::cout << time << " ";
    }
    std::cout << std::endl;
    
    // Selection Sort modificado para resultados de testes
    std::vector<std::string> testResults = {"Pass", "Fail", "Pass", "Pass", "Fail"};
    modifiedSelectionSort(testResults);
    
    std::cout << "Resultados de testes ordenados: ";
    for (const std::string& result : testResults) {
        std::cout << result << " ";
    }
    std::cout << std::endl;
    
    // Selection Sort para matriz de taxas de defeito
    std::vector<std::vector<double>> defectRates = {
        {0.02, 0.08, 0.04},
        {0.05, 0.12, 0.09},
        {0.03, 0.06, 0.07}
    };
    
    for (auto& row : defectRates) {
        selectionSort(row);
    }
    
    std::cout << "Matriz de taxas de defeito ordenada:" << std::endl;
    for (const auto& row : defectRates) {
        for (double rate : row) {
            std::cout << rate << " ";
        }
        std::cout << std::endl;
    }
    
    return 0;
}
