### Semana 1 - Dia 25/05/2022 - Aulas 001a004 - Atividade Supervisionada
# API REST

API REST é uma interface de programação de aplicações. API (Application Programming Interface) é um conjunto de padrões, rotinas que permitem que aplicações possam utilizar funcionalidades que ela oferece, sem precisar conhecer todos os detalhes de como foi implementado.  Já a parte REST (Representational State Transfer) é um conjunto de restrições, possui um estilo de arquitetura com implementação de recursos rápido, prático e acessível.

API REST é utilizada na comunicação entre aplicações de forma rápida e segura. Para ser considerada uma API REST é preciso atender algumas especificações:
- Arquitetura cliente/servidor, separando as responsabilidades de cada tipo.
- Comunicação stateless, ou seja, ocorre de forma isolada, sem armazenamento do cliente, entre cliente e servidor;
- Armazenar dados em cache para otimizar as interações entre cliente e servidor;
- Interface uniforme para que as informações sejam transferidas em um formato padronizado;
- Sistema em camadas que organiza os tipos de forma independente.
	
Atendendendo esses critérios ela pode ser classificada em 3 tipos: 
**Privadas ou Locais:** aplicações internas de uma empresa, geralmente usada para ter acesso a dados mais sigilosos;
**Parceiras ou baseadas em programa:** modelo restritivo, geralmente usado para integração de softwares;
**Públicas ou baseadas em web:** esse modelo pode ser acessado por quase todas as aplicações de software, sendo necessário um pedido de requisição HTTP GET, muito utilizado em testes de acesso e validação.
Utilizar API REST possui vantagens como a separação entre cliente/servidor, confiabilidade e segurança na aplicação, multiplataforma, as requisições http retornam dados JSON, que é o formato mais utilizado e também no formato XML. Ainda deve ser levado em consideração que essas API utilizam 2 endpoints: HTTP GET e HTTP POST, e trabalham de forma assíncrona, o que permite o aumento de solicitações e pode comprometer o desempenho das aplicações.

###### Referências

NOLETO, Cairo.  API REST: o que é e como montar umas API sem complicação?. Trybe 2022. Disponível em: (https://blog.betrybe.com/desenvolvimento-web/api-rest-tudo-sobre/)
Acessado: 27 de maio de 2022

PIRES, Jackson. O que é API? REST e RESTful? Conheça as definições e diferenças!. Becode, 2017. Disponível em:  (https://becode.com.br/o-que-e-api-rest-e-restful/)
Acessado: 27 de maio de 2022

API REST. Red Hat, 2020. Disponível em: 
(https://www.redhat.com/pt-br/topics/api/what-is-a-rest-api)
Acessado: 27 de maio de 2022


