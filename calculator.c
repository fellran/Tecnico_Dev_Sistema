#include <stdio.h>
struct dados
{
    char operacao;
    unsigned int num_operation;
    double num1, num2, result;

};

int main (void){
    struct dados  result;    

        printf("Digite o seu primeiro número: ");
        scanf("%lf", &result.num1);

        printf("Digite o segundo numero: ");
        scanf("%lf", &result.num2);

        printf("Qual operador matematico você deseja usar? (+,-,*,/): ");
        scanf(" %c", &result.operacao);
   
        switch (result.operacao)
        {
        case '+':
            result.result = result.num1 + result.num2;
            
            printf("O resultado de %.2f mais %.2f é: %.2f\n", result.num1, result.num2, result.result);
            break;

             case '-':
            result.result = result.num1 - result.num2;
            
            printf("O resultado de %.2f menos %.2f é: %.2f\n", result.num1, result.num2, result.result);
            break;

             case '*':
            result.result = result.num1 * result.num2;
            
            printf("O resultado de %.2f vezes %.2f é: %.2f\n", result.num1, result.num2, result.result);
            break;

             case '/':
            result.result = result.num1 / result.num2;
            
            printf("O resultado de %.2f dividido por %.2f é: %.2f\n", result.num1, result.num2, result.result);
            break;
        
        default:
            break;
        }
    }
