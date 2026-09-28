# TP02 - Cadastro de Alunos

Projeto desenvolvido em Java para a disciplina de programação, utilizando conceitos de interfaces gráficas com Java Swing.

## Descrição

O sistema permite cadastrar alunos por meio de uma interface gráfica. Os dados dos alunos são armazenados em memória utilizando `List<Aluno>` em conjunto com `ArrayList<Aluno>`.

Cada aluno possui um identificador único (`UUID`), gerado automaticamente pelo sistema no momento do cadastro.

## Funcionalidades

- Cadastro de alunos;
- Armazenamento dos alunos em uma `ArrayList`;
- Geração automática de UUID para cada aluno;
- Limpeza dos campos do formulário;
- Exibição dos alunos cadastrados;
- Exibição do UUID e nome dos alunos;
- Encerramento da aplicação.

## Interface

A interface gráfica foi desenvolvida utilizando Java Swing e possui:

- Campo para nome;
- Campo para idade;
- Campo para endereço;
- Botão **OK** para cadastrar;
- Botão **Limpar** para limpar os campos;
- Botão **Mostrar** para exibir os alunos cadastrados;
- Botão **Sair** para encerrar a aplicação.

  ## Link do video
  
  https://youtu.be/FT-XJlPk6i0

## Estrutura do projeto

```text
TP02
├── README.md
└── src
    ├── Aluno.java
    └── TelaAluno.java

