# GeniusApi

Para a resolução do problema, foi usado API REST com SpringBoot.

Para a busca das 10 musicas de um determinado artista, foi utilizado a API Genius, onde é mandada uma requisição http passando o nome do artista, quantidade de músicas e o token de acesso.

Foi usado um converson JSON para a manipulação de informações.

O retorno é gerado pela busca: http://localhost:8080/api/artist/{nome do artista}.