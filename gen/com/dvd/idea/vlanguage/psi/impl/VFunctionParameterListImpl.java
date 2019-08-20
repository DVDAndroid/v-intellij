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

public class VFunctionParameterListImpl extends ASTWrapperPsiElement implements VFunctionParameterList {

  public VFunctionParameterListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitFunctionParameterList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VFunctionParameter> getFunctionParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VFunctionParameter.class);
  }

}
