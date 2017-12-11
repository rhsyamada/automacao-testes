#language: pt
#Author: Ricardo Yamada
#Version: 1.0
#Encoding: iso-8859-1
Funcionalidade: Validar carrinho Shoestock

  @shoestock
  Esquema do Cenario: Validar carrinho Shoestock
    Dado que abri o browser CRHOME
    E que acessei o site da Shoestock
    Quando incluir os produtos ao carrinho no site da Shoestock
      | Chave   | DiretorioMassa   |
      | <Chave> | <DiretorioMassa> |
    Entao validar os produtos incluidos no carrinho esta na tela de pagamento no site da Shoestock

    Exemplos: 
      | Chave                     | DiretorioMassa                                                  |
      | ComprasShoestock_produtos | src/test/resources/massa/shoestock/ValidaCarrinhoShoestock.yaml |
