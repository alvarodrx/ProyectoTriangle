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
public class LocalCompoundDeclaration extends Declaration {

    public LocalCompoundDeclaration(Declaration D1, Declaration D2, SourcePosition thePosition) {
        super(thePosition);
        this.D1 = D1;
        this.D2 = D2;
    }
    
    public Declaration D1, D2;
    
    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitLocalCompoundDeclaration(this, o);
    }
    
}
