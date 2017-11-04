public class MarsRover {

	// initial values
	private char facing = 'N';
	private int xPosition = 0;
	private int yPosition = 0;

	private int lastXPosition = 0;
	private int lastYPosition = 0;

	private int xSize;
	private int ySize;

	private int[][] obstacles;
	private int[][] obstaclesRemaining;

	public MarsRover(int xSize, int ySize, int[][] obstacles) {
		this.xSize = xSize;
		this.ySize = ySize;		
		this.obstacles = obstacles;	
		obstaclesRemaining = new int[obstacles.length][2];
		for(int i=0; i<obstacles.length; i++)
			obstaclesRemaining[i] = obstacles[i].clone();
	}	

	String move(String commandList){
		
		String obstacleString = "";

		for (int i=0; i<commandList.length();i++){
			char command = commandList.charAt(i);
			switch(command){
			case 'f':
				if (facing == 'N'){
					if(yPosition == ySize-1)
						yPosition = 0;
					else{yPosition++;}				
				}
				else if (facing == 'S'){
					if(yPosition == 0)
						yPosition = ySize-1;
					else{yPosition--;}				
				}
				else if (facing == 'E'){
					if(xPosition == xSize-1)
						xPosition = 0;
					else{xPosition++;}				
				}
				else if (facing == 'W'){
					if(xPosition == 0)
						xPosition = xSize-1;
					else{xPosition--;}				
				}
				break;
			case 'b':
				if (facing == 'N'){
					if(yPosition == 0)
						yPosition = ySize-1;
					else{yPosition--;}				
				}
				else if (facing == 'S'){
					if(yPosition == ySize-1)
						yPosition = 0;
					else{yPosition++;}				
				}
				else if (facing == 'E'){
					if(xPosition == 0)
						xPosition = xSize-1;
					else{xPosition--;}
				}
				else if (facing == 'W'){
					if(xPosition == xSize-1)
						xPosition = 0;
					else{xPosition++;}				
				}
				break;	
			case 'l':
				if (facing == 'N')
					facing = 'W';
				else if (facing == 'W')
					facing = 'S';
				else if (facing == 'S')
					facing = 'E';
				else if (facing == 'E')
					facing = 'N';
				break;	

			case 'r':
				if (facing == 'N')
					facing = 'E';	
				else if (facing == 'E')
					facing = 'S';	
				else if (facing == 'S')
					facing = 'W';
				else if (facing == 'W')
					facing = 'N';	
				break;
			}

			for(int o=0; o<obstacles.length;o++){ // Process obstacles
				boolean crash = false;
				if(!crash && obstacles[o][0] == xPosition && obstacles[o][1] == yPosition){					
					if(obstaclesRemaining[o][0] != -1){
						// adds obstacle to print
						obstacleString = obstacleString+"("+xPosition+","+yPosition+")"; 
						obstaclesRemaining[o][0] = -1;
					}	
					xPosition = lastXPosition;
					yPosition = lastYPosition;
					crash = true;					
				}
			}
			lastXPosition = xPosition;
			lastYPosition = yPosition;	
		}
		return "("+xPosition+","+yPosition+","+ Character.toString(facing)+")"+obstacleString;

	}

}
