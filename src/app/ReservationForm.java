package app;
import javax.swing.*;

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
        panel.add(new JComboBox<>(new String[]{"M","F"}));
        frame.setVisible(true);
    }
}
