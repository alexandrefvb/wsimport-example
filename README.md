Exemplo de como utilizar o wsimport com o maven para gerar as classes de consumo de um webservice automaticamente.

Neste exemplo utilizei o wsdl de uma calculadora definido em:

http://www.html2xml.nl/Services/Calculator/Version1/Calculator.asmx?WSDL

A classe Teste.java possui um main que executa o código fonte gerado.

O plugin build-helper foi inculído para que o m2eclipse coloque as classes geradas pelo wsimport no classpath do eclipse.


