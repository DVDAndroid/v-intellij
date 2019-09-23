// This is a generated file. Not intended for manual editing.
package com.dvd.idea.vlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.dvd.idea.vlanguage.psi.VElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.dvd.idea.vlanguage.psi.*;

public class VStatementImpl extends ASTWrapperPsiElement implements VStatement {

  public VStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VForStatement getForStatement() {
    return findChildByClass(VForStatement.class);
  }

  @Override
  @Nullable
  public VIfElseStatement getIfElseStatement() {
    return findChildByClass(VIfElseStatement.class);
  }

  @Override
  @Nullable
  public VReturnStatement getReturnStatement() {
    return findChildByClass(VReturnStatement.class);
  }

  @Override
  @Nullable
  public VSwitchStatement getSwitchStatement() {
    return findChildByClass(VSwitchStatement.class);
  }

  @Override
  @Nullable
  public VVariableStatement getVariableStatement() {
    return findChildByClass(VVariableStatement.class);
  }

}
