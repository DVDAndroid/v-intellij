// This is a generated file. Not intended for manual editing.
package com.dvd.idea.vlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VIfElseStatement extends PsiElement {

  @Nullable
  VElseIfStatement getElseIfStatement();

  @Nullable
  VElseStatement getElseStatement();

  @NotNull
  VIfStatement getIfStatement();

}
