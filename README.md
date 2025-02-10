# Lang Interpreter

Este projeto implementa um interpretador para a linguagem C utilizando ANTLR para análise léxica e sintática. O interpretador executa código escrito na linguagem definida no arquivo de gramática `Lang.g4`.

## 📌 Tecnologias Utilizadas

- **Java** - Linguagem principal do projeto
- **ANTLR 4** - Para análise léxica e sintática

## 📜 Estrutura do Projeto

O projeto é composto pelos seguintes arquivos principais:

- `Lang.g4` - Arquivo de gramática que define a linguagem
- `SemanticLangListener.java` - Responsável pela análise semântica do código
- `LangInterpreter.java` - Responsável por interpretar e executar o código
- `Main.java` - Ponto de entrada do programa, gerencia a execução
- `input.lang` - Arquivo de entrada contendo código-fonte na linguagem definida

## ⚙️ Como Executar

1. **Baixe e instale o ANTLR 4**, caso ainda não tenha:
     
2. **Execute o interpretador**:
   ```sh
   .\run.bat input.lang
   ```

O interpretador irá processar o arquivo `input.lang`, verificar erros sintáticos e semânticos, e então executar o código.

## 🚀 Exemplo de Código (`input.lang`)

```c
#include <stdio.h>
#define IHC 90;

struct aboba2{
    int y;
    float w;
};

union aboba3{
    int x;
    float h;
};

int main() {
    int x = 7;
    int z = 0;
    int a = x + z;
    char str;

    struct aboba2 bacate;
    bacate.y = 5;
    bacate.w = 5.1;
    
    union aboba3 bacate2;

    printf("Valor de Y na struct: %d", bacate.y);
    printf("Valor W: %f", bacate.w);

    scanf("%c", &str);

    printf("Print da variavel STR:")
    puts(str);
    /*printf("%c", str);*/
    
    // Ler valor em 'x'
    //scanf("%d", &x);

    // Imprimir variável e expressão
    printf("Valor da variavel 'a': %d", a); 


    scanf("%d", &z);
    //z = z * 10;
    printf("%d", z);

    printf("Hello, %d", x * 2); 

    // Condicional if/else
    if (x > 6) {
        printf("x not zero");
    } 
    else {
        printf("x is zero");
    }

    // Exemplo de 'for'
    for (x = 0; x <= 5; x++) { 
        printf("%d", x);
    }

    // Exemplo de 'while'
    while (x <= 10) {
        printf("%d", x);
        x++;
    }

    // Exemplo de 'switch'
    switch (z) {
        case 1:
            printf("Case 1");
            break;
        case 2:
            printf("Case 2");
            break;
        default:
            printf("Default");
            break;
    }

    return 0;
}
```

Saída esperada:
```
=== Execution Start ===

Valor de Y na struct: 5
Valor W: 5,100000
>A
Print da variavel STR:
A
Valor da variavel 'a': 7
>5
5
Hello, 14
x not zero
0
1
2
3
4
5
6
7
8
9
10
Default

=== Execution End ===
```

## 🛠 Exemplo de Funcionalidades Implementadas

* Suporte a variáveis e operadores aritméticos
* Controle de fluxo (`if`, `while`, `for`, `switch`)
* Estruturas como `structs` e `unions`
* Entrada e saída de dados (`scanf`, `printf`)
* Gerenciamento de funções e escopos
* Ponteiros e arrays

## ⚠️ Erros e Validações

O projeto contém verificações para erros comuns como:
* Uso de variáveis não declaradas
* Tipos incompatíveis em expressões
* Falta de função `main()`
* Estruturas não definidas antes do uso
