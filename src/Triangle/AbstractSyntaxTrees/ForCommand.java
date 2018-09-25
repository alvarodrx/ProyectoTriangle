/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

/**
 *
 * @author AA Team
 */
import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command {

	public ForCommand(Identifier iAST, Expression eAST_1, Expression eAST_2, Command cAST, SourcePosition thePosition) {
		super(thePosition);
		I = iAST;
		E1 = eAST_1;
		E2 = eAST_2;
		C = cAST;
	}

	public Object visit(Visitor v, Object o) {
		return v.visitForCommand(this, o);
	}
	
	public Expression E1, E2;
	public Command C;
	public Identifier I;

}
