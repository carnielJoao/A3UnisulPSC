
package View;

import Model.Funcionario;
import Model.Produto;
import View.RoundedPanel;
import dao.RelatorioDAO;
import java.awt.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Inshelf4 extends javax.swing.JFrame {

    private Produto objproduto;
    
    private Funcionario objfuncionario;
    
    public Inshelf4() {
        
        setUndecorated(true);
        initComponents();
        this.objproduto = new Produto();
        this.objfuncionario = new Funcionario();
        this.carregaTabela();
        this.carregaTabela2();
        additionalConfig();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paine_base = new javax.swing.JPanel();
        margin_top = new javax.swing.JPanel();
        margin_right = new javax.swing.JPanel();
        margin_bottom = new javax.swing.JPanel();
        margin_left = new javax.swing.JPanel();
        margin_center = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        menu_item_relatorios = new javax.swing.JPanel();
        menu_text_relatorios = new javax.swing.JLabel();
        menu_icon_relatorios = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        menu_item_funcionarios = new javax.swing.JPanel();
        menu_icon_funcionarios = new javax.swing.JLabel();
        menu_combo_box_funcionarios = new javax.swing.JComboBox<>();
        jPanel31 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        menu_item_produtos = new javax.swing.JPanel();
        menu_icon_produtos = new javax.swing.JLabel();
        menu_combo_box_produtos = new javax.swing.JComboBox<>();
        jPanel26 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        menu_item_sair = new javax.swing.JPanel();
        menu_text_sair = new javax.swing.JLabel();
        menu_icon_sair = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        menu_item_sobre = new javax.swing.JPanel();
        menu_text_sobre = new javax.swing.JLabel();
        menu_icon_sobre = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        roundedPanel1 = new View.RoundedPanel();
        roundedPanel2 = new View.RoundedPanel();
        roundedPanel3 = new View.RoundedPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        roundedPanel4 = new View.RoundedPanel();
        roundedPanel6 = new View.RoundedPanel();
        roundedPanel7 = new View.RoundedPanel();
        painel_principal_superior = new javax.swing.JPanel();
        tela_cadastro_produtos_superior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        painel_campos_produtos_superior = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        campoTitulo = new javax.swing.JTextField();
        jPanel43 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        campoAutor = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        campoPreco = new javax.swing.JTextField();
        jPanel44 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        campoEditora = new javax.swing.JTextField();
        jPanel38 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        campoAnoPublicacao = new javax.swing.JTextField();
        jPanel47 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        campoGenero = new javax.swing.JComboBox<>();
        tela_gerenciamento_produtos_supeior = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        tela_cadastro_funcionarios_superior = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jPanel106 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel120 = new javax.swing.JPanel();
        jTextField50 = new javax.swing.JTextField();
        campoNomeFuncionario = new javax.swing.JTextField();
        jPanel85 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jPanel221 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel223 = new javax.swing.JPanel();
        jTextField51 = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        jPanel220 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel222 = new javax.swing.JPanel();
        jTextField54 = new javax.swing.JTextField();
        comboBoxEstadoCivil = new javax.swing.JComboBox<>();
        jPanel96 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        jPanel135 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel137 = new javax.swing.JPanel();
        campoCpfFuncionario = new javax.swing.JTextField();
        jPanel117 = new javax.swing.JPanel();
        jPanel122 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel132 = new javax.swing.JPanel();
        jTextField55 = new javax.swing.JTextField();
        comboBoxEscolariedade = new javax.swing.JComboBox<>();
        jPanel97 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jPanel136 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel194 = new javax.swing.JPanel();
        campoDataNasciemntoFuncionario = new javax.swing.JTextField();
        jPanel119 = new javax.swing.JPanel();
        jPanel133 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel134 = new javax.swing.JPanel();
        campoCepFuncionario = new javax.swing.JTextField();
        tela_gerenciamento_funcionarios_superior = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionarios = new javax.swing.JTable();
        tela_relatorios_superior = new javax.swing.JPanel();
        jPanel224 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jPanel225 = new javax.swing.JPanel();
        jPanel235 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        valorTotalEstoque = new javax.swing.JLabel();
        quantidadeProdutosUnicos = new javax.swing.JLabel();
        jPanel226 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        quantidadeProdutosGeral = new javax.swing.JLabel();
        quantidadeFuncionarios = new javax.swing.JLabel();
        tela_sobre_superior = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        roundedPanel5 = new View.RoundedPanel();
        painel_principal_inferior = new javax.swing.JPanel();
        tela_cadastro_produtos_inferior = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        painel_campos_produtos_inferior = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        campoDataCadastro = new javax.swing.JTextField();
        jPanel61 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        campoDescricao = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        campoQuantidade = new javax.swing.JTextField();
        jPanel66 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        botao_cadastrar = new javax.swing.JButton();
        jPanel65 = new javax.swing.JPanel();
        tela_gerenciamento_produtos_inferior = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel107 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel98 = new javax.swing.JPanel();
        campoTitulo_edicao = new javax.swing.JTextField();
        jPanel77 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel108 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel99 = new javax.swing.JPanel();
        campoPreco_edicao = new javax.swing.JTextField();
        jPanel78 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jPanel109 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel100 = new javax.swing.JPanel();
        campoAutor_edicao = new javax.swing.JTextField();
        jPanel79 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel110 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel101 = new javax.swing.JPanel();
        campoEditora_edicao = new javax.swing.JTextField();
        jPanel80 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel111 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel102 = new javax.swing.JPanel();
        campoGenero1 = new javax.swing.JComboBox<>();
        jPanel81 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        campoQuantidade_edicao = new javax.swing.JTextField();
        jPanel82 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel104 = new javax.swing.JPanel();
        campoDescricao_edicao = new javax.swing.JTextField();
        jPanel83 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel114 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel105 = new javax.swing.JPanel();
        campoAnoPublicacao_edicao = new javax.swing.JTextField();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        botao_atualizar = new javax.swing.JButton();
        botao_cancelar = new javax.swing.JButton();
        botao_deletar = new javax.swing.JButton();
        tela_cadastro_funcionarios_inferior = new javax.swing.JPanel();
        jPanel123 = new javax.swing.JPanel();
        jPanel138 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel144 = new javax.swing.JPanel();
        campoEnderecoFuncionario = new javax.swing.JTextField();
        jPanel124 = new javax.swing.JPanel();
        jPanel139 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel145 = new javax.swing.JPanel();
        campoCidadeFuncionario = new javax.swing.JTextField();
        jPanel125 = new javax.swing.JPanel();
        jPanel128 = new javax.swing.JPanel();
        jPanel142 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel147 = new javax.swing.JPanel();
        comboboxEstado = new javax.swing.JComboBox<>();
        jPanel129 = new javax.swing.JPanel();
        jPanel140 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel146 = new javax.swing.JPanel();
        campoNendereco = new javax.swing.JTextField();
        jPanel126 = new javax.swing.JPanel();
        jPanel130 = new javax.swing.JPanel();
        jPanel143 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel148 = new javax.swing.JPanel();
        campoSalarioFuncionario = new javax.swing.JTextField();
        jPanel131 = new javax.swing.JPanel();
        jPanel141 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel149 = new javax.swing.JPanel();
        campoComplemento = new javax.swing.JTextField();
        jPanel127 = new javax.swing.JPanel();
        buttonCadastrarFuncionario = new javax.swing.JButton();
        tela_relatorios_inferior = new javax.swing.JPanel();
        tela_gerenciamento_funcionarios_inferior = new javax.swing.JPanel();
        jPanel150 = new javax.swing.JPanel();
        jPanel156 = new javax.swing.JPanel();
        jPanel187 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel161 = new javax.swing.JPanel();
        campoNomeAlterar = new javax.swing.JTextField();
        jPanel157 = new javax.swing.JPanel();
        jPanel193 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel204 = new javax.swing.JPanel();
        campoSalarioAlterar = new javax.swing.JTextField();
        jPanel158 = new javax.swing.JPanel();
        jPanel172 = new javax.swing.JPanel();
        jPanel173 = new javax.swing.JPanel();
        jPanel195 = new javax.swing.JPanel();
        jPanel196 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel197 = new javax.swing.JPanel();
        campoCEPalterar = new javax.swing.JTextField();
        jPanel151 = new javax.swing.JPanel();
        jPanel159 = new javax.swing.JPanel();
        jPanel188 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel199 = new javax.swing.JPanel();
        campoTelefoneAlterar = new javax.swing.JTextField();
        jPanel160 = new javax.swing.JPanel();
        jPanel205 = new javax.swing.JPanel();
        jPanel184 = new javax.swing.JPanel();
        jPanel185 = new javax.swing.JPanel();
        jPanel186 = new javax.swing.JPanel();
        jPanel198 = new javax.swing.JPanel();
        jPanel210 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel215 = new javax.swing.JPanel();
        campoEnderecoAlterar = new javax.swing.JTextField();
        jPanel152 = new javax.swing.JPanel();
        jPanel162 = new javax.swing.JPanel();
        jPanel189 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel200 = new javax.swing.JPanel();
        campoCPFalterar = new javax.swing.JTextField();
        jPanel163 = new javax.swing.JPanel();
        jPanel164 = new javax.swing.JPanel();
        jPanel174 = new javax.swing.JPanel();
        jPanel175 = new javax.swing.JPanel();
        jPanel206 = new javax.swing.JPanel();
        jPanel211 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel216 = new javax.swing.JPanel();
        campoCidadeAlterar = new javax.swing.JTextField();
        jPanel153 = new javax.swing.JPanel();
        jPanel167 = new javax.swing.JPanel();
        jPanel176 = new javax.swing.JPanel();
        jPanel190 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel201 = new javax.swing.JPanel();
        campoNascimentoAlterar = new javax.swing.JTextField();
        jPanel177 = new javax.swing.JPanel();
        jPanel178 = new javax.swing.JPanel();
        jPanel179 = new javax.swing.JPanel();
        jPanel207 = new javax.swing.JPanel();
        jPanel212 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel217 = new javax.swing.JPanel();
        campoNalterar = new javax.swing.JTextField();
        jPanel154 = new javax.swing.JPanel();
        jPanel165 = new javax.swing.JPanel();
        jPanel191 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel202 = new javax.swing.JPanel();
        campoEscolariedadeAlterar = new javax.swing.JTextField();
        jPanel166 = new javax.swing.JPanel();
        botaoAlterarFuncionario = new javax.swing.JButton();
        jPanel168 = new javax.swing.JPanel();
        jPanel180 = new javax.swing.JPanel();
        jPanel182 = new javax.swing.JPanel();
        jPanel208 = new javax.swing.JPanel();
        jPanel213 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel218 = new javax.swing.JPanel();
        campoComplementoAlterar = new javax.swing.JTextField();
        jPanel155 = new javax.swing.JPanel();
        jPanel169 = new javax.swing.JPanel();
        botaoDeleteFuncionario = new javax.swing.JButton();
        jPanel170 = new javax.swing.JPanel();
        jPanel192 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel203 = new javax.swing.JPanel();
        campoEstadoCivilAlterar = new javax.swing.JTextField();
        jPanel171 = new javax.swing.JPanel();
        jPanel181 = new javax.swing.JPanel();
        jPanel183 = new javax.swing.JPanel();
        jPanel209 = new javax.swing.JPanel();
        jPanel214 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel219 = new javax.swing.JPanel();
        campoEstadoAlterar = new javax.swing.JTextField();
        tela_sobre_inferior = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        roundedPanel8 = new View.RoundedPanel();
        roundedPanel9 = new View.RoundedPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(251, 245, 238));

        paine_base.setBackground(new java.awt.Color(251, 245, 238));
        paine_base.setLayout(new java.awt.BorderLayout());

        margin_top.setBackground(new java.awt.Color(251, 245, 238));
        margin_top.setPreferredSize(new java.awt.Dimension(1280, 20));

        javax.swing.GroupLayout margin_topLayout = new javax.swing.GroupLayout(margin_top);
        margin_top.setLayout(margin_topLayout);
        margin_topLayout.setHorizontalGroup(
            margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        margin_topLayout.setVerticalGroup(
            margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paine_base.add(margin_top, java.awt.BorderLayout.PAGE_START);

        margin_right.setBackground(new java.awt.Color(251, 245, 238));
        margin_right.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout margin_rightLayout = new javax.swing.GroupLayout(margin_right);
        margin_right.setLayout(margin_rightLayout);
        margin_rightLayout.setHorizontalGroup(
            margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        margin_rightLayout.setVerticalGroup(
            margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        paine_base.add(margin_right, java.awt.BorderLayout.LINE_END);

        margin_bottom.setBackground(new java.awt.Color(251, 245, 238));
        margin_bottom.setPreferredSize(new java.awt.Dimension(1280, 20));

        javax.swing.GroupLayout margin_bottomLayout = new javax.swing.GroupLayout(margin_bottom);
        margin_bottom.setLayout(margin_bottomLayout);
        margin_bottomLayout.setHorizontalGroup(
            margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        margin_bottomLayout.setVerticalGroup(
            margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        paine_base.add(margin_bottom, java.awt.BorderLayout.PAGE_END);

        margin_left.setBackground(new java.awt.Color(251, 245, 238));
        margin_left.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout margin_leftLayout = new javax.swing.GroupLayout(margin_left);
        margin_left.setLayout(margin_leftLayout);
        margin_leftLayout.setHorizontalGroup(
            margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        margin_leftLayout.setVerticalGroup(
            margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        paine_base.add(margin_left, java.awt.BorderLayout.LINE_START);

        margin_center.setBackground(new java.awt.Color(251, 245, 238));
        margin_center.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(251, 245, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 660));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(251, 245, 238));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(251, 245, 238));
        jPanel16.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(251, 245, 238));
        jPanel18.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel18, java.awt.BorderLayout.NORTH);

        jPanel19.setBackground(new java.awt.Color(251, 245, 238));
        jPanel19.setPreferredSize(new java.awt.Dimension(20, 80));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel19, java.awt.BorderLayout.WEST);

        jPanel20.setBackground(new java.awt.Color(251, 245, 238));
        jPanel20.setPreferredSize(new java.awt.Dimension(280, 180));

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(95, 74, 61));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/logo_40.png"))); // NOI18N
        jLabel1.setText("INSHELF");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIconTextGap(10);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel16, java.awt.BorderLayout.NORTH);

        jPanel8.setBackground(new java.awt.Color(251, 245, 238));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel21.setBackground(new java.awt.Color(251, 245, 238));
        jPanel21.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(251, 245, 238));
        jPanel17.setPreferredSize(new java.awt.Dimension(20, 80));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel17, java.awt.BorderLayout.WEST);

        jPanel28.setBackground(new java.awt.Color(251, 245, 238));
        jPanel28.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel28, java.awt.BorderLayout.NORTH);

        menu_item_relatorios.setBackground(new java.awt.Color(251, 245, 238));
        menu_item_relatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_relatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_item_relatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_item_relatoriosMouseExited(evt);
            }
        });

        menu_text_relatorios.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        menu_text_relatorios.setForeground(new java.awt.Color(91, 48, 22));
        menu_text_relatorios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_text_relatorios.setText("Relatórios");
        menu_text_relatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_text_relatoriosMouseClicked(evt);
            }
        });

        menu_icon_relatorios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png"))); // NOI18N
        menu_icon_relatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_icon_relatoriosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu_item_relatoriosLayout = new javax.swing.GroupLayout(menu_item_relatorios);
        menu_item_relatorios.setLayout(menu_item_relatoriosLayout);
        menu_item_relatoriosLayout.setHorizontalGroup(
            menu_item_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_item_relatoriosLayout.createSequentialGroup()
                .addComponent(menu_icon_relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu_text_relatorios)
                .addGap(122, 122, 122))
        );
        menu_item_relatoriosLayout.setVerticalGroup(
            menu_item_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_item_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(menu_text_relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(menu_icon_relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel21.add(menu_item_relatorios, java.awt.BorderLayout.CENTER);

        jPanel30.setBackground(new java.awt.Color(251, 245, 238));
        jPanel30.setMinimumSize(new java.awt.Dimension(300, 20));
        jPanel30.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel30, java.awt.BorderLayout.SOUTH);

        jPanel8.add(jPanel21, java.awt.BorderLayout.NORTH);

        jPanel22.setBackground(new java.awt.Color(251, 245, 238));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel32.setBackground(new java.awt.Color(251, 245, 238));
        jPanel32.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel32, java.awt.BorderLayout.NORTH);

        menu_item_funcionarios.setBackground(new java.awt.Color(251, 245, 238));
        menu_item_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_item_funcionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_item_funcionariosMouseExited(evt);
            }
        });

        menu_icon_funcionarios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png"))); // NOI18N

        menu_combo_box_funcionarios.setBackground(new java.awt.Color(251, 245, 238));
        menu_combo_box_funcionarios.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        menu_combo_box_funcionarios.setForeground(new java.awt.Color(91, 48, 22));
        menu_combo_box_funcionarios.setMaximumRowCount(3);
        menu_combo_box_funcionarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionarios", "Gerenciar Funcionarios", "Cadastrar Funcionario" }));
        menu_combo_box_funcionarios.setBorder(null);
        menu_combo_box_funcionarios.setFocusable(false);
        menu_combo_box_funcionarios.setRequestFocusEnabled(false);
        menu_combo_box_funcionarios.setVerifyInputWhenFocusTarget(false);
        menu_combo_box_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_combo_box_funcionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_combo_box_funcionariosMouseExited(evt);
            }
        });
        menu_combo_box_funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_combo_box_funcionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_item_funcionariosLayout = new javax.swing.GroupLayout(menu_item_funcionarios);
        menu_item_funcionarios.setLayout(menu_item_funcionariosLayout);
        menu_item_funcionariosLayout.setHorizontalGroup(
            menu_item_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_item_funcionariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_icon_funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_combo_box_funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_item_funcionariosLayout.setVerticalGroup(
            menu_item_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_item_funcionariosLayout.createSequentialGroup()
                .addGroup(menu_item_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(menu_icon_funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_combo_box_funcionarios))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel22.add(menu_item_funcionarios, java.awt.BorderLayout.CENTER);

        jPanel31.setBackground(new java.awt.Color(251, 245, 238));
        jPanel31.setMinimumSize(new java.awt.Dimension(300, 20));
        jPanel31.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel31, java.awt.BorderLayout.SOUTH);

        jPanel33.setBackground(new java.awt.Color(251, 245, 238));
        jPanel33.setPreferredSize(new java.awt.Dimension(20, 60));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel33, java.awt.BorderLayout.WEST);

        jPanel8.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel23.setBackground(new java.awt.Color(251, 245, 238));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel24.setBackground(new java.awt.Color(251, 245, 238));
        jPanel24.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel24, java.awt.BorderLayout.NORTH);

        menu_item_produtos.setBackground(new java.awt.Color(251, 245, 238));
        menu_item_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_item_produtosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_item_produtosMouseExited(evt);
            }
        });

        menu_icon_produtos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png"))); // NOI18N

        menu_combo_box_produtos.setBackground(new java.awt.Color(251, 245, 238));
        menu_combo_box_produtos.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        menu_combo_box_produtos.setForeground(new java.awt.Color(91, 48, 22));
        menu_combo_box_produtos.setMaximumRowCount(3);
        menu_combo_box_produtos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Produtos", "Gerenciar Produtos", "Cadastrar Produto" }));
        menu_combo_box_produtos.setBorder(null);
        menu_combo_box_produtos.setFocusable(false);
        menu_combo_box_produtos.setLightWeightPopupEnabled(false);
        menu_combo_box_produtos.setRequestFocusEnabled(false);
        menu_combo_box_produtos.setVerifyInputWhenFocusTarget(false);
        menu_combo_box_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_combo_box_produtosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_item_produtosLayout = new javax.swing.GroupLayout(menu_item_produtos);
        menu_item_produtos.setLayout(menu_item_produtosLayout);
        menu_item_produtosLayout.setHorizontalGroup(
            menu_item_produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_item_produtosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_icon_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_combo_box_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_item_produtosLayout.setVerticalGroup(
            menu_item_produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_item_produtosLayout.createSequentialGroup()
                .addGroup(menu_item_produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(menu_icon_produtos, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(menu_combo_box_produtos))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel23.add(menu_item_produtos, java.awt.BorderLayout.CENTER);

        jPanel26.setBackground(new java.awt.Color(251, 245, 238));
        jPanel26.setMinimumSize(new java.awt.Dimension(300, 20));
        jPanel26.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel26, java.awt.BorderLayout.SOUTH);

        jPanel34.setBackground(new java.awt.Color(251, 245, 238));
        jPanel34.setPreferredSize(new java.awt.Dimension(20, 60));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel34, java.awt.BorderLayout.WEST);

        jPanel8.add(jPanel23, java.awt.BorderLayout.SOUTH);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel7.setBackground(new java.awt.Color(251, 245, 238));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 200));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(251, 245, 238));
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(251, 245, 238));
        jPanel10.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel10, java.awt.BorderLayout.NORTH);

        menu_item_sair.setBackground(new java.awt.Color(251, 245, 238));
        menu_item_sair.setPreferredSize(new java.awt.Dimension(300, 80));
        menu_item_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_sairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_item_sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_item_sairMouseExited(evt);
            }
        });

        menu_text_sair.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        menu_text_sair.setForeground(new java.awt.Color(91, 48, 22));
        menu_text_sair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_text_sair.setText("Sair");

        menu_icon_sair.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_icon_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/logout-black.png"))); // NOI18N

        javax.swing.GroupLayout menu_item_sairLayout = new javax.swing.GroupLayout(menu_item_sair);
        menu_item_sair.setLayout(menu_item_sairLayout);
        menu_item_sairLayout.setHorizontalGroup(
            menu_item_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_item_sairLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_icon_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(menu_text_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_item_sairLayout.setVerticalGroup(
            menu_item_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_text_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menu_item_sairLayout.createSequentialGroup()
                .addComponent(menu_icon_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(menu_item_sair, java.awt.BorderLayout.CENTER);

        jPanel15.setBackground(new java.awt.Color(251, 245, 238));
        jPanel15.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel15, java.awt.BorderLayout.SOUTH);

        jPanel35.setBackground(new java.awt.Color(251, 245, 238));
        jPanel35.setPreferredSize(new java.awt.Dimension(20, 60));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel35, java.awt.BorderLayout.WEST);

        jPanel7.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel9.setBackground(new java.awt.Color(251, 245, 238));
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(251, 245, 238));
        jPanel11.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel11, java.awt.BorderLayout.NORTH);

        menu_item_sobre.setBackground(new java.awt.Color(251, 245, 238));
        menu_item_sobre.setPreferredSize(new java.awt.Dimension(0, 60));
        menu_item_sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_sobreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_item_sobreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_item_sobreMouseExited(evt);
            }
        });

        menu_text_sobre.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        menu_text_sobre.setForeground(new java.awt.Color(91, 48, 22));
        menu_text_sobre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_text_sobre.setText("Sobre");

        menu_icon_sobre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png"))); // NOI18N

        javax.swing.GroupLayout menu_item_sobreLayout = new javax.swing.GroupLayout(menu_item_sobre);
        menu_item_sobre.setLayout(menu_item_sobreLayout);
        menu_item_sobreLayout.setHorizontalGroup(
            menu_item_sobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_item_sobreLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_icon_sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(menu_text_sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_item_sobreLayout.setVerticalGroup(
            menu_item_sobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_text_sobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menu_item_sobreLayout.createSequentialGroup()
                .addComponent(menu_icon_sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.add(menu_item_sobre, java.awt.BorderLayout.CENTER);

        jPanel14.setBackground(new java.awt.Color(251, 245, 238));
        jPanel14.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel14, java.awt.BorderLayout.SOUTH);

        jPanel36.setBackground(new java.awt.Color(251, 245, 238));
        jPanel36.setPreferredSize(new java.awt.Dimension(20, 60));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel36, java.awt.BorderLayout.WEST);

        jPanel7.add(jPanel9, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel7, java.awt.BorderLayout.SOUTH);

        margin_center.add(jPanel1, java.awt.BorderLayout.LINE_START);

        roundedPanel1.setBackground(new java.awt.Color(91, 48, 22));
        roundedPanel1.setRoundBottomLeft(50);
        roundedPanel1.setRoundBottomRight(50);
        roundedPanel1.setRoundTopLeft(50);
        roundedPanel1.setRoundTopRight(50);
        roundedPanel1.setLayout(new java.awt.BorderLayout());

        roundedPanel2.setBackground(new java.awt.Color(91, 48, 22));
        roundedPanel2.setPreferredSize(new java.awt.Dimension(940, 30));
        roundedPanel2.setRoundTopLeft(50);
        roundedPanel2.setRoundTopRight(50);

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        roundedPanel1.add(roundedPanel2, java.awt.BorderLayout.PAGE_START);

        roundedPanel3.setBackground(new java.awt.Color(91, 48, 22));
        roundedPanel3.setPreferredSize(new java.awt.Dimension(940, 30));
        roundedPanel3.setRoundBottomLeft(50);
        roundedPanel3.setRoundBottomRight(50);

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        roundedPanel1.add(roundedPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(91, 48, 22));
        jPanel2.setPreferredSize(new java.awt.Dimension(20, 590));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        roundedPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(91, 48, 22));
        jPanel3.setPreferredSize(new java.awt.Dimension(20, 590));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        roundedPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(91, 48, 22));
        jPanel4.setLayout(new java.awt.BorderLayout());

        roundedPanel4.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel4.setMinimumSize(new java.awt.Dimension(900, 290));
        roundedPanel4.setPreferredSize(new java.awt.Dimension(900, 290));
        roundedPanel4.setRoundBottomLeft(50);
        roundedPanel4.setRoundBottomRight(50);
        roundedPanel4.setRoundTopLeft(50);
        roundedPanel4.setRoundTopRight(50);
        roundedPanel4.setLayout(new java.awt.BorderLayout());

        roundedPanel6.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel6.setPreferredSize(new java.awt.Dimension(900, 30));
        roundedPanel6.setRoundTopLeft(50);
        roundedPanel6.setRoundTopRight(50);

        javax.swing.GroupLayout roundedPanel6Layout = new javax.swing.GroupLayout(roundedPanel6);
        roundedPanel6.setLayout(roundedPanel6Layout);
        roundedPanel6Layout.setHorizontalGroup(
            roundedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        roundedPanel6Layout.setVerticalGroup(
            roundedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        roundedPanel4.add(roundedPanel6, java.awt.BorderLayout.NORTH);

        roundedPanel7.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel7.setPreferredSize(new java.awt.Dimension(900, 30));
        roundedPanel7.setRoundBottomLeft(50);
        roundedPanel7.setRoundBottomRight(50);

        javax.swing.GroupLayout roundedPanel7Layout = new javax.swing.GroupLayout(roundedPanel7);
        roundedPanel7.setLayout(roundedPanel7Layout);
        roundedPanel7Layout.setHorizontalGroup(
            roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        roundedPanel7Layout.setVerticalGroup(
            roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        roundedPanel4.add(roundedPanel7, java.awt.BorderLayout.SOUTH);

        painel_principal_superior.setBackground(new java.awt.Color(251, 245, 238));
        painel_principal_superior.setLayout(new java.awt.CardLayout());

        tela_cadastro_produtos_superior.setBackground(new java.awt.Color(251, 245, 238));
        tela_cadastro_produtos_superior.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(91, 48, 22));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de produto");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(140, 30));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        tela_cadastro_produtos_superior.add(jLabel2, java.awt.BorderLayout.NORTH);

        painel_campos_produtos_superior.setBackground(new java.awt.Color(251, 245, 238));
        painel_campos_produtos_superior.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        jPanel12.setBackground(new java.awt.Color(251, 245, 238));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel42.setBackground(new java.awt.Color(251, 245, 238));
        jPanel42.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel42.setLayout(new java.awt.BorderLayout());

        jPanel49.setBackground(new java.awt.Color(91, 48, 22));
        jPanel49.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(251, 245, 238));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Titulo");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        jPanel42.add(jPanel49, java.awt.BorderLayout.WEST);

        jPanel48.setBackground(new java.awt.Color(225, 195, 145));
        jPanel48.setPreferredSize(new java.awt.Dimension(290, 0));

        campoTitulo.setBackground(new java.awt.Color(225, 195, 145));
        campoTitulo.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        campoTitulo.setBorder(null);

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel42.add(jPanel48, java.awt.BorderLayout.EAST);

        jPanel12.add(jPanel42, java.awt.BorderLayout.WEST);

        jPanel43.setBackground(new java.awt.Color(251, 245, 238));
        jPanel43.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jPanel51.setBackground(new java.awt.Color(91, 48, 22));
        jPanel51.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel16.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(251, 245, 238));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Autor");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel51, java.awt.BorderLayout.WEST);

        jPanel50.setBackground(new java.awt.Color(225, 195, 145));
        jPanel50.setPreferredSize(new java.awt.Dimension(290, 0));

        campoAutor.setBackground(new java.awt.Color(225, 195, 145));
        campoAutor.setBorder(null);

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel43.add(jPanel50, java.awt.BorderLayout.EAST);

        jPanel12.add(jPanel43, java.awt.BorderLayout.EAST);

        painel_campos_produtos_superior.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(251, 245, 238));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel45.setBackground(new java.awt.Color(251, 245, 238));
        jPanel45.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel45.setLayout(new java.awt.BorderLayout());

        jPanel55.setBackground(new java.awt.Color(91, 48, 22));
        jPanel55.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel14.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(251, 245, 238));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("<html>Preço<br>(R$/unid.)</html>");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        jPanel45.add(jPanel55, java.awt.BorderLayout.WEST);

        jPanel54.setBackground(new java.awt.Color(225, 195, 145));
        jPanel54.setPreferredSize(new java.awt.Dimension(290, 0));

        campoPreco.setBackground(new java.awt.Color(225, 195, 145));
        campoPreco.setBorder(null);

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.add(jPanel54, java.awt.BorderLayout.EAST);

        jPanel13.add(jPanel45, java.awt.BorderLayout.WEST);

        jPanel44.setBackground(new java.awt.Color(251, 245, 238));
        jPanel44.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel44.setLayout(new java.awt.BorderLayout());

        jPanel53.setBackground(new java.awt.Color(91, 48, 22));
        jPanel53.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel17.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(251, 245, 238));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Editora");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        jPanel44.add(jPanel53, java.awt.BorderLayout.WEST);

        jPanel52.setBackground(new java.awt.Color(225, 195, 145));
        jPanel52.setPreferredSize(new java.awt.Dimension(290, 0));

        campoEditora.setBackground(new java.awt.Color(225, 195, 145));
        campoEditora.setBorder(null);

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel44.add(jPanel52, java.awt.BorderLayout.EAST);

        jPanel13.add(jPanel44, java.awt.BorderLayout.EAST);

        painel_campos_produtos_superior.add(jPanel13);

        jPanel38.setBackground(new java.awt.Color(251, 245, 238));
        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel46.setBackground(new java.awt.Color(251, 245, 238));
        jPanel46.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel46.setLayout(new java.awt.BorderLayout());

        jPanel57.setBackground(new java.awt.Color(91, 48, 22));
        jPanel57.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel15.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(251, 245, 238));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("<html>Ano de<br>publicacao</html>");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        jPanel46.add(jPanel57, java.awt.BorderLayout.WEST);

        jPanel56.setBackground(new java.awt.Color(225, 195, 145));
        jPanel56.setPreferredSize(new java.awt.Dimension(290, 0));

        campoAnoPublicacao.setBackground(new java.awt.Color(225, 195, 145));
        campoAnoPublicacao.setBorder(null);

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoAnoPublicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoAnoPublicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel46.add(jPanel56, java.awt.BorderLayout.EAST);

        jPanel38.add(jPanel46, java.awt.BorderLayout.WEST);

        jPanel47.setBackground(new java.awt.Color(251, 245, 238));
        jPanel47.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel47.setLayout(new java.awt.BorderLayout());

        jPanel59.setBackground(new java.awt.Color(91, 48, 22));
        jPanel59.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel18.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(251, 245, 238));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Genero");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        jPanel47.add(jPanel59, java.awt.BorderLayout.WEST);

        jPanel58.setBackground(new java.awt.Color(225, 195, 145));
        jPanel58.setPreferredSize(new java.awt.Dimension(290, 0));

        campoGenero.setBackground(new java.awt.Color(225, 195, 145));
        campoGenero.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoGenero.setForeground(new java.awt.Color(91, 48, 22));
        campoGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ficção Literária", "Romance", "Mistério e Suspense", "Ficção Científica e Fantasia", "Autoajuda e Desenvolvimento Pessoal", "História e Biografia", "Política e Atualidades", "Religião e Espiritualidade", "Infantil e Juvenil" }));
        campoGenero.setBorder(null);
        campoGenero.setFocusable(false);

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoGenero, 0, 290, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        jPanel47.add(jPanel58, java.awt.BorderLayout.EAST);

        jPanel38.add(jPanel47, java.awt.BorderLayout.EAST);

        painel_campos_produtos_superior.add(jPanel38);

        tela_cadastro_produtos_superior.add(painel_campos_produtos_superior, java.awt.BorderLayout.CENTER);

        painel_principal_superior.add(tela_cadastro_produtos_superior, "card5");

        tela_gerenciamento_produtos_supeior.setBackground(new java.awt.Color(251, 245, 238));
        tela_gerenciamento_produtos_supeior.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(91, 48, 22));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gerenciamento de produtos");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setPreferredSize(new java.awt.Dimension(188, 30));
        tela_gerenciamento_produtos_supeior.add(jLabel5, java.awt.BorderLayout.NORTH);

        jPanel64.setBackground(new java.awt.Color(251, 245, 238));
        jPanel64.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBackground(new java.awt.Color(225, 195, 145));
        jScrollPane2.setBorder(null);

        tabela_produtos.setAutoCreateRowSorter(true);
        tabela_produtos.setBackground(new java.awt.Color(225, 195, 145));
        tabela_produtos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabela_produtos.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        tabela_produtos.setForeground(new java.awt.Color(91, 48, 22));
        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Título", "Preço", "Autor", "Editora", "Ano de publicação", "Gênero", "Descrição", "Quantidade", "Data de cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_produtos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabela_produtos.setColumnSelectionAllowed(true);
        tabela_produtos.setGridColor(new java.awt.Color(91, 48, 22));
        tabela_produtos.setSelectionBackground(new java.awt.Color(150, 80, 44));
        tabela_produtos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabela_produtos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_produtos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_produtos.setShowGrid(true);
        tabela_produtos.getTableHeader().setReorderingAllowed(false);
        tabela_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela_produtos);
        tabela_produtos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabela_produtos.getColumnModel().getColumnCount() > 0) {
            tabela_produtos.getColumnModel().getColumn(0).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(0).setPreferredWidth(15);
            tabela_produtos.getColumnModel().getColumn(1).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabela_produtos.getColumnModel().getColumn(2).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(2).setPreferredWidth(20);
            tabela_produtos.getColumnModel().getColumn(3).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(3).setPreferredWidth(70);
            tabela_produtos.getColumnModel().getColumn(4).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(4).setPreferredWidth(70);
            tabela_produtos.getColumnModel().getColumn(5).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(5).setPreferredWidth(30);
            tabela_produtos.getColumnModel().getColumn(6).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(6).setPreferredWidth(100);
            tabela_produtos.getColumnModel().getColumn(7).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(7).setPreferredWidth(50);
            tabela_produtos.getColumnModel().getColumn(8).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(8).setPreferredWidth(30);
            tabela_produtos.getColumnModel().getColumn(9).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        jPanel64.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        tela_gerenciamento_produtos_supeior.add(jPanel64, java.awt.BorderLayout.CENTER);

        painel_principal_superior.add(tela_gerenciamento_produtos_supeior, "card4");

        tela_cadastro_funcionarios_superior.setBackground(new java.awt.Color(251, 245, 238));
        tela_cadastro_funcionarios_superior.setLayout(new java.awt.GridLayout(5, 0, 0, 4));

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(91, 48, 22));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cadastramento de Funcionário");
        tela_cadastro_funcionarios_superior.add(jLabel7);

        jPanel84.setLayout(new java.awt.BorderLayout());

        jPanel106.setBackground(new java.awt.Color(91, 48, 22));
        jPanel106.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel11.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nome");

        javax.swing.GroupLayout jPanel106Layout = new javax.swing.GroupLayout(jPanel106);
        jPanel106.setLayout(jPanel106Layout);
        jPanel106Layout.setHorizontalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel106Layout.setVerticalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel84.add(jPanel106, java.awt.BorderLayout.LINE_START);

        jTextField50.setEditable(false);
        jTextField50.setBackground(new java.awt.Color(225, 195, 145));
        jTextField50.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField50.setForeground(new java.awt.Color(91, 48, 22));

        campoNomeFuncionario.setBackground(new java.awt.Color(225, 195, 145));

        javax.swing.GroupLayout jPanel120Layout = new javax.swing.GroupLayout(jPanel120);
        jPanel120.setLayout(jPanel120Layout);
        jPanel120Layout.setHorizontalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel120Layout.createSequentialGroup()
                .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField50))
        );
        jPanel120Layout.setVerticalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel120Layout.createSequentialGroup()
                .addGroup(jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel84.add(jPanel120, java.awt.BorderLayout.CENTER);

        tela_cadastro_funcionarios_superior.add(jPanel84);

        jPanel85.setBackground(new java.awt.Color(251, 245, 238));
        jPanel85.setLayout(new java.awt.BorderLayout());

        jPanel115.setPreferredSize(new java.awt.Dimension(430, 42));
        jPanel115.setLayout(new java.awt.BorderLayout());

        jPanel221.setBackground(new java.awt.Color(91, 48, 22));
        jPanel221.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel22.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Telefone");

        javax.swing.GroupLayout jPanel221Layout = new javax.swing.GroupLayout(jPanel221);
        jPanel221.setLayout(jPanel221Layout);
        jPanel221Layout.setHorizontalGroup(
            jPanel221Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel221Layout.setVerticalGroup(
            jPanel221Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel115.add(jPanel221, java.awt.BorderLayout.LINE_START);

        jTextField51.setEditable(false);
        jTextField51.setBackground(new java.awt.Color(225, 195, 145));
        jTextField51.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField51.setForeground(new java.awt.Color(91, 48, 22));

        campoTelefone.setBackground(new java.awt.Color(225, 195, 145));

        javax.swing.GroupLayout jPanel223Layout = new javax.swing.GroupLayout(jPanel223);
        jPanel223.setLayout(jPanel223Layout);
        jPanel223Layout.setHorizontalGroup(
            jPanel223Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel223Layout.createSequentialGroup()
                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField51))
        );
        jPanel223Layout.setVerticalGroup(
            jPanel223Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel223Layout.createSequentialGroup()
                .addGroup(jPanel223Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel115.add(jPanel223, java.awt.BorderLayout.CENTER);

        jPanel85.add(jPanel115, java.awt.BorderLayout.LINE_START);

        jPanel220.setPreferredSize(new java.awt.Dimension(423, 42));
        jPanel220.setLayout(new java.awt.BorderLayout());

        jPanel121.setBackground(new java.awt.Color(91, 48, 22));
        jPanel121.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel47.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Estado civil");

        javax.swing.GroupLayout jPanel121Layout = new javax.swing.GroupLayout(jPanel121);
        jPanel121.setLayout(jPanel121Layout);
        jPanel121Layout.setHorizontalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel121Layout.setVerticalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel220.add(jPanel121, java.awt.BorderLayout.LINE_START);

        jTextField54.setEditable(false);
        jTextField54.setBackground(new java.awt.Color(225, 195, 145));
        jTextField54.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField54.setForeground(new java.awt.Color(91, 48, 22));

        comboBoxEstadoCivil.setBackground(new java.awt.Color(225, 195, 145));
        comboBoxEstadoCivil.setForeground(new java.awt.Color(91, 48, 22));
        comboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteira", "Casado", "Separado", "Divorciado", "Viuvo" }));

        javax.swing.GroupLayout jPanel222Layout = new javax.swing.GroupLayout(jPanel222);
        jPanel222.setLayout(jPanel222Layout);
        jPanel222Layout.setHorizontalGroup(
            jPanel222Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel222Layout.createSequentialGroup()
                .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField54))
        );
        jPanel222Layout.setVerticalGroup(
            jPanel222Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel222Layout.createSequentialGroup()
                .addGroup(jPanel222Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel220.add(jPanel222, java.awt.BorderLayout.CENTER);

        jPanel85.add(jPanel220, java.awt.BorderLayout.LINE_END);

        tela_cadastro_funcionarios_superior.add(jPanel85);

        jPanel96.setBackground(new java.awt.Color(251, 245, 238));
        jPanel96.setLayout(new java.awt.BorderLayout());

        jPanel116.setPreferredSize(new java.awt.Dimension(430, 42));
        jPanel116.setLayout(new java.awt.BorderLayout());

        jPanel135.setBackground(new java.awt.Color(91, 48, 22));
        jPanel135.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel23.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CPF");

        javax.swing.GroupLayout jPanel135Layout = new javax.swing.GroupLayout(jPanel135);
        jPanel135.setLayout(jPanel135Layout);
        jPanel135Layout.setHorizontalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel135Layout.setVerticalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel116.add(jPanel135, java.awt.BorderLayout.LINE_START);

        campoCpfFuncionario.setBackground(new java.awt.Color(225, 195, 145));
        campoCpfFuncionario.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel137Layout = new javax.swing.GroupLayout(jPanel137);
        jPanel137.setLayout(jPanel137Layout);
        jPanel137Layout.setHorizontalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCpfFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );
        jPanel137Layout.setVerticalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCpfFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel116.add(jPanel137, java.awt.BorderLayout.CENTER);

        jPanel96.add(jPanel116, java.awt.BorderLayout.LINE_START);

        jPanel117.setPreferredSize(new java.awt.Dimension(423, 42));
        jPanel117.setLayout(new java.awt.BorderLayout());

        jPanel122.setBackground(new java.awt.Color(91, 48, 22));
        jPanel122.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel33.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Escolaridade");

        javax.swing.GroupLayout jPanel122Layout = new javax.swing.GroupLayout(jPanel122);
        jPanel122.setLayout(jPanel122Layout);
        jPanel122Layout.setHorizontalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel122Layout.setVerticalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel117.add(jPanel122, java.awt.BorderLayout.LINE_START);

        jTextField55.setEditable(false);
        jTextField55.setBackground(new java.awt.Color(225, 195, 145));
        jTextField55.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField55.setForeground(new java.awt.Color(91, 48, 22));

        comboBoxEscolariedade.setBackground(new java.awt.Color(225, 195, 145));
        comboBoxEscolariedade.setForeground(new java.awt.Color(91, 42, 22));
        comboBoxEscolariedade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Educação infantil incompleto", "Educação infantil completo", "Fundamental incompleto", "Fundamental completo", "Médio incompleto", "Médio completo", "Ensino Superior incompleto", "Ensino superior completo", "Pós-graduação incompleto", "Pós-graduação completo", "Mestrado incompleto", "Mestrado completo", "Doutorado incompleto", "Doutorado completo" }));

        javax.swing.GroupLayout jPanel132Layout = new javax.swing.GroupLayout(jPanel132);
        jPanel132.setLayout(jPanel132Layout);
        jPanel132Layout.setHorizontalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel132Layout.createSequentialGroup()
                .addComponent(comboBoxEscolariedade, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField55)
                .addGap(284, 284, 284))
        );
        jPanel132Layout.setVerticalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel132Layout.createSequentialGroup()
                .addGroup(jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBoxEscolariedade)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel117.add(jPanel132, java.awt.BorderLayout.CENTER);

        jPanel96.add(jPanel117, java.awt.BorderLayout.LINE_END);

        tela_cadastro_funcionarios_superior.add(jPanel96);

        jPanel97.setBackground(new java.awt.Color(251, 245, 238));
        jPanel97.setLayout(new java.awt.BorderLayout());

        jPanel118.setPreferredSize(new java.awt.Dimension(430, 42));
        jPanel118.setLayout(new java.awt.BorderLayout());

        jPanel136.setBackground(new java.awt.Color(91, 48, 22));
        jPanel136.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel32.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Data de nascimento");

        javax.swing.GroupLayout jPanel136Layout = new javax.swing.GroupLayout(jPanel136);
        jPanel136.setLayout(jPanel136Layout);
        jPanel136Layout.setHorizontalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel136Layout.setVerticalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel118.add(jPanel136, java.awt.BorderLayout.LINE_START);

        campoDataNasciemntoFuncionario.setBackground(new java.awt.Color(225, 195, 145));
        campoDataNasciemntoFuncionario.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel194Layout = new javax.swing.GroupLayout(jPanel194);
        jPanel194.setLayout(jPanel194Layout);
        jPanel194Layout.setHorizontalGroup(
            jPanel194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoDataNasciemntoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );
        jPanel194Layout.setVerticalGroup(
            jPanel194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoDataNasciemntoFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel118.add(jPanel194, java.awt.BorderLayout.CENTER);

        jPanel97.add(jPanel118, java.awt.BorderLayout.LINE_START);

        jPanel119.setPreferredSize(new java.awt.Dimension(423, 42));
        jPanel119.setLayout(new java.awt.BorderLayout());

        jPanel133.setBackground(new java.awt.Color(91, 48, 22));
        jPanel133.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel34.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("CEP");

        javax.swing.GroupLayout jPanel133Layout = new javax.swing.GroupLayout(jPanel133);
        jPanel133.setLayout(jPanel133Layout);
        jPanel133Layout.setHorizontalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel133Layout.setVerticalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel119.add(jPanel133, java.awt.BorderLayout.LINE_START);

        campoCepFuncionario.setBackground(new java.awt.Color(225, 195, 145));
        campoCepFuncionario.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel134Layout = new javax.swing.GroupLayout(jPanel134);
        jPanel134.setLayout(jPanel134Layout);
        jPanel134Layout.setHorizontalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCepFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );
        jPanel134Layout.setVerticalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCepFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel119.add(jPanel134, java.awt.BorderLayout.CENTER);

        jPanel97.add(jPanel119, java.awt.BorderLayout.LINE_END);

        tela_cadastro_funcionarios_superior.add(jPanel97);

        painel_principal_superior.add(tela_cadastro_funcionarios_superior, "card3");

        tela_gerenciamento_funcionarios_superior.setBackground(new java.awt.Color(251, 248, 248));
        tela_gerenciamento_funcionarios_superior.setLayout(new java.awt.BorderLayout());

        jLabel6.setBackground(new java.awt.Color(91, 48, 22));
        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(91, 48, 22));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gerenciamento de Funcionario");
        tela_gerenciamento_funcionarios_superior.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        tabelaFuncionarios.setAutoCreateRowSorter(true);
        tabelaFuncionarios.setBackground(new java.awt.Color(225, 195, 145));
        tabelaFuncionarios.setFont(new java.awt.Font("Microsoft Tai Le", 3, 12)); // NOI18N
        tabelaFuncionarios.setForeground(new java.awt.Color(91, 48, 22));
        tabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Telefone", "Estado civil", "CPF", "Escolaridade", "Data de nascimento", "CEP", "Nome da rua", "Cidade", "Número", "Complemento", "Estado", "Salário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Object.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaFuncionarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabelaFuncionarios.setGridColor(new java.awt.Color(91, 48, 22));
        tabelaFuncionarios.setSelectionBackground(new java.awt.Color(150, 80, 44));
        tabelaFuncionarios.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelaFuncionarios.setShowGrid(true);
        tabelaFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionarios);

        tela_gerenciamento_funcionarios_superior.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        painel_principal_superior.add(tela_gerenciamento_funcionarios_superior, "card2");

        tela_relatorios_superior.setBackground(new java.awt.Color(251, 245, 238));
        tela_relatorios_superior.setLayout(new java.awt.BorderLayout());

        jPanel224.setBackground(new java.awt.Color(251, 245, 238));
        jPanel224.setPreferredSize(new java.awt.Dimension(860, 20));

        jLabel54.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(91, 48, 22));
        jLabel54.setText("Relatórios");

        javax.swing.GroupLayout jPanel224Layout = new javax.swing.GroupLayout(jPanel224);
        jPanel224.setLayout(jPanel224Layout);
        jPanel224Layout.setHorizontalGroup(
            jPanel224Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel224Layout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(jLabel54)
                .addContainerGap(468, Short.MAX_VALUE))
        );
        jPanel224Layout.setVerticalGroup(
            jPanel224Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel224Layout.createSequentialGroup()
                .addComponent(jLabel54)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tela_relatorios_superior.add(jPanel224, java.awt.BorderLayout.PAGE_START);

        jPanel225.setBackground(new java.awt.Color(251, 245, 238));
        jPanel225.setLayout(new java.awt.GridLayout(3, 3, 4, 3));

        jPanel235.setBackground(new java.awt.Color(251, 245, 238));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(91, 48, 22));
        jLabel57.setText("Valor Total no Estoque R$");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(91, 48, 22));
        jLabel8.setText("Quantidade de Produtos Unicos:");

        valorTotalEstoque.setBackground(new java.awt.Color(187, 187, 187));
        valorTotalEstoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valorTotalEstoque.setForeground(new java.awt.Color(225, 195, 145));
        valorTotalEstoque.setText("jLabel57");

        quantidadeProdutosUnicos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quantidadeProdutosUnicos.setForeground(new java.awt.Color(225, 195, 145));
        quantidadeProdutosUnicos.setText("jLabel58");

        javax.swing.GroupLayout jPanel235Layout = new javax.swing.GroupLayout(jPanel235);
        jPanel235.setLayout(jPanel235Layout);
        jPanel235Layout.setHorizontalGroup(
            jPanel235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel235Layout.createSequentialGroup()
                .addGroup(jPanel235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel235Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadeProdutosUnicos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel235Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTotalEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 528, Short.MAX_VALUE))
        );
        jPanel235Layout.setVerticalGroup(
            jPanel235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel235Layout.createSequentialGroup()
                .addGroup(jPanel235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorTotalEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(quantidadeProdutosUnicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel225.add(jPanel235);

        jPanel226.setBackground(new java.awt.Color(251, 245, 238));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(91, 48, 22));
        jLabel55.setText("Quantidade de Produtos Geral:");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(91, 48, 22));
        jLabel56.setText("Quantidade de Funcionarios:");

        quantidadeProdutosGeral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quantidadeProdutosGeral.setForeground(new java.awt.Color(225, 195, 145));
        quantidadeProdutosGeral.setText("jLabel59");

        quantidadeFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quantidadeFuncionarios.setForeground(new java.awt.Color(225, 195, 145));
        quantidadeFuncionarios.setText("jLabel60");

        javax.swing.GroupLayout jPanel226Layout = new javax.swing.GroupLayout(jPanel226);
        jPanel226.setLayout(jPanel226Layout);
        jPanel226Layout.setHorizontalGroup(
            jPanel226Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel226Layout.createSequentialGroup()
                .addGroup(jPanel226Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel226Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadeProdutosGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel226Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 546, Short.MAX_VALUE))
        );
        jPanel226Layout.setVerticalGroup(
            jPanel226Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel226Layout.createSequentialGroup()
                .addGroup(jPanel226Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(quantidadeProdutosGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel226Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(quantidadeFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel225.add(jPanel226);

        tela_relatorios_superior.add(jPanel225, java.awt.BorderLayout.CENTER);

        painel_principal_superior.add(tela_relatorios_superior, "card1");

        tela_sobre_superior.setBackground(new java.awt.Color(251, 245, 238));

        jLabel9.setBackground(new java.awt.Color(91, 48, 22));
        jLabel9.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(91, 48, 22));
        jLabel9.setText("EQUIPE DE DESENVOLVIMENTO");

        jTextField10.setBackground(new java.awt.Color(251, 245, 238));
        jTextField10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(91, 48, 22));
        jTextField10.setText("- Andrey Marquez da Cruz (10724112122)");
        jTextField10.setBorder(null);

        jTextField11.setBackground(new java.awt.Color(251, 245, 238));
        jTextField11.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(91, 48, 22));
        jTextField11.setText("(48) 99962-3169");
        jTextField11.setBorder(null);

        jTextField13.setBackground(new java.awt.Color(251, 245, 238));
        jTextField13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(91, 48, 22));
        jTextField13.setText("- João Victor Carniel (1072414963)");
        jTextField13.setBorder(null);

        jTextField15.setBackground(new java.awt.Color(251, 245, 238));
        jTextField15.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(91, 48, 22));
        jTextField15.setText("- João Pedro Braga da Silva (10724113794)");
        jTextField15.setBorder(null);

        jTextField16.setBackground(new java.awt.Color(251, 245, 238));
        jTextField16.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(91, 48, 22));
        jTextField16.setText("- Kamily Cúrcio de Souza (10724114384)");
        jTextField16.setBorder(null);

        jTextField36.setBackground(new java.awt.Color(251, 245, 238));
        jTextField36.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField36.setForeground(new java.awt.Color(91, 48, 22));
        jTextField36.setText("Ciência da Computação");
        jTextField36.setBorder(null);

        jTextField37.setBackground(new java.awt.Color(251, 245, 238));
        jTextField37.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(91, 48, 22));
        jTextField37.setText("- Miguel Malheiro Kirchhof (107241124141)");
        jTextField37.setBorder(null);

        jTextField38.setBackground(new java.awt.Color(251, 245, 238));
        jTextField38.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(91, 48, 22));
        jTextField38.setText("Análise e Desenvolvimento de Sistemas");
        jTextField38.setBorder(null);

        jTextField39.setBackground(new java.awt.Color(251, 245, 238));
        jTextField39.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField39.setForeground(new java.awt.Color(91, 48, 22));
        jTextField39.setText("(48) 98822-2929");
        jTextField39.setBorder(null);

        jTextField40.setBackground(new java.awt.Color(251, 245, 238));
        jTextField40.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField40.setForeground(new java.awt.Color(91, 48, 22));
        jTextField40.setText("(48) 99143-9220");
        jTextField40.setBorder(null);

        jTextField41.setBackground(new java.awt.Color(251, 245, 238));
        jTextField41.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField41.setForeground(new java.awt.Color(91, 48, 22));
        jTextField41.setText("Ciência da Computação");
        jTextField41.setBorder(null);

        jTextField42.setBackground(new java.awt.Color(251, 245, 238));
        jTextField42.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField42.setForeground(new java.awt.Color(91, 48, 22));
        jTextField42.setText("Sistemas de Informação");
        jTextField42.setBorder(null);

        jTextField43.setBackground(new java.awt.Color(251, 245, 238));
        jTextField43.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(91, 48, 22));
        jTextField43.setText("Sistemas de Informação");
        jTextField43.setBorder(null);

        jTextField44.setBackground(new java.awt.Color(251, 245, 238));
        jTextField44.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField44.setForeground(new java.awt.Color(91, 48, 22));
        jTextField44.setText("(48) 98486-7263");
        jTextField44.setBorder(null);

        jTextField45.setBackground(new java.awt.Color(251, 245, 238));
        jTextField45.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField45.setForeground(new java.awt.Color(91, 48, 22));
        jTextField45.setText("(48) 99155-2787");
        jTextField45.setBorder(null);

        javax.swing.GroupLayout tela_sobre_superiorLayout = new javax.swing.GroupLayout(tela_sobre_superior);
        tela_sobre_superior.setLayout(tela_sobre_superiorLayout);
        tela_sobre_superiorLayout.setHorizontalGroup(
            tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela_sobre_superiorLayout.createSequentialGroup()
                .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tela_sobre_superiorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tela_sobre_superiorLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tela_sobre_superiorLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tela_sobre_superiorLayout.createSequentialGroup()
                                .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela_sobre_superiorLayout.createSequentialGroup()
                                        .addGap(0, 86, Short.MAX_VALUE)
                                        .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(156, 156, 156))
                                    .addGroup(tela_sobre_superiorLayout.createSequentialGroup()
                                        .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tela_sobre_superiorLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18))
                            .addGroup(tela_sobre_superiorLayout.createSequentialGroup()
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela_sobre_superiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(320, 320, 320))
        );
        tela_sobre_superiorLayout.setVerticalGroup(
            tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_sobre_superiorLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_sobre_superiorLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tela_sobre_superiorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painel_principal_superior.add(tela_sobre_superior, "card6");

        roundedPanel4.add(painel_principal_superior, java.awt.BorderLayout.CENTER);

        jPanel25.setBackground(new java.awt.Color(251, 245, 238));
        jPanel25.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel4.add(jPanel25, java.awt.BorderLayout.WEST);

        jPanel27.setBackground(new java.awt.Color(251, 245, 238));
        jPanel27.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel4.add(jPanel27, java.awt.BorderLayout.EAST);

        jPanel4.add(roundedPanel4, java.awt.BorderLayout.PAGE_START);

        roundedPanel5.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel5.setMinimumSize(new java.awt.Dimension(900, 400));
        roundedPanel5.setPreferredSize(new java.awt.Dimension(900, 290));
        roundedPanel5.setRoundBottomLeft(50);
        roundedPanel5.setRoundBottomRight(50);
        roundedPanel5.setRoundTopLeft(50);
        roundedPanel5.setRoundTopRight(50);
        roundedPanel5.setLayout(new java.awt.BorderLayout());

        painel_principal_inferior.setBackground(new java.awt.Color(251, 245, 238));
        painel_principal_inferior.setLayout(new java.awt.CardLayout());

        tela_cadastro_produtos_inferior.setBackground(new java.awt.Color(251, 245, 238));
        tela_cadastro_produtos_inferior.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(91, 48, 22));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastro de produto avançado");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(209, 30));
        tela_cadastro_produtos_inferior.add(jLabel3, java.awt.BorderLayout.NORTH);

        painel_campos_produtos_inferior.setBackground(new java.awt.Color(251, 245, 238));
        painel_campos_produtos_inferior.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        jPanel39.setBackground(new java.awt.Color(251, 245, 238));
        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel60.setBackground(new java.awt.Color(251, 245, 238));
        jPanel60.setPreferredSize(new java.awt.Dimension(420, 0));
        jPanel60.setLayout(new java.awt.BorderLayout());

        jPanel63.setBackground(new java.awt.Color(91, 48, 22));
        jPanel63.setPreferredSize(new java.awt.Dimension(125, 60));

        jLabel20.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(251, 245, 238));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("<html>Data<br>de cadastro</html>");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel60.add(jPanel63, java.awt.BorderLayout.WEST);

        jPanel62.setBackground(new java.awt.Color(225, 195, 145));
        jPanel62.setPreferredSize(new java.awt.Dimension(290, 60));

        campoDataCadastro.setBackground(new java.awt.Color(225, 195, 145));
        campoDataCadastro.setBorder(null);

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel60.add(jPanel62, java.awt.BorderLayout.EAST);

        jPanel39.add(jPanel60, java.awt.BorderLayout.WEST);

        jPanel61.setBackground(new java.awt.Color(251, 245, 238));
        jPanel61.setPreferredSize(new java.awt.Dimension(420, 60));
        jPanel61.setLayout(new java.awt.BorderLayout());

        jPanel71.setBackground(new java.awt.Color(91, 48, 22));
        jPanel71.setPreferredSize(new java.awt.Dimension(125, 60));

        jLabel19.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(251, 245, 238));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Descricao");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel61.add(jPanel71, java.awt.BorderLayout.WEST);

        jPanel68.setBackground(new java.awt.Color(225, 195, 145));
        jPanel68.setPreferredSize(new java.awt.Dimension(290, 60));

        campoDescricao.setBackground(new java.awt.Color(225, 195, 145));
        campoDescricao.setBorder(null);

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel61.add(jPanel68, java.awt.BorderLayout.EAST);

        jPanel39.add(jPanel61, java.awt.BorderLayout.EAST);

        painel_campos_produtos_inferior.add(jPanel39);

        jPanel40.setBackground(new java.awt.Color(251, 245, 238));
        jPanel40.setLayout(new java.awt.BorderLayout());

        jPanel67.setBackground(new java.awt.Color(251, 245, 238));
        jPanel67.setPreferredSize(new java.awt.Dimension(420, 0));
        jPanel67.setLayout(new java.awt.BorderLayout());

        jPanel75.setBackground(new java.awt.Color(91, 48, 22));
        jPanel75.setPreferredSize(new java.awt.Dimension(125, 60));

        jLabel21.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(251, 245, 238));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("<html>Quantidade<br>total (estoque)</html>");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel21.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel67.add(jPanel75, java.awt.BorderLayout.WEST);

        jPanel74.setBackground(new java.awt.Color(225, 195, 145));
        jPanel74.setPreferredSize(new java.awt.Dimension(290, 60));

        campoQuantidade.setBackground(new java.awt.Color(225, 195, 145));
        campoQuantidade.setBorder(null);

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel67.add(jPanel74, java.awt.BorderLayout.EAST);

        jPanel40.add(jPanel67, java.awt.BorderLayout.WEST);

        jPanel66.setBackground(new java.awt.Color(251, 245, 238));
        jPanel66.setPreferredSize(new java.awt.Dimension(420, 60));
        jPanel66.setLayout(new java.awt.BorderLayout());
        jPanel40.add(jPanel66, java.awt.BorderLayout.EAST);

        painel_campos_produtos_inferior.add(jPanel40);

        jPanel41.setBackground(new java.awt.Color(251, 245, 238));
        jPanel41.setLayout(new java.awt.BorderLayout());

        jPanel69.setBackground(new java.awt.Color(251, 245, 238));
        jPanel69.setPreferredSize(new java.awt.Dimension(420, 0));

        botao_cadastrar.setBackground(new java.awt.Color(251, 245, 238));
        botao_cadastrar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        botao_cadastrar.setForeground(new java.awt.Color(91, 48, 22));
        botao_cadastrar.setText("Cadastrar");
        botao_cadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(91, 48, 22), 1, true));
        botao_cadastrar.setPreferredSize(new java.awt.Dimension(75, 15));
        botao_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_cadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_cadastrarMouseExited(evt);
            }
        });
        botao_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel69Layout.createSequentialGroup()
                .addGap(0, 320, Short.MAX_VALUE)
                .addComponent(botao_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel69Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(botao_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel41.add(jPanel69, java.awt.BorderLayout.EAST);

        jPanel65.setBackground(new java.awt.Color(251, 245, 238));
        jPanel65.setPreferredSize(new java.awt.Dimension(420, 0));

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel41.add(jPanel65, java.awt.BorderLayout.WEST);

        painel_campos_produtos_inferior.add(jPanel41);

        tela_cadastro_produtos_inferior.add(painel_campos_produtos_inferior, java.awt.BorderLayout.CENTER);

        painel_principal_inferior.add(tela_cadastro_produtos_inferior, "card5");

        tela_gerenciamento_produtos_inferior.setBackground(new java.awt.Color(251, 245, 238));
        tela_gerenciamento_produtos_inferior.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(91, 48, 22));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Editar produto");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setPreferredSize(new java.awt.Dimension(98, 30));
        tela_gerenciamento_produtos_inferior.add(jLabel4, java.awt.BorderLayout.NORTH);

        jPanel70.setBackground(new java.awt.Color(251, 245, 238));
        jPanel70.setLayout(new java.awt.GridLayout(6, 2, 10, 5));

        jPanel72.setBackground(new java.awt.Color(251, 245, 238));
        jPanel72.setLayout(new java.awt.BorderLayout());
        jPanel70.add(jPanel72);

        jPanel73.setBackground(new java.awt.Color(251, 245, 238));
        jPanel73.setLayout(new java.awt.BorderLayout());
        jPanel70.add(jPanel73);

        jPanel76.setBackground(new java.awt.Color(251, 245, 238));
        jPanel76.setLayout(new java.awt.BorderLayout());

        jPanel86.setBackground(new java.awt.Color(91, 48, 22));
        jPanel86.setPreferredSize(new java.awt.Dimension(110, 29));

        jPanel107.setBackground(new java.awt.Color(91, 48, 22));
        jPanel107.setPreferredSize(new java.awt.Dimension(110, 29));

        jLabel24.setFont(new java.awt.Font("Microsoft Tai Le", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(251, 245, 238));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Titulo");

        javax.swing.GroupLayout jPanel107Layout = new javax.swing.GroupLayout(jPanel107);
        jPanel107.setLayout(jPanel107Layout);
        jPanel107Layout.setHorizontalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel107Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel107Layout.setVerticalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel86Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel86Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel76.add(jPanel86, java.awt.BorderLayout.WEST);

        jPanel98.setBackground(new java.awt.Color(225, 195, 145));
        jPanel98.setPreferredSize(new java.awt.Dimension(310, 29));

        campoTitulo_edicao.setBackground(new java.awt.Color(225, 195, 145));
        campoTitulo_edicao.setForeground(new java.awt.Color(91, 48, 22));
        campoTitulo_edicao.setBorder(null);

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoTitulo_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoTitulo_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel76.add(jPanel98, java.awt.BorderLayout.EAST);

        jPanel70.add(jPanel76);

        jPanel77.setBackground(new java.awt.Color(251, 245, 238));
        jPanel77.setLayout(new java.awt.BorderLayout());

        jPanel87.setBackground(new java.awt.Color(91, 48, 22));
        jPanel87.setPreferredSize(new java.awt.Dimension(110, 29));

        jPanel108.setBackground(new java.awt.Color(91, 48, 22));
        jPanel108.setPreferredSize(new java.awt.Dimension(110, 29));

        jLabel25.setFont(new java.awt.Font("Microsoft Tai Le", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(251, 245, 238));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Preço (R$/un.)");

        javax.swing.GroupLayout jPanel108Layout = new javax.swing.GroupLayout(jPanel108);
        jPanel108.setLayout(jPanel108Layout);
        jPanel108Layout.setHorizontalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel108Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel108Layout.setVerticalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel87Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel87Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel77.add(jPanel87, java.awt.BorderLayout.WEST);

        jPanel99.setBackground(new java.awt.Color(225, 195, 145));
        jPanel99.setPreferredSize(new java.awt.Dimension(310, 29));

        campoPreco_edicao.setBackground(new java.awt.Color(225, 195, 145));
        campoPreco_edicao.setForeground(new java.awt.Color(91, 48, 22));
        campoPreco_edicao.setBorder(null);

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPreco_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoPreco_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel77.add(jPanel99, java.awt.BorderLayout.EAST);

        jPanel70.add(jPanel77);

        jPanel78.setBackground(new java.awt.Color(251, 245, 238));
        jPanel78.setLayout(new java.awt.BorderLayout());

        jPanel89.setBackground(new java.awt.Color(91, 48, 22));
        jPanel89.setPreferredSize(new java.awt.Dimension(110, 29));

        jPanel109.setBackground(new java.awt.Color(91, 48, 22));
        jPanel109.setPreferredSize(new java.awt.Dimension(110, 29));

        jLabel26.setFont(new java.awt.Font("Microsoft Tai Le", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(251, 245, 238));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Autor");

        javax.swing.GroupLayout jPanel109Layout = new javax.swing.GroupLayout(jPanel109);
        jPanel109.setLayout(jPanel109Layout);
        jPanel109Layout.setHorizontalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel109Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel109Layout.setVerticalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel89Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel89Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel78.add(jPanel89, java.awt.BorderLayout.WEST);

        jPanel100.setBackground(new java.awt.Color(225, 195, 145));
        jPanel100.setPreferredSize(new java.awt.Dimension(310, 29));

        campoAutor_edicao.setBackground(new java.awt.Color(225, 195, 145));
        campoAutor_edicao.setForeground(new java.awt.Color(91, 48, 22));
        campoAutor_edicao.setBorder(null);

        javax.swing.GroupLayout jPanel100Layout = new javax.swing.GroupLayout(jPanel100);
        jPanel100.setLayout(jPanel100Layout);
        jPanel100Layout.setHorizontalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoAutor_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel100Layout.setVerticalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoAutor_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel78.add(jPanel100, java.awt.BorderLayout.EAST);

        jPanel70.add(jPanel78);

        jPanel79.setBackground(new java.awt.Color(251, 245, 238));
        jPanel79.setLayout(new java.awt.BorderLayout());

        jPanel88.setBackground(new java.awt.Color(91, 48, 22));
        jPanel88.setPreferredSize(new java.awt.Dimension(110, 29));

        jPanel110.setBackground(new java.awt.Color(91, 48, 22));
        jPanel110.setPreferredSize(new java.awt.Dimension(110, 29));

        jLabel27.setFont(new java.awt.Font("Microsoft Tai Le", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(251, 245, 238));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Editora");

        javax.swing.GroupLayout jPanel110Layout = new javax.swing.GroupLayout(jPanel110);
        jPanel110.setLayout(jPanel110Layout);
        jPanel110Layout.setHorizontalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel110Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel110Layout.setVerticalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel88Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel88Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel79.add(jPanel88, java.awt.BorderLayout.WEST);

        jPanel101.setBackground(new java.awt.Color(225, 195, 145));
        jPanel101.setPreferredSize(new java.awt.Dimension(310, 29));

        campoEditora_edicao.setBackground(new java.awt.Color(225, 195, 145));
        campoEditora_edicao.setForeground(new java.awt.Color(91, 48, 22));
        campoEditora_edicao.setBorder(null);

        javax.swing.GroupLayout jPanel101Layout = new javax.swing.GroupLayout(jPanel101);
        jPanel101.setLayout(jPanel101Layout);
        jPanel101Layout.setHorizontalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel101Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoEditora_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel101Layout.setVerticalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEditora_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel79.add(jPanel101, java.awt.BorderLayout.EAST);

        jPanel70.add(jPanel79);

        jPanel80.setBackground(new java.awt.Color(251, 245, 238));
        jPanel80.setLayout(new java.awt.BorderLayout());

        jPanel90.setBackground(new java.awt.Color(91, 48, 22));
        jPanel90.setPreferredSize(new java.awt.Dimension(110, 29));

        jPanel111.setBackground(new java.awt.Color(91, 48, 22));
        jPanel111.setPreferredSize(new java.awt.Dimension(110, 29));

        jLabel28.setFont(new java.awt.Font("Microsoft Tai Le", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(251, 245, 238));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Genero");

        javax.swing.GroupLayout jPanel111Layout = new javax.swing.GroupLayout(jPanel111);
        jPanel111.setLayout(jPanel111Layout);
        jPanel111Layout.setHorizontalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel111Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel111Layout.setVerticalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel90Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel90Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel80.add(jPanel90, java.awt.BorderLayout.WEST);

        jPanel102.setBackground(new java.awt.Color(225, 195, 145));
        jPanel102.setPreferredSize(new java.awt.Dimension(310, 29));

        campoGenero1.setBackground(new java.awt.Color(225, 195, 145));
        campoGenero1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 11)); // NOI18N
        campoGenero1.setForeground(new java.awt.Color(91, 48, 22));
        campoGenero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ficção Literária", "Romance", "Mistério e Suspense", "Ficção Científica e Fantasia", "Autoajuda e Desenvolvimento Pessoal", "História e Biografia", "Política e Atualidades", "Religião e Espiritualidade", "Infantil e Juvenil" }));
        campoGenero1.setBorder(null);
        campoGenero1.setFocusable(false);

        javax.swing.GroupLayout jPanel102Layout = new javax.swing.GroupLayout(jPanel102);
        jPanel102.setLayout(jPanel102Layout);
        jPanel102Layout.setHorizontalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel102Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoGenero1, 0, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel102Layout.setVerticalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoGenero1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel80.add(jPanel102, java.awt.BorderLayout.EAST);

        jPanel70.add(jPanel80);

        jPanel81.setBackground(new java.awt.Color(251, 245, 238));
        jPanel81.setLayout(new java.awt.BorderLayout());

        jPanel91.setBackground(new java.awt.Color(91, 48, 22));
        jPanel91.setPreferredSize(new java.awt.Dimension(110, 29));

        jPanel112.setBackground(new java.awt.Color(91, 48, 22));
        jPanel112.setPreferredSize(new java.awt.Dimension(110, 29));

        jLabel29.setFont(new java.awt.Font("Microsoft Tai Le", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(251, 245, 238));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Quantidade");

        javax.swing.GroupLayout jPanel112Layout = new javax.swing.GroupLayout(jPanel112);
        jPanel112.setLayout(jPanel112Layout);
        jPanel112Layout.setHorizontalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel112Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel112Layout.setVerticalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel91Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel91Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel81.add(jPanel91, java.awt.BorderLayout.WEST);

        jPanel103.setBackground(new java.awt.Color(225, 195, 145));
        jPanel103.setPreferredSize(new java.awt.Dimension(310, 29));

        campoQuantidade_edicao.setBackground(new java.awt.Color(225, 195, 145));
        campoQuantidade_edicao.setForeground(new java.awt.Color(91, 48, 22));
        campoQuantidade_edicao.setBorder(null);

        javax.swing.GroupLayout jPanel103Layout = new javax.swing.GroupLayout(jPanel103);
        jPanel103.setLayout(jPanel103Layout);
        jPanel103Layout.setHorizontalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoQuantidade_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel103Layout.setVerticalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoQuantidade_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel81.add(jPanel103, java.awt.BorderLayout.EAST);

        jPanel70.add(jPanel81);

        jPanel82.setBackground(new java.awt.Color(251, 245, 238));
        jPanel82.setLayout(new java.awt.BorderLayout());

        jPanel92.setBackground(new java.awt.Color(91, 48, 22));
        jPanel92.setPreferredSize(new java.awt.Dimension(110, 29));

        jPanel113.setBackground(new java.awt.Color(91, 48, 22));
        jPanel113.setPreferredSize(new java.awt.Dimension(110, 29));

        jLabel30.setFont(new java.awt.Font("Microsoft Tai Le", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(251, 245, 238));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Descricao");

        javax.swing.GroupLayout jPanel113Layout = new javax.swing.GroupLayout(jPanel113);
        jPanel113.setLayout(jPanel113Layout);
        jPanel113Layout.setHorizontalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel113Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel113Layout.setVerticalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel92Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel92Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel82.add(jPanel92, java.awt.BorderLayout.WEST);

        jPanel104.setBackground(new java.awt.Color(225, 195, 145));
        jPanel104.setPreferredSize(new java.awt.Dimension(310, 29));

        campoDescricao_edicao.setBackground(new java.awt.Color(225, 195, 145));
        campoDescricao_edicao.setForeground(new java.awt.Color(91, 48, 22));
        campoDescricao_edicao.setBorder(null);

        javax.swing.GroupLayout jPanel104Layout = new javax.swing.GroupLayout(jPanel104);
        jPanel104.setLayout(jPanel104Layout);
        jPanel104Layout.setHorizontalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel104Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoDescricao_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel104Layout.setVerticalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoDescricao_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel82.add(jPanel104, java.awt.BorderLayout.EAST);

        jPanel70.add(jPanel82);

        jPanel83.setBackground(new java.awt.Color(251, 245, 238));
        jPanel83.setLayout(new java.awt.BorderLayout());

        jPanel93.setBackground(new java.awt.Color(91, 48, 22));
        jPanel93.setPreferredSize(new java.awt.Dimension(110, 29));

        jPanel114.setBackground(new java.awt.Color(91, 48, 22));
        jPanel114.setPreferredSize(new java.awt.Dimension(110, 29));

        jLabel31.setFont(new java.awt.Font("Microsoft Tai Le", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(251, 245, 238));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Ano de publicacao");

        javax.swing.GroupLayout jPanel114Layout = new javax.swing.GroupLayout(jPanel114);
        jPanel114.setLayout(jPanel114Layout);
        jPanel114Layout.setHorizontalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel114Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel114Layout.setVerticalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel93Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel93Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel83.add(jPanel93, java.awt.BorderLayout.WEST);

        jPanel105.setBackground(new java.awt.Color(225, 195, 145));
        jPanel105.setPreferredSize(new java.awt.Dimension(310, 29));

        campoAnoPublicacao_edicao.setBackground(new java.awt.Color(225, 195, 145));
        campoAnoPublicacao_edicao.setForeground(new java.awt.Color(91, 48, 22));
        campoAnoPublicacao_edicao.setBorder(null);

        javax.swing.GroupLayout jPanel105Layout = new javax.swing.GroupLayout(jPanel105);
        jPanel105.setLayout(jPanel105Layout);
        jPanel105Layout.setHorizontalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel105Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoAnoPublicacao_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel105Layout.setVerticalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoAnoPublicacao_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel83.add(jPanel105, java.awt.BorderLayout.EAST);

        jPanel70.add(jPanel83);

        jPanel94.setBackground(new java.awt.Color(251, 245, 238));

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jPanel70.add(jPanel94);

        jPanel95.setBackground(new java.awt.Color(251, 245, 238));

        botao_atualizar.setBackground(new java.awt.Color(251, 245, 238));
        botao_atualizar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        botao_atualizar.setForeground(new java.awt.Color(91, 48, 22));
        botao_atualizar.setText("Atualizar");
        botao_atualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(91, 48, 22)));
        botao_atualizar.setFocusPainted(false);
        botao_atualizar.setFocusable(false);
        botao_atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_atualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_atualizarMouseExited(evt);
            }
        });
        botao_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_atualizarActionPerformed(evt);
            }
        });

        botao_cancelar.setBackground(new java.awt.Color(251, 245, 238));
        botao_cancelar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        botao_cancelar.setForeground(new java.awt.Color(82, 82, 82));
        botao_cancelar.setText("Cancelar");
        botao_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 82, 82)));
        botao_cancelar.setFocusPainted(false);
        botao_cancelar.setFocusable(false);
        botao_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_cancelarMouseExited(evt);
            }
        });

        botao_deletar.setBackground(new java.awt.Color(251, 245, 238));
        botao_deletar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        botao_deletar.setForeground(new java.awt.Color(215, 66, 65));
        botao_deletar.setText("Deletar");
        botao_deletar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(215, 66, 65)));
        botao_deletar.setFocusPainted(false);
        botao_deletar.setFocusable(false);
        botao_deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_deletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_deletarMouseExited(evt);
            }
        });
        botao_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_deletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel95Layout.createSequentialGroup()
                .addGap(0, 113, Short.MAX_VALUE)
                .addComponent(botao_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botao_atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botao_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botao_deletar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel70.add(jPanel95);

        tela_gerenciamento_produtos_inferior.add(jPanel70, java.awt.BorderLayout.CENTER);

        painel_principal_inferior.add(tela_gerenciamento_produtos_inferior, "card4");

        tela_cadastro_funcionarios_inferior.setBackground(new java.awt.Color(251, 245, 238));
        tela_cadastro_funcionarios_inferior.setLayout(new java.awt.GridLayout(5, 0, 0, 4));

        jPanel123.setLayout(new java.awt.BorderLayout());

        jPanel138.setBackground(new java.awt.Color(91, 48, 22));
        jPanel138.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel35.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Nome da rua");

        javax.swing.GroupLayout jPanel138Layout = new javax.swing.GroupLayout(jPanel138);
        jPanel138.setLayout(jPanel138Layout);
        jPanel138Layout.setHorizontalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel138Layout.setVerticalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel123.add(jPanel138, java.awt.BorderLayout.LINE_START);

        campoEnderecoFuncionario.setBackground(new java.awt.Color(225, 195, 145));
        campoEnderecoFuncionario.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel144Layout = new javax.swing.GroupLayout(jPanel144);
        jPanel144.setLayout(jPanel144Layout);
        jPanel144Layout.setHorizontalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEnderecoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );
        jPanel144Layout.setVerticalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEnderecoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel123.add(jPanel144, java.awt.BorderLayout.CENTER);

        tela_cadastro_funcionarios_inferior.add(jPanel123);

        jPanel124.setLayout(new java.awt.BorderLayout());

        jPanel139.setBackground(new java.awt.Color(91, 48, 22));
        jPanel139.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel36.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Cidade");

        javax.swing.GroupLayout jPanel139Layout = new javax.swing.GroupLayout(jPanel139);
        jPanel139.setLayout(jPanel139Layout);
        jPanel139Layout.setHorizontalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel139Layout.setVerticalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel124.add(jPanel139, java.awt.BorderLayout.LINE_START);

        campoCidadeFuncionario.setBackground(new java.awt.Color(225, 195, 145));
        campoCidadeFuncionario.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel145Layout = new javax.swing.GroupLayout(jPanel145);
        jPanel145.setLayout(jPanel145Layout);
        jPanel145Layout.setHorizontalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCidadeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );
        jPanel145Layout.setVerticalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCidadeFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel124.add(jPanel145, java.awt.BorderLayout.CENTER);

        tela_cadastro_funcionarios_inferior.add(jPanel124);

        jPanel125.setBackground(new java.awt.Color(251, 245, 238));
        jPanel125.setLayout(new java.awt.BorderLayout());

        jPanel128.setPreferredSize(new java.awt.Dimension(423, 42));
        jPanel128.setLayout(new java.awt.BorderLayout());

        jPanel142.setBackground(new java.awt.Color(91, 48, 22));
        jPanel142.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel39.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Estado");

        javax.swing.GroupLayout jPanel142Layout = new javax.swing.GroupLayout(jPanel142);
        jPanel142.setLayout(jPanel142Layout);
        jPanel142Layout.setHorizontalGroup(
            jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel142Layout.setVerticalGroup(
            jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel128.add(jPanel142, java.awt.BorderLayout.LINE_START);

        comboboxEstado.setBackground(new java.awt.Color(225, 195, 145));
        comboboxEstado.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        comboboxEstado.setForeground(new java.awt.Color(91, 48, 22));
        comboboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraiba", "Paraná", "Pernambuco", "Piaui", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins." }));

        javax.swing.GroupLayout jPanel147Layout = new javax.swing.GroupLayout(jPanel147);
        jPanel147.setLayout(jPanel147Layout);
        jPanel147Layout.setHorizontalGroup(
            jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboboxEstado, 0, 279, Short.MAX_VALUE)
        );
        jPanel147Layout.setVerticalGroup(
            jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboboxEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel128.add(jPanel147, java.awt.BorderLayout.CENTER);

        jPanel125.add(jPanel128, java.awt.BorderLayout.LINE_END);

        jPanel129.setPreferredSize(new java.awt.Dimension(430, 42));
        jPanel129.setLayout(new java.awt.BorderLayout());

        jPanel140.setBackground(new java.awt.Color(91, 48, 22));
        jPanel140.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel37.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Número");

        javax.swing.GroupLayout jPanel140Layout = new javax.swing.GroupLayout(jPanel140);
        jPanel140.setLayout(jPanel140Layout);
        jPanel140Layout.setHorizontalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel140Layout.setVerticalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel129.add(jPanel140, java.awt.BorderLayout.LINE_START);

        campoNendereco.setBackground(new java.awt.Color(225, 195, 145));
        campoNendereco.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel146Layout = new javax.swing.GroupLayout(jPanel146);
        jPanel146.setLayout(jPanel146Layout);
        jPanel146Layout.setHorizontalGroup(
            jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNendereco, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );
        jPanel146Layout.setVerticalGroup(
            jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNendereco, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel129.add(jPanel146, java.awt.BorderLayout.CENTER);

        jPanel125.add(jPanel129, java.awt.BorderLayout.LINE_START);

        tela_cadastro_funcionarios_inferior.add(jPanel125);

        jPanel126.setBackground(new java.awt.Color(251, 245, 238));
        jPanel126.setLayout(new java.awt.BorderLayout());

        jPanel130.setPreferredSize(new java.awt.Dimension(423, 42));
        jPanel130.setLayout(new java.awt.BorderLayout());

        jPanel143.setBackground(new java.awt.Color(91, 48, 22));
        jPanel143.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel40.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Salário");

        javax.swing.GroupLayout jPanel143Layout = new javax.swing.GroupLayout(jPanel143);
        jPanel143.setLayout(jPanel143Layout);
        jPanel143Layout.setHorizontalGroup(
            jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel143Layout.setVerticalGroup(
            jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel130.add(jPanel143, java.awt.BorderLayout.LINE_START);

        campoSalarioFuncionario.setBackground(new java.awt.Color(225, 195, 145));
        campoSalarioFuncionario.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel148Layout = new javax.swing.GroupLayout(jPanel148);
        jPanel148.setLayout(jPanel148Layout);
        jPanel148Layout.setHorizontalGroup(
            jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoSalarioFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );
        jPanel148Layout.setVerticalGroup(
            jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoSalarioFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel130.add(jPanel148, java.awt.BorderLayout.CENTER);

        jPanel126.add(jPanel130, java.awt.BorderLayout.LINE_END);

        jPanel131.setPreferredSize(new java.awt.Dimension(430, 42));
        jPanel131.setLayout(new java.awt.BorderLayout());

        jPanel141.setBackground(new java.awt.Color(91, 48, 22));
        jPanel141.setPreferredSize(new java.awt.Dimension(144, 42));

        jLabel38.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Complemento");

        javax.swing.GroupLayout jPanel141Layout = new javax.swing.GroupLayout(jPanel141);
        jPanel141.setLayout(jPanel141Layout);
        jPanel141Layout.setHorizontalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel141Layout.setVerticalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel131.add(jPanel141, java.awt.BorderLayout.LINE_START);

        campoComplemento.setBackground(new java.awt.Color(225, 195, 145));
        campoComplemento.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel149Layout = new javax.swing.GroupLayout(jPanel149);
        jPanel149.setLayout(jPanel149Layout);
        jPanel149Layout.setHorizontalGroup(
            jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );
        jPanel149Layout.setVerticalGroup(
            jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel131.add(jPanel149, java.awt.BorderLayout.CENTER);

        jPanel126.add(jPanel131, java.awt.BorderLayout.LINE_START);

        tela_cadastro_funcionarios_inferior.add(jPanel126);

        jPanel127.setBackground(new java.awt.Color(251, 245, 238));

        buttonCadastrarFuncionario.setBackground(new java.awt.Color(251, 245, 238));
        buttonCadastrarFuncionario.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        buttonCadastrarFuncionario.setForeground(new java.awt.Color(91, 45, 22));
        buttonCadastrarFuncionario.setText("Cadastrar");
        buttonCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel127Layout = new javax.swing.GroupLayout(jPanel127);
        jPanel127.setLayout(jPanel127Layout);
        jPanel127Layout.setHorizontalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel127Layout.createSequentialGroup()
                .addGap(0, 757, Short.MAX_VALUE)
                .addComponent(buttonCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel127Layout.setVerticalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonCadastrarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        tela_cadastro_funcionarios_inferior.add(jPanel127);

        painel_principal_inferior.add(tela_cadastro_funcionarios_inferior, "card3");

        tela_relatorios_inferior.setBackground(new java.awt.Color(251, 245, 238));

        javax.swing.GroupLayout tela_relatorios_inferiorLayout = new javax.swing.GroupLayout(tela_relatorios_inferior);
        tela_relatorios_inferior.setLayout(tela_relatorios_inferiorLayout);
        tela_relatorios_inferiorLayout.setHorizontalGroup(
            tela_relatorios_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        tela_relatorios_inferiorLayout.setVerticalGroup(
            tela_relatorios_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        painel_principal_inferior.add(tela_relatorios_inferior, "card1");

        tela_gerenciamento_funcionarios_inferior.setBackground(new java.awt.Color(251, 245, 238));
        tela_gerenciamento_funcionarios_inferior.setLayout(new java.awt.GridLayout(6, 0, 0, 5));

        jPanel150.setLayout(new java.awt.BorderLayout());

        jPanel156.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel156.setLayout(new java.awt.BorderLayout());

        jPanel187.setBackground(new java.awt.Color(91, 48, 22));
        jPanel187.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel12.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nome");

        javax.swing.GroupLayout jPanel187Layout = new javax.swing.GroupLayout(jPanel187);
        jPanel187.setLayout(jPanel187Layout);
        jPanel187Layout.setHorizontalGroup(
            jPanel187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel187Layout.setVerticalGroup(
            jPanel187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel156.add(jPanel187, java.awt.BorderLayout.LINE_START);

        campoNomeAlterar.setBackground(new java.awt.Color(225, 195, 145));
        campoNomeAlterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoNomeAlterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel161Layout = new javax.swing.GroupLayout(jPanel161);
        jPanel161.setLayout(jPanel161Layout);
        jPanel161Layout.setHorizontalGroup(
            jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNomeAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel161Layout.setVerticalGroup(
            jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNomeAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel156.add(jPanel161, java.awt.BorderLayout.CENTER);

        jPanel150.add(jPanel156, java.awt.BorderLayout.LINE_START);

        jPanel157.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel157.setLayout(new java.awt.BorderLayout());

        jPanel193.setBackground(new java.awt.Color(91, 48, 22));
        jPanel193.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel46.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Salário");

        javax.swing.GroupLayout jPanel193Layout = new javax.swing.GroupLayout(jPanel193);
        jPanel193.setLayout(jPanel193Layout);
        jPanel193Layout.setHorizontalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel193Layout.setVerticalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel157.add(jPanel193, java.awt.BorderLayout.LINE_START);

        campoSalarioAlterar.setBackground(new java.awt.Color(225, 195, 145));
        campoSalarioAlterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoSalarioAlterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel204Layout = new javax.swing.GroupLayout(jPanel204);
        jPanel204.setLayout(jPanel204Layout);
        jPanel204Layout.setHorizontalGroup(
            jPanel204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoSalarioAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel204Layout.setVerticalGroup(
            jPanel204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoSalarioAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel157.add(jPanel204, java.awt.BorderLayout.CENTER);

        jPanel150.add(jPanel157, java.awt.BorderLayout.LINE_END);

        jPanel158.setLayout(new java.awt.BorderLayout());

        jPanel172.setBackground(new java.awt.Color(251, 245, 238));
        jPanel172.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel172Layout = new javax.swing.GroupLayout(jPanel172);
        jPanel172.setLayout(jPanel172Layout);
        jPanel172Layout.setHorizontalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel172Layout.setVerticalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel158.add(jPanel172, java.awt.BorderLayout.LINE_END);

        jPanel173.setBackground(new java.awt.Color(251, 245, 238));
        jPanel173.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel173Layout = new javax.swing.GroupLayout(jPanel173);
        jPanel173.setLayout(jPanel173Layout);
        jPanel173Layout.setHorizontalGroup(
            jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel173Layout.setVerticalGroup(
            jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel158.add(jPanel173, java.awt.BorderLayout.LINE_START);

        jPanel195.setLayout(new java.awt.BorderLayout());

        jPanel196.setBackground(new java.awt.Color(91, 48, 22));
        jPanel196.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel48.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("CEP");

        javax.swing.GroupLayout jPanel196Layout = new javax.swing.GroupLayout(jPanel196);
        jPanel196.setLayout(jPanel196Layout);
        jPanel196Layout.setHorizontalGroup(
            jPanel196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel196Layout.setVerticalGroup(
            jPanel196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel195.add(jPanel196, java.awt.BorderLayout.LINE_START);

        campoCEPalterar.setBackground(new java.awt.Color(225, 195, 145));
        campoCEPalterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoCEPalterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel197Layout = new javax.swing.GroupLayout(jPanel197);
        jPanel197.setLayout(jPanel197Layout);
        jPanel197Layout.setHorizontalGroup(
            jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCEPalterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel197Layout.setVerticalGroup(
            jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCEPalterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel195.add(jPanel197, java.awt.BorderLayout.CENTER);

        jPanel158.add(jPanel195, java.awt.BorderLayout.CENTER);

        jPanel150.add(jPanel158, java.awt.BorderLayout.CENTER);

        tela_gerenciamento_funcionarios_inferior.add(jPanel150);

        jPanel151.setLayout(new java.awt.BorderLayout());

        jPanel159.setDoubleBuffered(false);
        jPanel159.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel159.setLayout(new java.awt.BorderLayout());

        jPanel188.setBackground(new java.awt.Color(91, 48, 22));
        jPanel188.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel41.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Telefone");

        javax.swing.GroupLayout jPanel188Layout = new javax.swing.GroupLayout(jPanel188);
        jPanel188.setLayout(jPanel188Layout);
        jPanel188Layout.setHorizontalGroup(
            jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel188Layout.setVerticalGroup(
            jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel159.add(jPanel188, java.awt.BorderLayout.LINE_START);

        campoTelefoneAlterar.setBackground(new java.awt.Color(225, 195, 145));
        campoTelefoneAlterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoTelefoneAlterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel199Layout = new javax.swing.GroupLayout(jPanel199);
        jPanel199.setLayout(jPanel199Layout);
        jPanel199Layout.setHorizontalGroup(
            jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoTelefoneAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel199Layout.setVerticalGroup(
            jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoTelefoneAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel159.add(jPanel199, java.awt.BorderLayout.CENTER);

        jPanel151.add(jPanel159, java.awt.BorderLayout.LINE_START);

        jPanel160.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel160.setLayout(new java.awt.BorderLayout());

        jPanel205.setBackground(new java.awt.Color(251, 245, 238));

        javax.swing.GroupLayout jPanel205Layout = new javax.swing.GroupLayout(jPanel205);
        jPanel205.setLayout(jPanel205Layout);
        jPanel205Layout.setHorizontalGroup(
            jPanel205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel205Layout.setVerticalGroup(
            jPanel205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel160.add(jPanel205, java.awt.BorderLayout.CENTER);

        jPanel151.add(jPanel160, java.awt.BorderLayout.LINE_END);

        jPanel184.setLayout(new java.awt.BorderLayout());

        jPanel185.setBackground(new java.awt.Color(251, 245, 238));
        jPanel185.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel185Layout = new javax.swing.GroupLayout(jPanel185);
        jPanel185.setLayout(jPanel185Layout);
        jPanel185Layout.setHorizontalGroup(
            jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel185Layout.setVerticalGroup(
            jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel184.add(jPanel185, java.awt.BorderLayout.LINE_START);

        jPanel186.setBackground(new java.awt.Color(251, 245, 238));
        jPanel186.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel186Layout = new javax.swing.GroupLayout(jPanel186);
        jPanel186.setLayout(jPanel186Layout);
        jPanel186Layout.setHorizontalGroup(
            jPanel186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel186Layout.setVerticalGroup(
            jPanel186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel184.add(jPanel186, java.awt.BorderLayout.LINE_END);

        jPanel198.setLayout(new java.awt.BorderLayout());

        jPanel210.setBackground(new java.awt.Color(91, 48, 22));
        jPanel210.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel49.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Nome da rua");

        javax.swing.GroupLayout jPanel210Layout = new javax.swing.GroupLayout(jPanel210);
        jPanel210.setLayout(jPanel210Layout);
        jPanel210Layout.setHorizontalGroup(
            jPanel210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel210Layout.setVerticalGroup(
            jPanel210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel198.add(jPanel210, java.awt.BorderLayout.LINE_START);

        campoEnderecoAlterar.setBackground(new java.awt.Color(225, 195, 145));
        campoEnderecoAlterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoEnderecoAlterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel215Layout = new javax.swing.GroupLayout(jPanel215);
        jPanel215.setLayout(jPanel215Layout);
        jPanel215Layout.setHorizontalGroup(
            jPanel215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEnderecoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel215Layout.setVerticalGroup(
            jPanel215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEnderecoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel198.add(jPanel215, java.awt.BorderLayout.CENTER);

        jPanel184.add(jPanel198, java.awt.BorderLayout.CENTER);

        jPanel151.add(jPanel184, java.awt.BorderLayout.CENTER);

        tela_gerenciamento_funcionarios_inferior.add(jPanel151);

        jPanel152.setLayout(new java.awt.BorderLayout());

        jPanel162.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel162.setLayout(new java.awt.BorderLayout());

        jPanel189.setBackground(new java.awt.Color(91, 48, 22));
        jPanel189.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel42.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("CPF");

        javax.swing.GroupLayout jPanel189Layout = new javax.swing.GroupLayout(jPanel189);
        jPanel189.setLayout(jPanel189Layout);
        jPanel189Layout.setHorizontalGroup(
            jPanel189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel189Layout.setVerticalGroup(
            jPanel189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel162.add(jPanel189, java.awt.BorderLayout.LINE_START);

        campoCPFalterar.setBackground(new java.awt.Color(225, 195, 145));
        campoCPFalterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoCPFalterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel200Layout = new javax.swing.GroupLayout(jPanel200);
        jPanel200.setLayout(jPanel200Layout);
        jPanel200Layout.setHorizontalGroup(
            jPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCPFalterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel200Layout.setVerticalGroup(
            jPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCPFalterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel162.add(jPanel200, java.awt.BorderLayout.CENTER);

        jPanel152.add(jPanel162, java.awt.BorderLayout.LINE_START);

        jPanel163.setBackground(new java.awt.Color(251, 245, 238));
        jPanel163.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel163.setLayout(new java.awt.BorderLayout());
        jPanel152.add(jPanel163, java.awt.BorderLayout.LINE_END);

        jPanel164.setLayout(new java.awt.BorderLayout());

        jPanel174.setBackground(new java.awt.Color(251, 245, 238));
        jPanel174.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel174Layout = new javax.swing.GroupLayout(jPanel174);
        jPanel174.setLayout(jPanel174Layout);
        jPanel174Layout.setHorizontalGroup(
            jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel174Layout.setVerticalGroup(
            jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel164.add(jPanel174, java.awt.BorderLayout.LINE_END);

        jPanel175.setBackground(new java.awt.Color(251, 245, 238));
        jPanel175.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel175Layout = new javax.swing.GroupLayout(jPanel175);
        jPanel175.setLayout(jPanel175Layout);
        jPanel175Layout.setHorizontalGroup(
            jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel175Layout.setVerticalGroup(
            jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel164.add(jPanel175, java.awt.BorderLayout.LINE_START);

        jPanel206.setLayout(new java.awt.BorderLayout());

        jPanel211.setBackground(new java.awt.Color(91, 48, 22));
        jPanel211.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel50.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Cidade");

        javax.swing.GroupLayout jPanel211Layout = new javax.swing.GroupLayout(jPanel211);
        jPanel211.setLayout(jPanel211Layout);
        jPanel211Layout.setHorizontalGroup(
            jPanel211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel211Layout.setVerticalGroup(
            jPanel211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel206.add(jPanel211, java.awt.BorderLayout.LINE_START);

        campoCidadeAlterar.setBackground(new java.awt.Color(225, 195, 145));
        campoCidadeAlterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoCidadeAlterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel216Layout = new javax.swing.GroupLayout(jPanel216);
        jPanel216.setLayout(jPanel216Layout);
        jPanel216Layout.setHorizontalGroup(
            jPanel216Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCidadeAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel216Layout.setVerticalGroup(
            jPanel216Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCidadeAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel206.add(jPanel216, java.awt.BorderLayout.CENTER);

        jPanel164.add(jPanel206, java.awt.BorderLayout.CENTER);

        jPanel152.add(jPanel164, java.awt.BorderLayout.CENTER);

        tela_gerenciamento_funcionarios_inferior.add(jPanel152);

        jPanel153.setLayout(new java.awt.BorderLayout());

        jPanel167.setBackground(new java.awt.Color(251, 245, 238));
        jPanel167.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel167.setLayout(new java.awt.BorderLayout());
        jPanel153.add(jPanel167, java.awt.BorderLayout.LINE_END);

        jPanel176.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel176.setLayout(new java.awt.BorderLayout());

        jPanel190.setBackground(new java.awt.Color(91, 48, 22));
        jPanel190.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel43.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Data de nascimento");

        javax.swing.GroupLayout jPanel190Layout = new javax.swing.GroupLayout(jPanel190);
        jPanel190.setLayout(jPanel190Layout);
        jPanel190Layout.setHorizontalGroup(
            jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel190Layout.setVerticalGroup(
            jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel176.add(jPanel190, java.awt.BorderLayout.LINE_START);

        campoNascimentoAlterar.setBackground(new java.awt.Color(225, 195, 145));
        campoNascimentoAlterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoNascimentoAlterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel201Layout = new javax.swing.GroupLayout(jPanel201);
        jPanel201.setLayout(jPanel201Layout);
        jPanel201Layout.setHorizontalGroup(
            jPanel201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNascimentoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel201Layout.setVerticalGroup(
            jPanel201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNascimentoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel176.add(jPanel201, java.awt.BorderLayout.CENTER);

        jPanel153.add(jPanel176, java.awt.BorderLayout.LINE_START);

        jPanel177.setLayout(new java.awt.BorderLayout());

        jPanel178.setBackground(new java.awt.Color(251, 245, 238));
        jPanel178.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel178Layout = new javax.swing.GroupLayout(jPanel178);
        jPanel178.setLayout(jPanel178Layout);
        jPanel178Layout.setHorizontalGroup(
            jPanel178Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel178Layout.setVerticalGroup(
            jPanel178Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel177.add(jPanel178, java.awt.BorderLayout.LINE_START);

        jPanel179.setBackground(new java.awt.Color(251, 245, 238));
        jPanel179.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel179Layout = new javax.swing.GroupLayout(jPanel179);
        jPanel179.setLayout(jPanel179Layout);
        jPanel179Layout.setHorizontalGroup(
            jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel179Layout.setVerticalGroup(
            jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel177.add(jPanel179, java.awt.BorderLayout.LINE_END);

        jPanel207.setLayout(new java.awt.BorderLayout());

        jPanel212.setBackground(new java.awt.Color(91, 48, 22));
        jPanel212.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel51.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Número");

        javax.swing.GroupLayout jPanel212Layout = new javax.swing.GroupLayout(jPanel212);
        jPanel212.setLayout(jPanel212Layout);
        jPanel212Layout.setHorizontalGroup(
            jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel212Layout.setVerticalGroup(
            jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel207.add(jPanel212, java.awt.BorderLayout.LINE_START);

        campoNalterar.setBackground(new java.awt.Color(225, 195, 145));
        campoNalterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoNalterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel217Layout = new javax.swing.GroupLayout(jPanel217);
        jPanel217.setLayout(jPanel217Layout);
        jPanel217Layout.setHorizontalGroup(
            jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNalterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel217Layout.setVerticalGroup(
            jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNalterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel207.add(jPanel217, java.awt.BorderLayout.CENTER);

        jPanel177.add(jPanel207, java.awt.BorderLayout.CENTER);

        jPanel153.add(jPanel177, java.awt.BorderLayout.CENTER);

        tela_gerenciamento_funcionarios_inferior.add(jPanel153);

        jPanel154.setLayout(new java.awt.BorderLayout());

        jPanel165.setPreferredSize(new java.awt.Dimension(280, 0));
        jPanel165.setLayout(new java.awt.BorderLayout());

        jPanel191.setBackground(new java.awt.Color(91, 48, 22));
        jPanel191.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel44.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Escolaridade");

        javax.swing.GroupLayout jPanel191Layout = new javax.swing.GroupLayout(jPanel191);
        jPanel191.setLayout(jPanel191Layout);
        jPanel191Layout.setHorizontalGroup(
            jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel191Layout.setVerticalGroup(
            jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel165.add(jPanel191, java.awt.BorderLayout.LINE_START);

        campoEscolariedadeAlterar.setBackground(new java.awt.Color(225, 195, 145));
        campoEscolariedadeAlterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoEscolariedadeAlterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel202Layout = new javax.swing.GroupLayout(jPanel202);
        jPanel202.setLayout(jPanel202Layout);
        jPanel202Layout.setHorizontalGroup(
            jPanel202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEscolariedadeAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel202Layout.setVerticalGroup(
            jPanel202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEscolariedadeAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel165.add(jPanel202, java.awt.BorderLayout.CENTER);

        jPanel154.add(jPanel165, java.awt.BorderLayout.LINE_START);

        jPanel166.setBackground(new java.awt.Color(251, 245, 238));
        jPanel166.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel166.setLayout(new java.awt.BorderLayout());

        botaoAlterarFuncionario.setBackground(new java.awt.Color(251, 245, 238));
        botaoAlterarFuncionario.setForeground(new java.awt.Color(91, 48, 22));
        botaoAlterarFuncionario.setText("Alterar");
        botaoAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarFuncionarioActionPerformed(evt);
            }
        });
        jPanel166.add(botaoAlterarFuncionario, java.awt.BorderLayout.LINE_END);

        jPanel154.add(jPanel166, java.awt.BorderLayout.LINE_END);

        jPanel168.setLayout(new java.awt.BorderLayout());

        jPanel180.setBackground(new java.awt.Color(251, 245, 238));
        jPanel180.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel180Layout = new javax.swing.GroupLayout(jPanel180);
        jPanel180.setLayout(jPanel180Layout);
        jPanel180Layout.setHorizontalGroup(
            jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel180Layout.setVerticalGroup(
            jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel168.add(jPanel180, java.awt.BorderLayout.LINE_START);

        jPanel182.setBackground(new java.awt.Color(251, 245, 238));
        jPanel182.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel182Layout = new javax.swing.GroupLayout(jPanel182);
        jPanel182.setLayout(jPanel182Layout);
        jPanel182Layout.setHorizontalGroup(
            jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel182Layout.setVerticalGroup(
            jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel168.add(jPanel182, java.awt.BorderLayout.LINE_END);

        jPanel208.setLayout(new java.awt.BorderLayout());

        jPanel213.setBackground(new java.awt.Color(91, 48, 22));
        jPanel213.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel52.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Complemento");

        javax.swing.GroupLayout jPanel213Layout = new javax.swing.GroupLayout(jPanel213);
        jPanel213.setLayout(jPanel213Layout);
        jPanel213Layout.setHorizontalGroup(
            jPanel213Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel213Layout.setVerticalGroup(
            jPanel213Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel208.add(jPanel213, java.awt.BorderLayout.LINE_START);

        campoComplementoAlterar.setBackground(new java.awt.Color(225, 195, 145));
        campoComplementoAlterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoComplementoAlterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel218Layout = new javax.swing.GroupLayout(jPanel218);
        jPanel218.setLayout(jPanel218Layout);
        jPanel218Layout.setHorizontalGroup(
            jPanel218Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoComplementoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel218Layout.setVerticalGroup(
            jPanel218Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoComplementoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel208.add(jPanel218, java.awt.BorderLayout.CENTER);

        jPanel168.add(jPanel208, java.awt.BorderLayout.CENTER);

        jPanel154.add(jPanel168, java.awt.BorderLayout.CENTER);

        tela_gerenciamento_funcionarios_inferior.add(jPanel154);

        jPanel155.setLayout(new java.awt.BorderLayout());

        jPanel169.setBackground(new java.awt.Color(251, 245, 238));
        jPanel169.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel169.setLayout(new java.awt.BorderLayout());

        botaoDeleteFuncionario.setBackground(new java.awt.Color(251, 245, 238));
        botaoDeleteFuncionario.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        botaoDeleteFuncionario.setForeground(new java.awt.Color(255, 0, 0));
        botaoDeleteFuncionario.setText("Apagar");
        botaoDeleteFuncionario.setPreferredSize(new java.awt.Dimension(79, 24));
        botaoDeleteFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeleteFuncionarioActionPerformed(evt);
            }
        });
        jPanel169.add(botaoDeleteFuncionario, java.awt.BorderLayout.LINE_END);

        jPanel155.add(jPanel169, java.awt.BorderLayout.LINE_END);

        jPanel170.setPreferredSize(new java.awt.Dimension(280, 34));
        jPanel170.setLayout(new java.awt.BorderLayout());

        jPanel192.setBackground(new java.awt.Color(91, 48, 22));
        jPanel192.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel45.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Estado civil");

        javax.swing.GroupLayout jPanel192Layout = new javax.swing.GroupLayout(jPanel192);
        jPanel192.setLayout(jPanel192Layout);
        jPanel192Layout.setHorizontalGroup(
            jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel192Layout.setVerticalGroup(
            jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel170.add(jPanel192, java.awt.BorderLayout.LINE_START);

        campoEstadoCivilAlterar.setBackground(new java.awt.Color(225, 195, 145));
        campoEstadoCivilAlterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoEstadoCivilAlterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel203Layout = new javax.swing.GroupLayout(jPanel203);
        jPanel203.setLayout(jPanel203Layout);
        jPanel203Layout.setHorizontalGroup(
            jPanel203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEstadoCivilAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel203Layout.setVerticalGroup(
            jPanel203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEstadoCivilAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel170.add(jPanel203, java.awt.BorderLayout.CENTER);

        jPanel155.add(jPanel170, java.awt.BorderLayout.LINE_START);

        jPanel171.setLayout(new java.awt.BorderLayout());

        jPanel181.setBackground(new java.awt.Color(251, 245, 238));
        jPanel181.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel181Layout = new javax.swing.GroupLayout(jPanel181);
        jPanel181.setLayout(jPanel181Layout);
        jPanel181Layout.setHorizontalGroup(
            jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel181Layout.setVerticalGroup(
            jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel171.add(jPanel181, java.awt.BorderLayout.LINE_START);

        jPanel183.setBackground(new java.awt.Color(251, 245, 238));
        jPanel183.setPreferredSize(new java.awt.Dimension(10, 34));

        javax.swing.GroupLayout jPanel183Layout = new javax.swing.GroupLayout(jPanel183);
        jPanel183.setLayout(jPanel183Layout);
        jPanel183Layout.setHorizontalGroup(
            jPanel183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel183Layout.setVerticalGroup(
            jPanel183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel171.add(jPanel183, java.awt.BorderLayout.LINE_END);

        jPanel209.setLayout(new java.awt.BorderLayout());

        jPanel214.setBackground(new java.awt.Color(91, 48, 22));
        jPanel214.setPreferredSize(new java.awt.Dimension(80, 34));

        jLabel53.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Estado");

        javax.swing.GroupLayout jPanel214Layout = new javax.swing.GroupLayout(jPanel214);
        jPanel214.setLayout(jPanel214Layout);
        jPanel214Layout.setHorizontalGroup(
            jPanel214Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel214Layout.setVerticalGroup(
            jPanel214Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel209.add(jPanel214, java.awt.BorderLayout.LINE_START);

        campoEstadoAlterar.setBackground(new java.awt.Color(225, 195, 145));
        campoEstadoAlterar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        campoEstadoAlterar.setForeground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout jPanel219Layout = new javax.swing.GroupLayout(jPanel219);
        jPanel219.setLayout(jPanel219Layout);
        jPanel219Layout.setHorizontalGroup(
            jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEstadoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel219Layout.setVerticalGroup(
            jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoEstadoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel209.add(jPanel219, java.awt.BorderLayout.CENTER);

        jPanel171.add(jPanel209, java.awt.BorderLayout.CENTER);

        jPanel155.add(jPanel171, java.awt.BorderLayout.CENTER);

        tela_gerenciamento_funcionarios_inferior.add(jPanel155);

        painel_principal_inferior.add(tela_gerenciamento_funcionarios_inferior, "card2");

        tela_sobre_inferior.setBackground(new java.awt.Color(251, 245, 238));
        tela_sobre_inferior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField17.setBackground(new java.awt.Color(251, 245, 238));
        jTextField17.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(91, 48, 22));
        jTextField17.setText("- Softwares utilizados: ");
        jTextField17.setBorder(null);

        jTextField18.setBackground(new java.awt.Color(251, 245, 238));
        jTextField18.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(91, 48, 22));
        jTextField18.setText("- Metodologia de desenvolvimento: ");
        jTextField18.setBorder(null);

        jTextField19.setBackground(new java.awt.Color(251, 245, 238));
        jTextField19.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(91, 48, 22));
        jTextField19.setText("- Linguagens utilizadas: ");
        jTextField19.setBorder(null);

        jTextField20.setBackground(new java.awt.Color(251, 245, 238));
        jTextField20.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(91, 48, 22));
        jTextField20.setText("2024.1");
        jTextField20.setBorder(null);

        jTextField21.setBackground(new java.awt.Color(251, 245, 238));
        jTextField21.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(91, 48, 22));
        jTextField21.setText("-Professor:");
        jTextField21.setBorder(null);

        jTextField30.setBackground(new java.awt.Color(251, 245, 238));
        jTextField30.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(91, 48, 22));
        jTextField30.setText("- UNISUL (DIB MUSSI)");
        jTextField30.setBorder(null);

        jTextField31.setBackground(new java.awt.Color(251, 245, 238));
        jTextField31.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jTextField31.setForeground(new java.awt.Color(91, 48, 22));
        jTextField31.setText("Java e SQL");
        jTextField31.setBorder(null);

        jTextField32.setBackground(new java.awt.Color(251, 245, 238));
        jTextField32.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jTextField32.setForeground(new java.awt.Color(91, 48, 22));
        jTextField32.setText("Netbeans, Figma, Miro, Trello e MySQL");
        jTextField32.setBorder(null);

        jTextField33.setBackground(new java.awt.Color(251, 245, 238));
        jTextField33.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jTextField33.setForeground(new java.awt.Color(91, 48, 22));
        jTextField33.setText("SCRUM");
        jTextField33.setBorder(null);

        jTextField34.setBackground(new java.awt.Color(251, 245, 238));
        jTextField34.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jTextField34.setForeground(new java.awt.Color(91, 48, 22));
        jTextField34.setText("Ricardo R. Assink");
        jTextField34.setBorder(null);

        jTextField35.setBackground(new java.awt.Color(251, 245, 238));
        jTextField35.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jTextField35.setForeground(new java.awt.Color(91, 48, 22));
        jTextField35.setText("Semestre:");
        jTextField35.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(91, 48, 22));
        jLabel10.setText("PROJETO");

        javax.swing.GroupLayout tela_sobre_inferiorLayout = new javax.swing.GroupLayout(tela_sobre_inferior);
        tela_sobre_inferior.setLayout(tela_sobre_inferiorLayout);
        tela_sobre_inferiorLayout.setHorizontalGroup(
            tela_sobre_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_sobre_inferiorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(tela_sobre_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_sobre_inferiorLayout.createSequentialGroup()
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tela_sobre_inferiorLayout.createSequentialGroup()
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tela_sobre_inferiorLayout.createSequentialGroup()
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tela_sobre_inferiorLayout.createSequentialGroup()
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tela_sobre_inferiorLayout.createSequentialGroup()
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela_sobre_inferiorLayout.createSequentialGroup()
                .addContainerGap(399, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(397, 397, 397))
        );
        tela_sobre_inferiorLayout.setVerticalGroup(
            tela_sobre_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_sobre_inferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addGroup(tela_sobre_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tela_sobre_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tela_sobre_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tela_sobre_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tela_sobre_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        painel_principal_inferior.add(tela_sobre_inferior, "card6");

        roundedPanel5.add(painel_principal_inferior, java.awt.BorderLayout.CENTER);

        jPanel29.setBackground(new java.awt.Color(251, 245, 238));
        jPanel29.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel5.add(jPanel29, java.awt.BorderLayout.WEST);

        jPanel37.setBackground(new java.awt.Color(251, 245, 238));
        jPanel37.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel5.add(jPanel37, java.awt.BorderLayout.EAST);

        roundedPanel8.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel8.setPreferredSize(new java.awt.Dimension(900, 30));
        roundedPanel8.setRoundTopLeft(50);
        roundedPanel8.setRoundTopRight(50);

        javax.swing.GroupLayout roundedPanel8Layout = new javax.swing.GroupLayout(roundedPanel8);
        roundedPanel8.setLayout(roundedPanel8Layout);
        roundedPanel8Layout.setHorizontalGroup(
            roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        roundedPanel8Layout.setVerticalGroup(
            roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        roundedPanel5.add(roundedPanel8, java.awt.BorderLayout.NORTH);

        roundedPanel9.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel9.setPreferredSize(new java.awt.Dimension(900, 30));
        roundedPanel9.setRoundBottomLeft(50);
        roundedPanel9.setRoundBottomRight(50);

        javax.swing.GroupLayout roundedPanel9Layout = new javax.swing.GroupLayout(roundedPanel9);
        roundedPanel9.setLayout(roundedPanel9Layout);
        roundedPanel9Layout.setHorizontalGroup(
            roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        roundedPanel9Layout.setVerticalGroup(
            roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel5.add(roundedPanel9, java.awt.BorderLayout.SOUTH);

        jPanel4.add(roundedPanel5, java.awt.BorderLayout.PAGE_END);

        roundedPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        margin_center.add(roundedPanel1, java.awt.BorderLayout.CENTER);

        paine_base.add(margin_center, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paine_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paine_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void additionalConfig(){
        
        //------ABRIR SOFTWARE NA PAGINA SOBRE------------------

        //-----hover effect-------
        
        //sobre selecionado
        menu_item_sobre.setBackground(new Color(91,48,22));
        menu_text_sobre.setForeground(new Color(251,245,238));
        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/help-white.png")));
        
        //produto deseleciona
        menu_item_produtos.setBackground(new Color(251,245,238));
        menu_combo_box_produtos.setForeground(new Color(91,48,22));
        menu_combo_box_produtos.setBackground(new Color(251,245,238));
        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));
        
        //funcionario deseleciona
        menu_item_funcionarios.setBackground(new Color(251,245,238));
        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
        
        //relatorio deseleciona
        menu_item_relatorios.setBackground(new Color(251,245,238));
        menu_text_relatorios.setForeground(new Color(91,48,22));
        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
        
        CardLayout cardSuperior = (CardLayout)(painel_principal_superior.getLayout()); //declaracao para manipular o card supeior
        CardLayout cardInferior = (CardLayout)(painel_principal_inferior.getLayout()); //declaracao para manipular o card inferior
        
        cardSuperior.show(painel_principal_superior, "card6"); //mostra card sobre superior
        cardInferior.show(painel_principal_inferior, "card6"); //mostra card sobre inferior
        
        menu_combo_box_funcionarios.setSelectedIndex(0);//redefine o combobox para funcionario
        menu_combo_box_produtos.setSelectedIndex(0);//redefine o combobox para produto
        
        
        
        //--------MODIFICACAO DE TABELA DE PRODUTO ---------------
        tabela_produtos.getTableHeader().setBackground(new Color(91,48,22));
        tabela_produtos.getTableHeader().setForeground(new Color(251,245,238));
        tabela_produtos.getTableHeader().setBorder(null);
        tabela_produtos.getTableHeader().setFont(new java.awt.Font("Microsoft Tai Le", 1, 12));
        tabela_produtos.setCellSelectionEnabled(false);
        tabela_produtos.setRowSelectionAllowed(true);
        tabela_produtos.setShowVerticalLines(false);
        tabela_produtos.setRowHeight(20);
        

    }
    
    private void menu_item_funcionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_funcionariosMouseEntered
//        menu_item_funcionarios.setBackground(new Color(91,48,22));
//        menu_combo_box_funcionarios.setForeground(new Color(251,245,238));
//        menu_combo_box_funcionarios.setBackground(new Color(91,48,22));
//        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/id_card-white.png")));
        
    }//GEN-LAST:event_menu_item_funcionariosMouseEntered

    private void menu_item_funcionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_funcionariosMouseExited
//        menu_item_funcionarios.setBackground(new Color(251,245,238));
//        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
//        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
//        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
    }//GEN-LAST:event_menu_item_funcionariosMouseExited

    private void menu_item_produtosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_produtosMouseEntered
//        menu_item_produtos.setBackground(new Color(91,48,22));
//        menu_combo_box_produtos.setForeground(new Color(251,245,238));
//        menu_combo_box_produtos.setBackground(new Color(91,48,22));
//        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/book-white.png")));
    }//GEN-LAST:event_menu_item_produtosMouseEntered

    private void menu_item_produtosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_produtosMouseExited
//        menu_item_produtos.setBackground(new Color(251,245,238));
//        menu_combo_box_produtos.setForeground(new Color(91,48,22));
//        menu_combo_box_produtos.setBackground(new Color(251,245,238));
//        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));
    }//GEN-LAST:event_menu_item_produtosMouseExited

    private void menu_item_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sairMouseEntered
        
    }//GEN-LAST:event_menu_item_sairMouseEntered

    private void menu_item_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sairMouseExited
        
    }//GEN-LAST:event_menu_item_sairMouseExited

    private void menu_item_sobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sobreMouseEntered
//        menu_item_sobre.setBackground(new Color(91,48,22));
//        menu_text_sobre.setForeground(new Color(251,245,238));
//        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/help-white.png")));
    }//GEN-LAST:event_menu_item_sobreMouseEntered

    private void menu_item_sobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sobreMouseExited
//        menu_item_sobre.setBackground(new Color(251,245,238));
//        menu_text_sobre.setForeground(new Color(91,48,22));
//        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));
    }//GEN-LAST:event_menu_item_sobreMouseExited

    private void menu_item_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menu_item_sairMouseClicked

    private void menu_item_sobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sobreMouseClicked
        
        //-----hover effect-------
        
        //sobre selecionado
        menu_item_sobre.setBackground(new Color(91,48,22));
        menu_text_sobre.setForeground(new Color(251,245,238));
        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/help-white.png")));
        
        //produto deseleciona
        menu_item_produtos.setBackground(new Color(251,245,238));
        menu_combo_box_produtos.setForeground(new Color(91,48,22));
        menu_combo_box_produtos.setBackground(new Color(251,245,238));
        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));
        
        //funcionario deseleciona
        menu_item_funcionarios.setBackground(new Color(251,245,238));
        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
        
        //relatorio deseleciona
        menu_item_relatorios.setBackground(new Color(251,245,238));
        menu_text_relatorios.setForeground(new Color(91,48,22));
        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
        
        CardLayout cardSuperior = (CardLayout)(painel_principal_superior.getLayout()); //declaracao para manipular o card supeior
        CardLayout cardInferior = (CardLayout)(painel_principal_inferior.getLayout()); //declaracao para manipular o card inferior
        
        cardSuperior.show(painel_principal_superior, "card6"); //mostra card sobre superior
        cardInferior.show(painel_principal_inferior, "card6"); //mostra card sobre inferior
        
        menu_combo_box_funcionarios.setSelectedIndex(0);//redefine o combobox para funcionario
        menu_combo_box_produtos.setSelectedIndex(0);//redefine o combobox para produto
    }//GEN-LAST:event_menu_item_sobreMouseClicked

    private void menu_combo_box_funcionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_combo_box_funcionariosMouseEntered
//        menu_item_funcionarios.setBackground(new Color(251,245,238));
//        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
//        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
//        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
    }//GEN-LAST:event_menu_combo_box_funcionariosMouseEntered

    private void menu_combo_box_funcionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_combo_box_funcionariosMouseExited
//        menu_item_funcionarios.setBackground(new Color(251,245,238));
//        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
//        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
//        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
    }//GEN-LAST:event_menu_combo_box_funcionariosMouseExited

    private void menu_combo_box_funcionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_combo_box_funcionariosActionPerformed

        String option = (String)menu_combo_box_funcionarios.getSelectedItem(); //recebe a opcao escolhida no combo box
        
        CardLayout cardSuperior = (CardLayout)(painel_principal_superior.getLayout()); //declaracao para manipular o card supeior
        CardLayout cardInferior = (CardLayout)(painel_principal_inferior.getLayout()); //declaracao para manipular o card inferior
        
        
        switch(option){
            
            case "Gerenciar Funcionarios":
                
                //-----hover effect-------

                    //funcionario selecionado
                    menu_item_funcionarios.setBackground(new Color(91,48,22));
                    menu_combo_box_funcionarios.setForeground(new Color(251,245,238));
                    menu_combo_box_funcionarios.setBackground(new Color(91,48,22));
                    menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/id_card-white.png")));

                    //produto deseleciona
                    menu_item_produtos.setBackground(new Color(251,245,238));
                    menu_combo_box_produtos.setForeground(new Color(91,48,22));
                    menu_combo_box_produtos.setBackground(new Color(251,245,238));
                    menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));

                    //sobre deseleciona
                    menu_item_sobre.setBackground(new Color(251,245,238));
                    menu_text_sobre.setForeground(new Color(91,48,22));
                    menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));

                    //relatorio deseleciona
                    menu_item_relatorios.setBackground(new Color(251,245,238));
                    menu_text_relatorios.setForeground(new Color(91,48,22));
                    menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
                
                //----mostra conteudo------
                cardSuperior.show(painel_principal_superior, "card2"); //mostra card gerenciar funcionarios superior
                cardInferior.show(painel_principal_inferior, "card2"); //mostra card gerenciar funcionarios inferior
                //menu_combo_box_funcionarios.setSelectedIndex(0);
                menu_combo_box_produtos.setSelectedIndex(0);//redefine o combobox para produto
                break;
                
            case "Cadastrar Funcionario":
                
                //-----hover effect-------

                    //funcionario selecionado
                    menu_item_funcionarios.setBackground(new Color(91,48,22));
                    menu_combo_box_funcionarios.setForeground(new Color(251,245,238));
                    menu_combo_box_funcionarios.setBackground(new Color(91,48,22));
                    menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/id_card-white.png")));

                    //produto deseleciona
                    menu_item_produtos.setBackground(new Color(251,245,238));
                    menu_combo_box_produtos.setForeground(new Color(91,48,22));
                    menu_combo_box_produtos.setBackground(new Color(251,245,238));
                    menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));

                    //sobre deseleciona
                    menu_item_sobre.setBackground(new Color(251,245,238));
                    menu_text_sobre.setForeground(new Color(91,48,22));
                    menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));

                    //relatorio deseleciona
                    menu_item_relatorios.setBackground(new Color(251,245,238));
                    menu_text_relatorios.setForeground(new Color(91,48,22));
                    menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
                
                //----mostra conteudo------
                cardSuperior.show(painel_principal_superior, "card3"); //mostra card cadastrar funcionario superior
                cardInferior.show(painel_principal_inferior, "card3"); //mostra card cadastrar funcionario inferior
                //menu_combo_box_funcionarios.setSelectedIndex(0);
                menu_combo_box_produtos.setSelectedIndex(0);//redefine o combobox para produto
                break;
                
            case "Funcionarios":
                //nenhuma acao
                break;
        }
        
    }//GEN-LAST:event_menu_combo_box_funcionariosActionPerformed

    private void menu_combo_box_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_combo_box_produtosActionPerformed
        
        String option = (String)menu_combo_box_produtos.getSelectedItem(); //recebe a opcao escolhida no combo box
        
        CardLayout cardSuperior = (CardLayout)(painel_principal_superior.getLayout()); //declaracao para manipular o card supeior
        CardLayout cardInferior = (CardLayout)(painel_principal_inferior.getLayout()); //declaracao para manipular o card inferior
        
        
        switch(option){
            
            case "Gerenciar Produtos":
                
                //-----hover effect-------

                    //produto selecionado
                    menu_item_produtos.setBackground(new Color(91,48,22));
                    menu_combo_box_produtos.setForeground(new Color(251,245,238));
                    menu_combo_box_produtos.setBackground(new Color(91,48,22));
                    menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/book-white.png")));

                    //funcionario deseleciona
                    menu_item_funcionarios.setBackground(new Color(251,245,238));
                    menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
                    menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
                    menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));

                    //sobre deseleciona
                    menu_item_sobre.setBackground(new Color(251,245,238));
                    menu_text_sobre.setForeground(new Color(91,48,22));
                    menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));

                    //relatorio deseleciona
                    menu_item_relatorios.setBackground(new Color(251,245,238));
                    menu_text_relatorios.setForeground(new Color(91,48,22));
                    menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
                
                //----mostra conteudo------
                
                cardSuperior.show(painel_principal_superior, "card4"); //mostra card gerenciar produtos superior
                cardInferior.show(painel_principal_inferior, "card4"); //mostra card gerenciar produtos inferior
                //menu_combo_box_produtos.setSelectedIndex(0);
                menu_combo_box_funcionarios.setSelectedIndex(0);//redefine o combobox para funcionario
                break;
                
            case "Cadastrar Produto":
                
                //-----hover effect-------

                    //produto selecionado
                    menu_item_produtos.setBackground(new Color(91,48,22));
                    menu_combo_box_produtos.setForeground(new Color(251,245,238));
                    menu_combo_box_produtos.setBackground(new Color(91,48,22));
                    menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/book-white.png")));

                    //funcionario deseleciona
                    menu_item_funcionarios.setBackground(new Color(251,245,238));
                    menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
                    menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
                    menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));

                    //sobre deseleciona
                    menu_item_sobre.setBackground(new Color(251,245,238));
                    menu_text_sobre.setForeground(new Color(91,48,22));
                    menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));

                    //relatorio deseleciona
                    menu_item_relatorios.setBackground(new Color(251,245,238));
                    menu_text_relatorios.setForeground(new Color(91,48,22));
                    menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
                
                //----mostra conteudo------
                
                cardSuperior.show(painel_principal_superior, "card5"); //mostra card cadastrar produto superior
                cardInferior.show(painel_principal_inferior, "card5"); //mostra card cadastrar produto inferior
                //menu_combo_box_produtos.setSelectedIndex(0);
                menu_combo_box_funcionarios.setSelectedIndex(0);//redefine o combobox para funcionario
                break;
                
            case "Produtos":
                //nenhuma acao
                break;
        }
        
    }//GEN-LAST:event_menu_combo_box_produtosActionPerformed

    private void botao_cadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cadastrarMouseEntered
        botao_cadastrar.setForeground(new Color(251,245,238));
        botao_cadastrar.setBackground(new Color(63,143,66));
        botao_cadastrar.setBorder(null);
    }//GEN-LAST:event_botao_cadastrarMouseEntered

    private void botao_cadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cadastrarMouseExited
        botao_cadastrar.setForeground(new Color(91,48,22));
        botao_cadastrar.setBackground(new Color(251,245,238));
        botao_cadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(91, 48, 22), 1, true));
    }//GEN-LAST:event_botao_cadastrarMouseExited

    private void botao_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrarActionPerformed
        try {   
            // recebendo e validando dados da interface gr�fica.
            String nomeProduto = "";
            String descricaoProduto = "";
            int quantidadeProduto = 0;
            float precoProduto = 0;
            LocalDate dataCadastro;
            String categoriaProduto = "";
            String editoraProduto = "";
            String autorProduto = "";
            int anoLancamento = 0;
     
            if (this.campoTitulo.getText().length() < 2) {
                throw new Mensagens("Titulo deve conter ao menos 2 caracteres!");
            } else {
                nomeProduto = this.campoTitulo.getText();
            }
            
            if (this.campoDescricao.getText().length() < 2) {
                throw new Mensagens("Descrição deve conter ao menos 2 caracteres!");
            } else {
                descricaoProduto = this.campoDescricao.getText();
            }
            
            if (this.campoQuantidade.getText().length() <= 0) {
                throw new Mensagens("Tem que informar no Minimo 1 Unidade de Quantidade!");
            } else {
                quantidadeProduto = Integer.parseInt(this.campoQuantidade.getText());
            }
            
            if (this.campoPreco.getText().length() <= 0) {
                throw new Mensagens("Tem que informar um Preço maior que R$0,00!");
            } else {
                precoProduto = Float.parseFloat(this.campoPreco.getText());
            }
            
            if (this.campoDataCadastro.getText().length() <= 0) {
            throw new Mensagens("Tem que informar a data!");
        } else {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                dataCadastro = LocalDate.parse(this.campoDataCadastro.getText(), formatter);
            } catch (DateTimeParseException e) {
                throw new Mensagens("Formato de data inválido!");
            }
        }
            
            if (this.campoGenero.getSelectedItem().equals("Selecione")){
                throw new Mensagens("Deve selecionar uma categoria!");
            }else {
                categoriaProduto = (String) this.campoGenero.getSelectedItem();
            }
            
            if (this.campoEditora.getText().length() < 2) {
                throw new Mensagens("Editora deve conter ao menos 2 caracteres!");
            } else {
                editoraProduto = this.campoEditora.getText();
            }
            
            if (this.campoAutor.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres!");
            } else {
                autorProduto = this.campoAutor.getText();
            }
            
            if (this.campoAnoPublicacao.getText().length() < 2) {
                throw new Mensagens("O ano tem que ser maior que tres numeros!");
            } else {
                anoLancamento = Integer.parseInt(this.campoAnoPublicacao.getText());
            }   
            
            // envia os dados para o Controlador cadastrar
            if (this.objproduto.InsertProdutoBD(nomeProduto, descricaoProduto, quantidadeProduto, precoProduto, dataCadastro, categoriaProduto, editoraProduto, autorProduto, anoLancamento)) {
                JOptionPane.showMessageDialog(rootPane, "Produto Cadastrado com Sucesso!");

                // limpa campos da interface
                this.campoTitulo.setText("");
                this.campoDescricao.setText("");
                this.campoQuantidade.setText("");
                this.campoPreco.setText("");
                this.campoDataCadastro.setText("");
                this.campoGenero.setSelectedItem("Selecione");
                this.campoEditora.setText("");
                this.campoAutor.setText("");
                this.campoAnoPublicacao.setText("");

            }

            System.out.println(this.objproduto.getMinhaLista().toString());
            
        }catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n�mero.");
        } catch (SQLException ex) {
            Logger.getLogger(Inshelf4.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_botao_cadastrarActionPerformed

    private void botao_atualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_atualizarMouseEntered
        botao_atualizar.setBackground(new Color(66,143,65));
        botao_atualizar.setForeground(new Color(251,245,238));
        botao_atualizar.setBorder(null);
    }//GEN-LAST:event_botao_atualizarMouseEntered

    private void botao_atualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_atualizarMouseExited
        botao_atualizar.setBackground(new Color(251,245,238));
        botao_atualizar.setForeground(new Color(91,48,22));
        botao_atualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(91, 48, 22)));
    }//GEN-LAST:event_botao_atualizarMouseExited

    private void botao_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cancelarMouseEntered
        botao_cancelar.setBackground(new Color(82,82,82));
        botao_cancelar.setForeground(new Color(251,245,238));
        botao_cancelar.setBorder(null);
    }//GEN-LAST:event_botao_cancelarMouseEntered

    private void botao_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cancelarMouseExited
        botao_cancelar.setBackground(new Color(251,245,238));
        botao_cancelar.setForeground(new Color(82,82,82));
        botao_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82,82,82)));
    }//GEN-LAST:event_botao_cancelarMouseExited

    private void botao_deletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_deletarMouseEntered
        botao_deletar.setBackground(new Color(215,66,65));
        botao_deletar.setForeground(new Color(251,245,238));
        botao_deletar.setBorder(null);
    }//GEN-LAST:event_botao_deletarMouseEntered

    private void botao_deletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_deletarMouseExited
        botao_deletar.setBackground(new Color(251,245,238));
        botao_deletar.setForeground(new Color(215,66,65));
        botao_deletar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(215,66,65)));
    }//GEN-LAST:event_botao_deletarMouseExited

    private void tabela_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtosMouseClicked
        if (this.tabela_produtos.getSelectedRow() != -1) {

            String nome = this.tabela_produtos.getValueAt(this.tabela_produtos.getSelectedRow(), 1).toString();
            
            String preco = this.tabela_produtos.getValueAt(this.tabela_produtos.getSelectedRow(), 2).toString();
            
            String autor = this.tabela_produtos.getValueAt(this.tabela_produtos.getSelectedRow(), 3).toString();
            
            String editora = this.tabela_produtos.getValueAt(this.tabela_produtos.getSelectedRow(), 4).toString();
            
            String ano = this.tabela_produtos.getValueAt(this.tabela_produtos.getSelectedRow(), 5).toString();
            
            String categoria = this.tabela_produtos.getValueAt(this.tabela_produtos.getSelectedRow(), 6).toString();
            
            String descricao = this.tabela_produtos.getValueAt(this.tabela_produtos.getSelectedRow(), 7).toString();
            
            String quantidade = this.tabela_produtos.getValueAt(this.tabela_produtos.getSelectedRow(), 8).toString();
            
            
            this.campoTitulo_edicao.setText(nome);
            this.campoAutor_edicao.setText(autor);
            this.campoGenero1.setSelectedItem(categoria);
            this.campoDescricao_edicao.setText(descricao);
            this.campoPreco_edicao.setText(preco);
            this.campoEditora_edicao.setText(editora);
            this.campoQuantidade_edicao.setText(quantidade);
            this.campoAnoPublicacao_edicao.setText(ano);
        }
    }//GEN-LAST:event_tabela_produtosMouseClicked

    private void botao_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_atualizarActionPerformed
        try {   
            // recebendo e validando dados da interface gr�fica.
            int id = 0;
            String nomeProduto = "";
            String descricaoProduto = "";
            int quantidadeProduto = 0;
            float precoProduto = 0;
            String categoriaProduto = "";
            String editoraProduto = "";
            String autorProduto = "";
            int anoLancamento = 0;
     
            if (this.campoTitulo_edicao.getText().length() < 2) {
                throw new Mensagens("Titulo deve conter ao menos 2 caracteres!");
            } else {
                nomeProduto = this.campoTitulo_edicao.getText();
            }
            
            if (this.campoDescricao_edicao.getText().length() < 2) {
                throw new Mensagens("Descrição deve conter ao menos 2 caracteres!");
            } else {
                descricaoProduto = this.campoDescricao_edicao.getText();
            }
            
            if (this.campoQuantidade_edicao.getText().length() <= 0) {
                throw new Mensagens("Tem que informar no Minimo 1 Unidade de Quantidade!");
            } else {
                quantidadeProduto = Integer.parseInt(this.campoQuantidade_edicao.getText());
            }
            
            if (this.campoPreco_edicao.getText().length() <= 0) {
                throw new Mensagens("Tem que informar um Preço maior que R$0,00!");
            } else {
                precoProduto = Float.parseFloat(this.campoPreco_edicao.getText());
            }
            
            if (this.campoGenero1.getSelectedItem().equals("Selecione")){
                throw new Mensagens("Deve selecionar uma categoria!");
            }else {
                categoriaProduto = (String) this.campoGenero1.getSelectedItem();
            }
            
            if (this.campoEditora_edicao.getText().length() < 2) {
                throw new Mensagens("Editora deve conter ao menos 2 caracteres!");
            } else {
                editoraProduto = this.campoEditora_edicao.getText();
            }
            
            if (this.campoAutor_edicao.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres!");
            } else {
                autorProduto = this.campoAutor_edicao.getText();
            }
            
            if (this.campoAnoPublicacao_edicao.getText().length() < 2) {
                throw new Mensagens("O ano tem que ser maior que tres numeros!");
            } else {
                anoLancamento = Integer.parseInt(this.campoAnoPublicacao_edicao.getText());
            }
            
            if (this.tabela_produtos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Produto para Alterar");
            } else {
                id = Integer.parseInt(this.tabela_produtos.getValueAt(this.tabela_produtos.getSelectedRow(), 0).toString());
            }
            
            if (this.objproduto.UpdateProdutoBD(id, nomeProduto, descricaoProduto, quantidadeProduto, precoProduto, categoriaProduto, editoraProduto, autorProduto, anoLancamento)) {
                // limpa os campos
                this.campoTitulo_edicao.setText("");
                this.campoAutor_edicao.setText("");
                this.campoGenero1.setSelectedItem("Selecione");
                this.campoDescricao_edicao.setText("");
                this.campoPreco_edicao.setText("");
                this.campoEditora_edicao.setText("");
                this.campoQuantidade_edicao.setText("");
                this.campoAnoPublicacao_edicao.setText("");
            
                JOptionPane.showMessageDialog(rootPane, "Produto Alterado com Sucesso!");
            }
             System.out.println(this.objproduto.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n�mero.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }    
    }//GEN-LAST:event_botao_atualizarActionPerformed

    private void botao_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_deletarActionPerformed
        try {
            // validando dados da interface gr�fica.
            int id = 0;
            if (this.tabela_produtos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Produto para APAGAR");
            } else {
                id = Integer.parseInt(this.tabela_produtos.getValueAt(this.tabela_produtos.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Produto ?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Aluno processar
                if (this.objproduto.DeleteProdutoBD(id)) {

                // limpa os campos
                this.campoTitulo_edicao.setText("");
                this.campoAutor_edicao.setText("");
                this.campoGenero1.setSelectedItem("Selecione");
                this.campoDescricao_edicao.setText("");
                this.campoPreco_edicao.setText("");
                this.campoEditora_edicao.setText("");
                this.campoQuantidade_edicao.setText("");
                this.campoAnoPublicacao_edicao.setText(""); 
                
                JOptionPane.showMessageDialog(rootPane, "Produto Apagado com Sucesso!");

                }
            }

            System.out.println(this.objproduto.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_botao_deletarActionPerformed

    private void buttonCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFuncionarioActionPerformed
        try {   
        // recebendo e validando dados da interface gráfica.
        String nomeFuncionario = "";
            long telefoneFuncionario = 0L;
            String estadoCivil = "";
            long cpfFuncionario = 0L;
            String escolariedadeFuncionario = "";
            LocalDate dataNascimento;
            long cepFuncionario = 0L;
            String enderecoFuncionario = "";
            String cidadeFuncionario = "";
            int numeroEndereco = 0;       
            String estadoFuncionario = "";
            String complementoFuncionario = "";
            float salarioFuncionario = 0;         

        if (this.campoNomeFuncionario.getText().length() < 2) {
            throw new Mensagens("Nome deve conter ao menos 2 caracteres!");
        } else {
            nomeFuncionario = this.campoNomeFuncionario.getText();
        }

        if (this.campoTelefone.getText().length() != 11) {
            throw new Mensagens("Telefone tem que ter 11 números!");
        } else {
            telefoneFuncionario = Long.parseLong(this.campoTelefone.getText());
        }

        if (this.comboBoxEstadoCivil.getSelectedItem().equals("Selecione")){
            throw new Mensagens("Deve selecionar uma opção!");
        } else {
            estadoCivil = (String) this.comboBoxEstadoCivil.getSelectedItem();
        }

        if (this.campoCpfFuncionario.getText().length() != 11) {
            throw new Mensagens("CPF tem que ter 11 números!");
        } else {
            cpfFuncionario = Long.parseLong(this.campoCpfFuncionario.getText());
        }

        if (this.comboBoxEscolariedade.getSelectedItem().equals("Selecione")){
            throw new Mensagens("Deve selecionar uma opção!");
        } else {
            escolariedadeFuncionario = (String) this.comboBoxEscolariedade.getSelectedItem();
        }

        if (this.campoDataNasciemntoFuncionario.getText().length() <= 0) {
            throw new Mensagens("Tem que informar a data!");
        } else {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                dataNascimento = LocalDate.parse(this.campoDataNasciemntoFuncionario.getText(), formatter);
            } catch (DateTimeParseException e) {
                throw new Mensagens("Formato de data inválido!");
            }
        }

        if (this.campoCepFuncionario.getText().length() < 7) {
                throw new Mensagens("CEP tem que ter 8 numeros!");
            } else {
                cepFuncionario = Long.parseLong(this.campoCepFuncionario.getText());
            }

        if (this.campoEnderecoFuncionario.getText().length() < 2) {
            throw new Mensagens("Endereço tem que ter mais de 2 caracteres!");
        } else {
            enderecoFuncionario = this.campoEnderecoFuncionario.getText();
        }

        if (this.campoCidadeFuncionario.getText().length() < 2) {
            throw new Mensagens("Cidade tem que ter mais de 2 caracteres!");
        } else {
            cidadeFuncionario = this.campoCidadeFuncionario.getText();
        }

         if (this.campoNendereco.getText().length() < 0) {
                throw new Mensagens("Numero tem que ser maior que 0!");
            } else {
                numeroEndereco = Integer.parseInt(this.campoNendereco.getText());
            }

        if (this.comboboxEstado.getSelectedItem().equals("Selecione")){
            throw new Mensagens("Deve selecionar uma opção!");
        } else {
            estadoFuncionario = (String) this.comboboxEstado.getSelectedItem();
        }

        if (this.campoComplemento.getText().length() < 2) {
            throw new Mensagens("Complemento tem que ter mais de 2 caracteres!");
        } else {
            complementoFuncionario = this.campoComplemento.getText();
        }  

        if (this.campoSalarioFuncionario.getText().length() <= 0) {
            throw new Mensagens("Tem que informar um Salário maior que R$0,00!");
        } else {
            salarioFuncionario = Float.parseFloat(this.campoSalarioFuncionario.getText());
        }

        // Logs para verificar valores antes da conversão
        System.out.println("Valores antes da conversão:");
        System.out.println("Telefone: " + telefoneFuncionario);
        System.out.println("CPF: " + cpfFuncionario);
        System.out.println("CEP: " + cepFuncionario);
        System.out.println("Número Endereço: " + numeroEndereco);

        // envia os dados para o Controlador cadastrar
        if (this.objfuncionario.InsertFuncionarioBD(telefoneFuncionario, estadoCivil, escolariedadeFuncionario, cepFuncionario, enderecoFuncionario, cidadeFuncionario, numeroEndereco, estadoFuncionario, complementoFuncionario, salarioFuncionario, nomeFuncionario, cpfFuncionario, dataNascimento)) {
            JOptionPane.showMessageDialog(rootPane, "Funcionário Cadastrado com Sucesso!");

            // limpa campos da interface
            this.campoNomeFuncionario.setText("");
            this.campoTelefone.setText("");
            this.comboBoxEstadoCivil.setSelectedItem("Selecione");
            this.campoCpfFuncionario.setText("");
            this.comboBoxEscolariedade.setSelectedItem("Selecione");
            this.campoDataNasciemntoFuncionario.setText("");
            this.campoCepFuncionario.setText("");
            this.campoEnderecoFuncionario.setText("");
            this.campoCidadeFuncionario.setText("");
            this.campoNendereco.setText("");
            this.comboboxEstado.setSelectedItem("Selecione");
            this.campoComplemento.setText("");
            this.campoSalarioFuncionario.setText("");
        }

        System.out.println(this.objfuncionario.getMinhaLista().toString());

    } catch (Mensagens erro) {
        JOptionPane.showMessageDialog(null, erro.getMessage());
    } catch (NumberFormatException erro2) {
        JOptionPane.showMessageDialog(null, "Informe um número válido.");
        erro2.printStackTrace(); // Adicionando log do stack trace para depuração
    } catch (SQLException ex) {
        Logger.getLogger(Inshelf4.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        carregaTabela2(); // atualiza a tabela.
    }
    }//GEN-LAST:event_buttonCadastrarFuncionarioActionPerformed

    private void menu_item_relatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_relatoriosMouseExited
        //        menu_item_relatorios.setBackground(new Color(251,245,238));
        //        menu_text_relatorios.setForeground(new Color(91,48,22));
        //        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
    }//GEN-LAST:event_menu_item_relatoriosMouseExited

    private void menu_item_relatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_relatoriosMouseEntered
        //        menu_item_relatorios.setBackground(new Color(91,48,22));
        //        menu_text_relatorios.setForeground(new Color(251,245,238));
        //        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/relatorio_icon-white.png")));
    }//GEN-LAST:event_menu_item_relatoriosMouseEntered

    private void menu_item_relatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_relatoriosMouseClicked
        atualizarDados();
        //-----hover effect-------

        //relatorio selecionado
        menu_item_relatorios.setBackground(new Color(91,48,22));
        menu_text_relatorios.setForeground(new Color(251,245,238));
        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/relatorio_icon-white.png")));

        //produto deseleciona
        menu_item_produtos.setBackground(new Color(251,245,238));
        menu_combo_box_produtos.setForeground(new Color(91,48,22));
        menu_combo_box_produtos.setBackground(new Color(251,245,238));
        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));

        //funcionario deseleciona
        menu_item_funcionarios.setBackground(new Color(251,245,238));
        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));

        //sobre deseleciona
        menu_item_sobre.setBackground(new Color(251,245,238));
        menu_text_sobre.setForeground(new Color(91,48,22));
        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));

        //----mostrar conteudo do card--------
        CardLayout cardSuperior = (CardLayout)(painel_principal_superior.getLayout()); //declaracao para manipular o card supeior
        CardLayout cardInferior = (CardLayout)(painel_principal_inferior.getLayout()); //declaracao para manipular o card inferior

        cardSuperior.show(painel_principal_superior, "card1"); //mostra card relatorios superior
        cardInferior.show(painel_principal_inferior, "card1"); //mostra card relatorios inferior

        menu_combo_box_funcionarios.setSelectedIndex(0); //redefine o combobox para funcionario
        menu_combo_box_produtos.setSelectedIndex(0); //redefine o combobox para produto
    }//GEN-LAST:event_menu_item_relatoriosMouseClicked

    private void menu_text_relatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_text_relatoriosMouseClicked
        atualizarDados();
    }//GEN-LAST:event_menu_text_relatoriosMouseClicked

    private void menu_icon_relatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_icon_relatoriosMouseClicked
       atualizarDados();
    }//GEN-LAST:event_menu_icon_relatoriosMouseClicked

    private void botaoAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarFuncionarioActionPerformed
        try {   
        // recebendo e validando dados da interface gráfica.
            int id = 0;
            String nomeFuncionario = "";
            long telefoneFuncionario = 0L;
            String estadoCivil = "";
            long cpfFuncionario = 0L;
            String escolariedadeFuncionario = "";
            LocalDate dataNascimento;
            long cepFuncionario = 0L;
            String enderecoFuncionario = "";
            String cidadeFuncionario = "";
            int numeroEndereco = 0;       
            String estadoFuncionario = "";
            String complementoFuncionario = "";
            float salarioFuncionario = 0;         

        if (this.campoNomeAlterar.getText().length() < 2) {
            throw new Mensagens("Nome deve conter ao menos 2 caracteres!");
        } else {
            nomeFuncionario = this.campoNomeAlterar.getText();
        }

        if (this.campoTelefoneAlterar.getText().length() != 11) {
            throw new Mensagens("Telefone tem que ter 11 números!");
        } else {
            telefoneFuncionario = Long.parseLong(this.campoTelefoneAlterar.getText());
        }

        if (this.campoEstadoCivilAlterar.getText().length() < 2){
            throw new Mensagens("Deve conter ao menos 2 caracteres!");
        } else {
            estadoCivil = this.campoEstadoCivilAlterar.getText();
        }

        if (this.campoCPFalterar.getText().length() < 10) {
            throw new Mensagens("CPF tem que ter 11 números!");
        } else {
            cpfFuncionario = Long.parseLong(this.campoCPFalterar.getText());
        }

        if (this.campoEscolariedadeAlterar.getText().length() < 2){
            throw new Mensagens("Deve conter ao menos 2 caracteres!");
        } else {
            escolariedadeFuncionario = this.campoEscolariedadeAlterar.getText();
        }

        if (this.campoNascimentoAlterar.getText().length() <= 0) {
            throw new Mensagens("Tem que informar a data!");
        } else {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                dataNascimento = LocalDate.parse(this.campoNascimentoAlterar.getText(), formatter);
            } catch (DateTimeParseException e) {
                throw new Mensagens("Formato de data inválido!");
            }
        }

        if (this.campoCEPalterar.getText().length() < 7) {
            throw new Mensagens("CEP tem que ter 8 numeros!");
        } else {
            cepFuncionario = Long.parseLong(this.campoCEPalterar.getText());
        }

        if (this.campoEnderecoAlterar.getText().length() < 2) {
            throw new Mensagens("Endereço tem que ter mais de 2 caracteres!");
        } else {
            enderecoFuncionario = this.campoEnderecoAlterar.getText();
        }

        if (this.campoCidadeAlterar.getText().length() < 2) {
            throw new Mensagens("Cidade tem que ter mais de 2 caracteres!");
        } else {
            cidadeFuncionario = this.campoCidadeAlterar.getText();
        }

        if (this.campoNalterar.getText().length() < 0) {
            throw new Mensagens("Numero tem que ser maior que 0!");
        } else {
            numeroEndereco = Integer.parseInt(this.campoNalterar.getText());
        }

        if (this.campoComplementoAlterar.getText().length() < 2) {
            throw new Mensagens("Complemento tem que ter mais de 2 caracteres!");
        } else {
            complementoFuncionario = this.campoComplementoAlterar.getText();
        } 

        if (this.campoEstadoAlterar.getText().length() < 2) {
            throw new Mensagens("Complemento tem que ter mais de 2 caracteres!");
        } else {
            estadoFuncionario = this.campoEstadoAlterar.getText();
        }  

        if (this.campoSalarioAlterar.getText().length() <= 0) {
            throw new Mensagens("Tem que informar um Salário maior que R$0,00!");
        } else {
            salarioFuncionario = Float.parseFloat(this.campoSalarioAlterar.getText());
        }
        
        if (this.tabelaFuncionarios.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Funcionario para Alterar");
            } else {
                id = Integer.parseInt(this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 0).toString());
            }

        // envia os dados para o Controlador cadastrar
        if (this.objfuncionario.UpdateFuncionarioBD(id, telefoneFuncionario, estadoCivil, escolariedadeFuncionario, cepFuncionario, enderecoFuncionario, cidadeFuncionario, numeroEndereco, estadoFuncionario, complementoFuncionario, salarioFuncionario, nomeFuncionario, cpfFuncionario, dataNascimento)) {
            JOptionPane.showMessageDialog(rootPane, "Funcionário Alterado com Sucesso!");

            // limpa campos da interface
            this.campoNomeAlterar.setText("");
            this.campoTelefoneAlterar.setText("");
            this.campoEstadoCivilAlterar.setText("");
            this.campoCPFalterar.setText("");
            this.campoEscolariedadeAlterar.setText("");
            this.campoNascimentoAlterar.setText("");
            this.campoCEPalterar.setText("");
            this.campoEnderecoAlterar.setText("");
            this.campoCidadeAlterar.setText("");
            this.campoNalterar.setText("");
            this.campoComplementoAlterar.setText("");
            this.campoEstadoAlterar.setText("");
            this.campoSalarioAlterar.setText("");
        }

        System.out.println(this.objfuncionario.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
            erro2.printStackTrace(); // Adicionando log do stack trace para depuração
        } catch (SQLException ex) {
            Logger.getLogger(Inshelf4.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            carregaTabela2(); // atualiza a tabela.
        }
    }//GEN-LAST:event_botaoAlterarFuncionarioActionPerformed

    private void botaoDeleteFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeleteFuncionarioActionPerformed
       try {
            // validando dados da interface gr�fica.
            int id = 0;
            if (this.tabelaFuncionarios.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Funcionario para APAGAR");
            } else {
                id = Integer.parseInt(this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Funcionario ?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Aluno processar
                if (this.objfuncionario.DeleteFuncionarioBD(id)) {

                // limpa campos da interface
            this.campoNomeAlterar.setText("");
            this.campoTelefoneAlterar.setText("");
            this.campoEstadoCivilAlterar.setText("");
            this.campoCPFalterar.setText("");
            this.campoEscolariedadeAlterar.setText("");
            this.campoNascimentoAlterar.setText("");
            this.campoCEPalterar.setText("");
            this.campoEnderecoAlterar.setText("");
            this.campoCidadeAlterar.setText("");
            this.campoNalterar.setText("");
            this.campoComplementoAlterar.setText("");
            this.campoEstadoAlterar.setText("");
            this.campoSalarioAlterar.setText("");
                
                JOptionPane.showMessageDialog(rootPane, "Funcionario Apagado com Sucesso!");

                }
            }

            System.out.println(this.objfuncionario.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela2();
        }
    }//GEN-LAST:event_botaoDeleteFuncionarioActionPerformed

    private void tabelaFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionariosMouseClicked
        if (this.tabelaFuncionarios.getSelectedRow() != -1) {

            String nome = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 1).toString();
            
            String telefone = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 2).toString();
            
            String estadoCivil = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 3).toString();
            
            String cpf = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 4).toString();
            
            String escolariedade = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 5).toString();
            
            String nascimento = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 6).toString();
            
            String cep = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 7).toString();
            
            String endereco = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 8).toString();
            
            String cidade = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 9).toString();

            String numero = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 10).toString();
            
            String complemento = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 11).toString();
            
            String estado = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 12).toString();
            
            String salario = this.tabelaFuncionarios.getValueAt(this.tabelaFuncionarios.getSelectedRow(), 13).toString();
            
            this.campoNomeAlterar.setText(nome);
            this.campoTelefoneAlterar.setText(telefone);
            this.campoEstadoCivilAlterar.setText(estadoCivil);
            this.campoCPFalterar.setText(cpf);
            this.campoEscolariedadeAlterar.setText(escolariedade);
            this.campoNascimentoAlterar.setText(nascimento);
            this.campoCEPalterar.setText(cep);
            this.campoEnderecoAlterar.setText(endereco);
            this.campoCidadeAlterar.setText(cidade);
            this.campoNalterar.setText(numero);
            this.campoComplementoAlterar.setText(complemento);
            this.campoEstadoAlterar.setText(estado);
            this.campoSalarioAlterar.setText(salario);
        }
    }//GEN-LAST:event_tabelaFuncionariosMouseClicked

    public void carregaTabela2() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaFuncionarios.getModel();
        modelo.setNumRows(0);

        ArrayList<Funcionario> minhalista = objfuncionario.getMinhaLista();
    
        if (minhalista.isEmpty()) {
            System.out.println("Nenhum Funcionario encontrado.");
        } else {
            System.out.println("Carregando Funcionarios na tabela...");
        }

        for (Funcionario a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone(),               
                a.getEstado_civil(),
                
                a.getCpf(),
                a.getEscolariedade(),
                a.getNascimento(),
                a.getCep(),
                a.getEndereco(),
                a.getCidade(),
                a.getNumero(),
                a.getComplemento(),
                a.getEstado(),
                a.getSalario()
            });
        }
    }
    
    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabela_produtos.getModel();
        modelo.setNumRows(0);

        ArrayList<Produto> minhalista = objproduto.getMinhaLista();
    
        if (minhalista.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
        } else {
            System.out.println("Carregando produtos na tabela...");
        }

        for (Produto a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNomeProduto(),
                a.getPrecoProduto(),
                a.getAutorProduto(),
                a.getEditoraProduto(),
                a.getAnoLancamento(),
                a.getCategoriaProduto(),
                a.getDescricaoProduto(),
                a.getQuantidadeProduto(),
                a.getDataCadastro()
            });
        }
    }
    
    private void atualizarDados() {
        try {
            RelatorioDAO relatorioDAO = new RelatorioDAO();

            // Obtenção dos valores do banco de dados
            double totalEstoque = relatorioDAO.getTotalEstoque();
            int totalProdutosDiferentes = relatorioDAO.getTotalProdutosDiferentes();
            int totalFuncionarios = relatorioDAO.getTotalFuncionarios();
            int totalQuantidade = relatorioDAO.getTotalQuantidade();

            // Atualização dos labels com os valores obtidos
            valorTotalEstoque.setText(String.format("R$ %.2f", totalEstoque));
            quantidadeProdutosUnicos.setText(String.valueOf(totalProdutosDiferentes));
            quantidadeProdutosGeral.setText(String.valueOf(totalQuantidade));
            quantidadeFuncionarios.setText(String.valueOf(totalFuncionarios));

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao acessar o banco de dados: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inshelf4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inshelf4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inshelf4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inshelf4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inshelf4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterarFuncionario;
    private javax.swing.JButton botaoDeleteFuncionario;
    private javax.swing.JButton botao_atualizar;
    private javax.swing.JButton botao_cadastrar;
    private javax.swing.JButton botao_cancelar;
    private javax.swing.JButton botao_deletar;
    private javax.swing.JButton buttonCadastrarFuncionario;
    private javax.swing.JTextField campoAnoPublicacao;
    private javax.swing.JTextField campoAnoPublicacao_edicao;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoAutor_edicao;
    private javax.swing.JTextField campoCEPalterar;
    private javax.swing.JTextField campoCPFalterar;
    private javax.swing.JTextField campoCepFuncionario;
    private javax.swing.JTextField campoCidadeAlterar;
    private javax.swing.JTextField campoCidadeFuncionario;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoComplementoAlterar;
    private javax.swing.JTextField campoCpfFuncionario;
    private javax.swing.JTextField campoDataCadastro;
    private javax.swing.JTextField campoDataNasciemntoFuncionario;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoDescricao_edicao;
    private javax.swing.JTextField campoEditora;
    private javax.swing.JTextField campoEditora_edicao;
    private javax.swing.JTextField campoEnderecoAlterar;
    private javax.swing.JTextField campoEnderecoFuncionario;
    private javax.swing.JTextField campoEscolariedadeAlterar;
    private javax.swing.JTextField campoEstadoAlterar;
    private javax.swing.JTextField campoEstadoCivilAlterar;
    private javax.swing.JComboBox<String> campoGenero;
    private javax.swing.JComboBox<String> campoGenero1;
    private javax.swing.JTextField campoNalterar;
    private javax.swing.JTextField campoNascimentoAlterar;
    private javax.swing.JTextField campoNendereco;
    private javax.swing.JTextField campoNomeAlterar;
    private javax.swing.JTextField campoNomeFuncionario;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoPreco_edicao;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JTextField campoQuantidade_edicao;
    private javax.swing.JTextField campoSalarioAlterar;
    private javax.swing.JTextField campoSalarioFuncionario;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JTextField campoTelefoneAlterar;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JTextField campoTitulo_edicao;
    private javax.swing.JComboBox<String> comboBoxEscolariedade;
    private javax.swing.JComboBox<String> comboBoxEstadoCivil;
    private javax.swing.JComboBox<String> comboboxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel181;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel183;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel188;
    private javax.swing.JPanel jPanel189;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel194;
    private javax.swing.JPanel jPanel195;
    private javax.swing.JPanel jPanel196;
    private javax.swing.JPanel jPanel197;
    private javax.swing.JPanel jPanel198;
    private javax.swing.JPanel jPanel199;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel200;
    private javax.swing.JPanel jPanel201;
    private javax.swing.JPanel jPanel202;
    private javax.swing.JPanel jPanel203;
    private javax.swing.JPanel jPanel204;
    private javax.swing.JPanel jPanel205;
    private javax.swing.JPanel jPanel206;
    private javax.swing.JPanel jPanel207;
    private javax.swing.JPanel jPanel208;
    private javax.swing.JPanel jPanel209;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel210;
    private javax.swing.JPanel jPanel211;
    private javax.swing.JPanel jPanel212;
    private javax.swing.JPanel jPanel213;
    private javax.swing.JPanel jPanel214;
    private javax.swing.JPanel jPanel215;
    private javax.swing.JPanel jPanel216;
    private javax.swing.JPanel jPanel217;
    private javax.swing.JPanel jPanel218;
    private javax.swing.JPanel jPanel219;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel220;
    private javax.swing.JPanel jPanel221;
    private javax.swing.JPanel jPanel222;
    private javax.swing.JPanel jPanel223;
    private javax.swing.JPanel jPanel224;
    private javax.swing.JPanel jPanel225;
    private javax.swing.JPanel jPanel226;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel235;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JPanel margin_bottom;
    private javax.swing.JPanel margin_center;
    private javax.swing.JPanel margin_left;
    private javax.swing.JPanel margin_right;
    private javax.swing.JPanel margin_top;
    private javax.swing.JComboBox<String> menu_combo_box_funcionarios;
    private javax.swing.JComboBox<String> menu_combo_box_produtos;
    private javax.swing.JLabel menu_icon_funcionarios;
    private javax.swing.JLabel menu_icon_produtos;
    private javax.swing.JLabel menu_icon_relatorios;
    private javax.swing.JLabel menu_icon_sair;
    private javax.swing.JLabel menu_icon_sobre;
    private javax.swing.JPanel menu_item_funcionarios;
    private javax.swing.JPanel menu_item_produtos;
    private javax.swing.JPanel menu_item_relatorios;
    private javax.swing.JPanel menu_item_sair;
    private javax.swing.JPanel menu_item_sobre;
    private javax.swing.JLabel menu_text_relatorios;
    private javax.swing.JLabel menu_text_sair;
    private javax.swing.JLabel menu_text_sobre;
    private javax.swing.JPanel paine_base;
    private javax.swing.JPanel painel_campos_produtos_inferior;
    private javax.swing.JPanel painel_campos_produtos_superior;
    private javax.swing.JPanel painel_principal_inferior;
    private javax.swing.JPanel painel_principal_superior;
    private javax.swing.JLabel quantidadeFuncionarios;
    private javax.swing.JLabel quantidadeProdutosGeral;
    private javax.swing.JLabel quantidadeProdutosUnicos;
    private View.RoundedPanel roundedPanel1;
    private View.RoundedPanel roundedPanel2;
    private View.RoundedPanel roundedPanel3;
    private View.RoundedPanel roundedPanel4;
    private View.RoundedPanel roundedPanel5;
    private View.RoundedPanel roundedPanel6;
    private View.RoundedPanel roundedPanel7;
    private View.RoundedPanel roundedPanel8;
    private View.RoundedPanel roundedPanel9;
    private javax.swing.JTable tabelaFuncionarios;
    private javax.swing.JTable tabela_produtos;
    private javax.swing.JPanel tela_cadastro_funcionarios_inferior;
    private javax.swing.JPanel tela_cadastro_funcionarios_superior;
    private javax.swing.JPanel tela_cadastro_produtos_inferior;
    private javax.swing.JPanel tela_cadastro_produtos_superior;
    private javax.swing.JPanel tela_gerenciamento_funcionarios_inferior;
    private javax.swing.JPanel tela_gerenciamento_funcionarios_superior;
    private javax.swing.JPanel tela_gerenciamento_produtos_inferior;
    private javax.swing.JPanel tela_gerenciamento_produtos_supeior;
    private javax.swing.JPanel tela_relatorios_inferior;
    private javax.swing.JPanel tela_relatorios_superior;
    private javax.swing.JPanel tela_sobre_inferior;
    private javax.swing.JPanel tela_sobre_superior;
    private javax.swing.JLabel valorTotalEstoque;
    // End of variables declaration//GEN-END:variables
}
