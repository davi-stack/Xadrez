package Chess.Piece;


import Chess.Board;
import Objects.Position;
public class Rei extends Piece{
	public Rei(int a, int b, Team t) {
		
		super('R', t, new Position(a, b));
		if(this.getTeam()==Team.BLACK) {
			this.simbolo = 'r';
		}
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void senseOfMov1(Board b) {
		//movimento para o valor
		Position p = this.aPartirDaPositionAtual(0, 1);
		this.validateOptMove(b, p);
		
	}
	@Override
	protected void senseOfMov2(Board b) {
		Position p = this.aPartirDaPositionAtual(0, -1);
		this.validateOptMove(b, p);
		
	}
	@Override
	protected void senseOfMov3(Board b) {
		Position p = this.aPartirDaPositionAtual(1, 1);
		this.validateOptMove(b, p);
	}
	@Override
	protected void senseOfMov4(Board b) {
		Position p = this.aPartirDaPositionAtual(1, 0);
		this.validateOptMove(b, p);
	}
	@Override
	protected void senseOfMov5(Board b) {
		Position p = this.aPartirDaPositionAtual(1, -1);
		this.validateOptMove(b, p);
	}
	@Override
	protected void senseOfMov6(Board b) {
		Position p = this.aPartirDaPositionAtual(-1, 0);
		this.validateOptMove(b, p);
	}
	@Override
	protected void senseOfMov7(Board b) {
		Position p = this.aPartirDaPositionAtual(-1, -1);
		this.validateOptMove(b, p);
	}
	@Override
	protected void senseOfMov8(Board b) {
		Position p = this.aPartirDaPositionAtual(-1, 1);
		this.validateOptMove(b, p);
	
	}
	
	
	
	
	

}
