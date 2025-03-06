## Desafio do projeto DIO 

#### **DIO - Trilha Java Básico**

www.dio.me

**Autores**
- [Gleyson Sampaio](https://github.com/glysns)

**POO - Desafio**

#### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto

Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento do Iphone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes: 00:15 até 00:55

#### Funcionalidades a Modelar
1. Reprodutor Musical
- Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. Aparelho Telefônico
- Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. Navegador na Internet
- Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

#### Objetivo

1. Criar um diagrama UML que represente as funcionalidades descritas acima.
Implementar as classes e interfaces correspondentes em Java (Opcional).

2. Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

### Exemplo de Diagrama UML (Mermaid)

```mermaid
---
title: Modelagem Iphone
---
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
		+selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
		+atender()
		+iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
		+adicionarNovaAba()
		+atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
#### Instruções

1. Assista ao vídeo do lançamento do iPhone para entender as funcionalidades principais.
2. Utilize uma ferramenta UML de sua preferência para criar o diagrama das classes e interfaces. Você pode utilizar o modelo acima (criado na sintaxe Mermaid), uma alternativa open-source e compatível com arquivos Markdown como este.
3. Opcionalmente, caso esteja cheio(a) de confiança, pode implementar as classes Java representadas em seu diagrama UML.
4. Submeta seu repositório GitHub conforme as orientações da plataforma DIO. Por exemplo:

>https://github.com/glysns/trilha-java-basico/desafios/poo/README.md
