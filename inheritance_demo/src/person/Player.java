package person;

public class Player extends Person{

		//Bring a has-A relationship here stating that Player plays for a Team(tid,teamName,coachName)
		private double score;
		private String sportName;
		private Team t;
		
		public Player() {}

		public Player(int id, String name, double score, String sportName) {
			super(id, name);
			this.score = score;
			this.sportName = sportName;
		}

		public double getScore() {
			return score;
		}

		public void setScore(double score) {
			this.score = score;
		}

		public String getSportName() {
			return sportName;
		}

		public void setSportName(String sportName) {
			this.sportName = sportName;
		}

		public Team getT() {
			return t;
		}

		public void setT(Team t) {
			this.t = t;
		}

		@Override
		public String toString() {
			return "Player [score=" + score + ", sportName=" + sportName + ", t=" + t + ", getId()=" + getId()
					+ ", getName()=" + getName() + "]";
		}
		
}
