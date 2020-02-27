import java.util.Scanner;
public class Maze {
	
	private Scanner s1 = new Scanner(System.in);
	
	
	public static String [][] maze = new String[][] {
				{
					"X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","  ","  ","  ","  ","  ","  ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","  ","X ","X ","X ","X ","  ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","  ","  ","X ","X ","X ","  ","  ","  ","  ","  ","  ","  ","  ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","X ","X ","X ","X ","X ","  ","X ","X ","X ","X ","X ","X ","  ","X ","X ","X "
				},
				{
					"X ","X ","X ","  ","  ","  ","X ","X ","X ","  ","X ","X ","X ","X ","X ","X ","  ","X ","X ","X "
				},
				{
					"X ","X ","X ","  ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","  ","X ","X ","X "
				},
				{
					"X ","X ","X ","  ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","  ","X ","X ","X "
				},
				{
					"* ","  ","  ","  ","  ","  ","  ","X ","X ","X ","X ","X ","X ","X ","X ","X ","  ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","X ","X ","  ","X ","X ","X ","X ","X ","X ","X ","X ","X ","  ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","X ","X ","  ","  ","  ","  ","  ","  ","X ","X ","X ","X ","  ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","  ","X ","X ","X ","X ","  ","X ","X ","X "
				},
				{
					"X ","X ","X ","  ","X ","X ","X ","X ","X ","X ","X ","  ","X ","X ","  ","  ","  ","X ","X ","X "
				},
				{
					"X ","X ","X ","  ","X ","X ","X ","X ","  ","  ","  ","  ","X ","X ","  ","X ","X ","X ","X ","X "
				},
				{
					"X ","X ","X ","  ","  ","  ","  ","  ","  ","X ","X ","X ","X ","X ","  ","X ","X ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","X ","X ","X ","X ","  ","X ","X ","X ","X ","X ","  ","X ","X ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","X ","  ","X ","X ","  ","  ","  ","  ","  ","  ","  ","X ","X ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","X ","  ","X ","X ","  ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","X ","  ","  ","  ","  ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X "
				},
				{
					"X ","X ","X ","X ","X ","X ","X ","X ","@ ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X ","X "
				}
		};
		
	public static void main(String[] args) {
		Maze game = new Maze();
		game.move();
	}
	
	int row = 19;
	int col = 8;
	
	public void move()
	{
		if (row != 8 || col != 1)
		{
			for (int i = 0; i<20; i++)
			{
				for (int z = 0; z<20; z++)
				{
					System.out.print(maze[i][z]);
				}
				System.out.println();
			}
			
			System.out.println();
			
			System.out.println("Where would you like to move? Enter \"q\" to exit the game.");
			
			String step = s1.nextLine();
			
			if (step.equalsIgnoreCase("w"))
			{
				if(maze[row-1][col] == "  ")
				{
					maze[row][col]="  ";
					row--;
					maze[row][col]= "@ ";
					
				} else
				{
					System.out.println();
					System.out.println("Be careful, you just ran into a wall!");
					move();
				}
				
				move();
				
			} else if (step.equalsIgnoreCase("d"))
			{
				if(maze[row][col+1] == "  ")
				{
					maze[row][col]="  ";
					col++;
					maze[row][col]= "@ ";
					
				} else 
				{
					System.out.println();
					System.out.println("Be careful, you just ran into a wall!");
					move();
				}
				for (int i = 0; i<20; i++)
				{
					for (int z = 0; z<20; z++)
					{
						System.out.print(maze[i][z]);
					}
					System.out.println();
				}
				
				System.out.println();
				
				move();
				
			} else if (step.equalsIgnoreCase("s"))
			{
				if(row<19 && maze[row+1][col]=="  ")
				{
					maze[row][col]="  ";
					row++;
					maze[row][col]= "@ ";
					
				} else 
				{
					System.out.println();
					System.out.println("Be careful, you just ran into a wall!");
					move();
				}
				
				move();
				
			} else if (step.equalsIgnoreCase("a"))
			{
				if(maze[row][col-1] == "  ")
				{
					maze[row][col]="  ";
					col--;
					maze[row][col]= "@ ";
					
				} else 
				{
					System.out.println();
					System.out.println("Be careful, you just ran into a wall!");
					move();
				}
				
				move();
				
			} else if (step.equalsIgnoreCase("q"))
			{
				
			} else
			{
				System.out.println("Use \"W\", \"S\", \"A\", and \"D\" to move in the maze.");
				System.out.println();
				move();
			}
		} else
		{
			for (int i = 0; i<20; i++)
			{
				for (int z = 0; z<20; z++)
				{
					System.out.print(maze[i][z]);
				}
				System.out.println();
			}
			
			System.out.println("You win!");
		}
	}
}
