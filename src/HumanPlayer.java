/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16313
 */

import java.util.Scanner;

public class HumanPlayer extends Player {
        
        private Scanner stdIn = new Scanner(System.in);
        
        /**
         * 自分の出す手を格納する変数
         */
        private int hand;
        
        /**
         * コンストラクタ
         */
        public HumanPlayer(){
                // なし
        }
        
        public int play(){
                System.out.println("あなたはどの手をだしますか？\n");
                System.out.println("グー（０）/ チョキ（１）/ パー（２）");
                hand = stdIn.nextInt();
                
                return hand;
        }
        
}
