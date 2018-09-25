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
public class SingleCaseLiteral extends CaseLiteral {

	public SingleCaseLiteral(Terminal L, SourcePosition thePosition) {
		super(thePosition);
		T = L;
	}
	
	public Terminal T;

	@Override
	public Object visit(Visitor v, Object o) {
		return v.visitSingleCaseLiteral(this, o);
	}
	
}
