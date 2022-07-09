# Tarefa 011 - Padrões de Codificação (Leiaute e estilo), Reflexão e Programação defensiva - 08/07/2022

## Padrões de Codificação

Padrão de codificação é uma forma de definir boas práticas de como desenvolver software de forma mais colaborativa. É recomendável que esse padrão seja definido em consenso com membros da equipe, para efetivamente ter adoção desse padrão.  
A importância de se ter padrões de codificação definidos contribui na produtividade, comunicação entre a equipe, já que será mais fácil entender o que foi escrito. Algumas formas de padronização são: padrão de nomenclatura, organização de arquivos, padrões para comentários, espaço em branco.  
Um exemplo de padrão de codificação é definir uma variável por linha, com um nome apropriado  e fazer um comentário em uma única linha já indicando para o que será usada:
``` C
int contador = 0; // contador para número de referências 
```

## Reflexão
Reflexão é um mecanismo (API) que permite um processo de recursos introspectivos, capaz de examinar, introspectar e modificar a própria estrutura e comportamento, tudo isso em tempo de execução. Muito utilizado para obter atributos públicos de um objeto,criar bibliotecas genéricas para lidar com diferentes formatos sem reimplantação, criar funcionalidades mais dinâmicas, ter capacidade de alterar o valor de um campo marcado como privado em uma biblioteca de terceiros, dentre outros.
Um exemplo de reflexão pode ser feito em teste de unidades permitindo que métodos protegidos ou privados tenham visibilidade pública nesses testes.
``` PHP
classe Teste {
 
    protected int $Value ;
 
    public  function __construct ( int $Value )  { 
        $this  ->  Valor  =  $Value ; 
    }
 
     função protegida computeValue ( )  : int { 
        return  ( $this  ->  Value  *  2 ) ; 
    }
 
}
 
/**
 * Sem Reflexão
 */
 
$t  =  novo Teste ( 10 ) ;
 
// Erro - o método não é acessível publicamente 
assert ( $t  ->  computeValue ( )  ===  20 ) ;
 
/**
 * Usando Reflexão
 */
 
$reflectionMethod  =  new ReflectionMethod ( Test :: CLASS ,  "computeValue" ) ; 
$reflectionMethod  ->  setAccessible ( true ) ;
 
$t  =  novo Teste ( 10 ) ;
 
// Isso agora funciona! 
assert ( $reflectionMethod  ->  invocar ( $t )  ===  20 ) ;
```

## Programação Defensiva

Programação defensiva é a prática de desenvolver software tratando os possíveis erros antes que eles apareçam, ou seja, prevenindo falhas. Tentar tratar todos os possíveis cenários de um método(ações possíveis do usuário), garantir que o fluxo esperado seja feito, irá permitir a estabilidade e segurança do produto. Salvar dados inconsistentes, aceitar valores inválidos podem afetar de forma negativa.

Um exemplo de programação defensiva é verificar a permissão de acesso de um usuário para determinadas funcionalidades, caso seja _null_,  é retornado false sem verificar permissões, evitando uma _NullReferenceException_:
``` C#
public bool CheckIfAdministrator(long userId) {
    var user = User.LoadById(userId);
    
    if (user == null)
        return false;
        
    return (user.Role == UserRoles.Administrator);
}
```
## Referencias
[cinUFPE](https://www.cin.ufpe.br/~rls2/processo_tg/Metodologia%20S&B/guidances/concepts/coding_standard_C98B0B0.html)  
[Micreiros](https://micreiros.com/padroes-de-codificacao-no-desenvolvimento-de-sistemas/)  
[Howtogeek](https://www.howtogeek.com/devops/what-is-reflection-in-programming/)  
[Oque-e.com](https://oque-e.com/o-que-e-programacao-defensiva/)  
[Mediaum](https://medium.com/mindminerstechblog/protegendo-seu-c%C3%B3digo-dos-usu%C3%A1rios-e-de-voc%C3%AA-mesmo-com-programa%C3%A7%C3%A3o-defensiva-e-ofensiva-8b7218a8b975)
