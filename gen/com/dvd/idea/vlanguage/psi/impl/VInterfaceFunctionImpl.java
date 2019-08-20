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

public class VInterfaceFunctionImpl extends ASTWrapperPsiElement implements VInterfaceFunction {

  public VInterfaceFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitInterfaceFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VFunctionParameterList getFunctionParameterList() {
    return findChildByClass(VFunctionParameterList.class);
  }

  @Override
  @NotNull
  public VFunctionResultType getFunctionResultType() {
    return findNotNullChildByClass(VFunctionResultType.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(V_IDENTIFIER);
  }

}
