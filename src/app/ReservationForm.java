package app;
import java.util.Properties;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Vector;


public class ReservationForm {
    public static void main(String[] args){
        // フレーム作成
        JFrame frame = new JFrame("予約フォーム");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        // パネル作成
        JPanel panel = new JPanel();
        frame.add(panel);

        // コンポーネント追加
        panel.add(new JLabel("名前"));
        panel.add(new JTextField(20));
        // panel.add(new JComboBox<>(new String[]{"M","F"}));
        JRadioButton maleButton = new JRadioButton("男性");
        JRadioButton femaleButton = new JRadioButton("女性");
        // 性別ラジオボタンをグループ化
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        panel.add(maleButton);
        panel.add(femaleButton);
        // 診療科目の選択

        // 問診入力
        JTextField syusoField = new JTextField(25);
        panel.add(syusoField);
        // 日付選択
        ArrayList<String> years = new ArrayList<>();
        ArrayList<String> months = new ArrayList<>();
        ArrayList<String> days = new ArrayList<>();
        for (int i = 2025; i < 2030; i++){
            years.add(String.valueOf(i));
        }
        for (int i = 1; i < 12; i++){
            months.add(String.valueOf(i));
        }
        for (int i = 1; i < 32; i++){
            days.add(String.valueOf(i));
        }
        JComboBox<String> yearBox = new JComboBox<>(new Vector<>(years));
        JComboBox<String> monthBox = new JComboBox<>(new Vector<>(months));
        JComboBox<String> dayBox = new JComboBox<>(new Vector<>(days));

        panel.add(new JLabel("予約日:"));
        panel.add(yearBox);
        panel.add(new JLabel("年"));
        panel.add(monthBox);
        panel.add(new JLabel("月"));
        panel.add(dayBox);
        panel.add(new JLabel("日"));

        frame.setVisible(true);
    }
}
