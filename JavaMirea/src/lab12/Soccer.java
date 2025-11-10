package lab12;

import javax.swing.*;

public class Soccer {
    static void main() {
        var frame = new JFrame("Soccer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1000, 400);
        frame.setLayout(null);

        final int[] milanScore = {0};
        final int[] madridScore = {0};
        var scoreText = "Result %d X %d";
        var lastScorerText = "Last Scorer: %s";
        var winnerText = "Winner: %s";


        var milan = new JButton("AC Milan");
        milan.setSize(100, 100);
        milan.setLocation(0, 275);
        frame.getContentPane().add(milan);

        var madrid = new JButton("Real\nMadrid");
        madrid.setSize(100, 100);
        madrid.setLocation(900, 275);
        frame.getContentPane().add(madrid);

        var result = new JLabel(String.format(scoreText, 0, 0));
        result.setSize(200, 100);
        result.setLocation(100, 0);
        frame.getContentPane().add(result);

        var lastScorer = new JLabel(String.format(lastScorerText, "N/A"));
        lastScorer.setSize(200, 100);
        lastScorer.setLocation(450, 0);
        frame.getContentPane().add(lastScorer);

        var winner = new JLabel(String.format(winnerText, "DRAW"));
        winner.setSize(200, 100);
        winner.setLocation(800, 0);
        frame.getContentPane().add(winner);

        var ball = new ImageIcon("C:\\Users\\Enego\\Desktop\\Джава\\Мяч.png");
        var image = new JLabel(ball);
        image.setSize(75, 75);
        image.setLocation(12, 190); // Под AC MILAN
        image.setLocation(905, 190); // Под Real Madrid
        frame.getContentPane().add(image);

        milan.addActionListener(e -> {
            milanScore[0]++;
            result.setText(String.format(scoreText, milanScore[0], madridScore[0]));
            lastScorer.setText(String.format(lastScorerText, "AC Milan"));
            updateWinner(winner, milanScore[0], madridScore[0]);
            if(image.getX() != 12)
                updateBallPosition(image, false);
        });
        madrid.addActionListener(e -> {
            madridScore[0]++;
            result.setText(String.format(scoreText, milanScore[0], madridScore[0]));
            lastScorer.setText(String.format(lastScorerText, "Real Madrid"));
            updateWinner(winner, milanScore[0], madridScore[0]);
            if(image.getX() != 905)
                updateBallPosition(image, true);
        });

        frame.setVisible(true);
    }

    private static void updateWinner(JLabel winner, int milanScore, int madridScore) {
        if (milanScore > madridScore) {
            winner.setText(String.format("Winner: AC Milan"));
        } else if (milanScore < madridScore) {
            winner.setText(String.format("Winner: Real Madrid"));
        } else {
            winner.setText(String.format("Winner: DRAW"));
        }
    }

    private static void updateBallPosition(JLabel ball, boolean toMadrid){
        var thread = new Thread(() -> {
            int start = 12;
            int end = 905;

            if (!toMadrid){
                start = 905;
                end = 12;
            }

            int steps = 50;
            double stepX = (end - start) / (double) steps;

            for (int i = 0; i <= steps; i++) {
                try {
                    int x = start + (int) (stepX * i);
                    ball.setLocation(x, 190);
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    IO.println("ашипка");
                }
            }
            ball.setLocation(end, 190);
        });
        thread.start();
    }


}
