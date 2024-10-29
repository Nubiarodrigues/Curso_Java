package interface_Swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Exemplo1_GUI {

	public static void main(String[] args) {

		// Criar a janela (JFrame)
		JFrame frame = new JFrame("Sorteio Lota Fácil");
		frame.setSize(600, 300); // Aumentar o tamanho da janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela
		frame.setLayout(null); // Definir layout manual

		// Definir cor de fundo da janela
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);

		// Criar um rótulo para exibir o resultado
		JLabel labelResultado = new JLabel(" ");
		labelResultado.setBounds(50, 100, 500, 50); // Aumentar largura e altura do rótulo
		labelResultado.setForeground(Color.BLACK); // Definir cor do texto do rótulo
		labelResultado.setOpaque(true); // Permitir a cor de fundo do rótulo ser visível
		labelResultado.setBackground(Color.WHITE); // Definir cor de fundo do rótulo
		labelResultado.setHorizontalAlignment(SwingConstants.CENTER); // Centralizar horizontalmente
		labelResultado.setVerticalAlignment(SwingConstants.CENTER); // Centralizar verticalmente
		frame.add(labelResultado); // Adicionar o rótulo ao JFrame

		// Criar um botão para realizar a geração de números
		JButton botaoGerar = new JButton("Gerar");
		botaoGerar.setBounds(250, 50, 100, 30); // Ajustar o tamanho do botão
		botaoGerar.setBackground(Color.CYAN); // Definir cor de fundo do botão (cor mais suave)
		botaoGerar.setForeground(Color.BLACK); // Definir cor do texto do botão
		frame.add(botaoGerar); // Adicionar o botão ao JFrame

		// Adicionar o ActionListener ao botão
		botaoGerar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		        Random random = new Random();
		        int quantidadeNumeros = 15;
		        Set<Integer> numerosSorteados = new LinkedHashSet<>();
		        //set não permite números duplicados
		        //LinkedHashSet garante que a ordem que os números são colocados sejam preservados

		        // Gerar números únicos até ter a quantidade desejada
		        while (numerosSorteados.size() < quantidadeNumeros) {
		            int numero = random.nextInt(25) + 1;
		            numerosSorteados.add(numero);
		        }

		        StringBuilder resultado = new StringBuilder("Números sorteados: ");

		        for (int numero : numerosSorteados) {
		            resultado.append(numero).append(" / ");
		        }

		        labelResultado.setText(resultado.toString());
		        
		    }
		});

		// Tornar a janela visível
		frame.setVisible(true);
	}
}