/**
Bubble Sort:

Exercício 4:
Você é um programador em uma empresa de análise de dados para a indústria de energia. 
Precisa ordenar uma lista de leituras de consumo de energia (em kWh) para análise. 
Utilize o Bubble Sort para ordenar os seguintes valores: [230, 180, 150, 300, 210]. 
Mostre o array após cada iteração e discuta como essa ordenação pode auxiliar na detecção de padrões de consumo.

Exercício 5:
Em um sistema de monitoramento de temperatura para processos industriais, é necessário ordenar uma lista de 
leituras de temperatura em ordem crescente. Implemente o Bubble Sort para ordenar as temperaturas a 
seguir: [125°C, 110°C, 135°C, 120°C, 130°C]. Mostre o array após cada iteração e explique como essa ordenação 
pode contribuir para o controle de qualidade dos processos.

Exercício 6:
Você trabalha em uma empresa de logística que lida com entregas internacionais. Implemente uma versão otimizada 
do Bubble Sort para ordenar um array de datas de chegada de encomendas. 
Ordenar as datas: ["2023-09-10", "2023-08-15", "2023-08-25", "2023-09-30", "2023-08-05"]. Apresente o array final e 
discuta como essa otimização pode melhorar a eficiência na organização das entregas.
*/

#include <iostream>
#include <vector>
#include <string>

// Função de Bubble Sort para ordenar um vetor de inteiros
void bubbleSort(std::vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n - 1; ++i) {
        for (int j = 0; j < n - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                std::swap(arr[j], arr[j + 1]);
            }
        }
    }
}

// Função de Bubble Sort para ordenar um vetor de strings
void bubbleSort(std::vector<std::string>& arr) {
    int n = arr.size();
    for (int i = 0; i < n - 1; ++i) {
        for (int j = 0; j < n - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                std::swap(arr[j], arr[j + 1]);
            }
        }
    }
}

// Função de Bubble Sort otimizada para ordenar um vetor de strings
void optimizedBubbleSort(std::vector<std::string>& arr) {
    int n = arr.size();
    bool swapped;
    
    for (int i = 0; i < n - 1; ++i) {
        swapped = false;
        
        for (int j = 0; j < n - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                std::swap(arr[j], arr[j + 1]);
                swapped = true;
            }
        }
        
        if (!swapped) {
            break;
        }
    }
}

int main() {
    // Bubble Sort para leituras de consumo de energia
    std::vector<int> energyReadings = {230, 180, 150, 300, 210};
    bubbleSort(energyReadings);
    
    std::cout << "Leituras de consumo de energia ordenadas: ";
    for (int reading : energyReadings) {
        std::cout << reading << " kWh ";
    }
    std::cout << std::endl;
    
    // Bubble Sort para leituras de temperatura
    std::vector<int> temperatureReadings = {125, 110, 135, 120, 130};
    bubbleSort(temperatureReadings);
    
    std::cout << "Leituras de temperatura ordenadas: ";
    for (int temp : temperatureReadings) {
        std::cout << temp << "°C ";
    }
    std::cout << std::endl;
    
    // Bubble Sort otimizado para datas de chegada de encomendas
    std::vector<std::string> arrivalDates = {
        "2023-09-10", "2023-08-15", "2023-08-25", "2023-09-30", "2023-08-05"
    };
    optimizedBubbleSort(arrivalDates);
    
    std::cout << "Datas de chegada de encomendas ordenadas: ";
    for (const std::string& date : arrivalDates) {
        std::cout << date << " ";
    }
    std::cout << std::endl;
    
    return 0;
}
