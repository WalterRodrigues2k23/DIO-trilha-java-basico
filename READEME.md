# 💻Desafio Orientação a Objetos e UML: Diagramação de Classes do iPhone - Bootcamp Santander & DIO 2023 (Backend com Java)
www.dio.me
#### Solucionador
[Walter Rodrigues](https://github.com/WalterRodrigues2k23)

## Desafio

Criar um modelo de Iphone com base no primeiro lançamento no ano 2007.
Fazer a diagramação UML e lançar as classes conforme proposto pelo professor.

###### Comportamentos esperados:
* Repodutor Musicial (Ipod): tocar, pausar, selecionarMusica;
* Aparelho Telefônico (Telefone): ligar, atender, iniciarCorrerioVoz;
* Navegador na Internet (Navegador): exibirPagina, adicionarNovaAba, atualizarPagina;
* Serviço de SMS (SMS): enviarSMS, receberSMS;
* Fotos (Fotos): camera, bibliotecaFotos;

##

### Diagrama do Iphone

```mermaid
classDiagrama
    class IControleVolume {
        + aumentarVolume()
        + diminuirVolume()
        + getVolume(): int
        + setVolume(novoVolume: int)
    }
    
    class Ipod {
        + selecionarMidia(midia)
        + reproduzirMidia()
        + pausarMidia()
    }
    
    class Navegador {
        + exibirPagina()
        + adicionarNovaAba()
        + atualizarPagina()
    }
    
    class Iphone {
        + efetuarLigacao()
        + atenderLigacao()
        + iniciarCorreioDeVoz()
    }
    
    class ControleVolume {
        -volume: int
        + ControleDeVolumeImpl()
        + aumentarVolume()
        + diminuirVolume()
        +getVolume(): int
        +  setVolume(novoVolume: int)
    }
    
    class NewIphone {
        - controleVolume: ControleVolume
        + aumentarVolume()
        + diminuirVolume()
        + getVolume(): int
        + setVolume(novoVolume: int)
        + selecionarMidia(midia)
        + reproduzirMidia()
        + pausarMidia()
        + exibirPagina()
        + adicionarNovaAba()
        + atualizarPagina()
        + efetuarLigacao()
        + atenderLigacao()
        + iniciarCorreioDeVoz()
        + camera()
        + bibliotecaFotos()
        + receberSMS()
        + enviarSMS()
    }
    
    IControleVolume <|-- ControleVolume
    Ipod <|-- NewIphone
    Navegador <|-- NewIphone
    Iphone <|-- NewIphone
    Fotos <|-- NewIphone
    SMS <|-- NewIphone
    NewIphone --> ControleVolume : possui