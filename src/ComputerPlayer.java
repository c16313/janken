/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
