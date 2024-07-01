# BOOTCAMP Oferecido Pela DIO Com Parceria Com A GFT 
 - Trazendo quais os problemas que tive e avanços no aprendizado com esse bootcamp

# Novos Aprendizados Bootcamp

## Desafio de Código NUMERO DA CONTA

### Quando quero usar validação como em numero de conta, em vez de fazer números e prever possíveis erros, inseri-los como string e em seguida convertê-los para int
>>> 
// Método para validar o número da conta bancária
    public static void validarNumeroConta(int numeroConta) {
        String numeroContaStr = String.valueOf(numeroConta);
        if (numeroContaStr.length() != 8 || !numeroContaStr.matches("\\d+")) {
            throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
<<<
Teria que lidar com a perda de zeros à esquerda, pois esta recebendo int

### _matches("\\d+")_ - usado nessa conversão, o que facilita muito
	Verificar se a string corresponde a um padrão específico

	Porem quando consultado para o chatGPT, me retornou que ele não valida a quantidade de números, mas só se ele contem só números, uma parte ja resolve, mas o restante não, dessa forma, fazer dessa forma...
>>>
public static void validarNumeroConta(String numeroConta) {
        // Verifica se o número da conta tem exatamente 8 dígitos
        if (!numeroConta.matches("\\d{8}")) {
            throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }
<<<


### Criar objetos quando tratar um erro, esses objetos podem ser chamados pois são "staticos"
	Esses objetos contem o IlllegalArgumentException, onde ele vai tratar o problema em vez de considerar um erro e encerrar a aplicação

### IllegalArgumentException
	Aprendi sobre o IllegalArgumentException e como ele funciona +-, para "ficar craque" precisa de mais erro e repetição... Mas pude compreender sobre ele e que existem vários, cada um para sua propria situação
	No entanto, nesse caso, ele foi necessário para tratar o erro de não conter os 8 dígitos e não ser todos numéricos

> e.getMessage() não define a mensagem da exceção, ele apenas retorna a mensagem definida quando a exceção foi lançada.
>Para definir a mensagem, você deve fornecê-la quando lançar a exceção (throw new IllegalArgumentException("Sua mensagem aqui");).
>Existem muitos tipos de exceções, e você pode capturá-las usando múltiplos catch blocks, cada um lidando com um tipo específico de exceção.

### Loop FOR
Ainda tenho muita dificuldade com esse loop, mas nesses exercícios, pude enxergar com mais clareza o loop
> Na questão do limite de saques!


