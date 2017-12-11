#language: pt
#Author: Ricardo Yamada
#Version: 1.0
#Encoding: iso-8859-1
Funcionalidade: Validar carrinho Zattini

  @zattini
  Esquema do Cenario: Validar carrinho Zattini
    Dado que abri o browser CRHOME
    E que acessei o site da Zattini
    Quando incluir os produtos ao carrinho no site da Zattini
      | Chave   | DiretorioMassa   |
      | <Chave> | <DiretorioMassa> |
    Entao validar os produtos incluidos no carrinho esta na tela de pagamento no site da Zattini

    Exemplos: 
      | Chave                   | DiretorioMassa                                              |
      | ComprasZattini_produtos | src/test/resources/massa/zattini/ValidaCarrinhoZattini.yaml |
