# GeniusApi

Para a resolu��o do problema, foi usado API REST com SpringBoot.

Para a busca das 10 musicas de um determinado artista, foi utilizado a API Genius, onde � mandada uma requisi��o http passando o nome do artista, quantidade de m�sicas e o token de acesso.

Foi usado um converson JSON para a manipula��o de informa��es.

O retorno � gerado pela busca: http://localhost:8080/api/artist/{nome do artista}.