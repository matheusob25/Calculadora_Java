package calc;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class Calculo extends JFrame {

    double vl1;
    double vl2;
    double res;
    String op;

    JTextField text = new JTextField();
    JPanel n = new JPanel();
    DecimalFormat df = new DecimalFormat("0");
    private void enternumber(String q) {
        String nums = text.getText() + q;
        text.setText(nums);
    }
    private void bzero(ActionEvent e) {
        if (text.getText().contains("÷") || text.getText().contains("x") || text.getText().contains("+") || text.getText().contains("-")) {
            text.setText("0");
        } else {
            enternumber("0");
        }
    }

    private void b1(ActionEvent e) {
        if (text.getText().contains("÷") || text.getText().contains("x") || text.getText().contains("+") || text.getText().contains("-")) {
            text.setText("1");
        } else {
            enternumber("1");
        }
    }

    private void b2(ActionEvent e) {
        if (text.getText().contains("÷") || text.getText().contains("x") || text.getText().contains("+") || text.getText().contains("-")) {
            text.setText("2");
        } else {
            enternumber("2");
        }
    }

    private void b3(ActionEvent e) {
        if (text.getText().contains("÷") || text.getText().contains("x") || text.getText().contains("+") || text.getText().contains("-")) {
            text.setText("3");
        } else {
            enternumber("3");
        }
    }

    private void b4(ActionEvent e) {
        if (text.getText().contains("÷") || text.getText().contains("x") || text.getText().contains("+") || text.getText().contains("-")) {
            text.setText("4");
        } else {
            enternumber("4");
        }
    }

    private void b5(ActionEvent e) {
        if (text.getText().contains("÷") || text.getText().contains("x") || text.getText().contains("+") || text.getText().contains("-")) {
            text.setText("5");
        } else {
            enternumber("5");
        }
    }

    private void b6(ActionEvent e) {
        if (text.getText().contains("÷") || text.getText().contains("x") || text.getText().contains("+") || text.getText().contains("-")) {
            text.setText("6");
        } else {
            enternumber("6");
        }
    }

    private void b7(ActionEvent e) {
        if (text.getText().contains("÷") || text.getText().contains("x") || text.getText().contains("+") || text.getText().contains("-")) {
            text.setText("7");
        } else {
            enternumber("7");
        }
    }

    private void b8(ActionEvent e) {
        if (text.getText().contains("÷") || text.getText().contains("x") || text.getText().contains("+") || text.getText().contains("-")) {
            text.setText("8");
        } else {
            enternumber("8");
        }
    }

    private void b9(ActionEvent e) {
        if (text.getText().contains("÷") || text.getText().contains("x") || text.getText().contains("+") || text.getText().contains("-")) {
            text.setText("9");
        } else {
            enternumber("9");
        }
    }

    private void pos(ActionEvent e) {

        if(op == null) {
            if (text.getText().contains(",")) {
                vl1 = Double.parseDouble(text.getText().replace(',', '.'));
                    vl1 *= (-1);
                text.setText(Float.toString((float) vl1).replace('.', ','));
            } else {
                vl1 = Double.parseDouble(text.getText());

                    vl1 *= (-1);
                text.setText(String.valueOf(df.format(vl1)));
            }
        }else{
            if (text.getText().contains(",")) {
                vl2 = Double.parseDouble(text.getText().replace(',', '.'));
                    vl2 *= (-1);
                text.setText(Float.toString((float) vl2).replace('.', ','));
            } else {
                vl2 = Double.parseDouble(text.getText());
                vl2 *= (-1);
                text.setText(String.valueOf(df.format(vl2)));
            }
        }
    }

    private void virg(ActionEvent e) {
        if (!text.getText().contains(",")) {
            text.setText(text.getText() + ",");
        }
    }

    private void res(ActionEvent e) {

        if (text.getText().contains(",")) {
            vl2 = Double.parseDouble(text.getText().replace(',', '.'));
            if (op == "+") {
                res = (vl1) + (vl2);
                text.setText(Float.toString((float) res).replace('.',','));
            } else if (op == "-") {
                res = (vl1) - (vl2);
                text.setText(Float.toString((float) res).replace('.',','));
            } else if (op == "x" || op == "*") {
                res = (vl1) * (vl2);
                text.setText(Float.toString((float) res).replace('.',','));
            } else if (op == "/" || op == "÷") {
                res = (vl1) / (vl2);
                text.setText(Float.toString((float) res).replace('.',','));
            }
            vl1 = res;


        } else {
            vl2 = Double.parseDouble(text.getText());
            if (op == "+") {
                res = (vl1) + (vl2);
                text.setText(String.valueOf(df.format(res)));

            }else if(op == "-"){
                res = vl1 - vl2;
                text.setText(String.valueOf(df.format(res)));
            }else if (op == "x") {
                res = (vl1 * vl2);
                text.setText(String.valueOf(df.format(res)));
            } else if (op == "÷") {
                res = (vl1) / (vl2);
                if(String.valueOf(res).contains(".")){
                    text.setText(Float.toString((float) res).replace('.',','));
                }else {
                    text.setText(String.valueOf(df.format(res)));
                }
            }
            vl1 = res;
        }
    }
        private void sum (ActionEvent e){
            if (text.getText().contains(",")) {
                vl1 = Double.parseDouble(text.getText().replace(',', '.'));
                text.setText("+");
                op = "+";
            } else {
                vl1 = Double.parseDouble(text.getText());
                text.setText("+");
                op = "+";
            }
        }
        private void dif (ActionEvent e){
            if (text.getText().contains(",")) {
                vl1 = Double.parseDouble(text.getText().replace(',', '.'));
                text.setText("-");
                op = "-";
            } else {
                vl1 = Double.parseDouble(text.getText());
                text.setText("-");
                op = "-";
            }
        }
        private void mult (ActionEvent e){
            if (text.getText().contains(",")) {
                vl1 = Double.parseDouble(text.getText().replace(',', '.'));
                text.setText("x");
                op = "x";
            } else {
                vl1 = Double.parseDouble(text.getText());
                text.setText("x");
                op = "x";
            }
        }
        private void div (ActionEvent e){
            if (text.getText().contains(",")) {
                vl1 = Double.parseDouble(text.getText().replace(',', '.'));
                text.setText("÷");
                op = "÷";
            } else {
                vl1 = Double.parseDouble(text.getText());
                text.setText("÷");
                op = "÷";
            }
            text.setText("÷");
        }
        private void raiz (ActionEvent e){
            String vl;
            if (text.getText().contains(",")) {
                vl = text.getText();
                vl1 = Double.parseDouble(text.getText().replace(',', '.'));
                text.setText(String.valueOf(Math.sqrt(vl1)));
            } else {
                vl = text.getText();
                vl1 = Double.parseDouble(text.getText());
                text.setText(String.valueOf(Math.sqrt(vl1)));
            }

        }
        private void pot (ActionEvent e){
            if (text.getText().contains(",")) {
                vl1 = Double.parseDouble(text.getText().replace(',', '.'));
                text.setText(String.valueOf(Math.pow(vl1, 2)));
            } else {
                vl1 = Double.parseDouble(text.getText());
                text.setText(String.valueOf(Math.pow(vl1, 2)));
            }

        }
        private void frac (ActionEvent e){
            String j;
            if (text.getText().contains(",")) {
                j = text.getText();
                vl1 = Double.parseDouble(text.getText().replace(',', '.'));
                text.setText("1/" + j + "= " + (1 / vl1));
            } else {
                j = text.getText();
                vl1 = Double.parseDouble(text.getText());
                text.setText("1/" + j + "= " + (1 / vl1));
            }

        }
        private void exc (ActionEvent e){
            text.setText("");
        }
        private void x (ActionEvent e){
            String tx = null;
            if (text.getText().length() > 0) {
                StringBuilder sb = new StringBuilder(text.getText());
                sb.deleteCharAt(text.getText().length() - 1);
                tx = sb.toString();
                text.setText(tx);
            }
        }
        private void ce (ActionEvent e){
            String c = null, v = null;
            c = String.valueOf(vl1);
            v = String.valueOf(vl2);
            c = "";
            v = "";
        }
    private void porc(ActionEvent actionEvent) {
        if (text.getText().contains(",")){


        }
    }

        ImageIcon icon = new ImageIcon("C:\\Users\\mathe\\IdeaProjects\\Calculadora\\src\\calc\\calc.png");

    public Calculo() {
            Font f = new Font("Georgia", Font.ITALIC, 20);
            n.setLayout(new GridLayout(6, 4, 3, 3));
            n.setBounds(0, 500, 410, 400);
            setSize(450, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            setTitle("Calculadora");
            setIconImage(icon.getImage());
            add(BorderLayout.NORTH, text);
            text.setBounds(6, 6, 410, 300);
            text.setFont(new Font("Georgia", Font.ITALIC, 30));
            text.setHorizontalAlignment(4);
            text.setDocument(new Sonum());


            JButton b1 = new JButton("1");
            b1.setForeground(new Color(0));
            b1.setBackground(new Color(57, 178, 178));

            JButton b2 = new JButton("2");
            b2.setForeground(new Color(0));
            b2.setBackground(new Color(57, 178, 178));

            JButton b3 = new JButton("3");

            b3.setForeground(new Color(0));
            b3.setBackground(new Color(57, 178, 178));

            JButton b4 = new JButton("4");
            b4.setForeground(new Color(0));
            b4.setBackground(new Color(57, 178, 178));

            JButton b5 = new JButton("5");
            b5.setForeground(new Color(0));
            b5.setBackground(new Color(57, 178, 178));

            JButton b6 = new JButton("6");
            b6.setForeground(new Color(0));
            b6.setBackground(new Color(57, 178, 178));

            JButton b7 = new JButton("7");
            b7.setForeground(new Color(0));
            b7.setBackground(new Color(57, 178, 178));

            JButton b8 = new JButton("8");
            b8.setForeground(new Color(0));
            b8.setBackground(new Color(57, 178, 178));

            JButton b9 = new JButton("9");
            b9.setForeground(new Color(0));
            b9.setBackground(new Color(57, 178, 178));

            JButton posneg = new JButton("+/_");
            posneg.setForeground(new Color(0));
            posneg.setBackground(new Color(57, 178, 178));

            JButton b0 = new JButton("0");
            b0.setForeground(new Color(0));
            b0.setBackground(new Color(57, 178, 178));

            JButton virg = new JButton(",");
            virg.setForeground(new Color(0));
            virg.setBackground(new Color(57, 178, 178));

            JButton resul = new JButton("=");
            resul.setForeground(new Color(0));
            resul.setBackground(new Color(57, 178, 178));

            JButton sum = new JButton("+");
            sum.setForeground(new Color(0));
            sum.setBackground(new Color(57, 178, 178));

            JButton dif = new JButton("_");

            dif.setForeground(new Color(0));
            dif.setBackground(new Color(57, 178, 178));

            JButton mult = new JButton("x");

            mult.setForeground(new Color(0));
            mult.setBackground(new Color(57, 178, 178));

            JButton div = new JButton("÷");
            div.setForeground(new Color(0));
            div.setBackground(new Color(57, 178, 178));


            JButton raiz = new JButton("²√x");
            raiz.setForeground(new Color(0));
            raiz.setBackground(new Color(57, 178, 178));

            JButton poten = new JButton("x²");
            poten.setForeground(new Color(0));
            poten.setBackground(new Color(57, 178, 178));

            JButton fr = new JButton("¹/x");
            fr.setForeground(new Color(0));
            fr.setBackground(new Color(57, 178, 178));
            JButton clean = new JButton("C");
            clean.setForeground(new Color(0x000000));
            clean.setBackground(new Color(57, 178, 178));
            ImageIcon cc = new ImageIcon("C:\\Users\\mathe\\IdeaProjects\\Calculadora\\src\\calc\\CC.png");
            JButton x = new JButton(cc);
            x.setForeground(new Color(0x000000));
            x.setBackground(new Color(57, 178, 178));

            JButton ce = new JButton("CE");
            ce.setForeground(new Color(0x000000));
            ce.setBackground(new Color(57, 178, 178));

            JButton porc = new JButton("%");
            porc.setForeground(new Color(0x000000));
            porc.setBackground(new Color(57, 178, 178));

            porc.setFont(f);
            ce.setFont(f);
            clean.setFont(f);
            x.setFont(f);
            fr.setFont(f);
            poten.setFont(f);
            raiz.setFont(f);
            div.setFont(f);
            b7.setFont(f);
            b8.setFont(f);
            b9.setFont(f);
            mult.setFont(f);
            b4.setFont(f);
            b5.setFont(f);
            b6.setFont(f);
            dif.setFont(f);
            b1.setFont(f);
            b2.setFont(f);
            b3.setFont(f);
            sum.setFont(f);
            posneg.setFont(f);
            virg.setFont(f);
            b0.setFont(f);
            resul.setFont(f);


            add(n);
            n.add(porc);
            n.add(ce);
            n.add(clean);
            n.add(x);
            n.add(fr);
            n.add(poten);
            n.add(raiz);
            n.add(div);
            n.add(b7);
            n.add(b8);
            n.add(b9);
            n.add(mult);
            n.add(b4);
            n.add(b5);
            n.add(b6);
            n.add(dif);
            n.add(b1);
            n.add(b2);
            n.add(b3);
            n.add(sum);
            n.add(posneg);
            n.add(b0);
            n.add(virg);
            n.add(resul);


            b0.addActionListener(this::bzero);
            b1.addActionListener(this::b1);
            b2.addActionListener(this::b2);
            b3.addActionListener(this::b3);
            b4.addActionListener(this::b4);
            b5.addActionListener(this::b5);
            b6.addActionListener(this::b6);
            b7.addActionListener(this::b7);
            b8.addActionListener(this::b8);
            b9.addActionListener(this::b9);
            virg.addActionListener(this::virg);
            sum.addActionListener(this::sum);
            dif.addActionListener(this::dif);
            mult.addActionListener(this::mult);
            div.addActionListener(this::div);
            raiz.addActionListener(this::raiz);
            poten.addActionListener(this::pot);
            fr.addActionListener(this::frac);
            clean.addActionListener(this::exc);
            x.addActionListener(this::x);
            ce.addActionListener(this::ce);
            posneg.addActionListener(this::pos);
            resul.addActionListener(this::res);
            porc.addActionListener(this:: porc);

            setLocationRelativeTo(null);
            setVisible(true);
        }


}

