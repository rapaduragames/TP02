
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TelaAluno extends JFrame {

    private JPanel painelSuperior;
    private JPanel painelInferior;

    private JTextField campoNome;
    private JTextField campoIdade;
    private JTextField campoEndereco;

    private List<Aluno> alunos = new ArrayList<>();

    public TelaAluno() {
        painelSuperior = new JPanel(new GridLayout(3, 2, 10, 10));
        painelInferior = new JPanel(new GridLayout(1, 4));

        // painel superior
        campoNome = new JTextField();
        campoIdade = new JTextField();
        campoEndereco = new JTextField();

        painelSuperior.add(new JLabel("Nome:"));
        painelSuperior.add(campoNome);

        painelSuperior.add(new JLabel("Idade:"));
        painelSuperior.add(campoIdade);

        painelSuperior.add(new JLabel("Endereço:"));
        painelSuperior.add(campoEndereco);

        // painel inferior
        JButton botaoOk = new JButton("OK");
        JButton botaoLimpar = new JButton("Limpar");
        JButton botaoMostrar = new JButton("Mostrar");
        JButton botaoSair = new JButton("Sair");

        painelInferior.add(botaoOk);
        painelInferior.add(botaoLimpar);
        painelInferior.add(botaoMostrar);
        painelInferior.add(botaoSair);
        // funcionalidade botão OK
        botaoOk.addActionListener(e -> {

            String nome = campoNome.getText();
            int idade = Integer.parseInt(campoIdade.getText());
            String endereco = campoEndereco.getText();

            Aluno aluno = new Aluno(nome, idade, endereco);

            alunos.add(aluno);

        });
        // funcionalidade botão mostrar
        botaoMostrar.addActionListener(e -> {
            String mensagem = "Resultado\n";

            for (Aluno aluno : alunos) {
                mensagem += "id: " + aluno.getUuid() + " Nome: " + aluno.getNome() + "\n";
            }

            JOptionPane.showMessageDialog(this, mensagem);
        });
        // funcionalidade botão limpar
        botaoLimpar.addActionListener(e -> {

            campoNome.setText("");
            campoIdade.setText("");
            campoEndereco.setText("");
        });

        //funcionalidade botão sair 
        botaoSair.addActionListener(e -> {
            System.exit(0);
        });

        // adiciona os painels ao jframe
        add(painelSuperior, BorderLayout.CENTER);
        add(painelInferior, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        TelaAluno tela = new TelaAluno();

        tela.setTitle("Cadastro de Aluno");
        tela.setSize(400, 180);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }

}
