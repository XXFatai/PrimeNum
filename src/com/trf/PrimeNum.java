
/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName：   PrimeNum
 * FileName: PrimeNum.java
 * Author:   润发
 * Date:     2013-1-25 下午6:31:59  
 * Version :
 * Description:判断一个数是否为素数。
 **********************************************************/
package com.trf;
import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Detemine det = new Detemine();
		
		System.out.print("输入数字：");
		det.dete(input.nextInt());
		input.close();
	}

}
class Detemine {
	public void dete(int n){
		int i = 2;
		//n = (int)Math.sqrt(n);
		//System.out.println(n+" "+i+" "+n%i);
			for(; i < n; i++){
				if((n % i) == 0) {
					System.out.println("不是素数");
					break;
				}
				else
					System.out.println("是素数");
			}
		}
	}