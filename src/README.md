# Desafio DIO - Componente iPhone (POO em Java)

Este é um projeto simples que representa a modelagem e implementação de um componente iPhone utilizando Java e conceitos de POO para aprendizado, baseado no vídeo de lançamento do iPhone (2007).

## Funcionalidades

- 🎵 Reprodutor Musical (`ReprodutorMusical`)
- 📞 Aparelho Telefônico (`AparelhoTelefonico`)
- 🌐 Navegador na Internet (`NavegadorInternet`)

## Diagrama UML (Mermaid)

```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Iphone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet


