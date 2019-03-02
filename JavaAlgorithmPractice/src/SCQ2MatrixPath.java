import java.util.LinkedList;
import java.util.Queue;

public class SCQ2MatrixPath {

	/*
	 * 
	 * Given a MxN matrix where each element can either be 0 or 1. 
	 * We need to find the shortest path between a given source cell to a destination cell.  
	 * {1,0,1,1,1,1,0,1}
	 * {0,0,0,1,1,1,1,1}
	 * {1,0,1,1,1,0,0,0}
	 * {1,0,0,0,1,0,0,1}
	 * {0,0,0,1,0,1,0,1}
	 */
	int[][] matrix = {
			 {1,0,1,1,1,1,0,1},
			  {0,0,0,1,1,1,1,1},
			  {1,0,1,1,1,0,0,0},
			  {1,0,0,0,1,0,0,1},
			  {0,0,0,1,0,1,0,1}
				};
	public SCQ2MatrixPath() {

		Queue<Point> que = new LinkedList<Point>() ;
		que.add(new Point(0,0));
		System.out.println(shortestPath(que,new Point(4,4)));
	}



	public int shortestPath(Queue<Point>que, Point des){	
		int path = 0;
		Queue<Point> temp =  new LinkedList<Point>();
		while(!que.isEmpty()){

			path++;
			
				for(Point x : que){
					if(x.xPos==des.xPos && x.yPos == des.yPos){
						que.removeAll(que);
						temp.removeAll(temp);
					}
					else{
						temp.addAll(x.nextSteps(x, matrix.length, matrix[1].length));
					
						x.printQueue(que);
					}
				
				}

				que.removeAll(que);
				que.addAll(temp);
		}
		
		return path;
	}
}

class Point{
	int xPos, yPos;
	public Point(int posx, int  posy){
		this.xPos = posx;
		this.yPos = posy;
	}
	
	public Queue<Point>nextSteps(Point currentPoint, int windowX, int windowY){
		Queue<Point> steps =  new LinkedList<Point>();
		if(withinWindow(currentPoint.xPos+1, windowX) )
		{
			steps.add(new Point(currentPoint.xPos + 1, currentPoint.yPos));
		}
		if(withinWindow(currentPoint.yPos+1, windowY) )
		{
			steps.add(new Point(currentPoint.xPos, currentPoint.yPos + 1));
		}
		if(withinWindow(currentPoint.xPos+1, windowX) && withinWindow(currentPoint.yPos+1, windowY) )
		{
			steps.add(new Point(currentPoint.xPos + 1, currentPoint.yPos + 1));
		}
	
		return steps;
	}
	public void printQueue(Queue<Point> q){
		for(Point x: q){
			System.out.print("("+x.xPos+","+x.yPos+") ");
		}
		System.out.println();
	}
	public boolean withinWindow(int z, int windowZ){
		
		if(z>=0 && z< windowZ){
			return true;
		}
		else{
			return false;	
		}
		}
	}

