// This is a generated file. Not intended for manual editing.
package com.dvd.idea.vlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VStatement extends PsiElement {

  @Nullable
  VForStatement getForStatement();

  @Nullable
  VIfElseStatement getIfElseStatement();

  @Nullable
  VReturnStatement getReturnStatement();

  @Nullable
  VSwitchStatement getSwitchStatement();

  @Nullable
  VVariableStatement getVariableStatement();

}
