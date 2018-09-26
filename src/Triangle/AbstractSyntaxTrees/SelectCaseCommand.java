/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author hp i5 septima
 */
public class SelectCaseCommand extends Command{

	public SelectCaseCommand(Expression e, Case c, SourcePosition thePosition) {
		super(thePosition);
		E = e;
		C = c;
	}
	public Expression E;
	public Case C;

	@Override
	public Object visit(Visitor v, Object o) {
		return v.visitSelectCaseCommand(this, o);
	}
	
}
