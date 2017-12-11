#language: pt
#Author: Ricardo Yamada
#Version: 1.0
#Encoding: iso-8859-1
Funcionalidade: Validar carrinho Netshoes Argentina

  @netshoesArgentina
  Esquema do Cenario: Validar carrinho Netshoes Argentina
    Dado que abri o browser CRHOME
    E que acessei o site da Netshoes Argentina
    Quando incluir os produtos ao carrinho no site da Netshoes Argentina
      | Chave   | DiretorioMassa   |
      | <Chave> | <DiretorioMassa> |
    Entao validar os produtos incluidos no carrinho esta na tela de pagamento no site da Netshoes Argentina

    Exemplos: 
      | Chave                      | DiretorioMassa                                                                   |
      | ComprasNetshoesArgentina_produtos | src/test/resources/massa/netshoes/argentina/ValidaCarrinhoNetshoesArgentina.yaml |
