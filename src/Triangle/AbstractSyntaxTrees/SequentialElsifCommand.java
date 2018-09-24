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

public class SequentialElsifCommand extends Command {

  public SequentialElsifCommand (Command c1AST, Command c2AST, SourcePosition thePosition) {
    super (thePosition);
    C1 = c1AST;
    C2 = c2AST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitSequentialElsifCommand(this, o);
  }

  public Command C1, C2;
}