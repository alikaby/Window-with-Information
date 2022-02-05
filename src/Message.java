import javax.swing.*;

public class Message {

    public static void main(String[] args) {

        String name = "Иванова Мария";
        int age = 30;
        String experience = "Нет опыта";
        String stack = "Java, SQL, Python";


        String text = "Тестировщица: "+ name;
        text = text +"\n"+"Возраст: "+ age + " лет";
        text = text + '\n'+ "Опыт работы: " + experience;
        text = text + '\n'+ "Стек технологий: " + stack;

        JOptionPane.showMessageDialog(null,text);

    }
}
