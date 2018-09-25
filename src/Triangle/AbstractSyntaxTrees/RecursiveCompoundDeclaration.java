/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Ana Belen
 */
public class RecursiveCompoundDeclaration extends Declaration {

    public RecursiveCompoundDeclaration(Declaration SPF, SourcePosition thePosition) {
        super(thePosition);
        this.SPF = SPF;
    }
    
    public Declaration SPF;
    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitRecursieCompDeclaration(this, o);
    }
    
    
}
