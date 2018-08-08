/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.cartao;

import static java.awt.event.KeyEvent.VK_0;
import static java.awt.event.KeyEvent.VK_1;
import static java.awt.event.KeyEvent.VK_2;
import static java.awt.event.KeyEvent.VK_3;
import static java.awt.event.KeyEvent.VK_4;
import static java.awt.event.KeyEvent.VK_5;
import static java.awt.event.KeyEvent.VK_6;
import static java.awt.event.KeyEvent.VK_7;
import static java.awt.event.KeyEvent.VK_8;
import static java.awt.event.KeyEvent.VK_9;
import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_ALT;
import static java.awt.event.KeyEvent.VK_AMPERSAND;
import static java.awt.event.KeyEvent.VK_ASTERISK;
import static java.awt.event.KeyEvent.VK_AT;
import static java.awt.event.KeyEvent.VK_B;
import static java.awt.event.KeyEvent.VK_BACK_QUOTE;
import static java.awt.event.KeyEvent.VK_BACK_SLASH;
import static java.awt.event.KeyEvent.VK_C;
import static java.awt.event.KeyEvent.VK_CIRCUMFLEX;
import static java.awt.event.KeyEvent.VK_CLOSE_BRACKET;
import static java.awt.event.KeyEvent.VK_COLON;
import static java.awt.event.KeyEvent.VK_COMMA;
import static java.awt.event.KeyEvent.VK_CONTROL;
import static java.awt.event.KeyEvent.VK_D;
import static java.awt.event.KeyEvent.VK_DOLLAR;
import static java.awt.event.KeyEvent.VK_E;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.awt.event.KeyEvent.VK_EQUALS;
import static java.awt.event.KeyEvent.VK_EXCLAMATION_MARK;
import static java.awt.event.KeyEvent.VK_F;
import static java.awt.event.KeyEvent.VK_G;
import static java.awt.event.KeyEvent.VK_H;
import static java.awt.event.KeyEvent.VK_I;
import static java.awt.event.KeyEvent.VK_J;
import static java.awt.event.KeyEvent.VK_K;
import static java.awt.event.KeyEvent.VK_L;
import static java.awt.event.KeyEvent.VK_LEFT_PARENTHESIS;
import static java.awt.event.KeyEvent.VK_M;
import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_N;
import static java.awt.event.KeyEvent.VK_NUMBER_SIGN;
import static java.awt.event.KeyEvent.VK_O;
import static java.awt.event.KeyEvent.VK_OPEN_BRACKET;
import static java.awt.event.KeyEvent.VK_P;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_PLUS;
import static java.awt.event.KeyEvent.VK_Q;
import static java.awt.event.KeyEvent.VK_QUOTE;
import static java.awt.event.KeyEvent.VK_QUOTEDBL;
import static java.awt.event.KeyEvent.VK_R;
import static java.awt.event.KeyEvent.VK_RIGHT_PARENTHESIS;
import static java.awt.event.KeyEvent.VK_S;
import static java.awt.event.KeyEvent.VK_SEMICOLON;
import static java.awt.event.KeyEvent.VK_SHIFT;
import static java.awt.event.KeyEvent.VK_SLASH;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_T;
import static java.awt.event.KeyEvent.VK_TAB;
import static java.awt.event.KeyEvent.VK_U;
import static java.awt.event.KeyEvent.VK_UNDERSCORE;
import static java.awt.event.KeyEvent.VK_V;
import static java.awt.event.KeyEvent.VK_W;
import static java.awt.event.KeyEvent.VK_X;
import static java.awt.event.KeyEvent.VK_Y;
import static java.awt.event.KeyEvent.VK_Z;

import java.awt.AWTException;
import java.awt.Robot;

/**
 *
 * @author eder.crespo
 */
public class Robo extends Robot {

	public Robo() throws AWTException {
		super();
	}

	public void digita(CharSequence characters) {
		int length = characters.length();
		for (int i = 0; i < length; i++) {
			char character = characters.charAt(i);
			mapeia(character);
		}
	}

	private void mapeia(char character) {
		switch (character) {
			case 'a':
				digita(VK_A);
				break;
			case 'b':
				digita(VK_B);
				break;
			case 'c':
				digita(VK_C);
				break;
			case 'd':
				digita(VK_D);
				break;
			case 'e':
				digita(VK_E);
				break;
			case 'f':
				digita(VK_F);
				break;
			case 'g':
				digita(VK_G);
				break;
			case 'h':
				digita(VK_H);
				break;
			case 'i':
				digita(VK_I);
				break;
			case 'j':
				digita(VK_J);
				break;
			case 'k':
				digita(VK_K);
				break;
			case 'l':
				digita(VK_L);
				break;
			case 'm':
				digita(VK_M);
				break;
			case 'n':
				digita(VK_N);
				break;
			case 'o':
				digita(VK_O);
				break;
			case 'p':
				digita(VK_P);
				break;
			case 'q':
				digita(VK_Q);
				break;
			case 'r':
				digita(VK_R);
				break;
			case 's':
				digita(VK_S);
				break;
			case 't':
				digita(VK_T);
				break;
			case 'u':
				digita(VK_U);
				break;
			case 'v':
				digita(VK_V);
				break;
			case 'w':
				digita(VK_W);
				break;
			case 'x':
				digita(VK_X);
				break;
			case 'y':
				digita(VK_Y);
				break;
			case 'z':
				digita(VK_Z);
				break;
			case 'A':
				digita(VK_SHIFT, VK_A);
				break;
			case 'B':
				digita(VK_SHIFT, VK_B);
				break;
			case 'C':
				digita(VK_SHIFT, VK_C);
				break;
			case 'D':
				digita(VK_SHIFT, VK_D);
				break;
			case 'E':
				digita(VK_SHIFT, VK_E);
				break;
			case 'F':
				digita(VK_SHIFT, VK_F);
				break;
			case 'G':
				digita(VK_SHIFT, VK_G);
				break;
			case 'H':
				digita(VK_SHIFT, VK_H);
				break;
			case 'I':
				digita(VK_SHIFT, VK_I);
				break;
			case 'J':
				digita(VK_SHIFT, VK_J);
				break;
			case 'K':
				digita(VK_SHIFT, VK_K);
				break;
			case 'L':
				digita(VK_SHIFT, VK_L);
				break;
			case 'M':
				digita(VK_SHIFT, VK_M);
				break;
			case 'N':
				digita(VK_SHIFT, VK_N);
				break;
			case 'O':
				digita(VK_SHIFT, VK_O);
				break;
			case 'P':
				digita(VK_SHIFT, VK_P);
				break;
			case 'Q':
				digita(VK_SHIFT, VK_Q);
				break;
			case 'R':
				digita(VK_SHIFT, VK_R);
				break;
			case 'S':
				digita(VK_SHIFT, VK_S);
				break;
			case 'T':
				digita(VK_SHIFT, VK_T);
				break;
			case 'U':
				digita(VK_SHIFT, VK_U);
				break;
			case 'V':
				digita(VK_SHIFT, VK_V);
				break;
			case 'W':
				digita(VK_SHIFT, VK_W);
				break;
			case 'X':
				digita(VK_SHIFT, VK_X);
				break;
			case 'Y':
				digita(VK_SHIFT, VK_Y);
				break;
			case 'Z':
				digita(VK_SHIFT, VK_Z);
				break;
			case '`':
				digita(VK_BACK_QUOTE);
				break;
			case '0':
				digita(VK_0);
				break;
			case '1':
				digita(VK_1);
				break;
			case '2':
				digita(VK_2);
				break;
			case '3':
				digita(VK_3);
				break;
			case '4':
				digita(VK_4);
				break;
			case '5':
				digita(VK_5);
				break;
			case '6':
				digita(VK_6);
				break;
			case '7':
				digita(VK_7);
				break;
			case '8':
				digita(VK_8);
				break;
			case '9':
				digita(VK_9);
				break;
			case '-':
				digita(VK_MINUS);
				break;
			case '=':
				digita(VK_EQUALS);
				break;
			case '~':
				digita(VK_SHIFT, VK_BACK_QUOTE);
				break;
			case '!':
				digita(VK_EXCLAMATION_MARK);
				break;
			case '@':
				digita(VK_AT);
				break;
			case '#':
				digita(VK_NUMBER_SIGN);
				break;
			case '$':
				digita(VK_DOLLAR);
				break;
			case '%':
				digita(VK_SHIFT, VK_5);
				break;
			case '^':
				digita(VK_CIRCUMFLEX);
				break;
			case '&':
				digita(VK_AMPERSAND);
				break;
			case '*':
				digita(VK_ASTERISK);
				break;
			case '(':
				digita(VK_LEFT_PARENTHESIS);
				break;
			case ')':
				digita(VK_RIGHT_PARENTHESIS);
				break;
			case '_':
				digita(VK_UNDERSCORE);
				break;
			case '+':
				digita(VK_PLUS);
				break;
			case '\t':
				digita(VK_TAB);
				break;
			case '\n':
				digita(VK_ENTER);
				break;
			case '[':
				digita(VK_OPEN_BRACKET);
				break;
			case ']':
				digita(VK_CLOSE_BRACKET);
				break;
			case '\\':
				digita(VK_BACK_SLASH);
				break;
			case '{':
				digita(VK_SHIFT, VK_OPEN_BRACKET);
				break;
			case '}':
				digita(VK_SHIFT, VK_CLOSE_BRACKET);
				break;
			case '|':
				digita(VK_SHIFT, VK_BACK_SLASH);
				break;
			case ';':
				digita(VK_SEMICOLON);
				break;
			case ':':
				digita(VK_COLON);
				break;
			case '\'':
				digita(VK_QUOTE);
				break;
			case '"':
				digita(VK_QUOTEDBL);
				break;
			case ',':
				digita(VK_COMMA);
				break;
			case '<':
				digita(VK_SHIFT, VK_COMMA);
				break;
			case '.':
				digita(VK_PERIOD);
				break;
			case '>':
				digita(VK_SHIFT, VK_PERIOD);
				break;
			case '/':
				digita(VK_SLASH);
				break;
			case '?':
				digita(VK_SHIFT, VK_SLASH);
				break;
			case ' ':
				digita(VK_SPACE);
				break;
			default:
				throw new IllegalArgumentException("Cannot type character " + character);
		}
	}

	private void digita(int... keyCodes) {
		digita(keyCodes, 0, keyCodes.length);
	}

	private void digita(int[] keyCodes, int offset, int length) {
		if (length == 0) {
			return;
		}

		keyPress(keyCodes[offset]);
		digita(keyCodes, offset + 1, length - 1);
		keyRelease(keyCodes[offset]);
	}

	public void digitaInterrogacao() {
		keyPress(VK_CONTROL);
		keyPress(VK_ALT);
		keyPress(VK_W);

		keyRelease(VK_CONTROL);
		keyRelease(VK_ALT);
		keyRelease(VK_W);
	}
}
