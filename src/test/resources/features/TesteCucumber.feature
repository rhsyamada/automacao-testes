#language: pt
#Author: Ricardo Yamada
#Version: 1.0
#Encoding: iso-8859-1
Funcionalidade: Validar carrinho

  Esquema do Cenario: Validar carrinho Zattini
    Dado que abri o browser CRHOME
    E que acessei o site da Zattini
    Quando incluir os produtos ao carrinho no site da Zattini
      | Produto    |
      | <Produto1> |
      | <Produto2> |
    Entao validar os produtos incluidos no carrinho esta na tela de pagamento no site da Zattini

    Exemplos: 
      | Produto1 | Produto2 |
      | Sapato   | Meia     |
