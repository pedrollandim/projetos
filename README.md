<h1>Spring boot<h1>

Para iniciar o projeto ele ficar lendo a pagina da fazenda basta abrir o link:

http://localhost:8080/

## Listagem dos dados

Para listar os dados salvos:

http://localhost:8080/StatusDosEstados

## Filtros

Os filtros são passados pelo link 

Filtro por data: 

http://localhost:8080/StatusDosEstados?page1&size=2&sort=dataEHora,desc

Filtro por estado:

http://localhost:8080/StatusDosEstados?page1&size=2&sort=autorizador,asc

Retorna o estado atual:

http://localhost:8080/StatusDosEstados?page1&size=20&sort=id,desc


## Resultados

Para exibir o resultado do total de alertas lidos na página da fazenda:

http://localhost:8080/contagem

## Banco de dados: H2

Para gerenciar o banco de dados basta abrir o link:

http://localhost:8080/h2-console

Para abrir o banco H2 o campo JDBC URL recebe:

jdbc:h2:mem:pedrolino-notas

<h1>Angular 10<h1>

Não iniciado
