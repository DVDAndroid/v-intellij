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

public class VVariableInitializerImpl extends ASTWrapperPsiElement implements VVariableInitializer {

  public VVariableInitializerImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitVariableInitializer(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VArrayInitializer getArrayInitializer() {
    return findChildByClass(VArrayInitializer.class);
  }

  @Override
  @Nullable
  public VElseIfStatement getElseIfStatement() {
    return findChildByClass(VElseIfStatement.class);
  }

  @Override
  @Nullable
  public VElseStatement getElseStatement() {
    return findChildByClass(VElseStatement.class);
  }

  @Override
  @Nullable
  public VExpression getExpression() {
    return findChildByClass(VExpression.class);
  }

  @Override
  @Nullable
  public VIfStatement getIfStatement() {
    return findChildByClass(VIfStatement.class);
  }

}
