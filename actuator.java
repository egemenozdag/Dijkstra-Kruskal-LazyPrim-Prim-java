package cmpe343hw3;
//--------------------------------------------------------------------
//Title: Actuator
//Author: Egemen OZDAG
//ID: 47755722122
//Section: 1
//Assignment: 3
//Description: This class actuating Prim and Kruskal's algorithms and compare them.
//--------------------------------------------------------------------
import edu.princeton.cs.algs4.Edge;
import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class actuator {

	public static void main(String[] args) {
		//Taking Graph
		In in = new In("input2.txt");
        EdgeWeightedGraph G = new EdgeWeightedGraph(in);
        //Starting timer and looking kruskals time spending.
        long startTime = System.currentTimeMillis(); 
        KruskalMST kst = new KruskalMST(G);
        for (Edge e : kst.edges()) {
            StdOut.println(e);
        }
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime; 
        double kruskal = (double)estimatedTime/1000;
        //Calculating time as a second.
        StdOut.println("-----------------------------------------------------------------------------");
        
        long start2Time = System.currentTimeMillis(); 
        //Starting timer and looking prims time spending.
        PrimMST mst = new PrimMST(G);
        for (Edge e : mst.edges()) {
            StdOut.println(e);
        }
        long end2Time = System.currentTimeMillis();
        long estimated2Time = end2Time - start2Time; 
        double prim = (double)estimated2Time/1000;
        //Calculating time as a second.

        StdOut.println("-----------------------------------------------------------------------------");
        
        long start3Time = System.currentTimeMillis(); 
        //Starting timer and looking LAZYprims time spending.
        LazyPrimMST Lazymst = new LazyPrimMST(G);
        for (Edge e : Lazymst.edges()) {
            StdOut.println(e);
        }
        long end3Time = System.currentTimeMillis();
        long estimated3Time = end3Time - start3Time; 
        double LAZYprim = (double)estimated3Time/1000;
        //Calculating time as a second.

        StdOut.println("-----------------------------------------------------------------------------");
        
        
        //Writing Seconds and I will compare them in my report
		System.out.println("krulskal :" + kruskal);
		System.out.println("prim :" + prim);
		System.out.println("Lazy Prim :" + LAZYprim);
		
	}

}
