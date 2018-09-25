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
public class SingleCase extends Case {

	public SingleCase(CaseLiteral C1, Command C2, SourcePosition thePosition) {
		super(thePosition);
		CL = C1;
		CM = C2;
		duplicated = false;
	}
	
	public boolean duplicated;
	public CaseLiteral CL;
	public Command CM;

	@Override
	public Object visit(Visitor v, Object o) {
		return v.visitSingleCase(this, o);
	}
	
	
	
}
