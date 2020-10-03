// https://practice.geeksforgeeks.org/problems/betting-game/0

import java.util.*;
import java.lang.*;
import java.io.*;

class Betting {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int amt = 4;

		int nextBet = 1;

		for(int i = 0; i<str.length(); i++) {
			if(nextBet > amt) {
				amt = -1;
				break;
			}

			switch(str.charAt(i)){
				case 'W':
					amt +=nextBet;
					nextBet = 1;
					break;
				case 'L':
					amt -=nextBet;
					nextBet *= 2;
					break;
				default:
					break;
			}
		}

		System.out.println(amt);
	}
}

