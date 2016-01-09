package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;

	public BowlingGame(){}

	public void addFrame(Frame frame){
		frames.add(frame);
	}

	public void setBonus(Frame bonusFrame) {
		bonus = bonusFrame;
	}

	public int score(){
		int scoreAc = 0;
		for (int i=0; i<frames.size();i++){
			int currentFirstThrow = frames.get(i).getFirstThrow();
			int currentSecondThrow = frames.get(i).getSecondThrow();
			scoreAc += currentFirstThrow;
			scoreAc += currentSecondThrow;
			if(currentFirstThrow == 10){
				// strike
				if(i == 9){
					// last frame strike
					scoreAc += bonus.getFirstThrow();
					scoreAc += bonus.getSecondThrow();
				}
				else if(i == 8){
					scoreAc += frames.get(i+1).getFirstThrow();
					scoreAc += frames.get(i+1).getSecondThrow();
					if(frames.get(i+1).getFirstThrow() == 10){
						scoreAc += bonus.getFirstThrow();
					}
				}
				else{
					scoreAc += frames.get(i+1).getFirstThrow();
					scoreAc += frames.get(i+1).getSecondThrow();
					if(frames.get(i+1).getFirstThrow() == 10){
						scoreAc += frames.get(i+2).getFirstThrow();
					}
				}
			}	
			else if(currentFirstThrow + currentSecondThrow == 10){
				// spare
				if(i == 9){
					// last frame spare
					scoreAc += bonus.getFirstThrow();
				}
				else{
					scoreAc += frames.get(i+1).getFirstThrow();
				}
			}
		}
		return scoreAc;
	}

	public Frame getBonus() {
		return bonus;
	}

	public List<Frame> getFrames() {
		return frames;
	}	

}
