### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?
**git --version**
2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help **Mostra os principais comandos do git**
  b. git help checkout **Apresenta o manual do git checkout**
  c. git help merge **Explica como utilizar o merge**
  d. git init **Inicializa ou cria um repositório**
  e. git add --all **Adiciona todos os arquivos para serem comitados para o repositório**
  f. git add -u **Adiciona apenas os arquivos editados para serem comitados**
  g. git config -l **Mostra as configurações feitas no git**
  h. git mv a.txt b.txt **Muda o nome do arquivo a.txt para b.txt**
  i. git reset --hard **Apaga todas as alterações sem commit**
  j. git log -27 **Lista os ultimos 27 commits**
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
**git add -all e git commit**
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”? **git diff**
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando? **git status**
6. Qual o comando para efetuar um _commit_? **git commit**
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo? **git restore teste.txt.**
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**. **Basta adicionar o nome do diretório no .gitignore.**
9. O que acontece se o seu repositório local for acidentalmente removido? **Se o repositório estiver disponível em alguma plataforma podemos clonar o repositório, caso não esteja será perdido todo o repositório.**
10. Como clonar um repositório remoto? **git clone <url do repositorio>**
11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado? **git log --pretty=oneline**
12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário? **No arquivo .gitconfig**
13. Qual o comando para criar um repositório local? **git init**
14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**? **.git**
15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?) **git add -u**
16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1? **Por questões de segurança e para a indeficação de alterações nos arquivos. O SHA1 é um tipo de criptografia que utiliza o método hash**
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente? **HEAD**
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_? **Não**
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**

**git reset --soft HEAD~1: muda HEAD para o commit determinado e todos os arquivos modificados vão ficar em estado de serem comitados. git reset --hard: descarta todos as mudanças já feitas.**
20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_? **git clean -fd.**
21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados? **.gitignore**
22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder? **Adiciona no .gitgnore: *.class**
23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**? **Mostra quantos commits foram feitos e quem já fez de forma descrescente**
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**? **Mostra o endereço do repositório remoto**
26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado? **git tag**
27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0? **git tag -l "2.0"**
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**? **Cria uma tag com o nome de 3.4-gold com a "descrição minha versão ouro"**
29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**? **Mostra os dados da tag**
30. O que o comando **git push origin 3.4-gold** teria como efeito? **Tanto no repositório local quanto no remoto serão atualizados para o "3.4-gold"**
31. Após executar um commit, qual o efeito de **git commit --amend**? **Adiona as ultimas alterações no último commit**
32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**? **Primeiro adiciona o arquivo, depois tudo que foi feito no arquivo não será comitado**
33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**? **Nenhum, já foi feito o commit**
34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**? **"git reset HEAD a.txt" reseta o arquivo para o HEAD e "git checkout -- a.txt" restaura o arquivo**
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado. 
