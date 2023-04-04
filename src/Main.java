import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Bayern Munchen!");
        ImageIcon img;
        String lahm,rummenige,beckenbauer,robben,kahn;
        String players;
        String file = "c:/pictures/";
        lahm = "Филипп Лам";
        rummenige = "Карл Хайнц Румменигге";
        beckenbauer = "Франц Беккенбауэр";
        robben = "Арьен Роббен";
        kahn = "Оливер Кан";
        String lahmInfo = "защитник";
        players = JOptionPane.showInputDialog(null,"1)"+lahm +" \n"+ "2)"+rummenige +" \n"+ "3)"+beckenbauer +" \n"+ "4)"+robben +" \n"+  "5)"+kahn  + "\n Choose a player","Legendary Players FCB",JOptionPane.QUESTION_MESSAGE);
        if (players == null){
            JOptionPane.showMessageDialog(null,"you didn't choose a player");
            System.exit(0);
        } else if (players.equalsIgnoreCase(lahm)) {
            file += "lahm.JPG";
            players = lahm;
            System.out.println("Самобытный защитник, способный так же ярко сыграть в любой линии полузащиты.\n Тренер «Баварии» в начале двухтысячных годов  Герман Герланд стал первым наставником Филиппа и с тех пор считает,\n что талантливее игрока он не тренировал.\n В 2010 году Лам был избран капитаном мюнхенского клуба и был им до окончания карьеры игрока в 2017 году.\n Его просили задержаться ещё, но Филипп сказал, что в силу уже не очень важного здоровья не может тренироваться и играть в полную силу, а это – не в его принципах.\n Что ж, восемь побед в Бундеслиге и выигрыш лиги Чемпионов даёт ему полное право объективно оценивать свои силы и возможности.");
            
        }else if (players.equalsIgnoreCase(rummenige)) {
            file += "rumm.JPG";
            players = rummenige;

        }else if (players.equalsIgnoreCase(beckenbauer)) {
            file += "beck.JPG";
            players = beckenbauer;
        }else if (players.equalsIgnoreCase(robben)) {
            file += "robben.JPG";
            players = robben;
        }else if (players.equalsIgnoreCase(kahn)) {
            file += "kahn.JPG";
            players = kahn;

        }
        img = new ImageIcon(file);
        JOptionPane.showMessageDialog(null,img,players,JOptionPane.PLAIN_MESSAGE);


    }
}