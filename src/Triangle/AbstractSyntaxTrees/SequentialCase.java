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

public class SequentialCase extends Case {

  public SequentialCase (Case c1AST, Case c2AST, SourcePosition thePosition) {
    super (thePosition);
    C1 = c1AST;
    C2 = c2AST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitSequentialCase(this, o);
  }

  public Case C1, C2;
  
  
}
