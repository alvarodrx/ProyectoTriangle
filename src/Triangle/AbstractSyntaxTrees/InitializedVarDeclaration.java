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
public class InitializedVarDeclaration extends Declaration {

	public InitializedVarDeclaration(Identifier iAST, Expression eAST,SourcePosition thePosition) {
		super(thePosition);
		I = iAST;
		E = eAST;
	}
	
	public Identifier I;
	public Expression E;
	
	@Override
	public Object visit(Visitor v, Object o) {
		return v.visitInitializedVarDeclaration(this, o);
	}
	
}
