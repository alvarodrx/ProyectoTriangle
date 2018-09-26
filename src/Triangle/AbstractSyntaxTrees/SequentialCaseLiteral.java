/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AA Team
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class SequentialCaseLiteral extends CaseLiteral {

  public SequentialCaseLiteral(CaseLiteral t1AST, CaseLiteral t2AST, SourcePosition thePosition) {
    super (thePosition);
    T1 = t1AST;
    T2 = t2AST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitSequentialCaseLiteral(this, o);
  }

  public CaseLiteral T1, T2;
}
