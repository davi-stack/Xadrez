package Chess.Piece;

import Chess.Board;
import Objects.Position;

public class Horse extends Piece{

	public Horse( Team team, int a, int b) {
		super('C', team, new Position(a, b));
		// TODO Auto-generated constructor stub
		if(team==Team.BLACK) {
			this.simbolo = 'c';
		}
	}
	@Override
	protected void senseOfMov1(Board b) {
		//movimento para o valor
		Position p = this.aPartirDaPositionAtual(2, 1);
		this.validateOptMove(b, p);
		
	}
	@Override
	protected void senseOfMov2(Board b) {
		Position p = this.aPartirDaPositionAtual(2, -1);
		this.validateOptMove(b, p);
		
	}
	@Override
	protected void senseOfMov3(Board b) {
		Position p = this.aPartirDaPositionAtual(-2, 1);
		this.validateOptMove(b, p);
	}
	@Override
	protected void senseOfMov4(Board b) {
		Position p = this.aPartirDaPositionAtual(-2, -1);
		this.validateOptMove(b, p);
	}
	@Override
	protected void senseOfMov5(Board b) {
		Position p = this.aPartirDaPositionAtual(1, 2);
		this.validateOptMove(b, p);
	}
	@Override
	protected void senseOfMov6(Board b) {
		Position p = this.aPartirDaPositionAtual(1, -2);
		this.validateOptMove(b, p);
	}
	@Override
	protected void senseOfMov7(Board b) {
		Position p = this.aPartirDaPositionAtual(-1, 2);
		this.validateOptMove(b, p);
	}
	@Override
	protected void senseOfMov8(Board b) {
		Position p = this.aPartirDaPositionAtual(-1, -2);
		this.validateOptMove(b, p);
	
	}
    
}
