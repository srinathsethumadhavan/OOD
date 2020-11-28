import java.util.HashMap;
import java.util.List;

public class Game {

	
	private List<Player> players;
	private int currentTurn;
	private Player winner;
	private HashMap<Integer, Integer> snakesAndLadders;	
	
	public Game(List<Snake> snakes, List<Player> players, List<Ladder> ladders) {

		this.players = players;
		snakesAndLadders= new HashMap<>();
		for(Snake snake: snakes)
			snakesAndLadders.put(snake.getStartInt(),snake.getEndInt()) ;
		for(Ladder ladder: ladders)
			snakesAndLadders.put(ladder.getStartInt(),ladder.getEndInt()) ;

		this.currentTurn = 0;
		this.winner = null;
	}

	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public Player getWinner() {
		return winner;
	}
	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public boolean roll(Player p, int diceVal) {
		
		if(winner != null ||  players.get(currentTurn).getId() != p.getId())
			return false;

		int destination = players.get(currentTurn).getCurrentPosition() + diceVal;
		if(destination <= 100)
		{
			if(snakesAndLadders.containsKey(destination) )
				players.get(currentTurn).setCurrentPosition(snakesAndLadders.get(destination));
			else
				players.get(currentTurn).setCurrentPosition(destination);
			
		}

		if (destination == 100)
		{
			winner =players.get(currentTurn);
		}

		nextPlayer();
		return true;
	}

  private void nextPlayer()
{
	currentTurn = (currentTurn +1) % players.size();
}

	
	
	

}
