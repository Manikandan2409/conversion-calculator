import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.Component;
import java.awt.Font;

public class ConverterCreator implements ActionListener, ItemListener {

    // Components reference

    JMenuItem weightConverter, lengthConverter, liquidConverter;
    JPanel converterPanel, imagePanel, rightPanel;
    JMenuBar menubar;
    JMenu converterMenu;
    JLabel fromLabel, toLabel, fromIndicator, toIndicator, fromUnit, toUnit, welcomelabel;
    JTextField fromInputField, toInputField;
    JComboBox<String> fromConversionBox, toConversionBox;
    JButton convertButton;
    static final int from_x = 70, to_x = 310, layer1_y = 60, layer2_y = 110, layer3_y = 200, layer4_y = 280;
    JFrame frame;
    Map<String, String> weightIndicatorToUnit = new HashMap<>();
    Map<String, String> lengthIndicatorToUnit = new HashMap<>();
    Map<String, String> liquidIndicatorToUnit = new HashMap<>();
    WeightConverter<Double> converter = new WeightConverter<>();
    private final String[] weightIndicator = {
            "Kilogram", "Gram", "Milligram", "MetricTon", "LongTon", "ShortTon", "Pound", "Ounce", "Carat"
    };

    private final String[] weightUnit = {
            "kg", "gm", "mg", "mt", "lt", "st", "lb", "oz", "ct"
    };

    String[] lengthIndicator = new String[] {
            "Kilometre", "Metre", "Centimetre", "Micrometre", "Inch", "Feet", "Yard"
    };
    String[] lengthUnit = new String[] {
            "km", "m", "cm", "mc", "in", "ft", "yd"
    };

    String[] liquidIndicator = new String[] {
            "Millilitre", "Litre", "Barrel", "peck", "Pointdry", "Quatdry"
    };
    String[] liquidUnit = new String[] { "ml", "l", "bl", "pk", "pd", "qd" };
    String panelcolor = "#fffffe";
    String compBkColor = "#9EDDFF";
    String compBkColor2 = "#CCC8AA";
    String welcomeLabelContent = "Our converter helps to calculate easier for your needs";
    Font lFont = new Font("Times new Roman", Font.ROMAN_BASELINE, 18);
    Font listFont = new Font("Times new Roman", Font.BOLD, 14);

    ConverterCreator() {
        for (int i = 0; i < weightIndicator.length; i++) {
            weightIndicatorToUnit.put(weightIndicator[i], weightUnit[i]);
        }
        for (int i = 0; i < lengthIndicator.length; i++) {
            lengthIndicatorToUnit.put(lengthIndicator[i], lengthUnit[i]);
        }
        for (int i = 0; i < liquidIndicator.length; i++) {
            liquidIndicatorToUnit.put(liquidIndicator[i], liquidUnit[i]);
        }
    }

    public static void main(String[] args) {
        ConverterCreator converter = new ConverterCreator();
        SwingUtilities.invokeLater(() -> converter.createAndShowGUI());

    }

    void createAndShowGUI() {
        frame = new JFrame("Converter Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.decode("#d4d8f0"));
        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setForeground(Color.decode("#020826"));

        // MenuBar, Menu Initializers

        menubar = new JMenuBar();
        menubar.setBackground(Color.decode(compBkColor));
        menubar.setSize(1920, 60);
        converterMenu = new JMenu("Converter");
        converterMenu.setBackground(Color.decode("#fffffe"));
        converterMenu.setForeground(Color.decode("#020826"));
        converterMenu.setFont(listFont);
        converterMenu.setFocusable(true);

        // Menu Item Initializers

        weightConverter = new JMenuItem("WeightConversion");
        weightConverter.setBackground(Color.decode(compBkColor2));
        // weightConverter.setFont(listFont);
        weightConverter.addActionListener(this);

        lengthConverter = new JMenuItem("length Conversion");
        lengthConverter.setBackground(Color.decode(compBkColor2));
        // lengthConverter.setFont(listFont);
        lengthConverter.addActionListener(this);

        liquidConverter = new JMenuItem("Liquid Conversion");
        liquidConverter.setBackground(Color.decode(compBkColor2));
        // liquidConverter.setFont(listFont);
        liquidConverter.addActionListener(this);
        // Setters

        converterMenu.add(weightConverter);
        converterMenu.addSeparator();
        converterMenu.add(lengthConverter);
        converterMenu.addSeparator();
        converterMenu.add(liquidConverter);

        menubar.add(converterMenu);
        frame.setJMenuBar(menubar);

        imagePanel = createImagePanel();
        rightPanel = createTextPanel();
        frame.add(imagePanel);
        frame.add(rightPanel);

        frame.setVisible(true);
    }

    // imagepanel
    private JPanel createImagePanel() {
        JPanel imagePanel = new JPanel();
        imagePanel.setBackground(Color.decode(panelcolor));
        imagePanel.setLayout(null);

        ImageIcon gifIcon = new ImageIcon("src\\calculator.gif");
        JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(60, 60, gifIcon.getIconWidth(), gifIcon.getIconHeight());
        imagePanel.add(gifLabel);
        imagePanel.setBounds(100, 30, 600, 650);
        return imagePanel;
    }

    private JPanel createTextPanel() {
        JPanel imagePanel = new JPanel();
        imagePanel.setBackground(Color.decode(panelcolor));
        imagePanel.setLayout(null);
        imagePanel.setBounds(850, 30, 600, 650);

        ImageIcon gifIcon = new ImageIcon("src\\welcome-back.gif");
        JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(60, 150, gifIcon.getIconWidth(), gifIcon.getIconHeight());
        JLabel welcomLabel = new JLabel(welcomeLabelContent);
        welcomLabel.setFont(lFont);
        welcomLabel.setBounds(100, 550, 250, 30);
        imagePanel.add(welcomLabel);
        imagePanel.add(gifLabel);
        return imagePanel;
    }

    // Initializing converterPanels

    public JPanel converterPanel(String[] conversion) {
        // frame section
        converterPanel = new JPanel();
        converterPanel.setLayout(null);
        System.out.println("Panel created");
        converterPanel.setBounds(850, 30, 600, 650);
        converterPanel.setBackground(Color.decode(panelcolor));
        Border border = BorderFactory.createLineBorder(Color.decode("#FFD700"), 10);
        converterPanel.setBorder(border);
        // layer1
        fromLabel = new JLabel("From:");
        fromLabel.setBounds(from_x, layer1_y, 60, 30);
        fromLabel.setFont(listFont);
        converterPanel.add(fromLabel);

        toLabel = new JLabel("To:");
        toLabel.setBounds(to_x, layer1_y, 60, 30);
        toLabel.setFont(listFont);
        converterPanel.add(toLabel);
        // unit To be converted
        fromIndicator = new JLabel("None");
        fromIndicator.setBounds(from_x + 80, layer1_y, 120, 20);
        fromIndicator.setForeground(Color.RED);
        fromIndicator.setFont(listFont);
        converterPanel.add(fromIndicator);

        toIndicator = new JLabel("None");
        toIndicator.setBounds(to_x + 80, layer1_y, 120, 30);
        toIndicator.setFont(listFont);
        toIndicator.setForeground(Color.RED);
        converterPanel.add(toIndicator);

        // layer2

        fromConversionBox = new JComboBox<>(conversion);
        fromConversionBox.setBounds(from_x, layer2_y, 200, 30);
        fromConversionBox.setBackground(Color.decode(compBkColor2));
        fromConversionBox.setRenderer(new CustomComboBoxRenderer());
        // fromConversionBox.setFont(listFont);
        fromConversionBox.addItemListener(this);
        converterPanel.add(fromConversionBox);
        // To weight Conversion List
        toConversionBox = new JComboBox<>(conversion);
        toConversionBox.setBounds(from_x + 250, layer2_y, 200, 30);
        toConversionBox.setBackground(Color.decode(compBkColor2));
        toConversionBox.setRenderer(new CustomComboBoxRenderer());
        // toConversionBox.setFont(listFont);
        toConversionBox.addItemListener(this);
        converterPanel.add(toConversionBox);

        // layer3
        // input text fields
        fromInputField = new JTextField();
        fromInputField.setBounds(from_x + 20, layer3_y, 120, 30);
        fromInputField.setFont(listFont);

        toInputField = new JTextField();
        toInputField.setBounds(to_x + 20, layer3_y, 120, 30);
        toInputField.setFont(listFont);

        converterPanel.add(fromInputField);
        converterPanel.add(toInputField);
        // unit specifing
        fromUnit = new JLabel("UN");
        fromUnit.setBounds(from_x + 150, layer3_y, 20, 30);
        fromUnit.setForeground(Color.RED);
        fromUnit.setFont(listFont);

        toUnit = new JLabel("UN");
        toUnit.setBounds(to_x + 150, layer3_y, 20, 30);
        toUnit.setForeground(Color.RED);
        toUnit.setFont(listFont);

        converterPanel.add(fromUnit);
        converterPanel.add(toUnit);
        // layer4
        convertButton = new JButton("Convert");
        convertButton.setBounds(from_x + 170, layer4_y, 100, 30);
        // convertButton.setFont(listFont);
        convertButton.setBackground(Color.decode("#CCC8AA"));
        convertButton.setForeground(Color.decode("#232946"));
        converterPanel.add(convertButton);
        convertButton.addActionListener(this);

        JLabel welcomeLabel = new JLabel(welcomeLabelContent);
        welcomeLabel.setForeground(Color.BLACK);
        welcomeLabel.setBounds(from_x + 10, layer4_y + 100, 480, 30);

        welcomeLabel.setFont(lFont);
        converterPanel.add(welcomeLabel);
        return converterPanel;

    }

    public void actionPerformed(ActionEvent e) throws NumberFormatException {

        if (e.getSource() == weightConverter) {
            rightPanel.removeAll();
            frame.remove(rightPanel);
            rightPanel = converterPanel(weightIndicator);
            frame.add(rightPanel);
            frame.repaint();
            frame.revalidate();
            return;
        }
        if (e.getSource() == lengthConverter) {
            rightPanel.removeAll();
            frame.remove(rightPanel);
            rightPanel = converterPanel(lengthIndicator);
            frame.add(rightPanel);
            frame.repaint();
            frame.revalidate();
            return;
        }
        if (e.getSource() == liquidConverter) {
            rightPanel.removeAll();
            frame.remove(rightPanel);
            rightPanel = converterPanel(liquidIndicator);
            frame.add(rightPanel);
            frame.repaint();
            frame.revalidate();
            return;
        }
        frame.revalidate();
        frame.repaint();

        if (e.getSource() == convertButton) {

            String fromValue = fromInputField.getText();
            if (fromValue.matches("^[+-]?\\d*\\.?\\d+$")) {
                double toValue = calculate(Double.parseDouble(fromValue));
                toInputField.setText(String.valueOf(toValue));
            }
        }
    }

    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == fromConversionBox) {
            String selectedString = (String) fromConversionBox.getSelectedItem();
            for (String str : weightIndicator) {
                if (str.equals(selectedString)) {
                    fromIndicator.setText(str);
                    fromUnit.setText(weightIndicatorToUnit.get(selectedString));
                    return;
                }
            }
            for (String str : lengthIndicator) {
                if (str.equals(selectedString)) {
                    fromIndicator.setText(str);
                    fromUnit.setText(lengthIndicatorToUnit.get(selectedString));
                    return;
                }
            }
            for (String str : liquidIndicator) {
                if (str.equals(selectedString)) {
                    fromIndicator.setText(str);
                    fromUnit.setText(liquidIndicatorToUnit.get(selectedString));
                    return;
                }
            }
        }
        if (e.getSource() == toConversionBox) {
            String selectedString = (String) toConversionBox.getSelectedItem();
            for (String str : weightIndicator) {
                if (str.equals(selectedString)) {
                    toIndicator.setText(str);
                    toUnit.setText(weightIndicatorToUnit.get(selectedString));
                    return;
                }
            }
            for (String str : lengthIndicator) {
                if (str.equals(selectedString)) {
                    toIndicator.setText(str);
                    toUnit.setText(lengthIndicatorToUnit.get(selectedString));
                    return;
                }
            }
            for (String str : liquidIndicator) {
                if (str.equals(selectedString)) {
                    toIndicator.setText(str);
                    toUnit.setText(liquidIndicatorToUnit.get(selectedString));
                    return;
                }
            }
        }
    }

    private double calculate(double fromValue) {
        // "Kilogram", "Gram", "Milligram", "MetricTon", "LongTon", "ShortTon", "Pound",
        // "Ounce", "Carat"
        // kilogram to..
        if (fromIndicator.getText().equals(weightIndicator[0])) {
            if (toIndicator.getText().equals(weightIndicator[0])) {
                return converter.gramToKilogram(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[1])) {
                return converter.kilogramToGram(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[2])) {
                return converter.kilogramToMilligram(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[3])) {
                return converter.kilogramToMetricTon(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[4])) {
                return converter.kilogramToLongTon(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[5])) {
                return converter.kilogramToShortTon(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[6])) {
                return converter.kilogramToPound(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[7])) {
                return converter.kilogramToOunce(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[8])) {
                return converter.kilogramToCarat(fromValue);
            }
        }
        // gram to...
        if (fromIndicator.getText().equals(weightIndicator[1])) {
            if (toIndicator.getText().equals(weightIndicator[0])) {
                return converter.gramToKilogram(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[1])) {
                return converter.gramToGram(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[2])) {
                return converter.gramToMilligram(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[3])) {
                return converter.gramToMetricTon(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[4])) {
                return converter.gramToLongTon(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[5])) {
                return converter.gramToShortTon(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[6])) {
                return converter.gramToPound(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[7])) {
                return converter.gramToOunce(fromValue);
            }
            if (toIndicator.getText().equals(weightIndicator[8])) {
                return converter.gramToCarat(fromValue);
            }
        }
        // Millirgam to...
        if (fromIndicator.getText().equals(weightIndicator[2])) {
            if (toIndicator.getText().equals(weightIndicator[0])) {
                return fromValue * 0.000001;
            }
            if (toIndicator.getText().equals(weightIndicator[1])) {
                return fromValue * 0.001;
            }
            if (toIndicator.getText().equals(weightIndicator[2])) {
                return fromValue;
            }
            if (toIndicator.getText().equals(weightIndicator[3])) {
                return fromValue * 0.000000001;
            }
            if (toIndicator.getText().equals(weightIndicator[4])) {
                return fromValue * 1.96841e-9;
            }
            if (toIndicator.getText().equals(weightIndicator[5])) {
                return fromValue * 2.20462e-9;
            }
            if (toIndicator.getText().equals(weightIndicator[6])) {
                return fromValue * 0.00000220462;
            }
            if (toIndicator.getText().equals(weightIndicator[7])) {
                return fromValue * 0.00003527396;
            }
            if (toIndicator.getText().equals(weightIndicator[8])) {
                return fromValue * 0.0002;
            }
        }

        // Metric ton to...
        if (fromIndicator.getText().equals(weightIndicator[3])) {
            if (toIndicator.getText().equals(weightIndicator[0])) {
                return fromValue * 1000; // Metric Ton to Kilogram
            }
            if (toIndicator.getText().equals(weightIndicator[1])) {
                return fromValue * 1000000; // Metric Ton to Gram
            }
            if (toIndicator.getText().equals(weightIndicator[2])) {
                return fromValue * 1000000000; // Metric Ton to Milligram
            }
            if (toIndicator.getText().equals(weightIndicator[3])) {
                return fromValue; // Metric Ton to Metric Ton (no conversion)
            }
            if (toIndicator.getText().equals(weightIndicator[4])) {
                return fromValue * 0.000984207; // Metric Ton to Long Ton
            }
            if (toIndicator.getText().equals(weightIndicator[5])) {
                return fromValue * 0.00110231; // Metric Ton to Short Ton
            }
            if (toIndicator.getText().equals(weightIndicator[6])) {
                return fromValue * 2204.62; // Metric Ton to Pound
            }
            if (toIndicator.getText().equals(weightIndicator[7])) {
                return fromValue * 35273.96; // Metric Ton to Ounce
            }
            if (toIndicator.getText().equals(weightIndicator[8])) {
                return fromValue * 5000000; // Metric Ton to Carat
            }
        }
        // Longton to.....
        if (fromIndicator.getText().equals(weightIndicator[4])) {
            if (toIndicator.getText().equals(weightIndicator[0])) {
                return fromValue * 1016046.9088;
            }
            if (toIndicator.getText().equals(weightIndicator[1])) {
                return fromValue * 1016046908800.0;
            }
            if (toIndicator.getText().equals(weightIndicator[2])) {
                return fromValue * 1016046908800000.0;
            }
            if (toIndicator.getText().equals(weightIndicator[3])) {
                return fromValue * 1.016;
            }
            if (toIndicator.getText().equals(weightIndicator[4])) {
                return fromValue;
            }
            if (toIndicator.getText().equals(weightIndicator[5])) {
                return fromValue * 1.12;
            }
            if (toIndicator.getText().equals(weightIndicator[6])) {
                return fromValue * 2240;
            }
            if (toIndicator.getText().equals(weightIndicator[7])) {
                return fromValue * 35840;
            }
            if (toIndicator.getText().equals(weightIndicator[8])) {
                return fromValue * 16000000;
            }
        }
        // shortton to..
        if (fromIndicator.getText().equals(weightIndicator[5])) {
            if (toIndicator.getText().equals(weightIndicator[0])) {
                return fromValue * 907.185;
            }
            if (toIndicator.getText().equals(weightIndicator[1])) {
                return fromValue * 907185;
            }
            if (toIndicator.getText().equals(weightIndicator[2])) {
                return fromValue * 907185000;
            }
            if (toIndicator.getText().equals(weightIndicator[3])) {
                return fromValue * 0.892857;
            }
            if (toIndicator.getText().equals(weightIndicator[4])) {
                return fromValue * 0.907185;
            }
            if (toIndicator.getText().equals(weightIndicator[5])) {
                return fromValue;
            }
            if (toIndicator.getText().equals(weightIndicator[6])) {
                return fromValue * 2000;
            }
            if (toIndicator.getText().equals(weightIndicator[7])) {
                return fromValue * 32000;
            }
            if (toIndicator.getText().equals(weightIndicator[8])) {
                return fromValue * 14285714.29;
            }
        }
        // pound to....
        if (fromIndicator.getText().equals(weightIndicator[6])) {
            if (toIndicator.getText().equals(weightIndicator[0])) {
                return fromValue * 0.453592;
            }
            if (toIndicator.getText().equals(weightIndicator[1])) {
                return fromValue * 453.592;
            }
            if (toIndicator.getText().equals(weightIndicator[2])) {
                return fromValue * 453592;
            }
            if (toIndicator.getText().equals(weightIndicator[3])) {
                return fromValue * 0.000453592;
            }
            if (toIndicator.getText().equals(weightIndicator[4])) {
                return fromValue * 0.0005;
            }
            if (toIndicator.getText().equals(weightIndicator[5])) {
                return fromValue * 0.000446429;
            }
            if (toIndicator.getText().equals(weightIndicator[6])) {
                return fromValue;
            }
            if (toIndicator.getText().equals(weightIndicator[7])) {
                return fromValue * 16;
            }
            if (toIndicator.getText().equals(weightIndicator[8])) {
                return fromValue * 2267.96;
            }
        }
        // Ounce to..
        if (fromIndicator.getText().equals(weightIndicator[7])) {
            if (toIndicator.getText().equals(weightIndicator[0])) {
                return fromValue * 0.0283495;
            }
            if (toIndicator.getText().equals(weightIndicator[1])) {
                return fromValue * 28.3495;
            }
            if (toIndicator.getText().equals(weightIndicator[2])) {
                return fromValue * 28349.5;
            }
            if (toIndicator.getText().equals(weightIndicator[3])) {
                return fromValue * 0.0000283495;
            }
            if (toIndicator.getText().equals(weightIndicator[4])) {
                return fromValue * 0.00003125;
            }
            if (toIndicator.getText().equals(weightIndicator[5])) {
                return fromValue * 0.0000279018;
            }
            if (toIndicator.getText().equals(weightIndicator[6])) {
                return fromValue * 141.747;
            }
            if (toIndicator.getText().equals(weightIndicator[7])) {
                return fromValue;
            }
            if (toIndicator.getText().equals(weightIndicator[8])) {
                return fromValue * 0.0625;
            }
        }
        // Carat to..
        if (fromIndicator.getText().equals(weightIndicator[8])) {
            if (toIndicator.getText().equals(weightIndicator[0])) {
                return fromValue * 0.0002;
            }
            if (toIndicator.getText().equals(weightIndicator[1])) {
                return fromValue * 0.2;
            }
            if (toIndicator.getText().equals(weightIndicator[2])) {
                return fromValue * 200;
            }
            if (toIndicator.getText().equals(weightIndicator[3])) {
                return fromValue * 1.96841e-7;
            }
            if (toIndicator.getText().equals(weightIndicator[4])) {
                return fromValue * 2.20462e-7;
            }
            if (toIndicator.getText().equals(weightIndicator[5])) {
                return fromValue * 2e-7;
            }
            if (toIndicator.getText().equals(weightIndicator[6])) {
                return fromValue * 0.000440925;
            }
            if (toIndicator.getText().equals(weightIndicator[7])) {
                return fromValue * 0.007055;
            }
            if (toIndicator.getText().equals(weightIndicator[8])) {
                return fromValue;
            }
        }
        /*
         * length Indicators "Kilometre", "Metre", "Centimetre", "Micrometre", "Inch",
         * "Feet", "Yard"
         */
        // kilometre to
        if (lengthIndicator[0].equals(fromIndicator.getText())) {
            if (lengthIndicator[0].equals(toIndicator.getText())) {
                return fromValue;
            }
            if (lengthIndicator[1].equals(toIndicator.getText())) {
                return fromValue * 1000;
            }
            if (lengthIndicator[2].equals(toIndicator.getText())) {
                return fromValue * 100000;
            }
            if (lengthIndicator[3].equals(toIndicator.getText())) {
                return fromValue * 1000000000;
            }
            if (lengthIndicator[4].equals(toIndicator.getText())) {
                return fromValue * 39370.0787;
            }
            if (lengthIndicator[5].equals(toIndicator.getText())) {
                return fromValue * 3280.84;
            }
            if (lengthIndicator[6].equals(toIndicator.getText())) {
                return fromValue * 1093.61;
            }
        }
        // Metre to..
        if (lengthIndicator[1].equals(fromIndicator.getText())) {
            if (lengthIndicator[1].equals(toIndicator.getText())) {
                return fromValue;
            }
            if (lengthIndicator[0].equals(toIndicator.getText())) {
                return fromValue / 1000;
            }
            if (lengthIndicator[2].equals(toIndicator.getText())) {
                return fromValue * 100;
            }
            if (lengthIndicator[3].equals(toIndicator.getText())) {
                return fromValue * 1000;
            }
            if (lengthIndicator[4].equals(toIndicator.getText())) {
                return fromValue * 39.37;
            }
            if (lengthIndicator[5].equals(toIndicator.getText())) {
                return fromValue * 3.281;
            }
            if (lengthIndicator[6].equals(toIndicator.getText())) {
                return fromValue * 1.094;
            }
        }

        // Centimetre to..
        if (lengthIndicator[2].equals(fromIndicator.getText())) {
            if (lengthIndicator[1].equals(toIndicator.getText())) {
                return fromValue;
            } else if (lengthIndicator[0].equals(toIndicator.getText())) {
                return fromValue / 1000;
            } else if (lengthIndicator[2].equals(toIndicator.getText())) {
                return fromValue * 100;
            } else if (lengthIndicator[3].equals(toIndicator.getText())) {
                return fromValue * 1000;
            } else if (lengthIndicator[4].equals(toIndicator.getText())) {
                return fromValue * 39.37;
            } else if (lengthIndicator[5].equals(toIndicator.getText())) {
                return fromValue * 3.281;
            } else if (lengthIndicator[6].equals(toIndicator.getText())) {
                return fromValue * 1.094;
            }
        }
        // Micrometre to..
        if (lengthIndicator[3].equals(fromIndicator.getText())) {
            if (lengthIndicator[2].equals(toIndicator.getText())) {
                return fromValue;
            } else if (lengthIndicator[0].equals(toIndicator.getText())) {
                return fromValue / 1000000.0;
            } else if (lengthIndicator[1].equals(toIndicator.getText())) {
                return fromValue * 10000.0;
            } else if (lengthIndicator[3].equals(toIndicator.getText())) {
                return fromValue / 25400.0;
            } else if (lengthIndicator[4].equals(toIndicator.getText())) {
                return fromValue * 0.000003281;
            } else if (lengthIndicator[5].equals(toIndicator.getText())) {
                return fromValue * 0.000001094;
            }
        }
        // Inch to..
        if (lengthIndicator[4].equals(fromIndicator.getText())) {
            if (lengthIndicator[4].equals(toIndicator.getText())) {
                return fromValue;
            } else if (lengthIndicator[0].equals(toIndicator.getText())) {
                return fromValue * 0.0000254;
            } else if (lengthIndicator[1].equals(toIndicator.getText())) {
                return fromValue * 0.0254;
            } else if (lengthIndicator[2].equals(toIndicator.getText())) {
                return fromValue * 2.54;
            } else if (lengthIndicator[3].equals(toIndicator.getText())) {
                return fromValue * 25400;
            } else if (lengthIndicator[5].equals(toIndicator.getText())) {
                return fromValue / 12;
            } else if (lengthIndicator[6].equals(toIndicator.getText())) {
                return fromValue * 36;
            }
        }
        // Feet to..
        if (lengthIndicator[5].equals(fromIndicator.getText())) {
            if (lengthIndicator[5].equals(toIndicator.getText())) {
                return fromValue;
            } else if (lengthIndicator[0].equals(toIndicator.getText())) {
                return fromValue * 0.000304;
            } else if (lengthIndicator[1].equals(toIndicator.getText())) {
                return fromValue * 0.3048;
            } else if (lengthIndicator[2].equals(toIndicator.getText())) {
                return fromValue * 30.48;
            } else if (lengthIndicator[3].equals(toIndicator.getText())) {
                return fromValue * 304800;
            } else if (lengthIndicator[4].equals(toIndicator.getText())) {
                return fromValue / 12;
            } else if (lengthIndicator[6].equals(toIndicator.getText())) {
                return fromValue / 3;
            }
        }
        if (lengthIndicator[6].equals(fromIndicator.getText())) {
            if (lengthIndicator[6].equals(toIndicator.getText())) {
                return fromValue;
            } else if (lengthIndicator[0].equals(toIndicator.getText())) {
                return fromValue * 0.0009144;
            } else if (lengthIndicator[1].equals(toIndicator.getText())) {
                return fromValue * 9144;
            } else if (lengthIndicator[2].equals(toIndicator.getText())) {
                return fromValue * 91.44;
            } else if (lengthIndicator[3].equals(toIndicator.getText())) {
                return fromValue * 914400;
            } else if (lengthIndicator[4].equals(toIndicator.getText())) {
                return fromValue * 36;
            } else if (lengthIndicator[5].equals(toIndicator.getText())) {
                return fromValue * 3;
            }
        }
        /*
         * liquid to ... "Millilitre", "Litre", "Barrel", "peck", "Pointdry", "Quatdry"
         */
        // Millilitre to..
        if (liquidIndicator[0].equals(fromIndicator.getText())) {
            if (liquidIndicator[0].equals(toIndicator.getText())) {
                return fromValue;
            } else if (liquidIndicator[1].equals(toIndicator.getText())) {
                return fromValue / 1000;
            } else if (liquidIndicator[2].equals(toIndicator.getText())) {
                return fromValue / 158987.295;
            } else if (liquidIndicator[3].equals(toIndicator.getText())) {
                return fromValue / 908.082984;
            } else if (liquidIndicator[4].equals(toIndicator.getText())) {
                return fromValue / 14.646;
            } else if (liquidIndicator[5].equals(toIndicator.getText())) {
                return fromValue / 946.353;
            }
        }
        // litre to...
        if (liquidIndicator[1].equals(fromIndicator.getText())) {
            if (liquidIndicator[1].equals(toIndicator.getText())) {
                return fromValue;
            }
            if (liquidIndicator[0].equals(toIndicator.getText())) {
                return fromValue * 1000;
            }
            if (liquidIndicator[2].equals(toIndicator.getText())) {
                return fromValue * 0.00628981;
            }
            if (liquidIndicator[3].equals(toIndicator.getText())) {
                return fromValue * 1.10122095;
            }
            if (liquidIndicator[4].equals(toIndicator.getText())) {
                return fromValue * 68.2743419;
            }
            if (liquidIndicator[5].equals(toIndicator.getText())) {
                return fromValue * 1.05668821;
            }

        }
        // Barrel to..
        if (liquidIndicator[2].equals(fromIndicator.getText())) {
            if (liquidIndicator[2].equals(toIndicator.getText())) {
                return fromValue;
            }
            if (liquidIndicator[1].equals(toIndicator.getText())) {
                return fromValue / 158987.295;
            }
            if (liquidIndicator[0].equals(toIndicator.getText())) {
                return fromValue / 158.987295;
            }
            if (liquidIndicator[3].equals(toIndicator.getText())) {
                return fromValue / 289.139227;
            }
            if (liquidIndicator[4].equals(toIndicator.getText())) {
                return fromValue / 10368;
            }
            if (liquidIndicator[5].equals(toIndicator.getText())) {
                return fromValue / 2113.37642;
            }

        }
        // Peck to..
        if (liquidIndicator[3].equals(fromIndicator.getText())) {
            if (liquidIndicator[3].equals(toIndicator.getText())) {
                return fromValue;
            }
            if (liquidIndicator[1].equals(toIndicator.getText())) {
                return fromValue * 9.09218;
            }
            if (liquidIndicator[2].equals(toIndicator.getText())) {
                return fromValue * 9092.18;
            }
            if (liquidIndicator[0].equals(toIndicator.getText())) {
                return fromValue * 0.344792;
            }
            if (liquidIndicator[4].equals(toIndicator.getText())) {
                return fromValue * 327.368736;
            }
            if (liquidIndicator[5].equals(toIndicator.getText())) {
                return fromValue * 81.842184;
            }

        }
        // Pointdry to..
        if (liquidIndicator[4].equals(fromIndicator.getText())) {
            if (liquidIndicator[4].equals(toIndicator.getText())) {
                return fromValue;
            }
            if (liquidIndicator[3].equals(toIndicator.getText())) {
                return fromValue * 327.368736;
            }
            if (liquidIndicator[1].equals(toIndicator.getText())) {
                return fromValue / 36.3773242;
            }
            if (liquidIndicator[0].equals(toIndicator.getText())) {
                return fromValue / 0.0363773242;
            }
            if (liquidIndicator[2].equals(toIndicator.getText())) {
                return fromValue / 9525.5;
            }
            if (liquidIndicator[5].equals(toIndicator.getText())) {
                return fromValue / 4.8082;
            }
        }
        // Quatdry to..
        if (liquidIndicator[5].equals(fromIndicator.getText())) {
            if (liquidIndicator[5].equals(toIndicator.getText())) {
                return fromValue;
            }
            if (liquidIndicator[3].equals(toIndicator.getText())) {
                return fromValue / 4.8082;
            }
            if (liquidIndicator[1].equals(toIndicator.getText())) {
                return fromValue / 1.10122095;
            }
            if (liquidIndicator[0].equals(toIndicator.getText())) {
                return fromValue / 0.00110122095;
            }
            if (liquidIndicator[2].equals(toIndicator.getText())) {
                return fromValue / 84.131586;
            }
            if (liquidIndicator[4].equals(toIndicator.getText())) {
                return fromValue * 194.210514;
            }
            // Add more conversion cases here as needed
        }

        // Handle other unit conversions outside of the if block as needed

        return 0.0;

    }
}

class CustomComboBoxRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
            boolean cellHasFocus) {
        Component renderer = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        if (isSelected) {
            renderer.setBackground(Color.decode("#CCC8AA"));
            renderer.setForeground(Color.WHITE);
        } else {
            renderer.setBackground(Color.WHITE);
            renderer.setForeground(Color.BLACK);
        }
        return renderer;
    }
}
