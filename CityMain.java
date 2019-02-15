package cmpe343hw3;
//--------------------------------------------------------------------
//Title: City Main
//Author: Egemen OZDAG
//ID: 47755722122
//Section: 1
//Assignment: 3
//Description: This class shows cities.
//--------------------------------------------------------------------

import java.util.Scanner;

import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.In;

public class CityMain {

	public static void main(String[] args) {
		String[] City = null;
		Scanner scanner = new Scanner(System.in);
		In  in = new In("cities.txt");
		EdgeWeightedGraph gr = new EdgeWeightedGraph(in);
		int i=0;
		String[] temp = in.readLine().split(" ");
		int vertex	=  Integer.parseInt(temp [0]);
		int edges	= Integer.parseInt(temp [1]);
		for(i=1; i<82; i++ ) {
			String t = in.readLine();
			City[i]= t;
		}
		
		
		System.out.println("First city:");
		String s1 = scanner.next();
		System.out.println("Second city:");
		String s2 = scanner.next();
		
		
		
		
		
	}

}
