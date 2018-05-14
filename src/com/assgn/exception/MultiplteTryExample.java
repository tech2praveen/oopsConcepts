package com.assgn.exception;

import java.util.InputMismatchException;

public class MultiplteTryExample {
	public static void main(String[] args) {
		try {
			System.out.println("Outer try block");
			try {
				System.out.println("Inner try block");
				int res = 5 / 0;
			} catch (InputMismatchException e) {
				System.out.println("InputMismatchException caught");
			} finally {
				System.out.println("Inner finally");
			}
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught");
		} finally {
			System.out.println("Outer finally");
		}
	}
}
