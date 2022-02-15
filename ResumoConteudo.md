# JavaPOO-CursoEmVideo


### Características trazidas ao código que implementa os conceitos de Orientação a Objetos

* Confiável;
* Oportuno;
* Manutenível;
* Extensível;
* Reutilizável;
* Natural.


# Classes

Nela são definidos os atributos e métodos que serão compartilhados por um objeto (ou por outras classes, como será visto em breve). O diagrama de classes da UML é apresentado da seguinte maneira:

![Exemplo Diagrama de Classes](https://i.imgur.com/dkgzMB3.png)

Vale salientar que:

Símbolo | Acesso | Significado
---|---|---
"+" | Público | Todas as classes terão acesso
"-" | Privado | Somente a classe atual terá acesso
"#" | Protegido | A classe mãe e as filhas terão acesso

# Objetos

Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas características, comportamentos ou estado atual. É a instância de uma classe.

* Possui atributos (também chamado de variável interna): o que sou?
* Possui métodos: o que faço?
* Possui estado: como estou?


# Métodos Acessores (getters) e Modificadores (setters)

* Getters: visam dar acesso para recuperar uma informação de um objeto;
* Setters: visam alterar uma informação de um objeto, geralmente é necessário passar um parâmetro.

Eles podem ser usados em métodos construtores.


# Pilares da Orientação a Objetos

* Abstração (nem todos os livros adotam abstração como um pilar);
* Encapsulamento;
* Herança;
* Polimorfismo.


## Abstração

* Consiste em separar apenas as características e ações que realmente sejam necessárias no contexto da aplicação.
Exemplo: No cadastro de clientes de um banco X qualquer, pouco interessa guardar informações como: altura do cliente, cor dos olhos etc.


## Encapsulamento

* Encapsular é ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior;
* Tornar os atributos privados ou protegidos, nunca públicos;
* Um objeto bem encapsulado possui uma interface bem definida.

__Interface é uma lista de serviços fornecidos por um componente, é a maneira que permite interagir com um objeto, definindo o que pode ser feito com um objeto dessa classe. Seus métodos serão sempre públicos.__

Vantagens em encapsular:

* Tornar mudanças mais fáceis, uma vez que a interface vai diminuir o impacto dessas modificações;
* Facilita a reutilização de código, pois mantém um padrão;
* Torna a aplicação mais robusta.

Uma interface é representada da seguinte maneira na UML:
![Interface UML](https://i.imgur.com/CT405WK.png)

***
Métodos Abstratos são aqueles que não são desenvolvidos na interface, mas são usados por ela.
***
Podemos relacionar duas classes utilizando a UML da seguinte maneira:
![Relacionamento entre classses](https://i.imgur.com/GeLur8p.png)


## Herança

* Permite criar uma nova classe a partir de características de uma classe previamente existente;
* Superclasse e subclasse (mãe e filha, respectivamente);
* Classes descendentes são aquelas que pertencem à uma "família" anterior, no entanto, __uma classe filha não é considerada descendente da sua classe mãe__;
* Classes ancestrais são similares às descendentes, só que o processo é inverso. __Uma classe mãe não pode ser ancestral de sua filha__;
* Especialização é o ato de percorrer uma árvore de classes de cima para baixo (raiz para folhas);  * Generalização é o ato de percorrer uma árvore de classes de baixo para cima (folhas para raiz).

***
Classe Abstrata: não pode ser instanciada (criar objetos), apenas servir como Superclasse.
***
Método Abstrato: só pode ser colocado dentro de uma interface ou classe abstrata - é declarado, mas não implementado na Superclasse.
***
Classe Final: não pode ser herdada por outra classe (tem que ser folha, não pode ter subclasses).
***
Método Final: não pode ser sobrescrito pelas suas subclasses.


## Polimorfismo
* De sobreposição (override): acontece quando substituimos um método de uma superclasse na sua subclasse, usando a mesma assinatura (assinaturas são iguais quando o método contém a mesma quantidade de parâmetros e os tipos são iguais);
* De sobrecarga: acontence quando criamos métodos com o mesmo nome, dentro de uma mesma classe, porém variando sua assinatura.
