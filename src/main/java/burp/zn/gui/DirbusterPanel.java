package burp.zn.gui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;

public class DirbusterPanel {

    private JPanel rootPanel;
    private JButton btnStart;
    private JTable tblFoundDirs;
    private JLabel lblCount;
    private JButton btnBrowse;
    private JTextField tbxPathToFile;
    private JTextField tbxMaxThreads;
    private JTextField tbxTimeout;
    private JTextField tbxHost;
    private JTextField tbxFileExtention;
    private final JFileChooser fileChooser;

    public DirbusterPanel() {
        this.fileChooser = new JFileChooser();
    }

    /**
     * Creates Custom GUI forms
     */
    private void createUIComponents() {
        tblFoundDirs = new DirBusterTable();
    }

    public JTextField getTbxFileExtention() {
        return tbxFileExtention;
    }

    public JFileChooser getFileChooser() {
        return fileChooser;
    }

    public JTextField getTbxMaxThreads() {
        return tbxMaxThreads;
    }

    public JTextField getTbxTimeout() {
        return tbxTimeout;
    }

    public JTextField getTbxHost() {
        return tbxHost;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JButton getBtnStart() {
        return btnStart;
    }

    public JTable getTblFoundDirs() {
        return tblFoundDirs;
    }

    public JLabel getLblCount() {
        return lblCount;
    }

    public JButton getBtnBrowse() {
        return btnBrowse;
    }

    public JTextField getTbxPathToFile() {
        return tbxPathToFile;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(8, 3, new Insets(10, 10, 10, 10), -1, -1));
        btnStart = new JButton();
        btnStart.setText("Start");
        rootPanel.add(btnStart, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setFont(new Font(label1.getFont().getName(), Font.BOLD, 16));
        label1.setText("DirBuster");
        rootPanel.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblCount = new JLabel();
        lblCount.setText("Count of bustered dirs: ");
        rootPanel.add(lblCount, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        rootPanel.add(spacer1, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        tbxMaxThreads = new JTextField();
        tbxMaxThreads.setText("10");
        rootPanel.add(tbxMaxThreads, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(80, -1), 0, false));
        final JLabel label2 = new JLabel();
        label2.setHorizontalAlignment(11);
        label2.setText("Max count of threads");
        rootPanel.add(label2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        tbxTimeout = new JTextField();
        tbxTimeout.setText("80");
        rootPanel.add(tbxTimeout, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(80, -1), 0, false));
        final JLabel label3 = new JLabel();
        label3.setHorizontalAlignment(11);
        label3.setText("Request Timeout mills");
        rootPanel.add(label3, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        tbxPathToFile = new JTextField();
        tbxPathToFile.setText("/home/ivan/DEV/DirBuster-0.12/directory-list-lowercase-2.3-small.txt");
        rootPanel.add(tbxPathToFile, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        tbxHost = new JTextField();
        tbxHost.setText("http://victim.com");
        rootPanel.add(tbxHost, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setHorizontalAlignment(11);
        label4.setText("Host");
        rootPanel.add(label4, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        rootPanel.add(scrollPane1, new GridConstraints(7, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        scrollPane1.setViewportView(tblFoundDirs);
        tbxFileExtention = new JTextField();
        tbxFileExtention.setText(".html");
        rootPanel.add(tbxFileExtention, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setHorizontalAlignment(11);
        label5.setText("Brute extension");
        rootPanel.add(label5, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnBrowse = new JButton();
        btnBrowse.setText("Browse...");
        rootPanel.add(btnBrowse, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}