package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// acessível somente por classes e subclasses dentro do mesmo pacote
	protected Board getBoard() {
		return board;
	}

}
