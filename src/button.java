import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button {
    private static int selectedGolongan = 0;
    private static boolean isMarried = false;
    private static int totalAnak = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Golongan Gaji");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JButton golongan1Button = new JButton("Golongan 1");
        JButton golongan2Button = new JButton("Golongan 2");
        JButton golongan3Button = new JButton("Golongan 3");

        JButton yaButton = new JButton("Ya");
        JButton tidakButton = new JButton("Tidak");

        frame.add(golongan1Button);
        frame.add(golongan2Button);
        frame.add(golongan3Button);

        golongan1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedGolongan = 1;
                showMaritalStatusOptions(frame);
            }
        });

        golongan2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedGolongan = 2;
                showMaritalStatusOptions(frame);
            }
        });

        golongan3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedGolongan = 3;
                showMaritalStatusOptions(frame);
            }
        });

        frame.setVisible(true);
    }

    private static void showMaritalStatusOptions(JFrame frame) {
        frame.getContentPane().removeAll();

        JButton yaButton = new JButton("Ya");
        JButton tidakButton = new JButton("Tidak");

        frame.add(yaButton);
        frame.add(tidakButton);

        yaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isMarried = true;
                showTotalAnakInput(frame);
            }
        });

        tidakButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateSalary();
            }
        });

        frame.revalidate();
        frame.repaint();
    }

    private static void showTotalAnakInput(JFrame frame) {
        frame.getContentPane().removeAll();

        JLabel label = new JLabel("Masukkan jumlah anak: ");
        JTextField anakField = new JTextField(10);
        JButton submitButton = new JButton("Submit");

        frame.add(label);
        frame.add(anakField);
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                totalAnak = Integer.parseInt(anakField.getText());
                calculateSalary();
            }
        });

        frame.revalidate();
        frame.repaint();
    }

    private static void calculateSalary() {
        int gol1 = 1000000;
        int gol2 = 2000000;
        int gol3 = 3000000;
        int tunjanganKeluarga = 300000;
        int tunjanganAnak = 100000;

        int totalGaji = 0;

        if (isMarried) {
            if (selectedGolongan == 1) {
                totalGaji = gol1 + tunjanganKeluarga + tunjanganAnak * Math.min(totalAnak, 3);
            } else if (selectedGolongan == 2) {
                totalGaji = gol2 + tunjanganKeluarga + tunjanganAnak * Math.min(totalAnak, 3);
            } else if (selectedGolongan == 3) {
                totalGaji = (gol3 + tunjanganKeluarga + tunjanganAnak * Math.min(totalAnak, 3)) * 98 / 100;
            }
        } else {
            if (selectedGolongan == 1) {
                totalGaji = gol1;
            } else if (selectedGolongan == 2) {
                totalGaji = gol2;
            } else if (selectedGolongan == 3) {
                totalGaji = gol3 * 98 / 100;
            }
        }

        JOptionPane.showMessageDialog(null, "Total Gaji Anda: " + totalGaji);
        System.exit(0);
    }
}
