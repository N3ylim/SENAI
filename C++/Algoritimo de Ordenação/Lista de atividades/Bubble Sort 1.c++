/**
Bubble Sort:

Exercício 1:
Você é parte de uma equipe de desenvolvimento de um sistema de gerenciamento de produção industrial.
Recebeu a tarefa de implementar o algoritmo Bubble Sort em C++ para ordenar um conjunto de tempos de
produção (em minutos) de diferentes produtos. Os tempos de produção são: [23, 15, 7, 42, 11, 5].
Mostre o array após cada iteração do Bubble Sort e explique como o desempenho desse algoritmo pode afetar
a eficiência da linha de produção.
*/

/*
O Bubble Sort é um algoritmo de ordenação simples que percorre repetidamente a lista a ser ordenada, compara 
elementos adjacentes e os troca se estiverem na ordem errada. O processo é 
repetido até que a lista esteja completamente ordenada.
*/

/**
Exercício 2:
Em um projeto de simulação de tráfego urbano para uma cidade inteligente, é necessário ordenar uma lista
de velocidades de veículos (em km/h) capturados por sensores. Utilize o Bubble Sort para ordenar
as seguintes velocidades: [65, 80, 45, 55, 70, 50]. Ilustre o processo de ordenação e discuta como a escolha do
Bubble Sort pode influenciar o tempo de resposta do sistema de gerenciamento de tráfego.
*/

/*
Iteração 1:
Comparação: 65 < 80 (Não é necessário trocar)
Comparação: 80 > 45 (Troca: [65, 45, 80, 55, 70, 50])
Comparação: 80 > 55 (Troca: [65, 45, 55, 80, 70, 50])
Comparação: 80 > 70 (Troca: [65, 45, 55, 70, 80, 50])
Comparação: 80 > 50 (Troca: [65, 45, 55, 70, 50, 80])
Iteração 2:
Comparação: 65 < 45 (Troca: [45, 65, 55, 70, 50, 80])
Comparação: 65 < 55 (Troca: [45, 55, 65, 70, 50, 80])
Comparação: 70 > 50 (Troca: [45, 55, 65, 50, 70, 80])
Comparação: 70 < 80 (Não é necessário trocar)
Iteração 3:
Comparação: 45 < 55 (Não é necessário trocar)
Comparação: 55 < 65 (Não é necessário trocar)
Comparação: 65 < 50 (Troca: [45, 55, 50, 65, 70, 80])
Iteração 4:
Comparação: 45 < 55 (Não é necessário trocar)
Comparação: 55 < 50 (Troca: [45, 50, 55, 65, 70, 80])
Iteração 5:
Comparação: 45 < 50 (Não é necessário trocar)
Comparação: 50 < 55 (Não é necessário trocar)
*/

/**
Exercício 3:
Em um aplicativo de gerenciamento de tarefas para equipes industriais, os prazos de entrega de projetos precisam
ser ordenados. Implemente uma versão otimizada do Bubble Sort que pare a execução caso nenhuma troca seja realizada
em uma iteração. Ordenar os prazos a seguir: [2023-09-10, 2023-08-15, 2023-08-25, 2023-09-30, 2023-08-05].
Mostre o array final e discuta como essa otimização pode melhorar a experiência do usuário.
*/

/*
A otimização do Bubble Sort pode melhorar significativamente a experiência do usuário, especialmente ao lidar com 
conjuntos de dados maiores. No contexto de um aplicativo de gerenciamento de tarefas, onde os prazos de entrega 
estão sendo ordenados, essa otimização pode economizar tempo de processamento.
*/


#include <iostream>
#include <vector>

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
    // Bubble Sort para tempos de produção
    std::vector<int> productionTimes = {23, 15, 7, 42, 11, 5};
    bubbleSort(productionTimes);
    
    std::cout << "Tempos de produção ordenados: ";
    for (int time : productionTimes) {
        std::cout << time << " ";
    }
    std::cout << std::endl;
    
    // Bubble Sort otimizado para velocidades de veículos
    std::vector<int> speeds = {65, 80, 45, 55, 70, 50};
    bubbleSort(speeds);
    
    std::cout << "Velocidades ordenadas: ";
    for (int speed : speeds) {
        std::cout << speed << " ";
    }
    std::cout << std::endl;
    
    // Bubble Sort otimizado para prazos de entrega
    std::vector<std::string> deadlines = {
        "2023-09-10", "2023-08-15", "2023-08-25", "2023-09-30", "2023-08-05"
    };
    optimizedBubbleSort(deadlines);
    
    std::cout << "Prazos ordenados: ";
    for (const std::string& deadline : deadlines) {
        std::cout << deadline << " ";
    }
    std::cout << std::endl;
    
    return 0;
}
