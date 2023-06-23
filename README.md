# Consultas-Java

<h2>
  Este é um código Java que implementa um gerenciador de consultas médicas. A classe principal é chamada GerenciadorConsultas e possui métodos para cadastrar e listar consultas. A classe Consultas é usada para representar uma consulta individual.

  Principais recursos do código:

 • A classe GerenciadorConsultas possui um construtor que inicializa uma lista vazia de consultas usando a classe ArrayList.
 <hr>
 • O método cadastarConsulta é usado para adicionar uma nova consulta à lista de consultas. Ele recebe os parâmetros do paciente, médico e data da consulta e cria um novo objeto Consultas com essas informações, que é então adicionado à lista.
  <hr>
 • O método listarConsulta verifica se a lista de consultas está vazia e exibe uma mensagem apropriada. Caso contrário, ele percorre a lista de consultas usando um loop for-each e exibe cada consulta usando o método toString da classe Consultas.
  <hr>

 • O método main é usado para testar o código. Ele cria um objeto GerenciadorConsultas, adiciona uma consulta de exemplo e, em seguida, chama o método listarConsulta para exibir todas as consultas cadastradas.
 <hr>

 • A classe Consultas possui três variáveis de instância para armazenar informações sobre uma consulta: paciente, médico e data. Ela possui um construtor que inicializa essas variáveis e um método toString que retorna uma representação textual da consulta.
<h3>
Esse código pode ser usado como base para desenvolver um sistema mais completo de gerenciamento de consultas médicas. Ele oferece uma estrutura básica para cadastrar e exibir consultas, permitindo a expansão de funcionalidades adicionais, como exclusão, edição e pesquisa de consultas.
</h3>
</h2>
