# Recursos Avaçados

## Classe Object e toString()

Todas as classes do Java são subclasses da classe Object e herdam os seguintes métodos:

* getClass: retorna o tipo de objeto
* equals: compara se dois objetos são iguais
* hashCode: retorna o código hash do objeto
* toString: converte o objeto para String

O método toString pode ser sobrescrito na classe criada para apresentar o conteudo necessário. Dentro de metodos de saida como `System.out.print()` se usarmos como parametro um objeto instanciado sem explicitar o método, automaticamente o Java chama o método toString. 

## Tipos de Referência x Tipos de Valor

### **Variáveis de tipo referência:** 

São variáveis em que seu tipo é uma classe. Essas váriaveis não armazenam valores, mas sim um endereço de memória, que aponta para um local na memoria chamado *heap* que armazena as informações de um objeto. Exemplo: Classe String.

Principais características:

- Usufrui recursos do POO
- Objetos precisam ser instanciados ou apontar para um objeto existente
- Aceita valor nulo
- Objetos não sao desalocados pelo garbage colector

**Valores Padrão:** Quando instanciamos uma classe ou array seu atributos recebem valores padrão que podem ser
- números(int, double, etc): 0
- boolean: false
- char: caractere 0
- objeto(String ou outra classe): null

**Null Pointer Exception:** Esse é um erro que aparece no Java quando tentamos usar metodos ou atributos de variáveis de tipo referência que estão com valor nulo ou que ainda não foram instanciados. Isto acontece pois a variável não possui o "ponteiro" que indica qual objeto acessar, então o Java lança uma exceção que pode interromper o programa. Na maioria dos casos, esse tipo de erro se deve a um problema na lógica do programa, então examine o código caso se depare com `NullPointerException`.

### **Váriaveis de tipo valor** 

São variáveis de tipos primitivos. Elas são "caixas" que realmente armazenam valores no campo de memória chamado stack. Exemplo: int, char, double, boolean.

Principais características: 

- São mais simples e performáticas
- Não precisam ser instanciadas, assim que declaradas podem ser usadas
- Não aceita valor nulo
- Variáveis são desalocadas imediatamente assim que o escopo é finalizado.

## Desalocação de Memória

**Garbage colector:** Processo que gerencia o uso da memória. Ele monitora o uso do heap e desaloca objetos que não possuem mais referência, ou seja, não possui mais variáveis do tipo rerencia apontando para seu endereço.

**Desalocação por escopo:** Processo que elimina as variáveis do tipo valor após o fim do escopo. Exemplo, váriavel declarada dentro de um if e que será eliminada após o fim do if.

## Boxing, Unboxing e Wrapper Classes

**Boxing:** Processo de conversão de um objeto do tipo valor(primitivo) para um tipo de referência compatível. Exemplo:

```
int x = 20;
Object obj = x;
```

**Unboxing:** Processo de conversão de um objeto de tipo referência para um objeto de tipo valor. Exemplo:

```
int x = 20;
Object obj = x;
int y = (int) obj;
```

**Wrapper Classes:** São classes equivalente aos tipos primitivos, e que permitem utilizar os benefícios da Orientação a Objetos. É normalmente usada em sistemas de informação, para compatibilizar o programa com os bancos de dados, visto que muitos campos dos BD aceitam valores nulos.

As wrapper classes do Java são: Boolean, Character, Byte, Short, Integer, Long, Float e Double.

**OBS**: As wrapper classes tem o mesmo nome dos tipos primitivos, mas para diferenciá-las, elas começam com a letra maiúscula.

## Data e Hora 

Objetos data-hora no Java são imutáveis. para realizar modificações é necessário criar um novo objeto.

Principais classes de Data e Hora (A partir do Java 8)

Data-Hora local:

- LocalDate: para Data
- LocalDateTime: Data e Hora

Data-Hora Global

- Instant: para pegar um instante no tempo.

Outros:

- Duration
- ZoneId
- ChronoUnit

## VARARGS (Variable Arguments)

Utilizamos o Varargs quando não sabemos quantos parâmetros serão passados para um método. Os argumentos devem ser do mesmo tipo e são tratados internamente como um array.

Para indicar que o parêmetro é um varargs deve-se colocar três pontos após a declaração do tipo. Exemplo de método que utiliza varargs:

```java
public void somaVarArgs(int... numeros){
        int soma = 0;

        for(int num : numeros){
            soma += num;
        }

        System.out.println(soma);
    }
```

Na chamada do método deve-se listar os argumentos normalmente, como se tivéssemos criando um array. Exemplo:

```java
Calculadora calculadora = new Calculadora();
calculadora.somaVarArgs(1,2,3,4,5);
```

**OBS:** Após declarar um varargs não é possivel adicionar mais nenhum parâmetro na assinatura do método. Então, caso seja necessário outros parâmetros, eles devem ser listados antes do varargs.

## Modificador `static`

São atributos ou métodos declarados com o modificador `static` e que não precisam ser instanciados dentro de um objeto para serem chamados, e são chamado na aplicação a partir do nome da classe. Por este motivo são também chamados de membros de classe.

Sao utilizadas normalmente em classes utilitarias, como a **classe Math**, e na declaração de constantes.

Uma classe também pode receber o modificador `static`, porém esse tipo de classe não pode ser instanciada.

**OBS:** Não é possível chamar um método que não possui o modificador estático dentro de um método estático, quando estão na mesma classe.

Um método ou atributo pode receber o modificador `static` para os casos que o seu resultado independe de um objeto especifico, como é no caso de constantes e calculos matemáticos.

## Modificador `final`

O modificador `final` é utilizado para criar constantes em Java. Assim como outros modificadores presentes na linguagem ele é declarado antes do tipo do atributo. Exemplo: `public final int VALOR = 250`.

Por convenção as constantes em Java são nomeadas sempre em UpperCase e se o nome for composto deve ser separado usando underline.

### Modificador final com atributos tipo valor(primitivos)

É muito comum usar constantes para armazenar valores de tipos primitivos em conjunto com o modificador `static`. Dessa forma, se torna mais simples utilizar valores constantes em outras partes do código sem necessariamente precisar instanciar um novo objeto.
Quando o atributo final é de um tipo primitivo, seu valor se torna imutável após ser atribuído. Qualquer tentativa de reatribuição causará erro de compilação.

Exemplo:

```java
public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
}

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
```

### Modificador final com atributos tipo referência

O modificador final permite também criar constantes de tipos referência. No entanto, devido as características desses tipos, o valor que será constante é a referência de memória daquele objeto. Em outras palavras, um atributo será criado e nele será armazenado a referência de memória ao objeto, mas por ter o modificador final essa referência não poderá ser alterada para indicar outro objeto.

Cabe ressaltar que apesar da referência se tornar fixa, o objeto pode ser manipulado normalmente. Ou seja, é possível modificar os atributos do objeto apontado pela referência, mas não é possível fazer a referência apontar para um novo objeto.

Exemplo:

```java
public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();
}

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
```

### Modificador final em Classes e Métodos

- O modificador final é utilizado em classes quando não é desejável que aquela classe seja herdada por outra. Exemplo: classe String do pacote java.lang que é uma classe final e não é possível estender ela para outra classe.
- O modificador final é utilizado em métodos quando não é desejável que esse método seja sobrescrito ao ser herdado.

### Modificador final em parâmetros e variáveis locais

Também é possível usar `final` em variáveis locais e parâmetros de métodos. Isso garante que o valor atribuído inicialmente não será modificado dentro do escopo do método.

```java
public void imprimirNomeFinal(final String nome) {
    System.out.println(nome);
    nome = "Outro nome"; // erro de compilação
}
```

## Bloco de Inicialização de Instância

É um bloco de código que será sempre executado quando objeto daquela classe é criado. Podem ser usados para iniciar variáveis de classe ou realizar configurações no objeto quando instanciado. Um bloco de inicialização tem acesso a todos os métodos e atributos da classe.

Os blocos de inicialização são definidos ao abrir e fechar chaves fora de qualquer método ou construtor. Exemplo:

```java
public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    } // este é o bloco de inicialização

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
```

Como podem ser usados:

- Quando a lógica de inicialização não  se encaixa bem em construtores.
- Quando a lógica de inicialização depende de condições específicas verificadas no tempo de excução.
- Quando é preciso configurar vários aspectos do objeto antes que qualquer outro código seja executado.

__*OBS:*__ Pode haver mais de um bloco de inicialização por classe e eles serão executados na ordem em que estão dispostos dentro dela.

## Ordem de execução de um objeto

Ao instanciar uma classe, a JVM segue uma ordem específica de execução, considerando os elementos definidos nas classes envolvidas (superclasse e subclasse). A sequência geral é a seguinte: 

1. O bloco de inicialização estático da superclasse é executado uma única vez, quando a JVM carrega a classe pai;

2. O bloco de inicialização estático da subclasse é executado uma única vez, quando a JVM carrega a classe filha;

3. É alocado espaço em memória para o objeto da subclasse (o espaço para a superclasse é incluído automaticamente como parte do objeto);

4. Cada atributo de superclasse é criado e inicializado com valores default ou valores definidos na declaração;

5. Os blocos de inicialização de instância da superclasse são executados, na ordem em que aparecem;

6. O construtor da superclasse é chamado;

7. Cada atributo de subclasse é criado e inicializado com valores default ou valores definidos na declaração;

8. Os blocos de inicialização de instância da subclasse são executados, na ordem em que aparecem;

9. O construtor da subclasse é chamado.