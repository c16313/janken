/**
 *
 * @author c16313
 */

import java.util.Random;

public class ComputerPlayer extends Player{
        
        private Random rnd = new Random();
        
        /**
         * コンピューターの出す手
         */
        int hand;
        
        /**
         * コンストラクタ 
         */
        public ComputerPlayer(){
                // なし
        }
        
        public int play(){
                hand = rnd.nextInt(3);
                
                return hand;
        }
}
