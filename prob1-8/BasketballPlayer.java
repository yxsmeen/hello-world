package prob1;

/**
 * Represents a baskeball player
 *
 */
public class BasketballPlayer {

	/**
	 * The name of the basketball player.
	 */
	private String name;
	/**
	 * The number of free throws attempted.
	 */
//	private int freeThrowsAttempted = 0;
	private int freeThrowsAttempted;
	/**
	 * The number of free throws made.
	 */
	private int freeThrowsMade = 0;
	/**
	 * The number of 2 point shots attempted.
	 */
	private int twoPointersAttempted = 0;
	/**
	 * The number of 2 point shots made.
	 */
	private int twoPointersMade = 0;
	/**
	 * The number of 3 point shots attempted.
	 */
	private int threePointersAttempted = 0;
	/**
	 * The number of 3 point shots made.
	 */
	private int threePointersMade = 0;
	
	/**
	 * Constructs a BasketballPlayer.
	 * @param name The name of the player.
	 */
	public BasketballPlayer(String name) {
		this.name = name;
	}

	/**
	 * Gets the name of the player
	 * @return the name of the player
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the number of free throws attempted.
	 * @return the number of free throws attempted.
	 */
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}

	/**
	 * Gets the number of free throws made.
	 * @return the number of free throws made.
	 */
	public int getFreeThrowsMade() {
		return freeThrowsMade;
	}

	/**
	 * Gets the number of 2 point shots attempted.
	 * @return the number of 2 point shots attempted.
	 */
	public int getTwoPointersAttempted() {
		return twoPointersAttempted;
	}

	/**
	 * Gets the number of 2 point shots made.
	 * @return the number of 2 point shots made.
	 */
	public int getTwoPointersMade() {
		return twoPointersMade;
	}

	/**
	 * Gets the number of 3 point shots attempted.
	 * @return the number of 3 point shots attempted.
	 */
	public int getThreePointersAttempted() {
		return threePointersAttempted;
	}

	/**
	 * Gets the number of 3 point shots made.
	 * @return the number of 3 point shots made.
	 */
	public int getThreePointersMade() {
		return threePointersMade;
	}

	/**
	 * Increments the number of free throws attempted and if isMade is true, then increments
	 * the number of free throws made.
	 * @param isMade true if the free throw was made, false it not
	 */
	public void shootFreeThrow(boolean isMade) {
		this.freeThrowsAttempted++;
		if(isMade) {
			this.freeThrowsMade++;
		}
	}

	/**
	 * Increments the number of 2 point shots attempted and if isMade is true, then increments
	 * the number of 2 point shots made.
	 * @param isMade true if the 2 point shot was made, false if not
	 */
	public void shootTwoPointer(boolean isMade) {
		this.twoPointersAttempted++;
		if(isMade) {
			this.twoPointersMade++;
		}
	}

	/**
	 * Increments the number of free throws attempted and if isMade is true, then increments
	 * the number of 3 point shots made.
	 * @param isMade true if the 3 point shot was made, false it not
	 */
	public void shootThreePointer(boolean isMade) {
		this.threePointersAttempted++;
		if(isMade) {
			this.threePointersMade++;
		}
	}

	/**
	 * Gets the total number of points across free throws, 2 point shots, and 3 point shots. 
	 * Each free throw that is made counts for 1 point, each 2 point shot made counts for 2 points,
	 * and each 3 point shot made counts as 3 points.
	 * @return The total number of points
	 */
	public int getTotalPoints() {
		int points = 1*freeThrowsMade + 2*twoPointersMade + 3*threePointersMade;
		return points;
	}
	
	/**
	 * Gets the free throw percent made. For example if there were 5 free 
	 * throws attempted and 3 were made, then the percent would be 60.0. 
	 * If no attempts have been made then the percent is 0.0.
	 * @return the free throw percent made.
	 */
	public double getFreeThrowPercent() {
		if(freeThrowsAttempted>0) {
			return 100.0*freeThrowsMade/freeThrowsAttempted;
		}
		return 0;
	}

	/**
	 * Gets the 2 point shot percent made. For example if there were 5 2 point shots attempted and 3 
	 * were made, then the percent would be 60.0. If no attempts have been made then the percent
	 * is 0.0.
	 * @return the free throw percent made.
	 */
	public double getTwoPointerPercent() {
		if(twoPointersAttempted>0) {
			return 100.0*twoPointersMade/twoPointersAttempted;
		}
		return 0;
	}

	/**
	 * Gets the 3 point shot percent made. For example if there were 3 three point shots attempted and 1 
	 * was made, then the percent would be 33.3333333. If no attempts have been made then the percent
	 * is 0.0.
	 * @return the free throw percent made.
	 */
	public double getThreePointerPercent() {
		if(threePointersAttempted>0) {
			return 100.0*threePointersMade/threePointersAttempted;
		}
		return 0;
	}

	/**
	 *  Returns a string representing the player. The format should exactly match this example:
	 *  <pre>
	 *  Player:Paul, points:12
	 *     Free Throws: made:2, attempted:3, percent:66.7
	 *      2 Pointers: made:2, attempted:3, percent:66.7
	 *  Three Pointers: made:2, attempted:5, percent:40.0
	 *   </pre>
	 */
	@Override
	public String toString() {
		String header = "Player:" + name + ", points:" + getTotalPoints() + "\n";
		String  frees = String.format("   Free Throws: made:%d, attempted:%d, percent:%.1f\n", 
				freeThrowsMade, freeThrowsAttempted, getFreeThrowPercent());
		String   twos = String.format("    2 Pointers: made:%d, attempted:%d, percent:%.1f\n", 
				twoPointersMade, twoPointersAttempted, getTwoPointerPercent());
		String threes = String.format("Three Pointers: made:%d, attempted:%d, percent:%.1f\n", 
				threePointersMade, threePointersAttempted, getThreePointerPercent());
		String msg = header + frees + twos + threes;
		return msg;
	}
}

