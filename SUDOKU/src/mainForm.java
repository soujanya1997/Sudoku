
import java.awt.event.*;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.Timer;

public class mainForm extends javax.swing.JFrame{
    String value = null ;
    Object grid = null ;
    int points=0 ;
    static int correct=0 ;
    char[][] answer = new char[10][10];
    static int[][] ans = new int[10][10];
    static int[][] a = new int[10][10] ;
    public mainForm() {
        initComponents();
        
        createProblem() ;
        
        eventHandler handler = new eventHandler() ;
        eventHandler2 handler2 = new eventHandler2() ;
        numberChooser.setVisible(false);
        erase.addActionListener(handler2);
        b1.addActionListener(handler2);
        b2.addActionListener(handler2);
        b3.addActionListener(handler2);
        b4.addActionListener(handler2);
        b5.addActionListener(handler2);
        b6.addActionListener(handler2);
        b7.addActionListener(handler2);
        b8.addActionListener(handler2);
        b9.addActionListener(handler2);
        g11.addActionListener(handler);
        g12.addActionListener(handler);
        g13.addActionListener(handler);
        g14.addActionListener(handler);
        g15.addActionListener(handler);
        g16.addActionListener(handler);
        g17.addActionListener(handler);
        g18.addActionListener(handler);
        g19.addActionListener(handler);
        g21.addActionListener(handler);
        g22.addActionListener(handler);
        g23.addActionListener(handler);
        g24.addActionListener(handler);
        g25.addActionListener(handler);
        g26.addActionListener(handler);
        g27.addActionListener(handler);
        g28.addActionListener(handler);
        g29.addActionListener(handler);
        g31.addActionListener(handler);
        g32.addActionListener(handler);
        g33.addActionListener(handler);
        g34.addActionListener(handler);
        g35.addActionListener(handler);
        g36.addActionListener(handler);
        g37.addActionListener(handler);
        g38.addActionListener(handler);
        g39.addActionListener(handler);
        g41.addActionListener(handler);
        g42.addActionListener(handler);
        g43.addActionListener(handler);
        g44.addActionListener(handler);
        g45.addActionListener(handler);
        g46.addActionListener(handler);
        g47.addActionListener(handler);
        g48.addActionListener(handler);
        g49.addActionListener(handler);
        g51.addActionListener(handler);
        g52.addActionListener(handler);
        g53.addActionListener(handler);
        g54.addActionListener(handler);
        g55.addActionListener(handler);
        g56.addActionListener(handler);
        g57.addActionListener(handler);
        g58.addActionListener(handler);
        g59.addActionListener(handler);
        g61.addActionListener(handler);
        g62.addActionListener(handler);
        g63.addActionListener(handler);
        g64.addActionListener(handler);
        g65.addActionListener(handler);
        g66.addActionListener(handler);
        g67.addActionListener(handler);
        g68.addActionListener(handler);
        g69.addActionListener(handler);
        g71.addActionListener(handler);
        g72.addActionListener(handler);
        g73.addActionListener(handler);
        g74.addActionListener(handler);
        g75.addActionListener(handler);
        g76.addActionListener(handler);
        g77.addActionListener(handler);
        g78.addActionListener(handler);
        g79.addActionListener(handler);
        g81.addActionListener(handler);
        g82.addActionListener(handler);
        g83.addActionListener(handler);
        g84.addActionListener(handler);
        g85.addActionListener(handler);
        g86.addActionListener(handler);
        g87.addActionListener(handler);
        g88.addActionListener(handler);
        g89.addActionListener(handler);
        g91.addActionListener(handler);
        g92.addActionListener(handler);
        g93.addActionListener(handler);
        g94.addActionListener(handler);
        g95.addActionListener(handler);
        g96.addActionListener(handler);
        g97.addActionListener(handler);
        g98.addActionListener(handler);
        g99.addActionListener(handler);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        board = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        g18 = new javax.swing.JToggleButton();
        g17 = new javax.swing.JToggleButton();
        g19 = new javax.swing.JToggleButton();
        g27 = new javax.swing.JToggleButton();
        g28 = new javax.swing.JToggleButton();
        g29 = new javax.swing.JToggleButton();
        g37 = new javax.swing.JToggleButton();
        g38 = new javax.swing.JToggleButton();
        g39 = new javax.swing.JToggleButton();
        jPanel7 = new javax.swing.JPanel();
        g74 = new javax.swing.JToggleButton();
        g75 = new javax.swing.JToggleButton();
        g76 = new javax.swing.JToggleButton();
        g84 = new javax.swing.JToggleButton();
        g85 = new javax.swing.JToggleButton();
        g86 = new javax.swing.JToggleButton();
        g94 = new javax.swing.JToggleButton();
        g95 = new javax.swing.JToggleButton();
        g96 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        g44 = new javax.swing.JToggleButton();
        g45 = new javax.swing.JToggleButton();
        g46 = new javax.swing.JToggleButton();
        g54 = new javax.swing.JToggleButton();
        g55 = new javax.swing.JToggleButton();
        g56 = new javax.swing.JToggleButton();
        g64 = new javax.swing.JToggleButton();
        g65 = new javax.swing.JToggleButton();
        g66 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        g77 = new javax.swing.JToggleButton();
        g78 = new javax.swing.JToggleButton();
        g79 = new javax.swing.JToggleButton();
        g87 = new javax.swing.JToggleButton();
        g88 = new javax.swing.JToggleButton();
        g89 = new javax.swing.JToggleButton();
        g97 = new javax.swing.JToggleButton();
        g98 = new javax.swing.JToggleButton();
        g99 = new javax.swing.JToggleButton();
        jPanel8 = new javax.swing.JPanel();
        g14 = new javax.swing.JToggleButton();
        g15 = new javax.swing.JToggleButton();
        g16 = new javax.swing.JToggleButton();
        g24 = new javax.swing.JToggleButton();
        g25 = new javax.swing.JToggleButton();
        g26 = new javax.swing.JToggleButton();
        g34 = new javax.swing.JToggleButton();
        g35 = new javax.swing.JToggleButton();
        g36 = new javax.swing.JToggleButton();
        jPanel15 = new javax.swing.JPanel();
        g41 = new javax.swing.JToggleButton();
        g42 = new javax.swing.JToggleButton();
        g43 = new javax.swing.JToggleButton();
        g51 = new javax.swing.JToggleButton();
        g52 = new javax.swing.JToggleButton();
        g53 = new javax.swing.JToggleButton();
        g61 = new javax.swing.JToggleButton();
        g62 = new javax.swing.JToggleButton();
        g63 = new javax.swing.JToggleButton();
        jPanel16 = new javax.swing.JPanel();
        g47 = new javax.swing.JToggleButton();
        g48 = new javax.swing.JToggleButton();
        g49 = new javax.swing.JToggleButton();
        g57 = new javax.swing.JToggleButton();
        g58 = new javax.swing.JToggleButton();
        g59 = new javax.swing.JToggleButton();
        g67 = new javax.swing.JToggleButton();
        g68 = new javax.swing.JToggleButton();
        g69 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        g11 = new javax.swing.JToggleButton();
        g12 = new javax.swing.JToggleButton();
        g13 = new javax.swing.JToggleButton();
        g21 = new javax.swing.JToggleButton();
        g22 = new javax.swing.JToggleButton();
        g23 = new javax.swing.JToggleButton();
        g31 = new javax.swing.JToggleButton();
        g32 = new javax.swing.JToggleButton();
        g33 = new javax.swing.JToggleButton();
        jPanel17 = new javax.swing.JPanel();
        g71 = new javax.swing.JToggleButton();
        g72 = new javax.swing.JToggleButton();
        g73 = new javax.swing.JToggleButton();
        g81 = new javax.swing.JToggleButton();
        g82 = new javax.swing.JToggleButton();
        g83 = new javax.swing.JToggleButton();
        g91 = new javax.swing.JToggleButton();
        g92 = new javax.swing.JToggleButton();
        g93 = new javax.swing.JToggleButton();
        numberChooser = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        erase = new javax.swing.JButton();
        newGame = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pause = new javax.swing.JButton();
        done = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1064, 989));
        setMinimumSize(new java.awt.Dimension(1064, 989));
        setPreferredSize(new java.awt.Dimension(1064, 989));
        setResizable(false);
        setSize(new java.awt.Dimension(1064, 989));
        getContentPane().setLayout(null);

        board.setBackground(new java.awt.Color(1, 1, 1));
        board.setMinimumSize(new java.awt.Dimension(684, 684));
        board.setPreferredSize(new java.awt.Dimension(684, 684));
        board.setLayout(null);

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);
        jPanel3.setMinimumSize(new java.awt.Dimension(216, 216));
        jPanel3.setPreferredSize(new java.awt.Dimension(216, 216));
        jPanel3.setLayout(null);

        g18.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g18.setText("jToggleButton10");
        jPanel3.add(g18);
        g18.setBounds(78, 12, 60, 60);

        g17.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g17.setText("jToggleButton10");
        jPanel3.add(g17);
        g17.setBounds(12, 12, 60, 60);

        g19.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g19.setText("jToggleButton10");
        jPanel3.add(g19);
        g19.setBounds(144, 12, 60, 60);

        g27.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g27.setText("jToggleButton10");
        jPanel3.add(g27);
        g27.setBounds(12, 78, 60, 60);

        g28.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g28.setText("jToggleButton10");
        jPanel3.add(g28);
        g28.setBounds(78, 78, 60, 60);

        g29.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g29.setText("jToggleButton10");
        jPanel3.add(g29);
        g29.setBounds(144, 78, 60, 60);

        g37.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g37.setText("jToggleButton10");
        jPanel3.add(g37);
        g37.setBounds(12, 144, 60, 60);

        g38.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g38.setText("jToggleButton10");
        jPanel3.add(g38);
        g38.setBounds(78, 144, 60, 60);

        g39.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g39.setText("jToggleButton10");
        jPanel3.add(g39);
        g39.setBounds(144, 144, 60, 60);

        board.add(jPanel3);
        jPanel3.setBounds(480, 20, 216, 216);

        jPanel7.setBackground(new java.awt.Color(154, 189, 206));
        jPanel7.setMinimumSize(new java.awt.Dimension(216, 216));
        jPanel7.setPreferredSize(new java.awt.Dimension(216, 216));
        jPanel7.setLayout(null);

        g74.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g74.setText("jToggleButton10");
        jPanel7.add(g74);
        g74.setBounds(12, 12, 60, 60);

        g75.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g75.setText("jToggleButton10");
        jPanel7.add(g75);
        g75.setBounds(78, 12, 60, 60);

        g76.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g76.setText("jToggleButton10");
        jPanel7.add(g76);
        g76.setBounds(144, 12, 60, 60);

        g84.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g84.setText("jToggleButton10");
        jPanel7.add(g84);
        g84.setBounds(12, 78, 60, 60);

        g85.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g85.setText("jToggleButton10");
        jPanel7.add(g85);
        g85.setBounds(78, 78, 60, 60);

        g86.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g86.setText("jToggleButton10");
        jPanel7.add(g86);
        g86.setBounds(144, 78, 60, 60);

        g94.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g94.setText("jToggleButton10");
        jPanel7.add(g94);
        g94.setBounds(12, 144, 60, 60);

        g95.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g95.setText("jToggleButton10");
        jPanel7.add(g95);
        g95.setBounds(78, 144, 60, 60);

        g96.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g96.setText("jToggleButton10");
        jPanel7.add(g96);
        g96.setBounds(144, 144, 60, 60);

        board.add(jPanel7);
        jPanel7.setBounds(260, 460, 216, 216);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setMaximumSize(new java.awt.Dimension(216, 216));
        jPanel1.setMinimumSize(new java.awt.Dimension(216, 216));
        jPanel1.setPreferredSize(new java.awt.Dimension(216, 216));
        jPanel1.setLayout(null);

        g44.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g44.setText("jToggleButton10");
        jPanel1.add(g44);
        g44.setBounds(12, 12, 60, 60);

        g45.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g45.setText("jToggleButton10");
        jPanel1.add(g45);
        g45.setBounds(78, 12, 60, 60);

        g46.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g46.setText("jToggleButton10");
        jPanel1.add(g46);
        g46.setBounds(144, 12, 60, 60);

        g54.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g54.setText("jToggleButton10");
        jPanel1.add(g54);
        g54.setBounds(12, 78, 60, 60);

        g55.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g55.setText("jToggleButton10");
        jPanel1.add(g55);
        g55.setBounds(78, 78, 60, 60);

        g56.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g56.setText("jToggleButton10");
        jPanel1.add(g56);
        g56.setBounds(144, 78, 60, 60);

        g64.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g64.setText("jToggleButton10");
        jPanel1.add(g64);
        g64.setBounds(12, 144, 60, 60);

        g65.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g65.setText("jToggleButton10");
        jPanel1.add(g65);
        g65.setBounds(78, 144, 60, 60);

        g66.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g66.setText("jToggleButton10");
        jPanel1.add(g66);
        g66.setBounds(144, 144, 60, 60);

        board.add(jPanel1);
        jPanel1.setBounds(260, 240, 216, 216);

        jPanel4.setBackground(java.awt.SystemColor.activeCaption);
        jPanel4.setMaximumSize(new java.awt.Dimension(216, 216));
        jPanel4.setMinimumSize(new java.awt.Dimension(216, 216));
        jPanel4.setLayout(null);

        g77.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g77.setText("jToggleButton10");
        jPanel4.add(g77);
        g77.setBounds(12, 12, 60, 60);

        g78.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g78.setText("jToggleButton10");
        jPanel4.add(g78);
        g78.setBounds(78, 12, 60, 60);

        g79.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g79.setText("jToggleButton10");
        jPanel4.add(g79);
        g79.setBounds(144, 12, 60, 60);

        g87.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g87.setText("jToggleButton10");
        jPanel4.add(g87);
        g87.setBounds(12, 78, 60, 60);

        g88.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g88.setText("jToggleButton10");
        jPanel4.add(g88);
        g88.setBounds(78, 78, 60, 60);

        g89.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g89.setText("jToggleButton10");
        jPanel4.add(g89);
        g89.setBounds(144, 78, 60, 60);

        g97.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g97.setText("jToggleButton10");
        jPanel4.add(g97);
        g97.setBounds(12, 144, 60, 60);

        g98.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g98.setText("jToggleButton10");
        jPanel4.add(g98);
        g98.setBounds(78, 144, 60, 60);

        g99.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g99.setText("jToggleButton10");
        jPanel4.add(g99);
        g99.setBounds(144, 144, 60, 60);

        board.add(jPanel4);
        jPanel4.setBounds(480, 460, 216, 216);

        jPanel8.setBackground(new java.awt.Color(154, 189, 206));
        jPanel8.setMinimumSize(new java.awt.Dimension(216, 216));
        jPanel8.setLayout(null);

        g14.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g14.setText("jToggleButton10");
        jPanel8.add(g14);
        g14.setBounds(12, 12, 60, 60);

        g15.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g15.setText("jToggleButton10");
        jPanel8.add(g15);
        g15.setBounds(78, 12, 60, 60);

        g16.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g16.setText("jToggleButton10");
        jPanel8.add(g16);
        g16.setBounds(144, 12, 60, 60);

        g24.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g24.setText("jToggleButton10");
        jPanel8.add(g24);
        g24.setBounds(12, 78, 60, 60);

        g25.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g25.setText("jToggleButton10");
        jPanel8.add(g25);
        g25.setBounds(78, 78, 60, 60);

        g26.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g26.setText("jToggleButton10");
        jPanel8.add(g26);
        g26.setBounds(144, 78, 60, 60);

        g34.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g34.setText("jToggleButton10");
        jPanel8.add(g34);
        g34.setBounds(12, 144, 60, 60);

        g35.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g35.setText("jToggleButton10");
        jPanel8.add(g35);
        g35.setBounds(78, 144, 60, 60);

        g36.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g36.setText("jToggleButton10");
        jPanel8.add(g36);
        g36.setBounds(144, 144, 60, 60);

        board.add(jPanel8);
        jPanel8.setBounds(260, 20, 216, 216);

        jPanel15.setBackground(new java.awt.Color(154, 189, 206));
        jPanel15.setMinimumSize(new java.awt.Dimension(216, 216));
        jPanel15.setLayout(null);

        g41.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g41.setText("jToggleButton10");
        jPanel15.add(g41);
        g41.setBounds(12, 12, 60, 60);

        g42.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g42.setText("jToggleButton10");
        jPanel15.add(g42);
        g42.setBounds(78, 12, 60, 60);

        g43.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g43.setText("jToggleButton10");
        jPanel15.add(g43);
        g43.setBounds(144, 12, 60, 60);

        g51.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g51.setText("jToggleButton10");
        jPanel15.add(g51);
        g51.setBounds(12, 78, 60, 60);

        g52.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g52.setText("jToggleButton10");
        jPanel15.add(g52);
        g52.setBounds(78, 78, 60, 60);

        g53.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g53.setText("jToggleButton10");
        jPanel15.add(g53);
        g53.setBounds(144, 78, 60, 60);

        g61.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g61.setText("jToggleButton10");
        jPanel15.add(g61);
        g61.setBounds(12, 144, 60, 60);

        g62.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g62.setText("jToggleButton10");
        jPanel15.add(g62);
        g62.setBounds(78, 144, 60, 60);

        g63.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g63.setText("jToggleButton10");
        jPanel15.add(g63);
        g63.setBounds(144, 144, 60, 60);

        board.add(jPanel15);
        jPanel15.setBounds(40, 240, 216, 216);

        jPanel16.setBackground(new java.awt.Color(154, 189, 206));
        jPanel16.setMinimumSize(new java.awt.Dimension(216, 216));
        jPanel16.setLayout(null);

        g47.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g47.setText("jToggleButton10");
        jPanel16.add(g47);
        g47.setBounds(12, 12, 60, 60);

        g48.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g48.setText("jToggleButton10");
        jPanel16.add(g48);
        g48.setBounds(78, 12, 60, 60);

        g49.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g49.setText("jToggleButton10");
        jPanel16.add(g49);
        g49.setBounds(144, 12, 60, 60);

        g57.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g57.setText("jToggleButton10");
        jPanel16.add(g57);
        g57.setBounds(12, 78, 60, 60);

        g58.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g58.setText("jToggleButton10");
        jPanel16.add(g58);
        g58.setBounds(78, 78, 60, 60);

        g59.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g59.setText("jToggleButton10");
        jPanel16.add(g59);
        g59.setBounds(144, 78, 60, 60);

        g67.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g67.setText("jToggleButton10");
        jPanel16.add(g67);
        g67.setBounds(12, 144, 60, 60);

        g68.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g68.setText("jToggleButton10");
        jPanel16.add(g68);
        g68.setBounds(78, 144, 60, 60);

        g69.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g69.setText("jToggleButton10");
        jPanel16.add(g69);
        g69.setBounds(144, 144, 60, 60);

        board.add(jPanel16);
        jPanel16.setBounds(480, 240, 216, 216);

        jPanel5.setBackground(java.awt.SystemColor.activeCaption);
        jPanel5.setMaximumSize(new java.awt.Dimension(216, 216));
        jPanel5.setMinimumSize(new java.awt.Dimension(216, 216));
        jPanel5.setLayout(null);

        g11.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g11.setText("g11");
        jPanel5.add(g11);
        g11.setBounds(12, 12, 60, 60);

        g12.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g12.setText("g12");
        jPanel5.add(g12);
        g12.setBounds(78, 12, 60, 60);

        g13.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g13.setText("g13");
        jPanel5.add(g13);
        g13.setBounds(144, 12, 60, 60);

        g21.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g21.setText("g21");
        jPanel5.add(g21);
        g21.setBounds(12, 78, 60, 60);

        g22.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g22.setText("g22");
        jPanel5.add(g22);
        g22.setBounds(78, 78, 60, 60);

        g23.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g23.setText("jToggleButton10");
        jPanel5.add(g23);
        g23.setBounds(144, 78, 60, 60);

        g31.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g31.setText("jToggleButton10");
        jPanel5.add(g31);
        g31.setBounds(12, 144, 60, 60);

        g32.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g32.setText("jToggleButton10");
        jPanel5.add(g32);
        g32.setBounds(78, 144, 60, 60);

        g33.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g33.setText("jToggleButton10");
        jPanel5.add(g33);
        g33.setBounds(144, 144, 60, 60);

        board.add(jPanel5);
        jPanel5.setBounds(40, 20, 216, 216);

        jPanel17.setBackground(java.awt.SystemColor.activeCaption);
        jPanel17.setMaximumSize(new java.awt.Dimension(216, 216));
        jPanel17.setMinimumSize(new java.awt.Dimension(216, 216));
        jPanel17.setLayout(null);

        g71.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g71.setText("jToggleButton10");
        jPanel17.add(g71);
        g71.setBounds(12, 12, 60, 60);

        g72.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g72.setText("jToggleButton10");
        jPanel17.add(g72);
        g72.setBounds(78, 12, 60, 60);

        g73.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g73.setText("jToggleButton10");
        jPanel17.add(g73);
        g73.setBounds(144, 12, 60, 60);

        g81.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g81.setText("jToggleButton10");
        jPanel17.add(g81);
        g81.setBounds(12, 78, 60, 60);

        g82.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g82.setText("jToggleButton10");
        jPanel17.add(g82);
        g82.setBounds(78, 78, 60, 60);

        g83.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g83.setText("jToggleButton10");
        jPanel17.add(g83);
        g83.setBounds(144, 78, 60, 60);

        g91.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g91.setText("jToggleButton10");
        jPanel17.add(g91);
        g91.setBounds(12, 144, 60, 60);

        g92.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g92.setText("jToggleButton10");
        g92.setBorder(null);
        jPanel17.add(g92);
        g92.setBounds(78, 144, 60, 60);

        g93.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        g93.setText("jToggleButton10");
        jPanel17.add(g93);
        g93.setBounds(144, 144, 60, 60);

        board.add(jPanel17);
        jPanel17.setBounds(40, 460, 216, 216);

        getContentPane().add(board);
        board.setBounds(190, 120, 740, 700);

        numberChooser.setBackground(new java.awt.Color(1, 1, 1));
        numberChooser.setEnabled(false);

        b1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        b1.setText("1");

        b2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        b2.setText("2");

        b3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        b3.setText("3");

        b4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        b4.setText("4");

        b5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        b5.setText("5");

        b6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        b6.setText("6");

        b7.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        b7.setText("7");

        b8.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        b8.setText("8");

        b9.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        b9.setText("9");

        javax.swing.GroupLayout numberChooserLayout = new javax.swing.GroupLayout(numberChooser);
        numberChooser.setLayout(numberChooserLayout);
        numberChooserLayout.setHorizontalGroup(
            numberChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numberChooserLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        numberChooserLayout.setVerticalGroup(
            numberChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numberChooserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(numberChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(numberChooser);
        numberChooser.setBounds(190, 820, 740, 90);

        erase.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        erase.setText("erase");
        getContentPane().add(erase);
        erase.setBounds(40, 640, 110, 80);

        newGame.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        newGame.setText("new");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });
        getContentPane().add(newGame);
        newGame.setBounds(40, 310, 110, 80);

        time.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("TIME");
        getContentPane().add(time);
        time.setBounds(0, 190, 190, 50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUDOKU.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 0, 740, 120);

        pause.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        pause.setText("pause");
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });
        getContentPane().add(pause);
        pause.setBounds(40, 420, 110, 80);

        done.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        done.setText("done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        getContentPane().add(done);
        done.setBounds(40, 530, 110, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1070, 990);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

class eventHandler2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

           if(e.getSource()==erase){
               value = "" ;
               
               if(grid.equals(g11)){
                    g11.setText(value);
                    g11.setSelected(false);
                }
                else if(grid.equals(g12)){
                    g12.setText(value) ;
                    g12.setSelected(false);
                }
                else if(grid.equals(g13)){
                    g13.setText(value) ;
                    g13.setSelected(false);
                }
                else if(grid.equals(g14)){
                    g14.setText(value) ;
                    g14.setSelected(false);
                }
                else if(grid.equals(g15)){
                    g15.setText(value) ;
                    g15.setSelected(false);
                }
                else if(grid.equals(g16)){
                    g16.setText(value) ;
                    g16.setSelected(false);
                }
                else if(grid.equals(g17)){
                    g17.setText(value) ;
                    g17.setSelected(false);
                }
                else if(grid.equals(g18)){
                    g18.setText(value) ;
                    g18.setSelected(false);
                }
                else if(grid.equals(g19)){
                    g19.setText(value) ;
                    g19.setSelected(false);
                }
                else if(grid.equals(g21)){
                    g21.setText(value) ;
                    g21.setSelected(false);
                }
                else if(grid.equals(g22)){
                    g22.setText(value) ;
                    g22.setSelected(false);
                }
                else if(grid.equals(g23)){
                    g23.setText(value) ;
                    g23.setSelected(false);
                }
                else if(grid.equals(g24)){
                    g24.setText(value) ;
                    g24.setSelected(false);
                }
                else if(grid.equals(g25)){
                    g25.setText(value) ;
                    g25.setSelected(false);
                }
                else if(grid.equals(g26)){
                    g26.setText(value) ;
                    g26.setSelected(false);
                }
                else if(grid.equals(g27)){
                    g27.setText(value) ;
                    g27.setSelected(false);
                }
                else if(grid.equals(g28)){
                    g28.setText(value) ;
                    g28.setSelected(false);
                }
                else if(grid.equals(g29)){
                    g29.setText(value) ;
                    g29.setSelected(false);
                }
                else if(grid.equals(g31)){
                    g31.setText(value) ;
                    g31.setSelected(false);
                }
                else if(grid.equals(g32)){
                    g32.setText(value) ;
                    g32.setSelected(false);
                }
                else if(grid.equals(g33)){
                    g33.setText(value) ;
                    g33.setSelected(false);
                }
                else if(grid.equals(g34)){
                    g34.setText(value) ;
                    g34.setSelected(false);
                }
                else if(grid.equals(g35)){
                    g35.setText(value) ;
                    g35.setSelected(false);
                }
                else if(grid.equals(g36)){
                    g36.setText(value) ;
                    g36.setSelected(false);
                }
                else if(grid.equals(g37)){
                    g37.setText(value) ;
                    g37.setSelected(false);
                }
                else if(grid.equals(g38)){
                    g38.setText(value) ;
                    g38.setSelected(false);
                }
                else if(grid.equals(g39)){
                    g39.setText(value) ;
                    g39.setSelected(false);
                }
                else if(grid.equals(g41)){
                    g41.setText(value) ;
                    g41.setSelected(false);
                }
                else if(grid.equals(g42)){
                    g42.setText(value) ;
                    g42.setSelected(false);
                }
                else if(grid.equals(g43)){
                    g43.setText(value) ;
                    g43.setSelected(false);
                }
                else if(grid.equals(g44)){
                    g44.setText(value) ;
                    g44.setSelected(false);
                }
                else if(grid.equals(g45)){
                    g45.setText(value) ;
                    g45.setSelected(false);
                }
                else if(grid.equals(g46)){
                    g46.setText(value) ;
                    g46.setSelected(false);
                }
                else if(grid.equals(g47)){
                    g47.setText(value) ;
                    g47.setSelected(false);
                }
                else if(grid.equals(g48)){
                    g48.setText(value) ;
                    g48.setSelected(false);
                }
                else if(grid.equals(g49)){
                    g49.setText(value) ;
                    g49.setSelected(false);
                }
                else if(grid.equals(g51)){
                    g51.setText(value) ;
                    g51.setSelected(false);
                }
                else if(grid.equals(g52)){
                    g52.setText(value) ;
                    g52.setSelected(false);
                }
                else if(grid.equals(g53)){
                    g53.setText(value) ;
                    g53.setSelected(false);
                }
                else if(grid.equals(g54)){
                    g54.setText(value) ;
                    g54.setSelected(false);
                }
                else if(grid.equals(g55)){
                    g55.setText(value) ;
                    g55.setSelected(false);
                }
                else if(grid.equals(g56)){
                    g56.setText(value) ;
                    g56.setSelected(false);
                }
                else if(grid.equals(g57)){
                    g57.setText(value) ;
                    g57.setSelected(false);
                }
                else if(grid.equals(g58)){
                    g58.setText(value) ;
                    g58.setSelected(false);
                }
                else if(grid.equals(g59)){
                    g59.setText(value) ;
                    g59.setSelected(false);
                }
                else if(grid.equals(g61)){
                    g61.setText(value) ;
                    g61.setSelected(false);
                }
                else if(grid.equals(g62)){
                    g62.setText(value) ;
                    g62.setSelected(false);
                }
                else if(grid.equals(g63)){
                    g63.setText(value) ;
                    g63.setSelected(false);
                }
                else if(grid.equals(g64)){
                    g64.setText(value) ;
                    g64.setSelected(false);
                }
                else if(grid.equals(g65)){
                    g65.setText(value) ;
                    g65.setSelected(false);
                }
                else if(grid.equals(g66)){
                    g66.setText(value) ;
                    g66.setSelected(false);
                }
                else if(grid.equals(g67)){
                    g67.setText(value) ;
                    g67.setSelected(false);
                }
                else if(grid.equals(g68)){
                    g68.setText(value) ;
                    g68.setSelected(false);
                }
                else if(grid.equals(g69)){
                    g69.setText(value) ;
                    g69.setSelected(false);
                }
                else if(grid.equals(g71)){
                    g71.setText(value) ;
                    g71.setSelected(false);
                }
                else if(grid.equals(g72)){
                    g72.setText(value) ;
                    g72.setSelected(false);
                }
                else if(grid.equals(g73)){
                    g73.setText(value) ;
                    g73.setSelected(false);
                }
                else if(grid.equals(g74)){
                    g74.setText(value) ;
                    g74.setSelected(false);
                }
                else if(grid.equals(g75)){
                    g75.setText(value) ;
                    g75.setSelected(false);
                }
                else if(grid.equals(g76)){
                    g76.setText(value) ;
                    g76.setSelected(false);
                }
                else if(grid.equals(g77)){
                    g77.setText(value) ;
                    g77.setSelected(false);
                }
                else if(grid.equals(g78)){
                    g78.setText(value) ;
                    g78.setSelected(false);
                }
                else if(grid.equals(g79)){
                    g79.setText(value) ;
                    g79.setSelected(false);
                }
                else if(grid.equals(g81)){
                    g81.setText(value) ;
                    g81.setSelected(false);
                }
                else if(grid.equals(g82)){
                    g82.setText(value) ;
                    g82.setSelected(false);
                }
                else if(grid.equals(g83)){
                    g83.setText(value) ;
                    g83.setSelected(false);
                }
                else if(grid.equals(g84)){
                    g84.setText(value) ;
                    g84.setSelected(false);
                }
                else if(grid.equals(g85)){
                    g85.setText(value) ;
                    g85.setSelected(false);
                }
                else if(grid.equals(g86)){
                    g86.setText(value) ;
                    g86.setSelected(false);
                }
                else if(grid.equals(g87)){
                    g87.setText(value) ;
                    g87.setSelected(false);
                }
                else if(grid.equals(g88)){
                    g88.setText(value) ;
                    g88.setSelected(false);
                }
                else if(grid.equals(g89)){
                    g89.setText(value) ;
                    g89.setSelected(false);
                }
                else if(grid.equals(g91)){
                    g91.setText(value) ;
                    g91.setSelected(false);
                }
                else if(grid.equals(g92)){
                    g92.setText(value) ;
                    g92.setSelected(false);
                }
                else if(grid.equals(g93)){
                    g93.setText(value) ;
                    g93.setSelected(false);
                }
                else if(grid.equals(g94)){
                    g94.setText(value) ;
                    g94.setSelected(false);
                }
                else if(grid.equals(g95)){
                    g95.setText(value) ;
                    g95.setSelected(false);
                }
                else if(grid.equals(g96)){
                    g96.setText(value) ;
                    g96.setSelected(false);
                }
                else if(grid.equals(g97)){
                    g97.setText(value) ;
                    g97.setSelected(false);
                }
                else if(grid.equals(g98)){
                    g98.setText(value) ;
                    g98.setSelected(false);
                }
                else if(grid.equals(g99)){
                    g99.setText(value) ;
                    g99.setSelected(false);
                }
           }
           else if(e.getSource()==b1){
            value = "1" ;

                if(grid.equals(g11)){
                    g11.setText(value);
                    g11.setSelected(false);
                }
                else if(grid.equals(g12)){
                    g12.setText(value) ;
                    g12.setSelected(false);
                }
                else if(grid.equals(g13)){
                    g13.setText(value) ;
                    g13.setSelected(false);
                }
                else if(grid.equals(g14)){
                    g14.setText(value) ;
                    g14.setSelected(false);
                }
                else if(grid.equals(g15)){
                    g15.setText(value) ;
                    g15.setSelected(false);
                }
                else if(grid.equals(g16)){
                    g16.setText(value) ;
                    g16.setSelected(false);
                }
                else if(grid.equals(g17)){
                    g17.setText(value) ;
                    g17.setSelected(false);
                }
                else if(grid.equals(g18)){
                    g18.setText(value) ;
                    g18.setSelected(false);
                }
                else if(grid.equals(g19)){
                    g19.setText(value) ;
                    g19.setSelected(false);
                }
                else if(grid.equals(g21)){
                    g21.setText(value) ;
                    g21.setSelected(false);
                }
                else if(grid.equals(g22)){
                    g22.setText(value) ;
                    g22.setSelected(false);
                }
                else if(grid.equals(g23)){
                    g23.setText(value) ;
                    g23.setSelected(false);
                }
                else if(grid.equals(g24)){
                    g24.setText(value) ;
                    g24.setSelected(false);
                }
                else if(grid.equals(g25)){
                    g25.setText(value) ;
                    g25.setSelected(false);
                }
                else if(grid.equals(g26)){
                    g26.setText(value) ;
                    g26.setSelected(false);
                }
                else if(grid.equals(g27)){
                    g27.setText(value) ;
                    g27.setSelected(false);
                }
                else if(grid.equals(g28)){
                    g28.setText(value) ;
                    g28.setSelected(false);
                }
                else if(grid.equals(g29)){
                    g29.setText(value) ;
                    g29.setSelected(false);
                }
                else if(grid.equals(g31)){
                    g31.setText(value) ;
                    g31.setSelected(false);
                }
                else if(grid.equals(g32)){
                    g32.setText(value) ;
                    g32.setSelected(false);
                }
                else if(grid.equals(g33)){
                    g33.setText(value) ;
                    g33.setSelected(false);
                }
                else if(grid.equals(g34)){
                    g34.setText(value) ;
                    g34.setSelected(false);
                }
                else if(grid.equals(g35)){
                    g35.setText(value) ;
                    g35.setSelected(false);
                }
                else if(grid.equals(g36)){
                    g36.setText(value) ;
                    g36.setSelected(false);
                }
                else if(grid.equals(g37)){
                    g37.setText(value) ;
                    g37.setSelected(false);
                }
                else if(grid.equals(g38)){
                    g38.setText(value) ;
                    g38.setSelected(false);
                }
                else if(grid.equals(g39)){
                    g39.setText(value) ;
                    g39.setSelected(false);
                }
                else if(grid.equals(g41)){
                    g41.setText(value) ;
                    g41.setSelected(false);
                }
                else if(grid.equals(g42)){
                    g42.setText(value) ;
                    g42.setSelected(false);
                }
                else if(grid.equals(g43)){
                    g43.setText(value) ;
                    g43.setSelected(false);
                }
                else if(grid.equals(g44)){
                    g44.setText(value) ;
                    g44.setSelected(false);
                }
                else if(grid.equals(g45)){
                    g45.setText(value) ;
                    g45.setSelected(false);
                }
                else if(grid.equals(g46)){
                    g46.setText(value) ;
                    g46.setSelected(false);
                }
                else if(grid.equals(g47)){
                    g47.setText(value) ;
                    g47.setSelected(false);
                }
                else if(grid.equals(g48)){
                    g48.setText(value) ;
                    g48.setSelected(false);
                }
                else if(grid.equals(g49)){
                    g49.setText(value) ;
                    g49.setSelected(false);
                }
                else if(grid.equals(g51)){
                    g51.setText(value) ;
                    g51.setSelected(false);
                }
                else if(grid.equals(g52)){
                    g52.setText(value) ;
                    g52.setSelected(false);
                }
                else if(grid.equals(g53)){
                    g53.setText(value) ;
                    g53.setSelected(false);
                }
                else if(grid.equals(g54)){
                    g54.setText(value) ;
                    g54.setSelected(false);
                }
                else if(grid.equals(g55)){
                    g55.setText(value) ;
                    g55.setSelected(false);
                }
                else if(grid.equals(g56)){
                    g56.setText(value) ;
                    g56.setSelected(false);
                }
                else if(grid.equals(g57)){
                    g57.setText(value) ;
                    g57.setSelected(false);
                }
                else if(grid.equals(g58)){
                    g58.setText(value) ;
                    g58.setSelected(false);
                }
                else if(grid.equals(g59)){
                    g59.setText(value) ;
                    g59.setSelected(false);
                }
                else if(grid.equals(g61)){
                    g61.setText(value) ;
                    g61.setSelected(false);
                }
                else if(grid.equals(g62)){
                    g62.setText(value) ;
                    g62.setSelected(false);
                }
                else if(grid.equals(g63)){
                    g63.setText(value) ;
                    g63.setSelected(false);
                }
                else if(grid.equals(g64)){
                    g64.setText(value) ;
                    g64.setSelected(false);
                }
                else if(grid.equals(g65)){
                    g65.setText(value) ;
                    g65.setSelected(false);
                }
                else if(grid.equals(g66)){
                    g66.setText(value) ;
                    g66.setSelected(false);
                }
                else if(grid.equals(g67)){
                    g67.setText(value) ;
                    g67.setSelected(false);
                }
                else if(grid.equals(g68)){
                    g68.setText(value) ;
                    g68.setSelected(false);
                }
                else if(grid.equals(g69)){
                    g69.setText(value) ;
                    g69.setSelected(false);
                }
                else if(grid.equals(g71)){
                    g71.setText(value) ;
                    g71.setSelected(false);
                }
                else if(grid.equals(g72)){
                    g72.setText(value) ;
                    g72.setSelected(false);
                }
                else if(grid.equals(g73)){
                    g73.setText(value) ;
                    g73.setSelected(false);
                }
                else if(grid.equals(g74)){
                    g74.setText(value) ;
                    g74.setSelected(false);
                }
                else if(grid.equals(g75)){
                    g75.setText(value) ;
                    g75.setSelected(false);
                }
                else if(grid.equals(g76)){
                    g76.setText(value) ;
                    g76.setSelected(false);
                }
                else if(grid.equals(g77)){
                    g77.setText(value) ;
                    g77.setSelected(false);
                }
                else if(grid.equals(g78)){
                    g78.setText(value) ;
                    g78.setSelected(false);
                }
                else if(grid.equals(g79)){
                    g79.setText(value) ;
                    g79.setSelected(false);
                }
                else if(grid.equals(g81)){
                    g81.setText(value) ;
                    g81.setSelected(false);
                }
                else if(grid.equals(g82)){
                    g82.setText(value) ;
                    g82.setSelected(false);
                }
                else if(grid.equals(g83)){
                    g83.setText(value) ;
                    g83.setSelected(false);
                }
                else if(grid.equals(g84)){
                    g84.setText(value) ;
                    g84.setSelected(false);
                }
                else if(grid.equals(g85)){
                    g85.setText(value) ;
                    g85.setSelected(false);
                }
                else if(grid.equals(g86)){
                    g86.setText(value) ;
                    g86.setSelected(false);
                }
                else if(grid.equals(g87)){
                    g87.setText(value) ;
                    g87.setSelected(false);
                }
                else if(grid.equals(g88)){
                    g88.setText(value) ;
                    g88.setSelected(false);
                }
                else if(grid.equals(g89)){
                    g89.setText(value) ;
                    g89.setSelected(false);
                }
                else if(grid.equals(g91)){
                    g91.setText(value) ;
                    g91.setSelected(false);
                }
                else if(grid.equals(g92)){
                    g92.setText(value) ;
                    g92.setSelected(false);
                }
                else if(grid.equals(g93)){
                    g93.setText(value) ;
                    g93.setSelected(false);
                }
                else if(grid.equals(g94)){
                    g94.setText(value) ;
                    g94.setSelected(false);
                }
                else if(grid.equals(g95)){
                    g95.setText(value) ;
                    g95.setSelected(false);
                }
                else if(grid.equals(g96)){
                    g96.setText(value) ;
                    g96.setSelected(false);
                }
                else if(grid.equals(g97)){
                    g97.setText(value) ;
                    g97.setSelected(false);
                }
                else if(grid.equals(g98)){
                    g98.setText(value) ;
                    g98.setSelected(false);
                }
                else if(grid.equals(g99)){
                    g99.setText(value) ;
                    g99.setSelected(false);
                }
            
           }
           else if(e.getSource()==b2){
            value = "2" ;

                if(grid.equals(g11)){
                    g11.setText(value);
                    g11.setSelected(false);
                }
                else if(grid.equals(g12)){
                    g12.setText(value) ;
                    g12.setSelected(false);
                }
                else if(grid.equals(g13)){
                    g13.setText(value) ;
                    g13.setSelected(false);
                }
                else if(grid.equals(g14)){
                    g14.setText(value) ;
                    g14.setSelected(false);
                }
                else if(grid.equals(g15)){
                    g15.setText(value) ;
                    g15.setSelected(false);
                }
                else if(grid.equals(g16)){
                    g16.setText(value) ;
                    g16.setSelected(false);
                }
                else if(grid.equals(g17)){
                    g17.setText(value) ;
                    g17.setSelected(false);
                }
                else if(grid.equals(g18)){
                    g18.setText(value) ;
                    g18.setSelected(false);
                }
                else if(grid.equals(g19)){
                    g19.setText(value) ;
                    g19.setSelected(false);
                }
                else if(grid.equals(g21)){
                    g21.setText(value) ;
                    g21.setSelected(false);
                }
                else if(grid.equals(g22)){
                    g22.setText(value) ;
                    g22.setSelected(false);
                }
                else if(grid.equals(g23)){
                    g23.setText(value) ;
                    g23.setSelected(false);
                }
                else if(grid.equals(g24)){
                    g24.setText(value) ;
                    g24.setSelected(false);
                }
                else if(grid.equals(g25)){
                    g25.setText(value) ;
                    g25.setSelected(false);
                }
                else if(grid.equals(g26)){
                    g26.setText(value) ;
                    g26.setSelected(false);
                }
                else if(grid.equals(g27)){
                    g27.setText(value) ;
                    g27.setSelected(false);
                }
                else if(grid.equals(g28)){
                    g28.setText(value) ;
                    g28.setSelected(false);
                }
                else if(grid.equals(g29)){
                    g29.setText(value) ;
                    g29.setSelected(false);
                }
                else if(grid.equals(g31)){
                    g31.setText(value) ;
                    g31.setSelected(false);
                }
                else if(grid.equals(g32)){
                    g32.setText(value) ;
                    g32.setSelected(false);
                }
                else if(grid.equals(g33)){
                    g33.setText(value) ;
                    g33.setSelected(false);
                }
                else if(grid.equals(g34)){
                    g34.setText(value) ;
                    g34.setSelected(false);
                }
                else if(grid.equals(g35)){
                    g35.setText(value) ;
                    g35.setSelected(false);
                }
                else if(grid.equals(g36)){
                    g36.setText(value) ;
                    g36.setSelected(false);
                }
                else if(grid.equals(g37)){
                    g37.setText(value) ;
                    g37.setSelected(false);
                }
                else if(grid.equals(g38)){
                    g38.setText(value) ;
                    g38.setSelected(false);
                }
                else if(grid.equals(g39)){
                    g39.setText(value) ;
                    g39.setSelected(false);
                }
                else if(grid.equals(g41)){
                    g41.setText(value) ;
                    g41.setSelected(false);
                }
                else if(grid.equals(g42)){
                    g42.setText(value) ;
                    g42.setSelected(false);
                }
                else if(grid.equals(g43)){
                    g43.setText(value) ;
                    g43.setSelected(false);
                }
                else if(grid.equals(g44)){
                    g44.setText(value) ;
                    g44.setSelected(false);
                }
                else if(grid.equals(g45)){
                    g45.setText(value) ;
                    g45.setSelected(false);
                }
                else if(grid.equals(g46)){
                    g46.setText(value) ;
                    g46.setSelected(false);
                }
                else if(grid.equals(g47)){
                    g47.setText(value) ;
                    g47.setSelected(false);
                }
                else if(grid.equals(g48)){
                    g48.setText(value) ;
                    g48.setSelected(false);
                }
                else if(grid.equals(g49)){
                    g49.setText(value) ;
                    g49.setSelected(false);
                }
                else if(grid.equals(g51)){
                    g51.setText(value) ;
                    g51.setSelected(false);
                }
                else if(grid.equals(g52)){
                    g52.setText(value) ;
                    g52.setSelected(false);
                }
                else if(grid.equals(g53)){
                    g53.setText(value) ;
                    g53.setSelected(false);
                }
                else if(grid.equals(g54)){
                    g54.setText(value) ;
                    g54.setSelected(false);
                }
                else if(grid.equals(g55)){
                    g55.setText(value) ;
                    g55.setSelected(false);
                }
                else if(grid.equals(g56)){
                    g56.setText(value) ;
                    g56.setSelected(false);
                }
                else if(grid.equals(g57)){
                    g57.setText(value) ;
                    g57.setSelected(false);
                }
                else if(grid.equals(g58)){
                    g58.setText(value) ;
                    g58.setSelected(false);
                }
                else if(grid.equals(g59)){
                    g59.setText(value) ;
                    g59.setSelected(false);
                }
                else if(grid.equals(g61)){
                    g61.setText(value) ;
                    g61.setSelected(false);
                }
                else if(grid.equals(g62)){
                    g62.setText(value) ;
                    g62.setSelected(false);
                }
                else if(grid.equals(g63)){
                    g63.setText(value) ;
                    g63.setSelected(false);
                }
                else if(grid.equals(g64)){
                    g64.setText(value) ;
                    g64.setSelected(false);
                }
                else if(grid.equals(g65)){
                    g65.setText(value) ;
                    g65.setSelected(false);
                }
                else if(grid.equals(g66)){
                    g66.setText(value) ;
                    g66.setSelected(false);
                }
                else if(grid.equals(g67)){
                    g67.setText(value) ;
                    g67.setSelected(false);
                }
                else if(grid.equals(g68)){
                    g68.setText(value) ;
                    g68.setSelected(false);
                }
                else if(grid.equals(g69)){
                    g69.setText(value) ;
                    g69.setSelected(false);
                }
                else if(grid.equals(g71)){
                    g71.setText(value) ;
                    g71.setSelected(false);
                }
                else if(grid.equals(g72)){
                    g72.setText(value) ;
                    g72.setSelected(false);
                }
                else if(grid.equals(g73)){
                    g73.setText(value) ;
                    g73.setSelected(false);
                }
                else if(grid.equals(g74)){
                    g74.setText(value) ;
                    g74.setSelected(false);
                }
                else if(grid.equals(g75)){
                    g75.setText(value) ;
                    g75.setSelected(false);
                }
                else if(grid.equals(g76)){
                    g76.setText(value) ;
                    g76.setSelected(false);
                }
                else if(grid.equals(g77)){
                    g77.setText(value) ;
                    g77.setSelected(false);
                }
                else if(grid.equals(g78)){
                    g78.setText(value) ;
                    g78.setSelected(false);
                }
                else if(grid.equals(g79)){
                    g79.setText(value) ;
                    g79.setSelected(false);
                }
                else if(grid.equals(g81)){
                    g81.setText(value) ;
                    g81.setSelected(false);
                }
                else if(grid.equals(g82)){
                    g82.setText(value) ;
                    g82.setSelected(false);
                }
                else if(grid.equals(g83)){
                    g83.setText(value) ;
                    g83.setSelected(false);
                }
                else if(grid.equals(g84)){
                    g84.setText(value) ;
                    g84.setSelected(false);
                }
                else if(grid.equals(g85)){
                    g85.setText(value) ;
                    g85.setSelected(false);
                }
                else if(grid.equals(g86)){
                    g86.setText(value) ;
                    g86.setSelected(false);
                }
                else if(grid.equals(g87)){
                    g87.setText(value) ;
                    g87.setSelected(false);
                }
                else if(grid.equals(g88)){
                    g88.setText(value) ;
                    g88.setSelected(false);
                }
                else if(grid.equals(g89)){
                    g89.setText(value) ;
                    g89.setSelected(false);
                }
                else if(grid.equals(g91)){
                    g91.setText(value) ;
                    g91.setSelected(false);
                }
                else if(grid.equals(g92)){
                    g92.setText(value) ;
                    g92.setSelected(false);
                }
                else if(grid.equals(g93)){
                    g93.setText(value) ;
                    g93.setSelected(false);
                }
                else if(grid.equals(g94)){
                    g94.setText(value) ;
                    g94.setSelected(false);
                }
                else if(grid.equals(g95)){
                    g95.setText(value) ;
                    g95.setSelected(false);
                }
                else if(grid.equals(g96)){
                    g96.setText(value) ;
                    g96.setSelected(false);
                }
                else if(grid.equals(g97)){
                    g97.setText(value) ;
                    g97.setSelected(false);
                }
                else if(grid.equals(g98)){
                    g98.setText(value) ;
                    g98.setSelected(false);
                }
                else if(grid.equals(g99)){
                    g99.setText(value) ;
                    g99.setSelected(false);
                }
            
           }
           else if(e.getSource()==b3){
            value = "3" ;

                if(grid.equals(g11)){
                    g11.setText(value);
                    g11.setSelected(false);
                }
                else if(grid.equals(g12)){
                    g12.setText(value) ;
                    g12.setSelected(false);
                }
                else if(grid.equals(g13)){
                    g13.setText(value) ;
                    g13.setSelected(false);
                }
                else if(grid.equals(g14)){
                    g14.setText(value) ;
                    g14.setSelected(false);
                }
                else if(grid.equals(g15)){
                    g15.setText(value) ;
                    g15.setSelected(false);
                }
                else if(grid.equals(g16)){
                    g16.setText(value) ;
                    g16.setSelected(false);
                }
                else if(grid.equals(g17)){
                    g17.setText(value) ;
                    g17.setSelected(false);
                }
                else if(grid.equals(g18)){
                    g18.setText(value) ;
                    g18.setSelected(false);
                }
                else if(grid.equals(g19)){
                    g19.setText(value) ;
                    g19.setSelected(false);
                }
                else if(grid.equals(g21)){
                    g21.setText(value) ;
                    g21.setSelected(false);
                }
                else if(grid.equals(g22)){
                    g22.setText(value) ;
                    g22.setSelected(false);
                }
                else if(grid.equals(g23)){
                    g23.setText(value) ;
                    g23.setSelected(false);
                }
                else if(grid.equals(g24)){
                    g24.setText(value) ;
                    g24.setSelected(false);
                }
                else if(grid.equals(g25)){
                    g25.setText(value) ;
                    g25.setSelected(false);
                }
                else if(grid.equals(g26)){
                    g26.setText(value) ;
                    g26.setSelected(false);
                }
                else if(grid.equals(g27)){
                    g27.setText(value) ;
                    g27.setSelected(false);
                }
                else if(grid.equals(g28)){
                    g28.setText(value) ;
                    g28.setSelected(false);
                }
                else if(grid.equals(g29)){
                    g29.setText(value) ;
                    g29.setSelected(false);
                }
                else if(grid.equals(g31)){
                    g31.setText(value) ;
                    g31.setSelected(false);
                }
                else if(grid.equals(g32)){
                    g32.setText(value) ;
                    g32.setSelected(false);
                }
                else if(grid.equals(g33)){
                    g33.setText(value) ;
                    g33.setSelected(false);
                }
                else if(grid.equals(g34)){
                    g34.setText(value) ;
                    g34.setSelected(false);
                }
                else if(grid.equals(g35)){
                    g35.setText(value) ;
                    g35.setSelected(false);
                }
                else if(grid.equals(g36)){
                    g36.setText(value) ;
                    g36.setSelected(false);
                }
                else if(grid.equals(g37)){
                    g37.setText(value) ;
                    g37.setSelected(false);
                }
                else if(grid.equals(g38)){
                    g38.setText(value) ;
                    g38.setSelected(false);
                }
                else if(grid.equals(g39)){
                    g39.setText(value) ;
                    g39.setSelected(false);
                }
                else if(grid.equals(g41)){
                    g41.setText(value) ;
                    g41.setSelected(false);
                }
                else if(grid.equals(g42)){
                    g42.setText(value) ;
                    g42.setSelected(false);
                }
                else if(grid.equals(g43)){
                    g43.setText(value) ;
                    g43.setSelected(false);
                }
                else if(grid.equals(g44)){
                    g44.setText(value) ;
                    g44.setSelected(false);
                }
                else if(grid.equals(g45)){
                    g45.setText(value) ;
                    g45.setSelected(false);
                }
                else if(grid.equals(g46)){
                    g46.setText(value) ;
                    g46.setSelected(false);
                }
                else if(grid.equals(g47)){
                    g47.setText(value) ;
                    g47.setSelected(false);
                }
                else if(grid.equals(g48)){
                    g48.setText(value) ;
                    g48.setSelected(false);
                }
                else if(grid.equals(g49)){
                    g49.setText(value) ;
                    g49.setSelected(false);
                }
                else if(grid.equals(g51)){
                    g51.setText(value) ;
                    g51.setSelected(false);
                }
                else if(grid.equals(g52)){
                    g52.setText(value) ;
                    g52.setSelected(false);
                }
                else if(grid.equals(g53)){
                    g53.setText(value) ;
                    g53.setSelected(false);
                }
                else if(grid.equals(g54)){
                    g54.setText(value) ;
                    g54.setSelected(false);
                }
                else if(grid.equals(g55)){
                    g55.setText(value) ;
                    g55.setSelected(false);
                }
                else if(grid.equals(g56)){
                    g56.setText(value) ;
                    g56.setSelected(false);
                }
                else if(grid.equals(g57)){
                    g57.setText(value) ;
                    g57.setSelected(false);
                }
                else if(grid.equals(g58)){
                    g58.setText(value) ;
                    g58.setSelected(false);
                }
                else if(grid.equals(g59)){
                    g59.setText(value) ;
                    g59.setSelected(false);
                }
                else if(grid.equals(g61)){
                    g61.setText(value) ;
                    g61.setSelected(false);
                }
                else if(grid.equals(g62)){
                    g62.setText(value) ;
                    g62.setSelected(false);
                }
                else if(grid.equals(g63)){
                    g63.setText(value) ;
                    g63.setSelected(false);
                }
                else if(grid.equals(g64)){
                    g64.setText(value) ;
                    g64.setSelected(false);
                }
                else if(grid.equals(g65)){
                    g65.setText(value) ;
                    g65.setSelected(false);
                }
                else if(grid.equals(g66)){
                    g66.setText(value) ;
                    g66.setSelected(false);
                }
                else if(grid.equals(g67)){
                    g67.setText(value) ;
                    g67.setSelected(false);
                }
                else if(grid.equals(g68)){
                    g68.setText(value) ;
                    g68.setSelected(false);
                }
                else if(grid.equals(g69)){
                    g69.setText(value) ;
                    g69.setSelected(false);
                }
                else if(grid.equals(g71)){
                    g71.setText(value) ;
                    g71.setSelected(false);
                }
                else if(grid.equals(g72)){
                    g72.setText(value) ;
                    g72.setSelected(false);
                }
                else if(grid.equals(g73)){
                    g73.setText(value) ;
                    g73.setSelected(false);
                }
                else if(grid.equals(g74)){
                    g74.setText(value) ;
                    g74.setSelected(false);
                }
                else if(grid.equals(g75)){
                    g75.setText(value) ;
                    g75.setSelected(false);
                }
                else if(grid.equals(g76)){
                    g76.setText(value) ;
                    g76.setSelected(false);
                }
                else if(grid.equals(g77)){
                    g77.setText(value) ;
                    g77.setSelected(false);
                }
                else if(grid.equals(g78)){
                    g78.setText(value) ;
                    g78.setSelected(false);
                }
                else if(grid.equals(g79)){
                    g79.setText(value) ;
                    g79.setSelected(false);
                }
                else if(grid.equals(g81)){
                    g81.setText(value) ;
                    g81.setSelected(false);
                }
                else if(grid.equals(g82)){
                    g82.setText(value) ;
                    g82.setSelected(false);
                }
                else if(grid.equals(g83)){
                    g83.setText(value) ;
                    g83.setSelected(false);
                }
                else if(grid.equals(g84)){
                    g84.setText(value) ;
                    g84.setSelected(false);
                }
                else if(grid.equals(g85)){
                    g85.setText(value) ;
                    g85.setSelected(false);
                }
                else if(grid.equals(g86)){
                    g86.setText(value) ;
                    g86.setSelected(false);
                }
                else if(grid.equals(g87)){
                    g87.setText(value) ;
                    g87.setSelected(false);
                }
                else if(grid.equals(g88)){
                    g88.setText(value) ;
                    g88.setSelected(false);
                }
                else if(grid.equals(g89)){
                    g89.setText(value) ;
                    g89.setSelected(false);
                }
                else if(grid.equals(g91)){
                    g91.setText(value) ;
                    g91.setSelected(false);
                }
                else if(grid.equals(g92)){
                    g92.setText(value) ;
                    g92.setSelected(false);
                }
                else if(grid.equals(g93)){
                    g93.setText(value) ;
                    g93.setSelected(false);
                }
                else if(grid.equals(g94)){
                    g94.setText(value) ;
                    g94.setSelected(false);
                }
                else if(grid.equals(g95)){
                    g95.setText(value) ;
                    g95.setSelected(false);
                }
                else if(grid.equals(g96)){
                    g96.setText(value) ;
                    g96.setSelected(false);
                }
                else if(grid.equals(g97)){
                    g97.setText(value) ;
                    g97.setSelected(false);
                }
                else if(grid.equals(g98)){
                    g98.setText(value) ;
                    g98.setSelected(false);
                }
                else if(grid.equals(g99)){
                    g99.setText(value) ;
                    g99.setSelected(false);
                }
            
           }
           else if(e.getSource()==b4){
            value = "4" ;

                if(grid.equals(g11)){
                    g11.setText(value);
                    g11.setSelected(false);
                }
                else if(grid.equals(g12)){
                    g12.setText(value) ;
                    g12.setSelected(false);
                }
                else if(grid.equals(g13)){
                    g13.setText(value) ;
                    g13.setSelected(false);
                }
                else if(grid.equals(g14)){
                    g14.setText(value) ;
                    g14.setSelected(false);
                }
                else if(grid.equals(g15)){
                    g15.setText(value) ;
                    g15.setSelected(false);
                }
                else if(grid.equals(g16)){
                    g16.setText(value) ;
                    g16.setSelected(false);
                }
                else if(grid.equals(g17)){
                    g17.setText(value) ;
                    g17.setSelected(false);
                }
                else if(grid.equals(g18)){
                    g18.setText(value) ;
                    g18.setSelected(false);
                }
                else if(grid.equals(g19)){
                    g19.setText(value) ;
                    g19.setSelected(false);
                }
                else if(grid.equals(g21)){
                    g21.setText(value) ;
                    g21.setSelected(false);
                }
                else if(grid.equals(g22)){
                    g22.setText(value) ;
                    g22.setSelected(false);
                }
                else if(grid.equals(g23)){
                    g23.setText(value) ;
                    g23.setSelected(false);
                }
                else if(grid.equals(g24)){
                    g24.setText(value) ;
                    g24.setSelected(false);
                }
                else if(grid.equals(g25)){
                    g25.setText(value) ;
                    g25.setSelected(false);
                }
                else if(grid.equals(g26)){
                    g26.setText(value) ;
                    g26.setSelected(false);
                }
                else if(grid.equals(g27)){
                    g27.setText(value) ;
                    g27.setSelected(false);
                }
                else if(grid.equals(g28)){
                    g28.setText(value) ;
                    g28.setSelected(false);
                }
                else if(grid.equals(g29)){
                    g29.setText(value) ;
                    g29.setSelected(false);
                }
                else if(grid.equals(g31)){
                    g31.setText(value) ;
                    g31.setSelected(false);
                }
                else if(grid.equals(g32)){
                    g32.setText(value) ;
                    g32.setSelected(false);
                }
                else if(grid.equals(g33)){
                    g33.setText(value) ;
                    g33.setSelected(false);
                }
                else if(grid.equals(g34)){
                    g34.setText(value) ;
                    g34.setSelected(false);
                }
                else if(grid.equals(g35)){
                    g35.setText(value) ;
                    g35.setSelected(false);
                }
                else if(grid.equals(g36)){
                    g36.setText(value) ;
                    g36.setSelected(false);
                }
                else if(grid.equals(g37)){
                    g37.setText(value) ;
                    g37.setSelected(false);
                }
                else if(grid.equals(g38)){
                    g38.setText(value) ;
                    g38.setSelected(false);
                }
                else if(grid.equals(g39)){
                    g39.setText(value) ;
                    g39.setSelected(false);
                }
                else if(grid.equals(g41)){
                    g41.setText(value) ;
                    g41.setSelected(false);
                }
                else if(grid.equals(g42)){
                    g42.setText(value) ;
                    g42.setSelected(false);
                }
                else if(grid.equals(g43)){
                    g43.setText(value) ;
                    g43.setSelected(false);
                }
                else if(grid.equals(g44)){
                    g44.setText(value) ;
                    g44.setSelected(false);
                }
                else if(grid.equals(g45)){
                    g45.setText(value) ;
                    g45.setSelected(false);
                }
                else if(grid.equals(g46)){
                    g46.setText(value) ;
                    g46.setSelected(false);
                }
                else if(grid.equals(g47)){
                    g47.setText(value) ;
                    g47.setSelected(false);
                }
                else if(grid.equals(g48)){
                    g48.setText(value) ;
                    g48.setSelected(false);
                }
                else if(grid.equals(g49)){
                    g49.setText(value) ;
                    g49.setSelected(false);
                }
                else if(grid.equals(g51)){
                    g51.setText(value) ;
                    g51.setSelected(false);
                }
                else if(grid.equals(g52)){
                    g52.setText(value) ;
                    g52.setSelected(false);
                }
                else if(grid.equals(g53)){
                    g53.setText(value) ;
                    g53.setSelected(false);
                }
                else if(grid.equals(g54)){
                    g54.setText(value) ;
                    g54.setSelected(false);
                }
                else if(grid.equals(g55)){
                    g55.setText(value) ;
                    g55.setSelected(false);
                }
                else if(grid.equals(g56)){
                    g56.setText(value) ;
                    g56.setSelected(false);
                }
                else if(grid.equals(g57)){
                    g57.setText(value) ;
                    g57.setSelected(false);
                }
                else if(grid.equals(g58)){
                    g58.setText(value) ;
                    g58.setSelected(false);
                }
                else if(grid.equals(g59)){
                    g59.setText(value) ;
                    g59.setSelected(false);
                }
                else if(grid.equals(g61)){
                    g61.setText(value) ;
                    g61.setSelected(false);
                }
                else if(grid.equals(g62)){
                    g62.setText(value) ;
                    g62.setSelected(false);
                }
                else if(grid.equals(g63)){
                    g63.setText(value) ;
                    g63.setSelected(false);
                }
                else if(grid.equals(g64)){
                    g64.setText(value) ;
                    g64.setSelected(false);
                }
                else if(grid.equals(g65)){
                    g65.setText(value) ;
                    g65.setSelected(false);
                }
                else if(grid.equals(g66)){
                    g66.setText(value) ;
                    g66.setSelected(false);
                }
                else if(grid.equals(g67)){
                    g67.setText(value) ;
                    g67.setSelected(false);
                }
                else if(grid.equals(g68)){
                    g68.setText(value) ;
                    g68.setSelected(false);
                }
                else if(grid.equals(g69)){
                    g69.setText(value) ;
                    g69.setSelected(false);
                }
                else if(grid.equals(g71)){
                    g71.setText(value) ;
                    g71.setSelected(false);
                }
                else if(grid.equals(g72)){
                    g72.setText(value) ;
                    g72.setSelected(false);
                }
                else if(grid.equals(g73)){
                    g73.setText(value) ;
                    g73.setSelected(false);
                }
                else if(grid.equals(g74)){
                    g74.setText(value) ;
                    g74.setSelected(false);
                }
                else if(grid.equals(g75)){
                    g75.setText(value) ;
                    g75.setSelected(false);
                }
                else if(grid.equals(g76)){
                    g76.setText(value) ;
                    g76.setSelected(false);
                }
                else if(grid.equals(g77)){
                    g77.setText(value) ;
                    g77.setSelected(false);
                }
                else if(grid.equals(g78)){
                    g78.setText(value) ;
                    g78.setSelected(false);
                }
                else if(grid.equals(g79)){
                    g79.setText(value) ;
                    g79.setSelected(false);
                }
                else if(grid.equals(g81)){
                    g81.setText(value) ;
                    g81.setSelected(false);
                }
                else if(grid.equals(g82)){
                    g82.setText(value) ;
                    g82.setSelected(false);
                }
                else if(grid.equals(g83)){
                    g83.setText(value) ;
                    g83.setSelected(false);
                }
                else if(grid.equals(g84)){
                    g84.setText(value) ;
                    g84.setSelected(false);
                }
                else if(grid.equals(g85)){
                    g85.setText(value) ;
                    g85.setSelected(false);
                }
                else if(grid.equals(g86)){
                    g86.setText(value) ;
                    g86.setSelected(false);
                }
                else if(grid.equals(g87)){
                    g87.setText(value) ;
                    g87.setSelected(false);
                }
                else if(grid.equals(g88)){
                    g88.setText(value) ;
                    g88.setSelected(false);
                }
                else if(grid.equals(g89)){
                    g89.setText(value) ;
                    g89.setSelected(false);
                }
                else if(grid.equals(g91)){
                    g91.setText(value) ;
                    g91.setSelected(false);
                }
                else if(grid.equals(g92)){
                    g92.setText(value) ;
                    g92.setSelected(false);
                }
                else if(grid.equals(g93)){
                    g93.setText(value) ;
                    g93.setSelected(false);
                }
                else if(grid.equals(g94)){
                    g94.setText(value) ;
                    g94.setSelected(false);
                }
                else if(grid.equals(g95)){
                    g95.setText(value) ;
                    g95.setSelected(false);
                }
                else if(grid.equals(g96)){
                    g96.setText(value) ;
                    g96.setSelected(false);
                }
                else if(grid.equals(g97)){
                    g97.setText(value) ;
                    g97.setSelected(false);
                }
                else if(grid.equals(g98)){
                    g98.setText(value) ;
                    g98.setSelected(false);
                }
                else if(grid.equals(g99)){
                    g99.setText(value) ;
                    g99.setSelected(false);
                }
            
           }
           else if(e.getSource()==b5){
            value = "5" ;

                if(grid.equals(g11)){
                    g11.setText(value);
                    g11.setSelected(false);
                }
                else if(grid.equals(g12)){
                    g12.setText(value) ;
                    g12.setSelected(false);
                }
                else if(grid.equals(g13)){
                    g13.setText(value) ;
                    g13.setSelected(false);
                }
                else if(grid.equals(g14)){
                    g14.setText(value) ;
                    g14.setSelected(false);
                }
                else if(grid.equals(g15)){
                    g15.setText(value) ;
                    g15.setSelected(false);
                }
                else if(grid.equals(g16)){
                    g16.setText(value) ;
                    g16.setSelected(false);
                }
                else if(grid.equals(g17)){
                    g17.setText(value) ;
                    g17.setSelected(false);
                }
                else if(grid.equals(g18)){
                    g18.setText(value) ;
                    g18.setSelected(false);
                }
                else if(grid.equals(g19)){
                    g19.setText(value) ;
                    g19.setSelected(false);
                }
                else if(grid.equals(g21)){
                    g21.setText(value) ;
                    g21.setSelected(false);
                }
                else if(grid.equals(g22)){
                    g22.setText(value) ;
                    g22.setSelected(false);
                }
                else if(grid.equals(g23)){
                    g23.setText(value) ;
                    g23.setSelected(false);
                }
                else if(grid.equals(g24)){
                    g24.setText(value) ;
                    g24.setSelected(false);
                }
                else if(grid.equals(g25)){
                    g25.setText(value) ;
                    g25.setSelected(false);
                }
                else if(grid.equals(g26)){
                    g26.setText(value) ;
                    g26.setSelected(false);
                }
                else if(grid.equals(g27)){
                    g27.setText(value) ;
                    g27.setSelected(false);
                }
                else if(grid.equals(g28)){
                    g28.setText(value) ;
                    g28.setSelected(false);
                }
                else if(grid.equals(g29)){
                    g29.setText(value) ;
                    g29.setSelected(false);
                }
                else if(grid.equals(g31)){
                    g31.setText(value) ;
                    g31.setSelected(false);
                }
                else if(grid.equals(g32)){
                    g32.setText(value) ;
                    g32.setSelected(false);
                }
                else if(grid.equals(g33)){
                    g33.setText(value) ;
                    g33.setSelected(false);
                }
                else if(grid.equals(g34)){
                    g34.setText(value) ;
                    g34.setSelected(false);
                }
                else if(grid.equals(g35)){
                    g35.setText(value) ;
                    g35.setSelected(false);
                }
                else if(grid.equals(g36)){
                    g36.setText(value) ;
                    g36.setSelected(false);
                }
                else if(grid.equals(g37)){
                    g37.setText(value) ;
                    g37.setSelected(false);
                }
                else if(grid.equals(g38)){
                    g38.setText(value) ;
                    g38.setSelected(false);
                }
                else if(grid.equals(g39)){
                    g39.setText(value) ;
                    g39.setSelected(false);
                }
                else if(grid.equals(g41)){
                    g41.setText(value) ;
                    g41.setSelected(false);
                }
                else if(grid.equals(g42)){
                    g42.setText(value) ;
                    g42.setSelected(false);
                }
                else if(grid.equals(g43)){
                    g43.setText(value) ;
                    g43.setSelected(false);
                }
                else if(grid.equals(g44)){
                    g44.setText(value) ;
                    g44.setSelected(false);
                }
                else if(grid.equals(g45)){
                    g45.setText(value) ;
                    g45.setSelected(false);
                }
                else if(grid.equals(g46)){
                    g46.setText(value) ;
                    g46.setSelected(false);
                }
                else if(grid.equals(g47)){
                    g47.setText(value) ;
                    g47.setSelected(false);
                }
                else if(grid.equals(g48)){
                    g48.setText(value) ;
                    g48.setSelected(false);
                }
                else if(grid.equals(g49)){
                    g49.setText(value) ;
                    g49.setSelected(false);
                }
                else if(grid.equals(g51)){
                    g51.setText(value) ;
                    g51.setSelected(false);
                }
                else if(grid.equals(g52)){
                    g52.setText(value) ;
                    g52.setSelected(false);
                }
                else if(grid.equals(g53)){
                    g53.setText(value) ;
                    g53.setSelected(false);
                }
                else if(grid.equals(g54)){
                    g54.setText(value) ;
                    g54.setSelected(false);
                }
                else if(grid.equals(g55)){
                    g55.setText(value) ;
                    g55.setSelected(false);
                }
                else if(grid.equals(g56)){
                    g56.setText(value) ;
                    g56.setSelected(false);
                }
                else if(grid.equals(g57)){
                    g57.setText(value) ;
                    g57.setSelected(false);
                }
                else if(grid.equals(g58)){
                    g58.setText(value) ;
                    g58.setSelected(false);
                }
                else if(grid.equals(g59)){
                    g59.setText(value) ;
                    g59.setSelected(false);
                }
                else if(grid.equals(g61)){
                    g61.setText(value) ;
                    g61.setSelected(false);
                }
                else if(grid.equals(g62)){
                    g62.setText(value) ;
                    g62.setSelected(false);
                }
                else if(grid.equals(g63)){
                    g63.setText(value) ;
                    g63.setSelected(false);
                }
                else if(grid.equals(g64)){
                    g64.setText(value) ;
                    g64.setSelected(false);
                }
                else if(grid.equals(g65)){
                    g65.setText(value) ;
                    g65.setSelected(false);
                }
                else if(grid.equals(g66)){
                    g66.setText(value) ;
                    g66.setSelected(false);
                }
                else if(grid.equals(g67)){
                    g67.setText(value) ;
                    g67.setSelected(false);
                }
                else if(grid.equals(g68)){
                    g68.setText(value) ;
                    g68.setSelected(false);
                }
                else if(grid.equals(g69)){
                    g69.setText(value) ;
                    g69.setSelected(false);
                }
                else if(grid.equals(g71)){
                    g71.setText(value) ;
                    g71.setSelected(false);
                }
                else if(grid.equals(g72)){
                    g72.setText(value) ;
                    g72.setSelected(false);
                }
                else if(grid.equals(g73)){
                    g73.setText(value) ;
                    g73.setSelected(false);
                }
                else if(grid.equals(g74)){
                    g74.setText(value) ;
                    g74.setSelected(false);
                }
                else if(grid.equals(g75)){
                    g75.setText(value) ;
                    g75.setSelected(false);
                }
                else if(grid.equals(g76)){
                    g76.setText(value) ;
                    g76.setSelected(false);
                }
                else if(grid.equals(g77)){
                    g77.setText(value) ;
                    g77.setSelected(false);
                }
                else if(grid.equals(g78)){
                    g78.setText(value) ;
                    g78.setSelected(false);
                }
                else if(grid.equals(g79)){
                    g79.setText(value) ;
                    g79.setSelected(false);
                }
                else if(grid.equals(g81)){
                    g81.setText(value) ;
                    g81.setSelected(false);
                }
                else if(grid.equals(g82)){
                    g82.setText(value) ;
                    g82.setSelected(false);
                }
                else if(grid.equals(g83)){
                    g83.setText(value) ;
                    g83.setSelected(false);
                }
                else if(grid.equals(g84)){
                    g84.setText(value) ;
                    g84.setSelected(false);
                }
                else if(grid.equals(g85)){
                    g85.setText(value) ;
                    g85.setSelected(false);
                }
                else if(grid.equals(g86)){
                    g86.setText(value) ;
                    g86.setSelected(false);
                }
                else if(grid.equals(g87)){
                    g87.setText(value) ;
                    g87.setSelected(false);
                }
                else if(grid.equals(g88)){
                    g88.setText(value) ;
                    g88.setSelected(false);
                }
                else if(grid.equals(g89)){
                    g89.setText(value) ;
                    g89.setSelected(false);
                }
                else if(grid.equals(g91)){
                    g91.setText(value) ;
                    g91.setSelected(false);
                }
                else if(grid.equals(g92)){
                    g92.setText(value) ;
                    g92.setSelected(false);
                }
                else if(grid.equals(g93)){
                    g93.setText(value) ;
                    g93.setSelected(false);
                }
                else if(grid.equals(g94)){
                    g94.setText(value) ;
                    g94.setSelected(false);
                }
                else if(grid.equals(g95)){
                    g95.setText(value) ;
                    g95.setSelected(false);
                }
                else if(grid.equals(g96)){
                    g96.setText(value) ;
                    g96.setSelected(false);
                }
                else if(grid.equals(g97)){
                    g97.setText(value) ;
                    g97.setSelected(false);
                }
                else if(grid.equals(g98)){
                    g98.setText(value) ;
                    g98.setSelected(false);
                }
                else if(grid.equals(g99)){
                    g99.setText(value) ;
                    g99.setSelected(false);
                }
            
           }
           else if(e.getSource()==b6){
            value = "6" ;

                if(grid.equals(g11)){
                    g11.setText(value);
                    g11.setSelected(false);
                }
                else if(grid.equals(g12)){
                    g12.setText(value) ;
                    g12.setSelected(false);
                }
                else if(grid.equals(g13)){
                    g13.setText(value) ;
                    g13.setSelected(false);
                }
                else if(grid.equals(g14)){
                    g14.setText(value) ;
                    g14.setSelected(false);
                }
                else if(grid.equals(g15)){
                    g15.setText(value) ;
                    g15.setSelected(false);
                }
                else if(grid.equals(g16)){
                    g16.setText(value) ;
                    g16.setSelected(false);
                }
                else if(grid.equals(g17)){
                    g17.setText(value) ;
                    g17.setSelected(false);
                }
                else if(grid.equals(g18)){
                    g18.setText(value) ;
                    g18.setSelected(false);
                }
                else if(grid.equals(g19)){
                    g19.setText(value) ;
                    g19.setSelected(false);
                }
                else if(grid.equals(g21)){
                    g21.setText(value) ;
                    g21.setSelected(false);
                }
                else if(grid.equals(g22)){
                    g22.setText(value) ;
                    g22.setSelected(false);
                }
                else if(grid.equals(g23)){
                    g23.setText(value) ;
                    g23.setSelected(false);
                }
                else if(grid.equals(g24)){
                    g24.setText(value) ;
                    g24.setSelected(false);
                }
                else if(grid.equals(g25)){
                    g25.setText(value) ;
                    g25.setSelected(false);
                }
                else if(grid.equals(g26)){
                    g26.setText(value) ;
                    g26.setSelected(false);
                }
                else if(grid.equals(g27)){
                    g27.setText(value) ;
                    g27.setSelected(false);
                }
                else if(grid.equals(g28)){
                    g28.setText(value) ;
                    g28.setSelected(false);
                }
                else if(grid.equals(g29)){
                    g29.setText(value) ;
                    g29.setSelected(false);
                }
                else if(grid.equals(g31)){
                    g31.setText(value) ;
                    g31.setSelected(false);
                }
                else if(grid.equals(g32)){
                    g32.setText(value) ;
                    g32.setSelected(false);
                }
                else if(grid.equals(g33)){
                    g33.setText(value) ;
                    g33.setSelected(false);
                }
                else if(grid.equals(g34)){
                    g34.setText(value) ;
                    g34.setSelected(false);
                }
                else if(grid.equals(g35)){
                    g35.setText(value) ;
                    g35.setSelected(false);
                }
                else if(grid.equals(g36)){
                    g36.setText(value) ;
                    g36.setSelected(false);
                }
                else if(grid.equals(g37)){
                    g37.setText(value) ;
                    g37.setSelected(false);
                }
                else if(grid.equals(g38)){
                    g38.setText(value) ;
                    g38.setSelected(false);
                }
                else if(grid.equals(g39)){
                    g39.setText(value) ;
                    g39.setSelected(false);
                }
                else if(grid.equals(g41)){
                    g41.setText(value) ;
                    g41.setSelected(false);
                }
                else if(grid.equals(g42)){
                    g42.setText(value) ;
                    g42.setSelected(false);
                }
                else if(grid.equals(g43)){
                    g43.setText(value) ;
                    g43.setSelected(false);
                }
                else if(grid.equals(g44)){
                    g44.setText(value) ;
                    g44.setSelected(false);
                }
                else if(grid.equals(g45)){
                    g45.setText(value) ;
                    g45.setSelected(false);
                }
                else if(grid.equals(g46)){
                    g46.setText(value) ;
                    g46.setSelected(false);
                }
                else if(grid.equals(g47)){
                    g47.setText(value) ;
                    g47.setSelected(false);
                }
                else if(grid.equals(g48)){
                    g48.setText(value) ;
                    g48.setSelected(false);
                }
                else if(grid.equals(g49)){
                    g49.setText(value) ;
                    g49.setSelected(false);
                }
                else if(grid.equals(g51)){
                    g51.setText(value) ;
                    g51.setSelected(false);
                }
                else if(grid.equals(g52)){
                    g52.setText(value) ;
                    g52.setSelected(false);
                }
                else if(grid.equals(g53)){
                    g53.setText(value) ;
                    g53.setSelected(false);
                }
                else if(grid.equals(g54)){
                    g54.setText(value) ;
                    g54.setSelected(false);
                }
                else if(grid.equals(g55)){
                    g55.setText(value) ;
                    g55.setSelected(false);
                }
                else if(grid.equals(g56)){
                    g56.setText(value) ;
                    g56.setSelected(false);
                }
                else if(grid.equals(g57)){
                    g57.setText(value) ;
                    g57.setSelected(false);
                }
                else if(grid.equals(g58)){
                    g58.setText(value) ;
                    g58.setSelected(false);
                }
                else if(grid.equals(g59)){
                    g59.setText(value) ;
                    g59.setSelected(false);
                }
                else if(grid.equals(g61)){
                    g61.setText(value) ;
                    g61.setSelected(false);
                }
                else if(grid.equals(g62)){
                    g62.setText(value) ;
                    g62.setSelected(false);
                }
                else if(grid.equals(g63)){
                    g63.setText(value) ;
                    g63.setSelected(false);
                }
                else if(grid.equals(g64)){
                    g64.setText(value) ;
                    g64.setSelected(false);
                }
                else if(grid.equals(g65)){
                    g65.setText(value) ;
                    g65.setSelected(false);
                }
                else if(grid.equals(g66)){
                    g66.setText(value) ;
                    g66.setSelected(false);
                }
                else if(grid.equals(g67)){
                    g67.setText(value) ;
                    g67.setSelected(false);
                }
                else if(grid.equals(g68)){
                    g68.setText(value) ;
                    g68.setSelected(false);
                }
                else if(grid.equals(g69)){
                    g69.setText(value) ;
                    g69.setSelected(false);
                }
                else if(grid.equals(g71)){
                    g71.setText(value) ;
                    g71.setSelected(false);
                }
                else if(grid.equals(g72)){
                    g72.setText(value) ;
                    g72.setSelected(false);
                }
                else if(grid.equals(g73)){
                    g73.setText(value) ;
                    g73.setSelected(false);
                }
                else if(grid.equals(g74)){
                    g74.setText(value) ;
                    g74.setSelected(false);
                }
                else if(grid.equals(g75)){
                    g75.setText(value) ;
                    g75.setSelected(false);
                }
                else if(grid.equals(g76)){
                    g76.setText(value) ;
                    g76.setSelected(false);
                }
                else if(grid.equals(g77)){
                    g77.setText(value) ;
                    g77.setSelected(false);
                }
                else if(grid.equals(g78)){
                    g78.setText(value) ;
                    g78.setSelected(false);
                }
                else if(grid.equals(g79)){
                    g79.setText(value) ;
                    g79.setSelected(false);
                }
                else if(grid.equals(g81)){
                    g81.setText(value) ;
                    g81.setSelected(false);
                }
                else if(grid.equals(g82)){
                    g82.setText(value) ;
                    g82.setSelected(false);
                }
                else if(grid.equals(g83)){
                    g83.setText(value) ;
                    g83.setSelected(false);
                }
                else if(grid.equals(g84)){
                    g84.setText(value) ;
                    g84.setSelected(false);
                }
                else if(grid.equals(g85)){
                    g85.setText(value) ;
                    g85.setSelected(false);
                }
                else if(grid.equals(g86)){
                    g86.setText(value) ;
                    g86.setSelected(false);
                }
                else if(grid.equals(g87)){
                    g87.setText(value) ;
                    g87.setSelected(false);
                }
                else if(grid.equals(g88)){
                    g88.setText(value) ;
                    g88.setSelected(false);
                }
                else if(grid.equals(g89)){
                    g89.setText(value) ;
                    g89.setSelected(false);
                }
                else if(grid.equals(g91)){
                    g91.setText(value) ;
                    g91.setSelected(false);
                }
                else if(grid.equals(g92)){
                    g92.setText(value) ;
                    g92.setSelected(false);
                }
                else if(grid.equals(g93)){
                    g93.setText(value) ;
                    g93.setSelected(false);
                }
                else if(grid.equals(g94)){
                    g94.setText(value) ;
                    g94.setSelected(false);
                }
                else if(grid.equals(g95)){
                    g95.setText(value) ;
                    g95.setSelected(false);
                }
                else if(grid.equals(g96)){
                    g96.setText(value) ;
                    g96.setSelected(false);
                }
                else if(grid.equals(g97)){
                    g97.setText(value) ;
                    g97.setSelected(false);
                }
                else if(grid.equals(g98)){
                    g98.setText(value) ;
                    g98.setSelected(false);
                }
                else if(grid.equals(g99)){
                    g99.setText(value) ;
                    g99.setSelected(false);
                }
            
           }
           else if(e.getSource()==b7){
            value = "7" ;

                if(grid.equals(g11)){
                    g11.setText(value);
                    g11.setSelected(false);
                }
                else if(grid.equals(g12)){
                    g12.setText(value) ;
                    g12.setSelected(false);
                }
                else if(grid.equals(g13)){
                    g13.setText(value) ;
                    g13.setSelected(false);
                }
                else if(grid.equals(g14)){
                    g14.setText(value) ;
                    g14.setSelected(false);
                }
                else if(grid.equals(g15)){
                    g15.setText(value) ;
                    g15.setSelected(false);
                }
                else if(grid.equals(g16)){
                    g16.setText(value) ;
                    g16.setSelected(false);
                }
                else if(grid.equals(g17)){
                    g17.setText(value) ;
                    g17.setSelected(false);
                }
                else if(grid.equals(g18)){
                    g18.setText(value) ;
                    g18.setSelected(false);
                }
                else if(grid.equals(g19)){
                    g19.setText(value) ;
                    g19.setSelected(false);
                }
                else if(grid.equals(g21)){
                    g21.setText(value) ;
                    g21.setSelected(false);
                }
                else if(grid.equals(g22)){
                    g22.setText(value) ;
                    g22.setSelected(false);
                }
                else if(grid.equals(g23)){
                    g23.setText(value) ;
                    g23.setSelected(false);
                }
                else if(grid.equals(g24)){
                    g24.setText(value) ;
                    g24.setSelected(false);
                }
                else if(grid.equals(g25)){
                    g25.setText(value) ;
                    g25.setSelected(false);
                }
                else if(grid.equals(g26)){
                    g26.setText(value) ;
                    g26.setSelected(false);
                }
                else if(grid.equals(g27)){
                    g27.setText(value) ;
                    g27.setSelected(false);
                }
                else if(grid.equals(g28)){
                    g28.setText(value) ;
                    g28.setSelected(false);
                }
                else if(grid.equals(g29)){
                    g29.setText(value) ;
                    g29.setSelected(false);
                }
                else if(grid.equals(g31)){
                    g31.setText(value) ;
                    g31.setSelected(false);
                }
                else if(grid.equals(g32)){
                    g32.setText(value) ;
                    g32.setSelected(false);
                }
                else if(grid.equals(g33)){
                    g33.setText(value) ;
                    g33.setSelected(false);
                }
                else if(grid.equals(g34)){
                    g34.setText(value) ;
                    g34.setSelected(false);
                }
                else if(grid.equals(g35)){
                    g35.setText(value) ;
                    g35.setSelected(false);
                }
                else if(grid.equals(g36)){
                    g36.setText(value) ;
                    g36.setSelected(false);
                }
                else if(grid.equals(g37)){
                    g37.setText(value) ;
                    g37.setSelected(false);
                }
                else if(grid.equals(g38)){
                    g38.setText(value) ;
                    g38.setSelected(false);
                }
                else if(grid.equals(g39)){
                    g39.setText(value) ;
                    g39.setSelected(false);
                }
                else if(grid.equals(g41)){
                    g41.setText(value) ;
                    g41.setSelected(false);
                }
                else if(grid.equals(g42)){
                    g42.setText(value) ;
                    g42.setSelected(false);
                }
                else if(grid.equals(g43)){
                    g43.setText(value) ;
                    g43.setSelected(false);
                }
                else if(grid.equals(g44)){
                    g44.setText(value) ;
                    g44.setSelected(false);
                }
                else if(grid.equals(g45)){
                    g45.setText(value) ;
                    g45.setSelected(false);
                }
                else if(grid.equals(g46)){
                    g46.setText(value) ;
                    g46.setSelected(false);
                }
                else if(grid.equals(g47)){
                    g47.setText(value) ;
                    g47.setSelected(false);
                }
                else if(grid.equals(g48)){
                    g48.setText(value) ;
                    g48.setSelected(false);
                }
                else if(grid.equals(g49)){
                    g49.setText(value) ;
                    g49.setSelected(false);
                }
                else if(grid.equals(g51)){
                    g51.setText(value) ;
                    g51.setSelected(false);
                }
                else if(grid.equals(g52)){
                    g52.setText(value) ;
                    g52.setSelected(false);
                }
                else if(grid.equals(g53)){
                    g53.setText(value) ;
                    g53.setSelected(false);
                }
                else if(grid.equals(g54)){
                    g54.setText(value) ;
                    g54.setSelected(false);
                }
                else if(grid.equals(g55)){
                    g55.setText(value) ;
                    g55.setSelected(false);
                }
                else if(grid.equals(g56)){
                    g56.setText(value) ;
                    g56.setSelected(false);
                }
                else if(grid.equals(g57)){
                    g57.setText(value) ;
                    g57.setSelected(false);
                }
                else if(grid.equals(g58)){
                    g58.setText(value) ;
                    g58.setSelected(false);
                }
                else if(grid.equals(g59)){
                    g59.setText(value) ;
                    g59.setSelected(false);
                }
                else if(grid.equals(g61)){
                    g61.setText(value) ;
                    g61.setSelected(false);
                }
                else if(grid.equals(g62)){
                    g62.setText(value) ;
                    g62.setSelected(false);
                }
                else if(grid.equals(g63)){
                    g63.setText(value) ;
                    g63.setSelected(false);
                }
                else if(grid.equals(g64)){
                    g64.setText(value) ;
                    g64.setSelected(false);
                }
                else if(grid.equals(g65)){
                    g65.setText(value) ;
                    g65.setSelected(false);
                }
                else if(grid.equals(g66)){
                    g66.setText(value) ;
                    g66.setSelected(false);
                }
                else if(grid.equals(g67)){
                    g67.setText(value) ;
                    g67.setSelected(false);
                }
                else if(grid.equals(g68)){
                    g68.setText(value) ;
                    g68.setSelected(false);
                }
                else if(grid.equals(g69)){
                    g69.setText(value) ;
                    g69.setSelected(false);
                }
                else if(grid.equals(g71)){
                    g71.setText(value) ;
                    g71.setSelected(false);
                }
                else if(grid.equals(g72)){
                    g72.setText(value) ;
                    g72.setSelected(false);
                }
                else if(grid.equals(g73)){
                    g73.setText(value) ;
                    g73.setSelected(false);
                }
                else if(grid.equals(g74)){
                    g74.setText(value) ;
                    g74.setSelected(false);
                }
                else if(grid.equals(g75)){
                    g75.setText(value) ;
                    g75.setSelected(false);
                }
                else if(grid.equals(g76)){
                    g76.setText(value) ;
                    g76.setSelected(false);
                }
                else if(grid.equals(g77)){
                    g77.setText(value) ;
                    g77.setSelected(false);
                }
                else if(grid.equals(g78)){
                    g78.setText(value) ;
                    g78.setSelected(false);
                }
                else if(grid.equals(g79)){
                    g79.setText(value) ;
                    g79.setSelected(false);
                }
                else if(grid.equals(g81)){
                    g81.setText(value) ;
                    g81.setSelected(false);
                }
                else if(grid.equals(g82)){
                    g82.setText(value) ;
                    g82.setSelected(false);
                }
                else if(grid.equals(g83)){
                    g83.setText(value) ;
                    g83.setSelected(false);
                }
                else if(grid.equals(g84)){
                    g84.setText(value) ;
                    g84.setSelected(false);
                }
                else if(grid.equals(g85)){
                    g85.setText(value) ;
                    g85.setSelected(false);
                }
                else if(grid.equals(g86)){
                    g86.setText(value) ;
                    g86.setSelected(false);
                }
                else if(grid.equals(g87)){
                    g87.setText(value) ;
                    g87.setSelected(false);
                }
                else if(grid.equals(g88)){
                    g88.setText(value) ;
                    g88.setSelected(false);
                }
                else if(grid.equals(g89)){
                    g89.setText(value) ;
                    g89.setSelected(false);
                }
                else if(grid.equals(g91)){
                    g91.setText(value) ;
                    g91.setSelected(false);
                }
                else if(grid.equals(g92)){
                    g92.setText(value) ;
                    g92.setSelected(false);
                }
                else if(grid.equals(g93)){
                    g93.setText(value) ;
                    g93.setSelected(false);
                }
                else if(grid.equals(g94)){
                    g94.setText(value) ;
                    g94.setSelected(false);
                }
                else if(grid.equals(g95)){
                    g95.setText(value) ;
                    g95.setSelected(false);
                }
                else if(grid.equals(g96)){
                    g96.setText(value) ;
                    g96.setSelected(false);
                }
                else if(grid.equals(g97)){
                    g97.setText(value) ;
                    g97.setSelected(false);
                }
                else if(grid.equals(g98)){
                    g98.setText(value) ;
                    g98.setSelected(false);
                }
                else if(grid.equals(g99)){
                    g99.setText(value) ;
                    g99.setSelected(false);
                }
            
           }
           else if(e.getSource()==b8){
            value = "8" ;

                if(grid.equals(g11)){
                    g11.setText(value);
                    g11.setSelected(false);
                }
                else if(grid.equals(g12)){
                    g12.setText(value) ;
                    g12.setSelected(false);
                }
                else if(grid.equals(g13)){
                    g13.setText(value) ;
                    g13.setSelected(false);
                }
                else if(grid.equals(g14)){
                    g14.setText(value) ;
                    g14.setSelected(false);
                }
                else if(grid.equals(g15)){
                    g15.setText(value) ;
                    g15.setSelected(false);
                }
                else if(grid.equals(g16)){
                    g16.setText(value) ;
                    g16.setSelected(false);
                }
                else if(grid.equals(g17)){
                    g17.setText(value) ;
                    g17.setSelected(false);
                }
                else if(grid.equals(g18)){
                    g18.setText(value) ;
                    g18.setSelected(false);
                }
                else if(grid.equals(g19)){
                    g19.setText(value) ;
                    g19.setSelected(false);
                }
                else if(grid.equals(g21)){
                    g21.setText(value) ;
                    g21.setSelected(false);
                }
                else if(grid.equals(g22)){
                    g22.setText(value) ;
                    g22.setSelected(false);
                }
                else if(grid.equals(g23)){
                    g23.setText(value) ;
                    g23.setSelected(false);
                }
                else if(grid.equals(g24)){
                    g24.setText(value) ;
                    g24.setSelected(false);
                }
                else if(grid.equals(g25)){
                    g25.setText(value) ;
                    g25.setSelected(false);
                }
                else if(grid.equals(g26)){
                    g26.setText(value) ;
                    g26.setSelected(false);
                }
                else if(grid.equals(g27)){
                    g27.setText(value) ;
                    g27.setSelected(false);
                }
                else if(grid.equals(g28)){
                    g28.setText(value) ;
                    g28.setSelected(false);
                }
                else if(grid.equals(g29)){
                    g29.setText(value) ;
                    g29.setSelected(false);
                }
                else if(grid.equals(g31)){
                    g31.setText(value) ;
                    g31.setSelected(false);
                }
                else if(grid.equals(g32)){
                    g32.setText(value) ;
                    g32.setSelected(false);
                }
                else if(grid.equals(g33)){
                    g33.setText(value) ;
                    g33.setSelected(false);
                }
                else if(grid.equals(g34)){
                    g34.setText(value) ;
                    g34.setSelected(false);
                }
                else if(grid.equals(g35)){
                    g35.setText(value) ;
                    g35.setSelected(false);
                }
                else if(grid.equals(g36)){
                    g36.setText(value) ;
                    g36.setSelected(false);
                }
                else if(grid.equals(g37)){
                    g37.setText(value) ;
                    g37.setSelected(false);
                }
                else if(grid.equals(g38)){
                    g38.setText(value) ;
                    g38.setSelected(false);
                }
                else if(grid.equals(g39)){
                    g39.setText(value) ;
                    g39.setSelected(false);
                }
                else if(grid.equals(g41)){
                    g41.setText(value) ;
                    g41.setSelected(false);
                }
                else if(grid.equals(g42)){
                    g42.setText(value) ;
                    g42.setSelected(false);
                }
                else if(grid.equals(g43)){
                    g43.setText(value) ;
                    g43.setSelected(false);
                }
                else if(grid.equals(g44)){
                    g44.setText(value) ;
                    g44.setSelected(false);
                }
                else if(grid.equals(g45)){
                    g45.setText(value) ;
                    g45.setSelected(false);
                }
                else if(grid.equals(g46)){
                    g46.setText(value) ;
                    g46.setSelected(false);
                }
                else if(grid.equals(g47)){
                    g47.setText(value) ;
                    g47.setSelected(false);
                }
                else if(grid.equals(g48)){
                    g48.setText(value) ;
                    g48.setSelected(false);
                }
                else if(grid.equals(g49)){
                    g49.setText(value) ;
                    g49.setSelected(false);
                }
                else if(grid.equals(g51)){
                    g51.setText(value) ;
                    g51.setSelected(false);
                }
                else if(grid.equals(g52)){
                    g52.setText(value) ;
                    g52.setSelected(false);
                }
                else if(grid.equals(g53)){
                    g53.setText(value) ;
                    g53.setSelected(false);
                }
                else if(grid.equals(g54)){
                    g54.setText(value) ;
                    g54.setSelected(false);
                }
                else if(grid.equals(g55)){
                    g55.setText(value) ;
                    g55.setSelected(false);
                }
                else if(grid.equals(g56)){
                    g56.setText(value) ;
                    g56.setSelected(false);
                }
                else if(grid.equals(g57)){
                    g57.setText(value) ;
                    g57.setSelected(false);
                }
                else if(grid.equals(g58)){
                    g58.setText(value) ;
                    g58.setSelected(false);
                }
                else if(grid.equals(g59)){
                    g59.setText(value) ;
                    g59.setSelected(false);
                }
                else if(grid.equals(g61)){
                    g61.setText(value) ;
                    g61.setSelected(false);
                }
                else if(grid.equals(g62)){
                    g62.setText(value) ;
                    g62.setSelected(false);
                }
                else if(grid.equals(g63)){
                    g63.setText(value) ;
                    g63.setSelected(false);
                }
                else if(grid.equals(g64)){
                    g64.setText(value) ;
                    g64.setSelected(false);
                }
                else if(grid.equals(g65)){
                    g65.setText(value) ;
                    g65.setSelected(false);
                }
                else if(grid.equals(g66)){
                    g66.setText(value) ;
                    g66.setSelected(false);
                }
                else if(grid.equals(g67)){
                    g67.setText(value) ;
                    g67.setSelected(false);
                }
                else if(grid.equals(g68)){
                    g68.setText(value) ;
                    g68.setSelected(false);
                }
                else if(grid.equals(g69)){
                    g69.setText(value) ;
                    g69.setSelected(false);
                }
                else if(grid.equals(g71)){
                    g71.setText(value) ;
                    g71.setSelected(false);
                }
                else if(grid.equals(g72)){
                    g72.setText(value) ;
                    g72.setSelected(false);
                }
                else if(grid.equals(g73)){
                    g73.setText(value) ;
                    g73.setSelected(false);
                }
                else if(grid.equals(g74)){
                    g74.setText(value) ;
                    g74.setSelected(false);
                }
                else if(grid.equals(g75)){
                    g75.setText(value) ;
                    g75.setSelected(false);
                }
                else if(grid.equals(g76)){
                    g76.setText(value) ;
                    g76.setSelected(false);
                }
                else if(grid.equals(g77)){
                    g77.setText(value) ;
                    g77.setSelected(false);
                }
                else if(grid.equals(g78)){
                    g78.setText(value) ;
                    g78.setSelected(false);
                }
                else if(grid.equals(g79)){
                    g79.setText(value) ;
                    g79.setSelected(false);
                }
                else if(grid.equals(g81)){
                    g81.setText(value) ;
                    g81.setSelected(false);
                }
                else if(grid.equals(g82)){
                    g82.setText(value) ;
                    g82.setSelected(false);
                }
                else if(grid.equals(g83)){
                    g83.setText(value) ;
                    g83.setSelected(false);
                }
                else if(grid.equals(g84)){
                    g84.setText(value) ;
                    g84.setSelected(false);
                }
                else if(grid.equals(g85)){
                    g85.setText(value) ;
                    g85.setSelected(false);
                }
                else if(grid.equals(g86)){
                    g86.setText(value) ;
                    g86.setSelected(false);
                }
                else if(grid.equals(g87)){
                    g87.setText(value) ;
                    g87.setSelected(false);
                }
                else if(grid.equals(g88)){
                    g88.setText(value) ;
                    g88.setSelected(false);
                }
                else if(grid.equals(g89)){
                    g89.setText(value) ;
                    g89.setSelected(false);
                }
                else if(grid.equals(g91)){
                    g91.setText(value) ;
                    g91.setSelected(false);
                }
                else if(grid.equals(g92)){
                    g92.setText(value) ;
                    g92.setSelected(false);
                }
                else if(grid.equals(g93)){
                    g93.setText(value) ;
                    g93.setSelected(false);
                }
                else if(grid.equals(g94)){
                    g94.setText(value) ;
                    g94.setSelected(false);
                }
                else if(grid.equals(g95)){
                    g95.setText(value) ;
                    g95.setSelected(false);
                }
                else if(grid.equals(g96)){
                    g96.setText(value) ;
                    g96.setSelected(false);
                }
                else if(grid.equals(g97)){
                    g97.setText(value) ;
                    g97.setSelected(false);
                }
                else if(grid.equals(g98)){
                    g98.setText(value) ;
                    g98.setSelected(false);
                }
                else if(grid.equals(g99)){
                    g99.setText(value) ;
                    g99.setSelected(false);
                }
            
           }
           else if(e.getSource()==b9){
            value = "9" ;

                if(grid.equals(g11)){
                    g11.setText(value);
                    g11.setSelected(false);
                }
                else if(grid.equals(g12)){
                    g12.setText(value) ;
                    g12.setSelected(false);
                }
                else if(grid.equals(g13)){
                    g13.setText(value) ;
                    g13.setSelected(false);
                }
                else if(grid.equals(g14)){
                    g14.setText(value) ;
                    g14.setSelected(false);
                }
                else if(grid.equals(g15)){
                    g15.setText(value) ;
                    g15.setSelected(false);
                }
                else if(grid.equals(g16)){
                    g16.setText(value) ;
                    g16.setSelected(false);
                }
                else if(grid.equals(g17)){
                    g17.setText(value) ;
                    g17.setSelected(false);
                }
                else if(grid.equals(g18)){
                    g18.setText(value) ;
                    g18.setSelected(false);
                }
                else if(grid.equals(g19)){
                    g19.setText(value) ;
                    g19.setSelected(false);
                }
                else if(grid.equals(g21)){
                    g21.setText(value) ;
                    g21.setSelected(false);
                }
                else if(grid.equals(g22)){
                    g22.setText(value) ;
                    g22.setSelected(false);
                }
                else if(grid.equals(g23)){
                    g23.setText(value) ;
                    g23.setSelected(false);
                }
                else if(grid.equals(g24)){
                    g24.setText(value) ;
                    g24.setSelected(false);
                }
                else if(grid.equals(g25)){
                    g25.setText(value) ;
                    g25.setSelected(false);
                }
                else if(grid.equals(g26)){
                    g26.setText(value) ;
                    g26.setSelected(false);
                }
                else if(grid.equals(g27)){
                    g27.setText(value) ;
                    g27.setSelected(false);
                }
                else if(grid.equals(g28)){
                    g28.setText(value) ;
                    g28.setSelected(false);
                }
                else if(grid.equals(g29)){
                    g29.setText(value) ;
                    g29.setSelected(false);
                }
                else if(grid.equals(g31)){
                    g31.setText(value) ;
                    g31.setSelected(false);
                }
                else if(grid.equals(g32)){
                    g32.setText(value) ;
                    g32.setSelected(false);
                }
                else if(grid.equals(g33)){
                    g33.setText(value) ;
                    g33.setSelected(false);
                }
                else if(grid.equals(g34)){
                    g34.setText(value) ;
                    g34.setSelected(false);
                }
                else if(grid.equals(g35)){
                    g35.setText(value) ;
                    g35.setSelected(false);
                }
                else if(grid.equals(g36)){
                    g36.setText(value) ;
                    g36.setSelected(false);
                }
                else if(grid.equals(g37)){
                    g37.setText(value) ;
                    g37.setSelected(false);
                }
                else if(grid.equals(g38)){
                    g38.setText(value) ;
                    g38.setSelected(false);
                }
                else if(grid.equals(g39)){
                    g39.setText(value) ;
                    g39.setSelected(false);
                }
                else if(grid.equals(g41)){
                    g41.setText(value) ;
                    g41.setSelected(false);
                }
                else if(grid.equals(g42)){
                    g42.setText(value) ;
                    g42.setSelected(false);
                }
                else if(grid.equals(g43)){
                    g43.setText(value) ;
                    g43.setSelected(false);
                }
                else if(grid.equals(g44)){
                    g44.setText(value) ;
                    g44.setSelected(false);
                }
                else if(grid.equals(g45)){
                    g45.setText(value) ;
                    g45.setSelected(false);
                }
                else if(grid.equals(g46)){
                    g46.setText(value) ;
                    g46.setSelected(false);
                }
                else if(grid.equals(g47)){
                    g47.setText(value) ;
                    g47.setSelected(false);
                }
                else if(grid.equals(g48)){
                    g48.setText(value) ;
                    g48.setSelected(false);
                }
                else if(grid.equals(g49)){
                    g49.setText(value) ;
                    g49.setSelected(false);
                }
                else if(grid.equals(g51)){
                    g51.setText(value) ;
                    g51.setSelected(false);
                }
                else if(grid.equals(g52)){
                    g52.setText(value) ;
                    g52.setSelected(false);
                }
                else if(grid.equals(g53)){
                    g53.setText(value) ;
                    g53.setSelected(false);
                }
                else if(grid.equals(g54)){
                    g54.setText(value) ;
                    g54.setSelected(false);
                }
                else if(grid.equals(g55)){
                    g55.setText(value) ;
                    g55.setSelected(false);
                }
                else if(grid.equals(g56)){
                    g56.setText(value) ;
                    g56.setSelected(false);
                }
                else if(grid.equals(g57)){
                    g57.setText(value) ;
                    g57.setSelected(false);
                }
                else if(grid.equals(g58)){
                    g58.setText(value) ;
                    g58.setSelected(false);
                }
                else if(grid.equals(g59)){
                    g59.setText(value) ;
                    g59.setSelected(false);
                }
                else if(grid.equals(g61)){
                    g61.setText(value) ;
                    g61.setSelected(false);
                }
                else if(grid.equals(g62)){
                    g62.setText(value) ;
                    g62.setSelected(false);
                }
                else if(grid.equals(g63)){
                    g63.setText(value) ;
                    g63.setSelected(false);
                }
                else if(grid.equals(g64)){
                    g64.setText(value) ;
                    g64.setSelected(false);
                }
                else if(grid.equals(g65)){
                    g65.setText(value) ;
                    g65.setSelected(false);
                }
                else if(grid.equals(g66)){
                    g66.setText(value) ;
                    g66.setSelected(false);
                }
                else if(grid.equals(g67)){
                    g67.setText(value) ;
                    g67.setSelected(false);
                }
                else if(grid.equals(g68)){
                    g68.setText(value) ;
                    g68.setSelected(false);
                }
                else if(grid.equals(g69)){
                    g69.setText(value) ;
                    g69.setSelected(false);
                }
                else if(grid.equals(g71)){
                    g71.setText(value) ;
                    g71.setSelected(false);
                }
                else if(grid.equals(g72)){
                    g72.setText(value) ;
                    g72.setSelected(false);
                }
                else if(grid.equals(g73)){
                    g73.setText(value) ;
                    g73.setSelected(false);
                }
                else if(grid.equals(g74)){
                    g74.setText(value) ;
                    g74.setSelected(false);
                }
                else if(grid.equals(g75)){
                    g75.setText(value) ;
                    g75.setSelected(false);
                }
                else if(grid.equals(g76)){
                    g76.setText(value) ;
                    g76.setSelected(false);
                }
                else if(grid.equals(g77)){
                    g77.setText(value) ;
                    g77.setSelected(false);
                }
                else if(grid.equals(g78)){
                    g78.setText(value) ;
                    g78.setSelected(false);
                }
                else if(grid.equals(g79)){
                    g79.setText(value) ;
                    g79.setSelected(false);
                }
                else if(grid.equals(g81)){
                    g81.setText(value) ;
                    g81.setSelected(false);
                }
                else if(grid.equals(g82)){
                    g82.setText(value) ;
                    g82.setSelected(false);
                }
                else if(grid.equals(g83)){
                    g83.setText(value) ;
                    g83.setSelected(false);
                }
                else if(grid.equals(g84)){
                    g84.setText(value) ;
                    g84.setSelected(false);
                }
                else if(grid.equals(g85)){
                    g85.setText(value) ;
                    g85.setSelected(false);
                }
                else if(grid.equals(g86)){
                    g86.setText(value) ;
                    g86.setSelected(false);
                }
                else if(grid.equals(g87)){
                    g87.setText(value) ;
                    g87.setSelected(false);
                }
                else if(grid.equals(g88)){
                    g88.setText(value) ;
                    g88.setSelected(false);
                }
                else if(grid.equals(g89)){
                    g89.setText(value) ;
                    g89.setSelected(false);
                }
                else if(grid.equals(g91)){
                    g91.setText(value) ;
                    g91.setSelected(false);
                }
                else if(grid.equals(g92)){
                    g92.setText(value) ;
                    g92.setSelected(false);
                }
                else if(grid.equals(g93)){
                    g93.setText(value) ;
                    g93.setSelected(false);
                }
                else if(grid.equals(g94)){
                    g94.setText(value) ;
                    g94.setSelected(false);
                }
                else if(grid.equals(g95)){
                    g95.setText(value) ;
                    g95.setSelected(false);
                }
                else if(grid.equals(g96)){
                    g96.setText(value) ;
                    g96.setSelected(false);
                }
                else if(grid.equals(g97)){
                    g97.setText(value) ;
                    g97.setSelected(false);
                }
                else if(grid.equals(g98)){
                    g98.setText(value) ;
                    g98.setSelected(false);
                }
                else if(grid.equals(g99)){
                    g99.setText(value) ;
                    g99.setSelected(false);
                }
            
           }

           
           sudoku.second.numberChooser.setVisible(false);
    }
}  
    
class eventHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        grid = e.getSource() ;
        sudoku.second.numberChooser.setVisible(true);
    }
}
    
    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        this.setVisible(false);
        sudoku.first.timer.stop();
        new pausedForm().setVisible(true);
    }//GEN-LAST:event_pauseActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        opening.count = 0 ;
        createProblem() ;
    }//GEN-LAST:event_newGameActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        if((g11.getText()).equals(ans[1][1])){
            correct++;
        }
        if((g12.getText()).equals(ans[1][2])){
            correct++;
        }
        if((g13.getText()).equals(ans[1][3])){
            correct++;
        }
        if((g14.getText()).equals(ans[1][4])){
            correct++;
        }
        if((g15.getText()).equals(ans[1][5])){
            correct++;
        }
        if((g16.getText()).equals(ans[1][6])){
            correct++;
        }
        if((g17.getText()).equals(ans[1][7])){
            correct++;
        }
        if((g18.getText()).equals(ans[1][8])){
            correct++;
        }
        if((g19.getText()).equals(ans[1][9])){
            correct++;
        }
        if((g21.getText()).equals(ans[2][1])){
            correct++;
        }
        if((g22.getText()).equals(ans[2][2])){
            correct++;
        }
        if((g23.getText()).equals(ans[2][3])){
            correct++;
        }
        if((g24.getText()).equals(ans[2][4])){
            correct++;
        }
        if((g25.getText()).equals(ans[2][5])){
            correct++;
        }
        if((g26.getText()).equals(ans[2][6])){
            correct++;
        }
        if((g27.getText()).equals(ans[2][7])){
            correct++;
        }
        if((g28.getText()).equals(ans[2][8])){
            correct++;
        }
        if((g29.getText()).equals(ans[2][9])){
            correct++;
        }
        if((g31.getText()).equals(ans[3][1])){
            correct++;
        }
        if((g32.getText()).equals(ans[3][2])){
            correct++;
        }
        if((g33.getText()).equals(ans[3][3])){
            correct++;
        }
        if((g34.getText()).equals(ans[3][4])){
            correct++;
        }
        if((g35.getText()).equals(ans[3][5])){
            correct++;
        }
        if((g36.getText()).equals(ans[3][6])){
            correct++;
        }
        if((g37.getText()).equals(ans[3][7])){
            correct++;
        }
        if((g38.getText()).equals(ans[3][8])){
            correct++;
        }
        if((g39.getText()).equals(ans[3][9])){
            correct++;
        }
        if((g41.getText()).equals(ans[4][1])){
            correct++;
        }
        if((g42.getText()).equals(ans[4][2])){
            correct++;
        }
        if((g43.getText()).equals(ans[4][3])){
            correct++;
        }
        if((g44.getText()).equals(ans[4][4])){
            correct++;
        }
        if((g45.getText()).equals(ans[4][5])){
            correct++;
        }
        if((g46.getText()).equals(ans[4][6])){
            correct++;
        }
        if((g47.getText()).equals(ans[4][7])){
            correct++;
        }
        if((g48.getText()).equals(ans[4][8])){
            correct++;
        }
        if((g49.getText()).equals(ans[4][9])){
            correct++;
        }
        if((g51.getText()).equals(ans[5][1])){
            correct++;
        }
        if((g52.getText()).equals(ans[5][2])){
            correct++;
        }
        if((g53.getText()).equals(ans[5][3])){
            correct++;
        }
        if((g54.getText()).equals(ans[5][4])){
            correct++;
        }
        if((g55.getText()).equals(ans[5][5])){
            correct++;
        }
        if((g56.getText()).equals(ans[5][6])){
            correct++;
        }
        if((g57.getText()).equals(ans[5][7])){
            correct++;
        }
        if((g58.getText()).equals(ans[5][8])){
            correct++;
        }
        if((g59.getText()).equals(ans[5][9])){
            correct++;
        }
        if((g61.getText()).equals(ans[6][1])){
            correct++;
        }
        if((g62.getText()).equals(ans[6][2])){
            correct++;
        }
        if((g63.getText()).equals(ans[6][3])){
            correct++;
        }
        if((g64.getText()).equals(ans[6][4])){
            correct++;
        }
        if((g65.getText()).equals(ans[6][5])){
            correct++;
        }
        if((g66.getText()).equals(ans[6][6])){
            correct++;
        }
        if((g67.getText()).equals(ans[6][7])){
            correct++;
        }
        if((g68.getText()).equals(ans[6][8])){
            correct++;
        }
        if((g69.getText()).equals(ans[6][9])){
            correct++;
        }
        if((g71.getText()).equals(ans[7][1])){
            correct++;
        }
        if((g72.getText()).equals(ans[7][2])){
            correct++;
        }
        if((g73.getText()).equals(ans[7][3])){
            correct++;
        }
        if((g74.getText()).equals(ans[7][4])){
            correct++;
        }
        if((g75.getText()).equals(ans[7][5])){
            correct++;
        }
        if((g76.getText()).equals(ans[7][6])){
            correct++;
        }
        if((g77.getText()).equals(ans[7][7])){
            correct++;
        }
        if((g78.getText()).equals(ans[7][8])){
            correct++;
        }
        if((g79.getText()).equals(ans[7][9])){
            correct++;
        }
        if((g81.getText()).equals(ans[8][1])){
            correct++;
        }
        if((g82.getText()).equals(ans[8][2])){
            correct++;
        }
        if((g83.getText()).equals(ans[8][3])){
            correct++;
        }
        if((g84.getText()).equals(ans[8][4])){
            correct++;
        }
        if((g85.getText()).equals(ans[8][5])){
            correct++;
        }
        if((g86.getText()).equals(ans[8][6])){
            correct++;
        }
        if((g87.getText()).equals(ans[8][7])){
            correct++;
        }
        if((g88.getText()).equals(ans[8][8])){
            correct++;
        }
        if((g89.getText()).equals(ans[8][9])){
            correct++;
        }
        if((g91.getText()).equals(ans[9][1])){
            correct++;
        }
        if((g92.getText()).equals(ans[9][2])){
            correct++;
        }
        if((g93.getText()).equals(ans[9][3])){
            correct++;
        }
        if((g94.getText()).equals(ans[9][4])){
            correct++;
        }
        if((g95.getText()).equals(ans[9][5])){
            correct++;
        }
        if((g96.getText()).equals(ans[9][6])){
            correct++;
        }
        if((g97.getText()).equals(ans[9][7])){
            correct++;
        }
        if((g98.getText()).equals(ans[9][8])){
            correct++;
        }
        if((g99.getText()).equals(ans[9][9])){
            correct++;
        }
        if(correct==81){
            System.out.println(correct);
            JOptionPane.showMessageDialog(this, "CORRECT ANSWER ! :) "); ;
        }
        else{
            System.out.println(correct);
            JOptionPane.showMessageDialog(this, "WRONG ANSWER ! :( ");
        }
    }//GEN-LAST:event_doneActionPerformed

public static void generate()
{
   int k=1,n=1;
   for(int i=0;i<9;i++)
   {
      k=n;
      for(int j=0;j<9;j++)
      {
          if(k<=9){
              a[i][j]=k;
              k++;
          }else{
           k=1;
           a[i][j]=k;
           k++;
          }
      }
      n=k+3;
      if(k==10)
      n=4;
      if(n>9)
      n=(n%9)+1;
   }
}
    
    public static void random_gen(int check){
int k1,k2,max=2,min=0;
Random r= new Random();
   for(int i=0;i<3;i++)
   {
//There are three groups.So we are using for loop three times.
      k1=r.nextInt(max-min+1)+min;
//This while is just to ensure k1 is not equal to k2.
      do{
         k2=r.nextInt(max-min+1)+min;
      }while(k1==k2);
      max+=3;min+=3;
//check is global variable.
//We are calling random_gen two time from the main func.
//Once it will be called for columns and once for rows.
      if(check==1)
//calling a function to interchange the selected rows.
      permutation_row(k1,k2);
      else if(check==0)
      permutation_col(k1,k2);
      }
   }
    
    //For row
public static void permutation_row(int k1,int k2){
int temp;//k1 and k2 are two rows that we are selecting to interchange.
   for(int j=0;j<9;j++)
   {
      temp=a[k1][j];
      a[k1][j]=a[k2][j];
      a[k2][j]=temp;
   }
}

//For column

 public static void permutation_col(int k1,int k2){
int temp;
   for(int j=0;j<9;j++)
   {
      temp=a[j][k1];
      a[j][k1]=a[j][k2];
      a[j][k2]=temp;
   }
}

public static void row_change(int k1,int k2)
{
   int temp;
   for(int n=1;n<=3;n++)
   {
      for(int i=0;i<9;i++)
      {
         temp=a[k1][i];
         a[k1][i]=a[k2][i];
         a[k2][i]=temp;
      }
      k1++;
      k2++;
   }
}
public static void col_change(int k1,int k2)
{
   int temp;
   for(int n=1;n<=3;n++)
   {
      for(int i=0;i<9;i++)
      {
         temp=a[i][k1];
         a[i][k1]=a[i][k2];
         a[i][k2]=temp;
      }
      k1++;
      k2++;
   }
}

public static void strike_out(int k1,int k2)
{
   int row_from;
   int row_to;
   int col_from;
   int col_to;
   int i,j,b,c;
   int rem1,rem2;
   int flag;
   int temp=a[k1][k2];
   int count=9;
   for(i=1;i<=9;i++)
   { flag=1;
      for(j=0;j<9;j++)
      {
         if(j!=k2)
        {
           if(i!=a[k1][j])
           {
              continue;
           }
           else
           {
              flag=0;
              break;
           }
        } 
     }
     if(flag==1)
     {
        for(c=0;c<9;c++)
        {
           if(c!=k1)
           {
              if(i!=a[c][k2])
              {
                 continue;
              }
              else
              {
              flag=0;
              break; 
              }
           }
       }
    }
    if(flag==1)
    {
       rem1=k1%3; rem2=k2%3;
       row_from=k1-rem1;
       row_to=k1+(2-rem1);
       col_from=k2-rem2;
       col_to=k2+(2-rem2);
       for(c=row_from;c<=row_to;c++)
       {
          for(b=col_from;b<=col_to;b++)
          {
             if(c!=k1 && b!=k2)
             {
                if(i!=a[c][b])
                continue;
                else{
                   flag=0;
                   break;
                }
            }
         }
      }
   }
   if(flag==0)
   count--;
  }
  if(count==1)
  { 
     a[k1][k2]=0;
     //counter_num--;
   }
}

public void createProblem(){
        g11.setEnabled(true);
        g12.setEnabled(true);
        g13.setEnabled(true);
        g14.setEnabled(true);
        g15.setEnabled(true);
        g16.setEnabled(true);
        g17.setEnabled(true);
        g18.setEnabled(true);
        g19.setEnabled(true);
        g21.setEnabled(true);
        g22.setEnabled(true);
        g23.setEnabled(true);
        g24.setEnabled(true);
        g25.setEnabled(true);
        g26.setEnabled(true);
        g27.setEnabled(true);
        g28.setEnabled(true);
        g29.setEnabled(true);
        g31.setEnabled(true);
        g32.setEnabled(true);
        g33.setEnabled(true);
        g34.setEnabled(true);
        g35.setEnabled(true);
        g36.setEnabled(true);
        g37.setEnabled(true);
        g38.setEnabled(true);
        g39.setEnabled(true);
        g41.setEnabled(true);
        g42.setEnabled(true);
        g43.setEnabled(true);
        g44.setEnabled(true);
        g45.setEnabled(true);
        g46.setEnabled(true);
        g47.setEnabled(true);
        g48.setEnabled(true);
        g49.setEnabled(true);
        g51.setEnabled(true);
        g52.setEnabled(true);
        g53.setEnabled(true);
        g54.setEnabled(true);
        g55.setEnabled(true);
        g56.setEnabled(true);
        g57.setEnabled(true);
        g58.setEnabled(true);
        g59.setEnabled(true);
        g61.setEnabled(true);
        g62.setEnabled(true);
        g63.setEnabled(true);
        g64.setEnabled(true);
        g65.setEnabled(true);
        g66.setEnabled(true);
        g67.setEnabled(true);
        g68.setEnabled(true);
        g69.setEnabled(true);
        g71.setEnabled(true);
        g72.setEnabled(true);
        g73.setEnabled(true);
        g74.setEnabled(true);
        g75.setEnabled(true);
        g76.setEnabled(true);
        g77.setEnabled(true);
        g78.setEnabled(true);
        g79.setEnabled(true);
        g81.setEnabled(true);
        g82.setEnabled(true);
        g83.setEnabled(true);
        g84.setEnabled(true);
        g85.setEnabled(true);
        g86.setEnabled(true);
        g87.setEnabled(true);
        g88.setEnabled(true);
        g89.setEnabled(true);
        g91.setEnabled(true);
        g92.setEnabled(true);
        g93.setEnabled(true);
        g94.setEnabled(true);
        g95.setEnabled(true);
        g96.setEnabled(true);
        g97.setEnabled(true);
        g98.setEnabled(true);
        g99.setEnabled(true);
        g11.setText("");
        g12.setText("");
        g13.setText("");
        g14.setText("");
        g15.setText("");
        g16.setText("");
        g17.setText("");
        g18.setText("");
        g19.setText("");
        g21.setText("");
        g22.setText("");
        g23.setText("");
        g24.setText("");
        g25.setText("");
        g26.setText("");
        g27.setText("");
        g28.setText("");
        g29.setText("");
        g31.setText("");
        g32.setText("");
        g33.setText("");
        g34.setText("");
        g35.setText("");
        g36.setText("");
        g37.setText("");
        g38.setText("");
        g39.setText("");
        g41.setText("");
        g42.setText("");
        g43.setText("");
        g44.setText("");
        g45.setText("");
        g46.setText("");
        g47.setText("");
        g48.setText("");
        g49.setText("");
        g51.setText("");
        g52.setText("");
        g53.setText("");
        g54.setText("");
        g55.setText("");
        g56.setText("");
        g57.setText("");
        g58.setText("");
        g59.setText("");
        g61.setText("");
        g62.setText("");
        g63.setText("");
        g64.setText("");
        g65.setText("");
        g66.setText("");
        g67.setText("");
        g68.setText("");
        g69.setText("");
        g71.setText("");
        g72.setText("");
        g73.setText("");
        g74.setText("");
        g75.setText("");
        g76.setText("");
        g77.setText("");
        g78.setText("");
        g79.setText("");
        g81.setText("");
        g82.setText("");
        g83.setText("");
        g84.setText("");
        g85.setText("");
        g86.setText("");
        g87.setText("");
        g88.setText("");
        g89.setText("");
        g91.setText("");
        g92.setText("");
        g93.setText("");
        g94.setText("");
        g95.setText("");
        g96.setText("");
        g97.setText("");
        g98.setText("");
        g99.setText("");
    int counter = 1, k1, k2 ;
    generate() ;
    random_gen(2);
    random_gen(1);
    random_gen(0);
    Random rand=new Random();
   int n[]={0,3,6};
   for(int i=0;i<2;i++)
   {
      k1=n[rand.nextInt(n.length)];
      do{
         k2=n[rand.nextInt(n.length)];
      }while(k1==k2);
      if(counter==1)
      row_change(k1,k2);
      else col_change(k1,k2);  
      counter++;
   } 
     for(int i=0;i<9;i++)
     {
        for(int j=0;j<9;j++)
        {
           ans[i+1][j+1] = a[i][j] ;
           System.out.print(ans[i+1][j+1] + " ");
        }
        System.out.println("\n");
     }
     //Striking out
    for(k1=0;k1<9;k1++)
    {
       for(k2=0;k2<9;k2++)
       strike_out(k1,k2);
     }
     System.out.println(); 
     for(int i=1;i<=9;i++)
     {
        for(int j=1;j<=9;j++)
        {
           System.out.print(a[i-1][j-1]+"\t");
           if(a[i-1][j-1]!=0){
           if(i==1&&j==1){
              g11.setText(Integer.toString(a[i-1][j-1]));
              g11.setEnabled(false);
            }
           else if(i==1&&j==2){
              g12.setText(Integer.toString(a[i-1][j-1]));
              g12.setEnabled(false);
            }
           else if(i==1&&j==3){
              g13.setText(Integer.toString(a[i-1][j-1]));
              g13.setEnabled(false);
            }
           else if(i==1&&j==4){
              g14.setText(Integer.toString(a[i-1][j-1]));
              g14.setEnabled(false);
            }
           else if(i==1&&j==5){
              g15.setText(Integer.toString(a[i-1][j-1]));
              g15.setEnabled(false);
            }
           else if(i==1&&j==6){
              g16.setText(Integer.toString(a[i-1][j-1]));
              g16.setEnabled(false);
            }
           else if(i==1&&j==7){
              g17.setText(Integer.toString(a[i-1][j-1]));
              g17.setEnabled(false);
            }
           else if(i==1&&j==8){
              g18.setText(Integer.toString(a[i-1][j-1]));
              g18.setEnabled(false);
            }
           else if(i==1&&j==9){
              g19.setText(Integer.toString(a[i-1][j-1]));
              g19.setEnabled(false);
            }
           else if(i==2&&j==1){
              g21.setText(Integer.toString(a[i-1][j-1]));
              g21.setEnabled(false);
            }
           else if(i==2&&j==2){
              g22.setText(Integer.toString(a[i-1][j-1]));
              g22.setEnabled(false);
            }
           else if(i==2&&j==3){
              g23.setText(Integer.toString(a[i-1][j-1]));
              g23.setEnabled(false);
            }
           else if(i==2&&j==4){
              g24.setText(Integer.toString(a[i-1][j-1]));
              g24.setEnabled(false);
            }
           else if(i==2&&j==5){
              g25.setText(Integer.toString(a[i-1][j-1]));
              g25.setEnabled(false);
            }
           else if(i==2&&j==6){
              g26.setText(Integer.toString(a[i-1][j-1]));
              g26.setEnabled(false);
            }
           else if(i==2&&j==7){
              g27.setText(Integer.toString(a[i-1][j-1]));
              g27.setEnabled(false);
            }
           else if(i==2&&j==8){
              g28.setText(Integer.toString(a[i-1][j-1]));
              g28.setEnabled(false);
            }
           else if(i==2&&j==9){
              g29.setText(Integer.toString(a[i-1][j-1]));
              g29.setEnabled(false);
            }
           else if(i==3&&j==1){
              g31.setText(Integer.toString(a[i-1][j-1]));
              g31.setEnabled(false);
            }
           else if(i==3&&j==2){
              g32.setText(Integer.toString(a[i-1][j-1]));
              g32.setEnabled(false);
            }
           else if(i==3&&j==3){
              g33.setText(Integer.toString(a[i-1][j-1]));
              g33.setEnabled(false);
            }
           else if(i==3&&j==4){
              g34.setText(Integer.toString(a[i-1][j-1]));
              g34.setEnabled(false);
            }
           else if(i==3&&j==5){
              g35.setText(Integer.toString(a[i-1][j-1]));
              g35.setEnabled(false);
            }
           else if(i==3&&j==6){
              g36.setText(Integer.toString(a[i-1][j-1]));
              g36.setEnabled(false);
            }
           else if(i==3&&j==7){
              g37.setText(Integer.toString(a[i-1][j-1]));
              g37.setEnabled(false);
            }
           else if(i==3&&j==8){
              g38.setText(Integer.toString(a[i-1][j-1]));
              g38.setEnabled(false);
            }
           else if(i==3&&j==9){
              g39.setText(Integer.toString(a[i-1][j-1]));
              g39.setEnabled(false);
            }
           else if(i==4&&j==1){
              g41.setText(Integer.toString(a[i-1][j-1]));
              g41.setEnabled(false);
            }
           else if(i==4&&j==2){
              g42.setText(Integer.toString(a[i-1][j-1]));
              g42.setEnabled(false);
            }
           else if(i==4&&j==3){
              g43.setText(Integer.toString(a[i-1][j-1]));
              g43.setEnabled(false);
            }
           else if(i==4&&j==4){
              g44.setText(Integer.toString(a[i-1][j-1]));
              g44.setEnabled(false);
            }
           else if(i==4&&j==5){
              g45.setText(Integer.toString(a[i-1][j-1]));
              g45.setEnabled(false);
            }
           else if(i==4&&j==6){
              g46.setText(Integer.toString(a[i-1][j-1]));
              g46.setEnabled(false);
            }
           else if(i==4&&j==7){
              g47.setText(Integer.toString(a[i-1][j-1]));
              g47.setEnabled(false);
            }
           else if(i==4&&j==8){
              g48.setText(Integer.toString(a[i-1][j-1]));
              g48.setEnabled(false);
            }
           else if(i==4&&j==9){
              g49.setText(Integer.toString(a[i-1][j-1]));
              g49.setEnabled(false);
            }
           else if(i==5&&j==1){
              g51.setText(Integer.toString(a[i-1][j-1]));
              g51.setEnabled(false);
            }
           else if(i==5&&j==2){
              g52.setText(Integer.toString(a[i-1][j-1]));
              g52.setEnabled(false);
            }
           else if(i==5&&j==3){
              g53.setText(Integer.toString(a[i-1][j-1]));
              g53.setEnabled(false);
            }
           else if(i==5&&j==4){
              g54.setText(Integer.toString(a[i-1][j-1]));
              g54.setEnabled(false);
            }
           else if(i==5&&j==5){
              g55.setText(Integer.toString(a[i-1][j-1]));
              g55.setEnabled(false);
            }
           else if(i==5&&j==6){
              g56.setText(Integer.toString(a[i-1][j-1]));
              g56.setEnabled(false);
            }
           else if(i==5&&j==7){
              g57.setText(Integer.toString(a[i-1][j-1]));
              g57.setEnabled(false);
            }
           else if(i==5&&j==8){
              g58.setText(Integer.toString(a[i-1][j-1]));
              g58.setEnabled(false);
            }
           else if(i==5&&j==9){
              g59.setText(Integer.toString(a[i-1][j-1]));
              g59.setEnabled(false);
            }
           else if(i==6&&j==1){
              g61.setText(Integer.toString(a[i-1][j-1]));
              g61.setEnabled(false);
            }
           else if(i==6&&j==2){
              g62.setText(Integer.toString(a[i-1][j-1]));
              g62.setEnabled(false);
            }
           else if(i==6&&j==3){
              g63.setText(Integer.toString(a[i-1][j-1]));
              g63.setEnabled(false);
            }
           else if(i==6&&j==4){
              g64.setText(Integer.toString(a[i-1][j-1]));
              g64.setEnabled(false);
            }
           else if(i==6&&j==5){
              g65.setText(Integer.toString(a[i-1][j-1]));
              g65.setEnabled(false);
            }
           else if(i==6&&j==6){
              g66.setText(Integer.toString(a[i-1][j-1]));
              g66.setEnabled(false);
            }
           else if(i==6&&j==7){
              g67.setText(Integer.toString(a[i-1][j-1]));
              g67.setEnabled(false);
            }
           else if(i==6&&j==8){
              g68.setText(Integer.toString(a[i-1][j-1]));
              g68.setEnabled(false);
            }
           else if(i==6&&j==9){
              g69.setText(Integer.toString(a[i-1][j-1]));
              g69.setEnabled(false);
            }
           else if(i==7&&j==1){
              g71.setText(Integer.toString(a[i-1][j-1]));
              g71.setEnabled(false);
            }
           else if(i==7&&j==2){
              g72.setText(Integer.toString(a[i-1][j-1]));
              g72.setEnabled(false);
            }
           else if(i==7&&j==3){
              g73.setText(Integer.toString(a[i-1][j-1]));
              g73.setEnabled(false);
            }
           else if(i==7&&j==4){
              g74.setText(Integer.toString(a[i-1][j-1]));
              g74.setEnabled(false);
            }
           else if(i==7&&j==5){
              g75.setText(Integer.toString(a[i-1][j-1]));
              g75.setEnabled(false);
            }
           else if(i==7&&j==6){
              g76.setText(Integer.toString(a[i-1][j-1]));
              g76.setEnabled(false);
            }
           else if(i==7&&j==7){
              g77.setText(Integer.toString(a[i-1][j-1]));
              g77.setEnabled(false);
            }
           else if(i==7&&j==8){
              g78.setText(Integer.toString(a[i-1][j-1]));
              g78.setEnabled(false);
            }
           else if(i==7&&j==9){
              g79.setText(Integer.toString(a[i-1][j-1]));
              g79.setEnabled(false);
            }
           else if(i==8&&j==1){
              g81.setText(Integer.toString(a[i-1][j-1]));
              g81.setEnabled(false);
            }
           else if(i==8&&j==2){
              g82.setText(Integer.toString(a[i-1][j-1]));
              g82.setEnabled(false);
            }
           else if(i==8&&j==3){
              g83.setText(Integer.toString(a[i-1][j-1]));
              g83.setEnabled(false);
            }
           else if(i==8&&j==4){
              g84.setText(Integer.toString(a[i-1][j-1]));
              g84.setEnabled(false);
            }
           else if(i==8&&j==5){
              g85.setText(Integer.toString(a[i-1][j-1]));
              g85.setEnabled(false);
            }
           else if(i==8&&j==6){
              g86.setText(Integer.toString(a[i-1][j-1]));
              g86.setEnabled(false);
            }
           else if(i==8&&j==7){
              g87.setText(Integer.toString(a[i-1][j-1]));
              g87.setEnabled(false);
            }
           else if(i==8&&j==8){
              g88.setText(Integer.toString(a[i-1][j-1]));
              g88.setEnabled(false);
            }
           else if(i==8&&j==9){
              g89.setText(Integer.toString(a[i-1][j-1]));
              g89.setEnabled(false);
            }
           else if(i==9&&j==1){
              g91.setText(Integer.toString(a[i-1][j-1]));
              g91.setEnabled(false);
            }
           else if(i==9&&j==2){
              g92.setText(Integer.toString(a[i-1][j-1]));
              g92.setEnabled(false);
            }
           else if(i==9&&j==3){
              g93.setText(Integer.toString(a[i-1][j-1]));
              g93.setEnabled(false);
            }
           else if(i==9&&j==4){
              g94.setText(Integer.toString(a[i-1][j-1]));
              g94.setEnabled(false);
            }
           else if(i==9&&j==5){
              g95.setText(Integer.toString(a[i-1][j-1]));
              g95.setEnabled(false);
            }
           else if(i==9&&j==6){
              g96.setText(Integer.toString(a[i-1][j-1]));
              g96.setEnabled(false);
            }
           else if(i==9&&j==7){
              g97.setText(Integer.toString(a[i-1][j-1]));
              g97.setEnabled(false);
            }
           else if(i==9&&j==8){
              g98.setText(Integer.toString(a[i-1][j-1]));
              g98.setEnabled(false);
            }
           else if(i==9&&j==9){
              g99.setText(Integer.toString(a[i-1][j-1]));
              g99.setEnabled(false);
            }
           }
        
        }
        System.out.println("");
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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JPanel board;
    private javax.swing.JButton done;
    private javax.swing.JButton erase;
    private javax.swing.JToggleButton g11;
    private javax.swing.JToggleButton g12;
    private javax.swing.JToggleButton g13;
    private javax.swing.JToggleButton g14;
    private javax.swing.JToggleButton g15;
    private javax.swing.JToggleButton g16;
    private javax.swing.JToggleButton g17;
    private javax.swing.JToggleButton g18;
    private javax.swing.JToggleButton g19;
    private javax.swing.JToggleButton g21;
    private javax.swing.JToggleButton g22;
    private javax.swing.JToggleButton g23;
    private javax.swing.JToggleButton g24;
    private javax.swing.JToggleButton g25;
    private javax.swing.JToggleButton g26;
    private javax.swing.JToggleButton g27;
    private javax.swing.JToggleButton g28;
    private javax.swing.JToggleButton g29;
    private javax.swing.JToggleButton g31;
    private javax.swing.JToggleButton g32;
    private javax.swing.JToggleButton g33;
    private javax.swing.JToggleButton g34;
    private javax.swing.JToggleButton g35;
    private javax.swing.JToggleButton g36;
    private javax.swing.JToggleButton g37;
    private javax.swing.JToggleButton g38;
    private javax.swing.JToggleButton g39;
    private javax.swing.JToggleButton g41;
    private javax.swing.JToggleButton g42;
    private javax.swing.JToggleButton g43;
    private javax.swing.JToggleButton g44;
    private javax.swing.JToggleButton g45;
    private javax.swing.JToggleButton g46;
    private javax.swing.JToggleButton g47;
    private javax.swing.JToggleButton g48;
    private javax.swing.JToggleButton g49;
    private javax.swing.JToggleButton g51;
    private javax.swing.JToggleButton g52;
    private javax.swing.JToggleButton g53;
    private javax.swing.JToggleButton g54;
    private javax.swing.JToggleButton g55;
    private javax.swing.JToggleButton g56;
    private javax.swing.JToggleButton g57;
    private javax.swing.JToggleButton g58;
    private javax.swing.JToggleButton g59;
    private javax.swing.JToggleButton g61;
    private javax.swing.JToggleButton g62;
    private javax.swing.JToggleButton g63;
    private javax.swing.JToggleButton g64;
    private javax.swing.JToggleButton g65;
    private javax.swing.JToggleButton g66;
    private javax.swing.JToggleButton g67;
    private javax.swing.JToggleButton g68;
    private javax.swing.JToggleButton g69;
    private javax.swing.JToggleButton g71;
    private javax.swing.JToggleButton g72;
    private javax.swing.JToggleButton g73;
    private javax.swing.JToggleButton g74;
    private javax.swing.JToggleButton g75;
    private javax.swing.JToggleButton g76;
    private javax.swing.JToggleButton g77;
    private javax.swing.JToggleButton g78;
    private javax.swing.JToggleButton g79;
    private javax.swing.JToggleButton g81;
    private javax.swing.JToggleButton g82;
    private javax.swing.JToggleButton g83;
    private javax.swing.JToggleButton g84;
    private javax.swing.JToggleButton g85;
    private javax.swing.JToggleButton g86;
    private javax.swing.JToggleButton g87;
    private javax.swing.JToggleButton g88;
    private javax.swing.JToggleButton g89;
    private javax.swing.JToggleButton g91;
    private javax.swing.JToggleButton g92;
    private javax.swing.JToggleButton g93;
    private javax.swing.JToggleButton g94;
    private javax.swing.JToggleButton g95;
    private javax.swing.JToggleButton g96;
    private javax.swing.JToggleButton g97;
    private javax.swing.JToggleButton g98;
    private javax.swing.JToggleButton g99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton newGame;
    private javax.swing.JPanel numberChooser;
    private javax.swing.JButton pause;
    public javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

}
