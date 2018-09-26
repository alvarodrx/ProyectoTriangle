/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author AA Teamo
 */
public class ElseCase extends Case{

	public ElseCase(Command c, SourcePosition thePosition) {
		super(thePosition);
		this.C = c;
	}
	
	public Command C;

	public Object visit(Visitor v, Object o) {
		return v.visitElseCase(this, o);
	}
	
}
