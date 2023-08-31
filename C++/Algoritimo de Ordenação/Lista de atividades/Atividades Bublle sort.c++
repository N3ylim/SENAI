/*
Bubble Sort:**

**Exercício 1:**
Você é parte de uma equipe de desenvolvimento de um sistema de gerenciamento de produção industrial.
Recebeu a tarefa de implementar o algoritmo Bubble Sort em C++ para ordenar um conjunto de tempos de
produção (em minutos) de diferentes produtos. Os tempos de produção são: [23, 15, 7, 42, 11, 5].
Mostre o array após cada iteração do Bubble Sort e explique como o desempenho desse algoritmo pode afetar
a eficiência da linha de produção.

**Exercício 2:**
Em um projeto de simulação de tráfego urbano para uma cidade inteligente, é necessário ordenar uma lista
de velocidades de veículos (em km/h) capturados por sensores. Utilize o Bubble Sort para ordenar
as seguintes velocidades: [65, 80, 45, 55, 70, 50]. Ilustre o processo de ordenação e discuta como a escolha do
Bubble Sort pode influenciar o tempo de resposta do sistema de gerenciamento de tráfego.

**Exercício 3:**
Em um aplicativo de gerenciamento de tarefas para equipes industriais, os prazos de entrega de projetos precisam
ser ordenados. Implemente uma versão otimizada do Bubble Sort que pare a execução caso nenhuma troca seja realizada
em uma iteração. Ordenar os prazos a seguir: [2023-09-10, 2023-08-15, 2023-08-25, 2023-09-30, 2023-08-05].
Mostre o array final e discuta como essa otimização pode melhorar a experiência do usuário.

**Insertion Sort:**

**Exercício 1:**
Como parte de um sistema de rastreamento de ativos em um armazém industrial, você precisa ordenar uma lista de códigos de produtos.
Implemente o Insertion Sort em C++ para ordenar os seguintes códigos: ["P123", "P354", "P011", "P789", "P234"].
Ilustre cada inserção e discuta como essa ordenação pode beneficiar o controle de estoque em um ambiente de alta demanda.

**Exercício 2:**
Em um ambiente de manufatura, é necessário ordenar uma lista de números de série de produtos acabados para facilitar o processo de
empacotamento. Utilize o Insertion Sort para ordenar os números de série a seguir: ["SN456", "SN123", "SN789", "SN234", "SN567"].
Mostre o array após cada inserção e explique como esse método de ordenação pode ser eficiente para pequenos lotes de produtos.

**Exercício 3:**
Imagine um sistema de monitoramento de dispositivos em uma planta industrial. Desenvolva uma versão do Insertion
Sort que seja capaz de ordenar uma lista encadeada de leituras de temperatura. Ordenar as seguintes
leituras: [28.5°C, 23.8°C, 32.1°C, 26.7°C, 29.3°C]. Apresente a lista após cada inserção e discuta como essa abordagem pode auxiliar na
detecção de anomalias térmicas.

**Selection Sort:**

**Exercício 1:**
Você faz parte de uma equipe de análise de desempenho de equipamentos industriais. Precisa ordenar uma lista de
tempos de operação (em horas) para identificar os equipamentos mais e menos eficientes. Implemente o Selection Sort
para ordenar os tempos a seguir: [120, 90, 150, 80, 110]. Mostre o array após cada iteração
de seleção e discuta como essa ordenação pode ajudar a otimizar o uso dos recursos da fábrica.

**Exercício 2:**
Em um sistema de controle de qualidade, você precisa ordenar uma lista de resultados de testes em ordem crescente de qualidade.
Modifique o Selection Sort para que ele, a cada iteração, encontre o melhor e o pior resultado e os coloque nas extremidades do array.
Ordene os resultados: [Pass, Fail, Pass, Pass, Fail]. Mostre o array após cada troca e discuta como essa abordagem pode destacar
rapidamente os produtos com problemas de qualidade.

**Exercício 3:**
No contexto de análise de dados de produção, é necessário ordenar uma matriz de taxas de defeito em diferentes linhas de produção.
Implemente o Selection Sort para ordenar as taxas de defeito por linha: [0.02, 0.08, 0.04; 0.05, 0.12, 0.09; 0.03, 0.06, 0.07]. 
Apresente a matriz após cada iteração e explique como essa ordenação pode ser útil na identificação de problemas em linhas de produção específicas.

**Bubble Sort:**

**Exercício 4:**
Você é um programador em uma empresa de análise de dados para a indústria de energia. 
Precisa ordenar uma lista de leituras de consumo de energia (em kWh) para análise. 
Utilize o Bubble Sort para ordenar os seguintes valores: [230, 180, 150, 300, 210]. 
Mostre o array após cada iteração e discuta como essa ordenação pode auxiliar na detecção de padrões de consumo.

**Exercício 5:**
Em um sistema de monitoramento de temperatura para processos industriais, é necessário ordenar uma lista de 
leituras de temperatura em ordem crescente. Implemente o Bubble Sort para ordenar as temperaturas a 
seguir: [125°C, 110°C, 135°C, 120°C, 130°C]. Mostre o array após cada iteração e explique como essa ordenação 
pode contribuir para o controle de qualidade dos processos.

**Exercício 6:**
Você trabalha em uma empresa de logística que lida com entregas internacionais. Implemente uma versão otimizada 
do Bubble Sort para ordenar um array de datas de chegada de encomendas. 
Ordenar as datas: ["2023-09-10", "2023-08-15", "2023-08-25", "2023-09-30", "2023-08-05"]. Apresente o array final e 
discuta como essa otimização pode melhorar a eficiência na organização das entregas.

**Insertion Sort:**

**Exercício 4:**
Na indústria automotiva, a montagem de componentes requer precisão na sequência de etapas. Implemente o Insertion Sort 
para ordenar uma lista de IDs de componentes na ordem desejada para montagem. Ordenar os IDs: ["C123", "C789", "C234", "C567", "C011"]. Mostre o array 
após cada inserção e discuta como esse algoritmo pode ser aplicado para otimizar o processo de montagem.

**Exercício 5:**
Em um sistema de controle de qualidade de alimentos, é necessário ordenar uma lista de amostras de produtos por peso. Modifique o Insertion 
Sort para ordenar os pesos a seguir: [150g, 125g, 175g, 130g, 160g]. Mostre o array após cada inserção e explique como essa ordenação pode 
ser útil para garantir que os produtos estejam dentro das especificações.

**Exercício 6:**
Como parte de um projeto de pesquisa em ciências ambientais, você precisa ordenar uma lista de medições de poluentes (em ppm). Utilize o 
Insertion Sort para ordenar as seguintes medições: [2.5 ppm, 1.8 ppm, 3.0 ppm, 2.2 ppm, 2.8 ppm]. Ilustre o processo de ordenação e discuta como essa 
abordagem pode contribuir para a análise de qualidade do ar.

**Selection Sort:**

**Exercício 4:**
Você é responsável por otimizar o agendamento de manutenção de máquinas em uma fábrica. Implemente o Selection Sort para ordenar uma lista de 
IDs de máquinas em ordem crescente de prioridade para manutenção. Ordenar os IDs: ["M567", "M123", "M789", "M234", "M011"]. Mostre o array após 
cada iteração de seleção e explique como essa ordenação pode contribuir para a eficiência da manutenção.

**Exercício 5:**
Em um sistema de controle de inventário de medicamentos, você precisa ordenar uma lista de medicamentos por data de vencimento. Modifique o 
Selection Sort para ordenar as datas a seguir: ["2023-06-15", "2023-08-25", "2023-07-10", "2023-09-30", "2023-08-05"]. Apresente o array após 
cada iteração e discuta como essa abordagem pode ajudar a evitar o desperdício de medicamentos vencidos.

**Exercício 6:**
Como parte de um projeto de automação de uma linha de produção, é necessário ordenar uma matriz de tempos de ciclo em diferentes etapas do 
processo. Implemente o Selection Sort para ordenar os tempos de ciclo por etapa: [10.2 s, 8.5 s, 12.1 s; 15.6 s, 9.8 s, 11.4 s; 7.2 s, 14.3 s, 13.0 s]. Apresente a 
matriz após cada iteração e discuta como essa ordenação pode ser crucial para o funcionamento coordenado da linha de produção.

*/