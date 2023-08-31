/**
Selection Sort:**

Exercício 4:
Você é responsável por otimizar o agendamento de manutenção de máquinas em uma fábrica. Implemente o Selection Sort para ordenar uma lista de 
IDs de máquinas em ordem crescente de prioridade para manutenção. Ordenar os IDs: ["M567", "M123", "M789", "M234", "M011"]. Mostre o array após 
cada iteração de seleção e explique como essa ordenação pode contribuir para a eficiência da manutenção.

Exercício 5:
Em um sistema de controle de inventário de medicamentos, você precisa ordenar uma lista de medicamentos por data de vencimento. Modifique o 
Selection Sort para ordenar as datas a seguir: ["2023-06-15", "2023-08-25", "2023-07-10", "2023-09-30", "2023-08-05"]. Apresente o array após 
cada iteração e discuta como essa abordagem pode ajudar a evitar o desperdício de medicamentos vencidos.

Exercício 6:
Como parte de um projeto de automação de uma linha de produção, é necessário ordenar uma matriz de tempos de ciclo em diferentes etapas do 
processo. Implemente o Selection Sort para ordenar os tempos de ciclo por etapa: [10.2 s, 8.5 s, 12.1 s; 15.6 s, 9.8 s, 11.4 s; 7.2 s, 14.3 s, 13.0 s]. Apresente a 
matriz após cada iteração e discuta como essa ordenação pode ser crucial para o funcionamento coordenado da linha de produção.

*/

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

// Função de Selection Sort para ordenar um vetor de strings
void selectionSort(std::vector<std::string>& arr) {
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

// Função de Selection Sort para ordenar um vetor de strings de datas
void selectionSortDates(std::vector<std::string>& arr) {
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

// Função de Selection Sort para ordenar uma matriz de vetores de doubles
void selectionSortMatrix(std::vector<std::vector<double>>& matrix) {
    int n = matrix.size();
    for (int k = 0; k < n; ++k) {
        for (int i = 0; i < n - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < n; ++j) {
                if (matrix[j][k] < matrix[minIndex][k]) {
                    minIndex = j;
                }
            }
            std::swap(matrix[i][k], matrix[minIndex][k]);
        }
    }
}

int main() {
    // Selection Sort para IDs de máquinas
    std::vector<std::string> machineIDs = {"M567", "M123", "M789", "M234", "M011"};
    selectionSort(machineIDs);
    
    std::cout << "IDs de máquinas ordenados: ";
    for (const std::string& id : machineIDs) {
        std::cout << id << " ";
    }
    std::cout << std::endl;
    
    // Selection Sort para datas de vencimento
    std::vector<std::string> expirationDates = {
        "2023-06-15", "2023-08-25", "2023-07-10", "2023-09-30", "2023-08-05"
    };
    selectionSortDates(expirationDates);
    
    std::cout << "Datas de vencimento ordenadas: ";
    for (const std::string& date : expirationDates) {
        std::cout << date << " ";
    }
    std::cout << std::endl;
    
    // Selection Sort para matriz de tempos de ciclo
    std::vector<std::vector<double>> cycleTimes = {
        {10.2, 8.5, 12.1},
        {15.6, 9.8, 11.4},
        {7.2, 14.3, 13.0}
    };
    selectionSortMatrix(cycleTimes);
    
    std::cout << "Matriz de tempos de ciclo ordenada:" << std::endl;
    for (const auto& row : cycleTimes) {
        for (double time : row) {
            std::cout << time << " s ";
        }
        std::cout << std::endl;
    }
    
    return 0;
}
