/**
 *
 * @author c16313
 */
import java.util.Scanner;

public class JankenTester {
        public static void main(String[] args){
                Scanner stdIn = new Scanner(System.in);
                
                HumanPlayer you = new HumanPlayer();
                ComputerPlayer cpu = new ComputerPlayer();
                
                // HumanPlayer側 の　勝ち(2)、負け(1)、引き分け(0)を格納する変数
                int result;
                
                int retry = 0;
                
                do{
                        result = (you.play() - cpu.play() + 3)%3;

                        if(result == 2)
                                System.out.println("あなたの勝ちです。\n");
                        else if(result == 1)
                                System.out.println("あなたの負けです。\n");
                        else
                                System.out.println("引き分けです。");
                        
                        System.out.println("Continue?   yes(1)/no(0)\n");
                        retry = stdIn.nextInt();
                        
                }while(retry == 1);
        }
}
