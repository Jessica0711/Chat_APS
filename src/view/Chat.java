
package view;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import dao.MensagensDao;
import model.Mensagem;
import servidor.Servidor;
import util.Emoji;

/**
 *
 * @author Lais
 */
public class Chat extends javax.swing.JFrame {

        private boolean emojisIniciados;
	private String nome;
	private Socket socket;
	private ObjectOutputStream out = null;

	public Chat() {
		initComponents();
                emojisIniciados = false;
	}

	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnChat = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();
        btEnviar = new javax.swing.JButton();
        psMenagemRecebida = new javax.swing.JScrollPane();
        txMensagemRecebida = new javax.swing.JTextArea();
        lbLogoChat = new javax.swing.JLabel();
        lbTituloChat = new javax.swing.JLabel();
        jpEnviar = new javax.swing.JTabbedPane();
        jpMensagemEnviar = new javax.swing.JPanel();
        psMensagemEnviar = new javax.swing.JScrollPane();
        txMensagemEnviar = new javax.swing.JTextArea();
        jpEmojis = new javax.swing.JPanel();
        jbSorriso = new javax.swing.JButton();
        jbSorrisoDente = new javax.swing.JButton();
        jbSorrisoOlhoFechado = new javax.swing.JButton();
        jbSorrisoGotaSuor = new javax.swing.JButton();
        jbPiscada = new javax.swing.JButton();
        jbSorrisoCovinha = new javax.swing.JButton();
        jbLinguaFora = new javax.swing.JButton();
        jbOlhoCoracao = new javax.swing.JButton();
        jbChorando = new javax.swing.JButton();
        jbBravo = new javax.swing.JButton();
        jbTriste = new javax.swing.JButton();
        jbPiscadaLingua = new javax.swing.JButton();
        jbBeijoCoracao = new javax.swing.JButton();
        jbNojo = new javax.swing.JButton();
        jbEmburradoLado = new javax.swing.JButton();
        jbSorrisoLado = new javax.swing.JButton();
        jbDormindo = new javax.swing.JButton();
        jbMaosAlto = new javax.swing.JButton();
        jbPensando = new javax.swing.JButton();
        jbApatico = new javax.swing.JButton();
        jbSurpreso = new javax.swing.JButton();
        jbCaraCoracoes = new javax.swing.JButton();
        jbEspantado = new javax.swing.JButton();
        jbCerto = new javax.swing.JButton();
        jbX = new javax.swing.JButton();
        jbSemSom = new javax.swing.JButton();
        jbSom = new javax.swing.JButton();
        jbAtencao = new javax.swing.JButton();
        jbCadeirante = new javax.swing.JButton();
        jbMao = new javax.swing.JButton();
        jbDedoApontando = new javax.swing.JButton();
        jbDoisDedos = new javax.swing.JButton();
        jbAceno = new javax.swing.JButton();
        jbPositivo = new javax.swing.JButton();
        jbDuasMaos = new javax.swing.JButton();
        jbCoracao = new javax.swing.JButton();
        jbNegativo = new javax.swing.JButton();
        jbPunho = new javax.swing.JButton();
        jbPalmas = new javax.swing.JButton();
        jbOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        pnChat.setBackground(new java.awt.Color(190, 242, 191));
        pnChat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 10, true));
        pnChat.setForeground(new java.awt.Color(190, 242, 191));

        btSair.setBackground(new java.awt.Color(0, 51, 51));
        btSair.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 255, 255));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btEnviar.setBackground(new java.awt.Color(0, 51, 51));
        btEnviar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        txMensagemRecebida.setEditable(false);
        txMensagemRecebida.setColumns(20);
        txMensagemRecebida.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        txMensagemRecebida.setRows(5);
        psMenagemRecebida.setViewportView(txMensagemRecebida);

        lbLogoChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/logo.png"))); // NOI18N

        lbTituloChat.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        lbTituloChat.setText("Bate-papo");

        jpEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEnviarMouseClicked(evt);
            }
        });

        txMensagemEnviar.setColumns(20);
        txMensagemEnviar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        txMensagemEnviar.setRows(5);
        txMensagemEnviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txMensagemEnviarKeyPressed(evt);
            }
        });
        psMensagemEnviar.setViewportView(txMensagemEnviar);

        javax.swing.GroupLayout jpMensagemEnviarLayout = new javax.swing.GroupLayout(jpMensagemEnviar);
        jpMensagemEnviar.setLayout(jpMensagemEnviarLayout);
        jpMensagemEnviarLayout.setHorizontalGroup(
            jpMensagemEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMensagemEnviarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(psMensagemEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMensagemEnviarLayout.setVerticalGroup(
            jpMensagemEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(psMensagemEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jpEnviar.addTab("Texto", jpMensagemEnviar);

        jbSorriso.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbSorriso.setText("a");
        jbSorriso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSorrisoActionPerformed(evt);
            }
        });

        jbSorrisoDente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbSorrisoDente.setText("a");
        jbSorrisoDente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSorrisoDenteActionPerformed(evt);
            }
        });

        jbSorrisoOlhoFechado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbSorrisoOlhoFechado.setText("a");
        jbSorrisoOlhoFechado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSorrisoOlhoFechadoActionPerformed(evt);
            }
        });

        jbSorrisoGotaSuor.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbSorrisoGotaSuor.setText("a");
        jbSorrisoGotaSuor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSorrisoGotaSuorActionPerformed(evt);
            }
        });

        jbPiscada.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbPiscada.setText("a");
        jbPiscada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPiscadaActionPerformed(evt);
            }
        });

        jbSorrisoCovinha.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbSorrisoCovinha.setText("a");
        jbSorrisoCovinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSorrisoCovinhaActionPerformed(evt);
            }
        });

        jbLinguaFora.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbLinguaFora.setText("a");
        jbLinguaFora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLinguaForaActionPerformed(evt);
            }
        });

        jbOlhoCoracao.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbOlhoCoracao.setText("a");
        jbOlhoCoracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOlhoCoracaoActionPerformed(evt);
            }
        });

        jbChorando.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbChorando.setText("a");
        jbChorando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChorandoActionPerformed(evt);
            }
        });

        jbBravo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbBravo.setText("a");
        jbBravo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBravoActionPerformed(evt);
            }
        });

        jbTriste.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbTriste.setText("a");
        jbTriste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTristeActionPerformed(evt);
            }
        });

        jbPiscadaLingua.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbPiscadaLingua.setText("a");
        jbPiscadaLingua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPiscadaLinguaActionPerformed(evt);
            }
        });

        jbBeijoCoracao.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbBeijoCoracao.setText("a");
        jbBeijoCoracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBeijoCoracaoActionPerformed(evt);
            }
        });

        jbNojo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbNojo.setText("a");
        jbNojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNojoActionPerformed(evt);
            }
        });

        jbEmburradoLado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbEmburradoLado.setText("a");
        jbEmburradoLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEmburradoLadoActionPerformed(evt);
            }
        });

        jbSorrisoLado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbSorrisoLado.setText("a");
        jbSorrisoLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSorrisoLadoActionPerformed(evt);
            }
        });

        jbDormindo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbDormindo.setText("a");
        jbDormindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDormindoActionPerformed(evt);
            }
        });

        jbMaosAlto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbMaosAlto.setText("a");
        jbMaosAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMaosAltoActionPerformed(evt);
            }
        });

        jbPensando.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbPensando.setText("a");
        jbPensando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPensandoActionPerformed(evt);
            }
        });

        jbApatico.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbApatico.setText("a");
        jbApatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbApaticoActionPerformed(evt);
            }
        });

        jbSurpreso.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbSurpreso.setText("a");
        jbSurpreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSurpresoActionPerformed(evt);
            }
        });

        jbCaraCoracoes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbCaraCoracoes.setText("a");
        jbCaraCoracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCaraCoracoesActionPerformed(evt);
            }
        });

        jbEspantado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbEspantado.setText("a");
        jbEspantado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEspantadoActionPerformed(evt);
            }
        });

        jbCerto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbCerto.setText("a");
        jbCerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCertoActionPerformed(evt);
            }
        });

        jbX.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbX.setText("a");
        jbX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbXActionPerformed(evt);
            }
        });

        jbSemSom.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbSemSom.setText("a");
        jbSemSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSemSomActionPerformed(evt);
            }
        });

        jbSom.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbSom.setText("a");
        jbSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSomActionPerformed(evt);
            }
        });

        jbAtencao.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbAtencao.setText("a");
        jbAtencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtencaoActionPerformed(evt);
            }
        });

        jbCadeirante.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbCadeirante.setText("a");
        jbCadeirante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadeiranteActionPerformed(evt);
            }
        });

        jbMao.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbMao.setText("a");
        jbMao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMaoActionPerformed(evt);
            }
        });

        jbDedoApontando.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbDedoApontando.setText("a");
        jbDedoApontando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDedoApontandoActionPerformed(evt);
            }
        });

        jbDoisDedos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbDoisDedos.setText("a");
        jbDoisDedos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDoisDedosActionPerformed(evt);
            }
        });

        jbAceno.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbAceno.setText("a");
        jbAceno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAcenoActionPerformed(evt);
            }
        });

        jbPositivo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbPositivo.setText("a");
        jbPositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPositivoActionPerformed(evt);
            }
        });

        jbDuasMaos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbDuasMaos.setText("a");
        jbDuasMaos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDuasMaosActionPerformed(evt);
            }
        });

        jbCoracao.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbCoracao.setText("a");
        jbCoracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCoracaoActionPerformed(evt);
            }
        });

        jbNegativo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbNegativo.setText("a");
        jbNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNegativoActionPerformed(evt);
            }
        });

        jbPunho.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbPunho.setText("a");
        jbPunho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPunhoActionPerformed(evt);
            }
        });

        jbPalmas.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbPalmas.setText("a");
        jbPalmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPalmasActionPerformed(evt);
            }
        });

        jbOk.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jbOk.setText("a");
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEmojisLayout = new javax.swing.GroupLayout(jpEmojis);
        jpEmojis.setLayout(jpEmojisLayout);
        jpEmojisLayout.setHorizontalGroup(
            jpEmojisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmojisLayout.createSequentialGroup()
                .addGroup(jpEmojisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEmojisLayout.createSequentialGroup()
                        .addComponent(jbSorriso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSorrisoDente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSorrisoOlhoFechado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSorrisoGotaSuor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPiscada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSorrisoCovinha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbLinguaFora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbOlhoCoracao))
                    .addGroup(jpEmojisLayout.createSequentialGroup()
                        .addComponent(jbSorrisoLado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEmburradoLado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNojo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBeijoCoracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPiscadaLingua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbTriste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBravo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbChorando))
                    .addGroup(jpEmojisLayout.createSequentialGroup()
                        .addComponent(jbSurpreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEspantado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbMaosAlto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCaraCoracoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPensando)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDormindo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbApatico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCerto))
                    .addGroup(jpEmojisLayout.createSequentialGroup()
                        .addComponent(jbX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSemSom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAtencao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCadeirante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbMao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDedoApontando)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDoisDedos))
                    .addGroup(jpEmojisLayout.createSequentialGroup()
                        .addComponent(jbPunho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAceno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPositivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNegativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPalmas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDuasMaos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCoracao)))
                .addGap(0, 82, Short.MAX_VALUE))
        );
        jpEmojisLayout.setVerticalGroup(
            jpEmojisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmojisLayout.createSequentialGroup()
                .addGroup(jpEmojisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSorriso)
                    .addComponent(jbSorrisoDente)
                    .addComponent(jbSorrisoOlhoFechado)
                    .addComponent(jbSorrisoGotaSuor)
                    .addComponent(jbPiscada)
                    .addComponent(jbSorrisoCovinha)
                    .addComponent(jbLinguaFora)
                    .addComponent(jbOlhoCoracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEmojisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSorrisoLado)
                    .addComponent(jbEmburradoLado)
                    .addComponent(jbNojo)
                    .addComponent(jbBeijoCoracao)
                    .addComponent(jbPiscadaLingua)
                    .addComponent(jbTriste)
                    .addComponent(jbBravo)
                    .addComponent(jbChorando))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEmojisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSurpreso)
                    .addComponent(jbEspantado)
                    .addComponent(jbMaosAlto)
                    .addComponent(jbCaraCoracoes)
                    .addComponent(jbPensando)
                    .addComponent(jbDormindo)
                    .addComponent(jbApatico)
                    .addComponent(jbCerto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEmojisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbX)
                    .addComponent(jbSemSom)
                    .addComponent(jbSom)
                    .addComponent(jbAtencao)
                    .addComponent(jbCadeirante)
                    .addComponent(jbMao)
                    .addComponent(jbDedoApontando)
                    .addComponent(jbDoisDedos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEmojisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPunho)
                    .addComponent(jbAceno)
                    .addComponent(jbOk)
                    .addComponent(jbPositivo)
                    .addComponent(jbNegativo)
                    .addComponent(jbPalmas)
                    .addComponent(jbDuasMaos)
                    .addComponent(jbCoracao))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jpEnviar.addTab("Emojis", jpEmojis);

        javax.swing.GroupLayout pnChatLayout = new javax.swing.GroupLayout(pnChat);
        pnChat.setLayout(pnChatLayout);
        pnChatLayout.setHorizontalGroup(
            pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChatLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(psMenagemRecebida)
                    .addGroup(pnChatLayout.createSequentialGroup()
                        .addComponent(lbLogoChat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTituloChat)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnChatLayout.createSequentialGroup()
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnChatLayout.setVerticalGroup(
            pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChatLayout.createSequentialGroup()
                .addGroup(pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChatLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbTituloChat))
                    .addGroup(pnChatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLogoChat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(psMenagemRecebida, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnChat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnChat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEnviarMouseClicked
        if(!emojisIniciados){
        jbAceno.setText(Emoji.ACENO.getEmoji());
        jbApatico.setText(Emoji.APATICO.getEmoji());
        jbAtencao.setText(Emoji.ATENCAO.getEmoji());
        jbBeijoCoracao.setText(Emoji.BEIJO_CORACAO.getEmoji());
        jbBravo.setText(Emoji.BRAVO.getEmoji());
        jbCadeirante.setText(Emoji.CADEIRANTE.getEmoji());
        jbCaraCoracoes.setText(Emoji.CARA_CORACOES.getEmoji());
        jbCerto.setText(Emoji.CERTO.getEmoji());
        jbChorando.setText(Emoji.CHORANDO.getEmoji());
        jbCoracao.setText(Emoji.CORACAO.getEmoji());
        jbDedoApontando.setText(Emoji.DEDO_APONTANDO.getEmoji());
        jbDoisDedos.setText(Emoji.DOIS_DEDOS.getEmoji());
        jbDormindo.setText(Emoji.DORMINDO.getEmoji());
        jbDuasMaos.setText(Emoji.DUAS_MAOS.getEmoji());
        jbEmburradoLado.setText(Emoji.EMBURRADO_LADO.getEmoji());
        jbEspantado.setText(Emoji.ESPANTADO.getEmoji());
        jbLinguaFora.setText(Emoji.LINGUA_PARA_FORA.getEmoji());
        jbMao.setText(Emoji.MAO.getEmoji());
        jbMaosAlto.setText(Emoji.MAOS_ALTO.getEmoji());
        jbNegativo.setText(Emoji.NEGATIVO.getEmoji());
        jbNojo.setText(Emoji.NOJO.getEmoji());
        jbOk.setText(Emoji.OK.getEmoji());
        jbOlhoCoracao.setText(Emoji.OLHO_CORACAO.getEmoji());
        jbPalmas.setText(Emoji.PALMAS.getEmoji());
        jbPensando.setText(Emoji.PENSANDO.getEmoji());
        jbPiscada.setText(Emoji.PISCADA.getEmoji());
        jbPiscadaLingua.setText(Emoji.PISCADA_LINGUA.getEmoji());
        jbPositivo.setText(Emoji.POSITIVO.getEmoji());
        jbPunho.setText(Emoji.PUNHO.getEmoji());
        jbSemSom.setText(Emoji.SEM_SOM.getEmoji());
        jbSom.setText(Emoji.SOM.getEmoji());
        jbSorriso.setText(Emoji.SORRISO.getEmoji());
        jbSorrisoCovinha.setText(Emoji.SORRISO_COVINHA.getEmoji());
        jbSorrisoDente.setText(Emoji.SORRISO_DENTE.getEmoji());
        jbSorrisoGotaSuor.setText(Emoji.SORRISO_GOTA_SUOR.getEmoji());
        jbSorrisoLado.setText(Emoji.SORRISO_LADO.getEmoji());
        jbSorrisoOlhoFechado.setText(Emoji.SORRISO_OLHO_FECHADO.getEmoji());
        jbSurpreso.setText(Emoji.SURPRESO.getEmoji());
        jbTriste.setText(Emoji.TRISTE.getEmoji());
        jbX.setText(Emoji.X.getEmoji());
        emojisIniciados = true;
        }
    }//GEN-LAST:event_jpEnviarMouseClicked

    private void jbSorrisoDenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSorrisoDenteActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbSorrisoDente.getText());
    }//GEN-LAST:event_jbSorrisoDenteActionPerformed

    private void jbSorrisoOlhoFechadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSorrisoOlhoFechadoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbSorrisoOlhoFechado.getText());
    }//GEN-LAST:event_jbSorrisoOlhoFechadoActionPerformed

    private void jbSorrisoGotaSuorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSorrisoGotaSuorActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbSorrisoGotaSuor.getText());
    }//GEN-LAST:event_jbSorrisoGotaSuorActionPerformed

    private void jbPiscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPiscadaActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbPiscada.getText());
    }//GEN-LAST:event_jbPiscadaActionPerformed

    private void jbSorrisoCovinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSorrisoCovinhaActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbSorrisoCovinha.getText());
    }//GEN-LAST:event_jbSorrisoCovinhaActionPerformed

    private void jbLinguaForaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLinguaForaActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbLinguaFora.getText());
    }//GEN-LAST:event_jbLinguaForaActionPerformed

    private void jbOlhoCoracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOlhoCoracaoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbOlhoCoracao.getText());
    }//GEN-LAST:event_jbOlhoCoracaoActionPerformed

    private void jbChorandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChorandoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbChorando.getText());
    }//GEN-LAST:event_jbChorandoActionPerformed

    private void jbBravoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBravoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbBravo.getText());
    }//GEN-LAST:event_jbBravoActionPerformed

    private void jbTristeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTristeActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbTriste.getText());
    }//GEN-LAST:event_jbTristeActionPerformed

    private void jbPiscadaLinguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPiscadaLinguaActionPerformed
       txMensagemEnviar.setText(txMensagemEnviar.getText() + jbPiscadaLingua.getText());
    }//GEN-LAST:event_jbPiscadaLinguaActionPerformed

    private void jbBeijoCoracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBeijoCoracaoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbBeijoCoracao.getText());
    }//GEN-LAST:event_jbBeijoCoracaoActionPerformed

    private void jbNojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNojoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbNojo.getText());
    }//GEN-LAST:event_jbNojoActionPerformed

    private void jbEmburradoLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEmburradoLadoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbEmburradoLado.getText());
    }//GEN-LAST:event_jbEmburradoLadoActionPerformed

    private void jbSorrisoLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSorrisoLadoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbSorrisoLado.getText());
    }//GEN-LAST:event_jbSorrisoLadoActionPerformed

    private void jbDormindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDormindoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbDormindo.getText());
    }//GEN-LAST:event_jbDormindoActionPerformed

    private void jbMaosAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMaosAltoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbMaosAlto.getText());
    }//GEN-LAST:event_jbMaosAltoActionPerformed

    private void jbPensandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPensandoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbPensando.getText());
    }//GEN-LAST:event_jbPensandoActionPerformed

    private void jbApaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbApaticoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbApatico.getText());
    }//GEN-LAST:event_jbApaticoActionPerformed

    private void jbSurpresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSurpresoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbSurpreso.getText());
    }//GEN-LAST:event_jbSurpresoActionPerformed

    private void jbCaraCoracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCaraCoracoesActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbCaraCoracoes.getText());
    }//GEN-LAST:event_jbCaraCoracoesActionPerformed

    private void jbEspantadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEspantadoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbEspantado.getText());
    }//GEN-LAST:event_jbEspantadoActionPerformed

    private void jbCertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCertoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbCerto.getText());
    }//GEN-LAST:event_jbCertoActionPerformed

    private void jbXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbXActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbX.getText());
    }//GEN-LAST:event_jbXActionPerformed

    private void jbSemSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSemSomActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbSemSom.getText());
    }//GEN-LAST:event_jbSemSomActionPerformed

    private void jbSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSomActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbSom.getText());
    }//GEN-LAST:event_jbSomActionPerformed

    private void jbAtencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtencaoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbAtencao.getText());
    }//GEN-LAST:event_jbAtencaoActionPerformed

    private void jbCadeiranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadeiranteActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbCadeirante.getText());
    }//GEN-LAST:event_jbCadeiranteActionPerformed

    private void jbMaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMaoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbMao.getText());
    }//GEN-LAST:event_jbMaoActionPerformed

    private void jbDedoApontandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDedoApontandoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbDedoApontando.getText());
    }//GEN-LAST:event_jbDedoApontandoActionPerformed

    private void jbDoisDedosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoisDedosActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbDoisDedos.getText());
    }//GEN-LAST:event_jbDoisDedosActionPerformed

    private void jbAcenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAcenoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbAceno.getText());
    }//GEN-LAST:event_jbAcenoActionPerformed

    private void jbPositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPositivoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbPositivo.getText());
    }//GEN-LAST:event_jbPositivoActionPerformed

    private void jbDuasMaosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDuasMaosActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbDuasMaos.getText());
    }//GEN-LAST:event_jbDuasMaosActionPerformed

    private void jbCoracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCoracaoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbCoracao.getText());
    }//GEN-LAST:event_jbCoracaoActionPerformed

    private void jbNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNegativoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbNegativo.getText());
    }//GEN-LAST:event_jbNegativoActionPerformed

    private void jbPunhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPunhoActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbPunho.getText());
    }//GEN-LAST:event_jbPunhoActionPerformed

    private void jbPalmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPalmasActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbPalmas.getText());
    }//GEN-LAST:event_jbPalmasActionPerformed

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        txMensagemEnviar.setText(txMensagemEnviar.getText() + jbOk.getText());
    }//GEN-LAST:event_jbOkActionPerformed

	private void jbSorrisoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbSorrisoActionPerformed
		txMensagemEnviar.setText(txMensagemEnviar.getText() + jbSorriso.getText());
	}// GEN-LAST:event_jbSorrisoActionPerformed

	public void setOut(ObjectOutputStream out) {
		this.out = out;
	}

	private void txMensagemEnviarKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txMensagemEnviarKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			this.enviarMensagem(txMensagemEnviar.getText());
		}

	}// GEN-LAST:event_txMensagemEnviarKeyPressed

	private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btEnviarActionPerformed
		this.enviarMensagem(txMensagemEnviar.getText());
	}// GEN-LAST:event_btEnviarActionPerformed

	private void btSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSairActionPerformed
		try {
			getSocket().close();
			Servidor.close();
			System.exit(0);
		} catch (IOException ex) {
		}
	}// GEN-LAST:event_btSairActionPerformed

	private void enviarMensagem(String mensagem) {
		try {

			txMensagemEnviar.setText("");
			sendText(mensagem);
		} catch (IOException ex) {
			showMessageDialog(null, "Mensagem não foi enviada", "", ERROR_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendText(String mensagem) throws Exception {
		try {
			Mensagem message = new Mensagem(mensagem, getNome());
			MensagensDao.getInstance().create(message);
			out.writeObject(message);
			out.flush();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro no envio da mensagem ao servidor." + e.getMessage());
			throw new Exception("Ocorreu um erro no envio da mensagem ao servidor." + e.getMessage());
		}
	}

	public void mensagens() {
		List<Mensagem> mensagens = MensagensDao.getInstance().read();
		txMensagemRecebida.setText("");
		for (Mensagem mensagem : mensagens) {
			txMensagemRecebida.setText(txMensagemRecebida.getText() + "\n" + mensagem.toString());
		}

	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton jbAceno;
    private javax.swing.JButton jbApatico;
    private javax.swing.JButton jbAtencao;
    private javax.swing.JButton jbBeijoCoracao;
    private javax.swing.JButton jbBravo;
    private javax.swing.JButton jbCadeirante;
    private javax.swing.JButton jbCaraCoracoes;
    private javax.swing.JButton jbCerto;
    private javax.swing.JButton jbChorando;
    private javax.swing.JButton jbCoracao;
    private javax.swing.JButton jbDedoApontando;
    private javax.swing.JButton jbDoisDedos;
    private javax.swing.JButton jbDormindo;
    private javax.swing.JButton jbDuasMaos;
    private javax.swing.JButton jbEmburradoLado;
    private javax.swing.JButton jbEspantado;
    private javax.swing.JButton jbLinguaFora;
    private javax.swing.JButton jbMao;
    private javax.swing.JButton jbMaosAlto;
    private javax.swing.JButton jbNegativo;
    private javax.swing.JButton jbNojo;
    private javax.swing.JButton jbOk;
    private javax.swing.JButton jbOlhoCoracao;
    private javax.swing.JButton jbPalmas;
    private javax.swing.JButton jbPensando;
    private javax.swing.JButton jbPiscada;
    private javax.swing.JButton jbPiscadaLingua;
    private javax.swing.JButton jbPositivo;
    private javax.swing.JButton jbPunho;
    private javax.swing.JButton jbSemSom;
    private javax.swing.JButton jbSom;
    private javax.swing.JButton jbSorriso;
    private javax.swing.JButton jbSorrisoCovinha;
    private javax.swing.JButton jbSorrisoDente;
    private javax.swing.JButton jbSorrisoGotaSuor;
    private javax.swing.JButton jbSorrisoLado;
    private javax.swing.JButton jbSorrisoOlhoFechado;
    private javax.swing.JButton jbSurpreso;
    private javax.swing.JButton jbTriste;
    private javax.swing.JButton jbX;
    private javax.swing.JPanel jpEmojis;
    private javax.swing.JTabbedPane jpEnviar;
    private javax.swing.JPanel jpMensagemEnviar;
    private javax.swing.JLabel lbLogoChat;
    private javax.swing.JLabel lbTituloChat;
    private javax.swing.JPanel pnChat;
    private javax.swing.JScrollPane psMenagemRecebida;
    private javax.swing.JScrollPane psMensagemEnviar;
    private javax.swing.JTextArea txMensagemEnviar;
    private javax.swing.JTextArea txMensagemRecebida;
    // End of variables declaration//GEN-END:variables

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the socket
	 */
	public Socket getSocket() {
		return socket;
	}

	/**
	 * @param socket the socket to set
	 */
	public void setSocket(Socket socket) throws IOException {
		this.socket = socket;
	}

}
