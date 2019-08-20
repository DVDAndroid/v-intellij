// This is a generated file. Not intended for manual editing.
package com.dvd.idea.vlanguage;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.dvd.idea.vlanguage.psi.VElementTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class VParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ instanceof IFileElementType) {
      result_ = parse_root_(root_, builder_, 0);
    }
    else {
      result_ = false;
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return File(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // '[' Expression* ']'
  public static boolean ArrayInitializer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayInitializer")) return false;
    if (!nextTokenIs(builder_, V_LBRACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_LBRACK);
    result_ = result_ && ArrayInitializer_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RBRACK);
    exit_section_(builder_, marker_, V_ARRAY_INITIALIZER, result_);
    return result_;
  }

  // Expression*
  private static boolean ArrayInitializer_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayInitializer_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Expression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ArrayInitializer_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '[' ']'PrimitiveType
  public static boolean ArrayType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType")) return false;
    if (!nextTokenIs(builder_, V_LBRACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_LBRACK, V_RBRACK);
    result_ = result_ && PrimitiveType(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_ARRAY_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' Statements? '}'
  public static boolean Block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Block")) return false;
    if (!nextTokenIs(builder_, V_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_LBRACE);
    result_ = result_ && Block_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RBRACE);
    exit_section_(builder_, marker_, V_BLOCK, result_);
    return result_;
  }

  // Statements?
  private static boolean Block_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Block_1")) return false;
    Statements(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // const '(' Constant+ ')'
  public static boolean ConstDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDeclaration")) return false;
    if (!nextTokenIs(builder_, V_CONST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_CONST, V_LPAREN);
    result_ = result_ && ConstDeclaration_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RPAREN);
    exit_section_(builder_, marker_, V_CONST_DECLARATION, result_);
    return result_;
  }

  // Constant+
  private static boolean ConstDeclaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDeclaration_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Constant(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!Constant(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ConstDeclaration_2", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER '=' Expression
  public static boolean Constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Constant")) return false;
    if (!nextTokenIs(builder_, V_IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_IDENTIFIER, V_ASSIGN);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_CONSTANT, result_);
    return result_;
  }

  /* ********************************************************** */
  // else IfStatement
  public static boolean ElseIfStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ElseIfStatement")) return false;
    if (!nextTokenIs(builder_, V_ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_ELSE);
    result_ = result_ && IfStatement(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_ELSE_IF_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // else '{' Statements '}'
  public static boolean ElseStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ElseStatement")) return false;
    if (!nextTokenIs(builder_, V_ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_ELSE, V_LBRACE);
    result_ = result_ && Statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RBRACE);
    exit_section_(builder_, marker_, V_ELSE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // enum IDENTIFIER '{' IDENTIFIER* '}'
  public static boolean EnumDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDeclaration")) return false;
    if (!nextTokenIs(builder_, V_ENUM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_ENUM, V_IDENTIFIER, V_LBRACE);
    result_ = result_ && EnumDeclaration_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RBRACE);
    exit_section_(builder_, marker_, V_ENUM_DECLARATION, result_);
    return result_;
  }

  // IDENTIFIER*
  private static boolean EnumDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDeclaration_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, V_IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(builder_, "EnumDeclaration_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ciaoo
  public static boolean Expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Expression")) return false;
    if (!nextTokenIs(builder_, V_CIAOO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_CIAOO);
    exit_section_(builder_, marker_, V_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // ModuleDeclaration?
  //          ImportDeclaration*
  //          ConstDeclaration*
  //          InterfaceDeclaration*
  //          EnumDeclaration*
  //          StructDeclaration*
  //          FunctionDeclaration*
  static boolean File(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = File_0(builder_, level_ + 1);
    result_ = result_ && File_1(builder_, level_ + 1);
    result_ = result_ && File_2(builder_, level_ + 1);
    result_ = result_ && File_3(builder_, level_ + 1);
    result_ = result_ && File_4(builder_, level_ + 1);
    result_ = result_ && File_5(builder_, level_ + 1);
    result_ = result_ && File_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ModuleDeclaration?
  private static boolean File_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File_0")) return false;
    ModuleDeclaration(builder_, level_ + 1);
    return true;
  }

  // ImportDeclaration*
  private static boolean File_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ImportDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "File_1", pos_)) break;
    }
    return true;
  }

  // ConstDeclaration*
  private static boolean File_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ConstDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "File_2", pos_)) break;
    }
    return true;
  }

  // InterfaceDeclaration*
  private static boolean File_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!InterfaceDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "File_3", pos_)) break;
    }
    return true;
  }

  // EnumDeclaration*
  private static boolean File_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!EnumDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "File_4", pos_)) break;
    }
    return true;
  }

  // StructDeclaration*
  private static boolean File_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!StructDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "File_5", pos_)) break;
    }
    return true;
  }

  // FunctionDeclaration*
  private static boolean File_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File_6")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!FunctionDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "File_6", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // f32 | f64
  public static boolean FloatingPointType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FloatingPointType")) return false;
    if (!nextTokenIs(builder_, "<floating point type>", V_F32, V_F64)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_FLOATING_POINT_TYPE, "<floating point type>");
    result_ = consumeToken(builder_, V_F32);
    if (!result_) result_ = consumeToken(builder_, V_F64);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // VariableStatement';' Expression';' Expression
  public static boolean ForClassicStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForClassicStatement")) return false;
    if (!nextTokenIs(builder_, "<for classic statement>", V_IDENTIFIER, V_MUT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_FOR_CLASSIC_STATEMENT, "<for classic statement>");
    result_ = VariableStatement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_SEMICOLON);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_SEMICOLON);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // for Block | for Expression Block | for ForClassicStatement Block
  public static boolean ForStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement")) return false;
    if (!nextTokenIs(builder_, V_FOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ForStatement_0(builder_, level_ + 1);
    if (!result_) result_ = ForStatement_1(builder_, level_ + 1);
    if (!result_) result_ = ForStatement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_FOR_STATEMENT, result_);
    return result_;
  }

  // for Block
  private static boolean ForStatement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_FOR);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // for Expression Block
  private static boolean ForStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_FOR);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // for ForClassicStatement Block
  private static boolean ForStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_FOR);
    result_ = result_ && ForClassicStatement(builder_, level_ + 1);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Block
  public static boolean FunctionBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionBody")) return false;
    if (!nextTokenIs(builder_, V_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_FUNCTION_BODY, result_);
    return result_;
  }

  /* ********************************************************** */
  // FunctionHeader FunctionBody
  public static boolean FunctionDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionDeclaration")) return false;
    if (!nextTokenIs(builder_, V_FN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FunctionHeader(builder_, level_ + 1);
    result_ = result_ && FunctionBody(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_FUNCTION_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // fn IDENTIFIER '(' [ (FunctionParameterList ','?) ] ')' FunctionResultType?
  public static boolean FunctionHeader(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionHeader")) return false;
    if (!nextTokenIs(builder_, V_FN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_FN, V_IDENTIFIER, V_LPAREN);
    result_ = result_ && FunctionHeader_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RPAREN);
    result_ = result_ && FunctionHeader_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_FUNCTION_HEADER, result_);
    return result_;
  }

  // [ (FunctionParameterList ','?) ]
  private static boolean FunctionHeader_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionHeader_3")) return false;
    FunctionHeader_3_0(builder_, level_ + 1);
    return true;
  }

  // FunctionParameterList ','?
  private static boolean FunctionHeader_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionHeader_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FunctionParameterList(builder_, level_ + 1);
    result_ = result_ && FunctionHeader_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean FunctionHeader_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionHeader_3_0_1")) return false;
    consumeToken(builder_, V_COMMA);
    return true;
  }

  // FunctionResultType?
  private static boolean FunctionHeader_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionHeader_5")) return false;
    FunctionResultType(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER Type?
  public static boolean FunctionParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionParameter")) return false;
    if (!nextTokenIs(builder_, V_IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_IDENTIFIER);
    result_ = result_ && FunctionParameter_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_FUNCTION_PARAMETER, result_);
    return result_;
  }

  // Type?
  private static boolean FunctionParameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionParameter_1")) return false;
    Type(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // FunctionParameter (',' (FunctionParameter | &')'))*
  public static boolean FunctionParameterList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionParameterList")) return false;
    if (!nextTokenIs(builder_, V_IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FunctionParameter(builder_, level_ + 1);
    result_ = result_ && FunctionParameterList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_FUNCTION_PARAMETER_LIST, result_);
    return result_;
  }

  // (',' (FunctionParameter | &')'))*
  private static boolean FunctionParameterList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionParameterList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!FunctionParameterList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FunctionParameterList_1", pos_)) break;
    }
    return true;
  }

  // ',' (FunctionParameter | &')')
  private static boolean FunctionParameterList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionParameterList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_COMMA);
    result_ = result_ && FunctionParameterList_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // FunctionParameter | &')'
  private static boolean FunctionParameterList_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionParameterList_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FunctionParameter(builder_, level_ + 1);
    if (!result_) result_ = FunctionParameterList_1_0_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &')'
  private static boolean FunctionParameterList_1_0_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionParameterList_1_0_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, V_RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Type
  public static boolean FunctionResultType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionResultType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_FUNCTION_RESULT_TYPE, "<function result type>");
    result_ = Type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IfStatement ElseIfStatement? ElseStatement?
  public static boolean IfElseStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfElseStatement")) return false;
    if (!nextTokenIs(builder_, V_IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = IfStatement(builder_, level_ + 1);
    result_ = result_ && IfElseStatement_1(builder_, level_ + 1);
    result_ = result_ && IfElseStatement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_IF_ELSE_STATEMENT, result_);
    return result_;
  }

  // ElseIfStatement?
  private static boolean IfElseStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfElseStatement_1")) return false;
    ElseIfStatement(builder_, level_ + 1);
    return true;
  }

  // ElseStatement?
  private static boolean IfElseStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfElseStatement_2")) return false;
    ElseStatement(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // if Expression '{' Statements '}'
  public static boolean IfStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement")) return false;
    if (!nextTokenIs(builder_, V_IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_IF);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_LBRACE);
    result_ = result_ && Statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RBRACE);
    exit_section_(builder_, marker_, V_IF_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // import IDENTIFIER
  public static boolean ImportDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImportDeclaration")) return false;
    if (!nextTokenIs(builder_, V_IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_IMPORT, V_IDENTIFIER);
    exit_section_(builder_, marker_, V_IMPORT_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // i8 | i16 | i32 | i64 | u8 | u16 | u32 | u64 | byte | int | rune
  public static boolean IntegralType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IntegralType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_INTEGRAL_TYPE, "<integral type>");
    result_ = consumeToken(builder_, V_I8);
    if (!result_) result_ = consumeToken(builder_, V_I16);
    if (!result_) result_ = consumeToken(builder_, V_I32);
    if (!result_) result_ = consumeToken(builder_, V_I64);
    if (!result_) result_ = consumeToken(builder_, V_U8);
    if (!result_) result_ = consumeToken(builder_, V_U16);
    if (!result_) result_ = consumeToken(builder_, V_U32);
    if (!result_) result_ = consumeToken(builder_, V_U64);
    if (!result_) result_ = consumeToken(builder_, V_BYTE);
    if (!result_) result_ = consumeToken(builder_, V_INT);
    if (!result_) result_ = consumeToken(builder_, V_RUNE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // interface IDENTIFIER '{' InterfaceFunction* '}'
  public static boolean InterfaceDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceDeclaration")) return false;
    if (!nextTokenIs(builder_, V_INTERFACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_INTERFACE, V_IDENTIFIER, V_LBRACE);
    result_ = result_ && InterfaceDeclaration_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RBRACE);
    exit_section_(builder_, marker_, V_INTERFACE_DECLARATION, result_);
    return result_;
  }

  // InterfaceFunction*
  private static boolean InterfaceDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceDeclaration_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!InterfaceFunction(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "InterfaceDeclaration_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER '(' [ (FunctionParameterList ','?) ]  ')' FunctionResultType
  public static boolean InterfaceFunction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceFunction")) return false;
    if (!nextTokenIs(builder_, V_IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_IDENTIFIER, V_LPAREN);
    result_ = result_ && InterfaceFunction_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RPAREN);
    result_ = result_ && FunctionResultType(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_INTERFACE_FUNCTION, result_);
    return result_;
  }

  // [ (FunctionParameterList ','?) ]
  private static boolean InterfaceFunction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceFunction_2")) return false;
    InterfaceFunction_2_0(builder_, level_ + 1);
    return true;
  }

  // FunctionParameterList ','?
  private static boolean InterfaceFunction_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceFunction_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FunctionParameterList(builder_, level_ + 1);
    result_ = result_ && InterfaceFunction_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean InterfaceFunction_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceFunction_2_0_1")) return false;
    consumeToken(builder_, V_COMMA);
    return true;
  }

  /* ********************************************************** */
  // module IDENTIFIER
  public static boolean ModuleDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModuleDeclaration")) return false;
    if (!nextTokenIs(builder_, V_MODULE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_MODULE, V_IDENTIFIER);
    exit_section_(builder_, marker_, V_MODULE_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IntegralType | FloatingPointType
  public static boolean NumericType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NumericType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_NUMERIC_TYPE, "<numeric type>");
    result_ = IntegralType(builder_, level_ + 1);
    if (!result_) result_ = FloatingPointType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // NumericType | bool | string | byteptr | voidptr
  public static boolean PrimitiveType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrimitiveType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_PRIMITIVE_TYPE, "<primitive type>");
    result_ = NumericType(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, V_BOOL);
    if (!result_) result_ = consumeToken(builder_, V_STRING);
    if (!result_) result_ = consumeToken(builder_, V_BYTEPTR);
    if (!result_) result_ = consumeToken(builder_, V_VOIDPTR);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // return Expression
  public static boolean ReturnStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReturnStatement")) return false;
    if (!nextTokenIs(builder_, V_RETURN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_RETURN);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_RETURN_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // VariableStatement | IfElseStatement | ForStatement | SwitchStatement | ReturnStatement
  public static boolean Statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_STATEMENT, "<statement>");
    result_ = VariableStatement(builder_, level_ + 1);
    if (!result_) result_ = IfElseStatement(builder_, level_ + 1);
    if (!result_) result_ = ForStatement(builder_, level_ + 1);
    if (!result_) result_ = SwitchStatement(builder_, level_ + 1);
    if (!result_) result_ = ReturnStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Statement*
  public static boolean Statements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Statements")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_STATEMENTS, "<statements>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Statements", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // struct IDENTIFIER '{' (StructVariablesDeclaration)+ '}'
  public static boolean StructDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructDeclaration")) return false;
    if (!nextTokenIs(builder_, V_STRUCT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_STRUCT, V_IDENTIFIER, V_LBRACE);
    result_ = result_ && StructDeclaration_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RBRACE);
    exit_section_(builder_, marker_, V_STRUCT_DECLARATION, result_);
    return result_;
  }

  // (StructVariablesDeclaration)+
  private static boolean StructDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructDeclaration_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = StructDeclaration_3_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!StructDeclaration_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "StructDeclaration_3", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (StructVariablesDeclaration)
  private static boolean StructDeclaration_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructDeclaration_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = StructVariablesDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // mut | pub mut mut | pub mut | pub
  public static boolean StructVariableModifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructVariableModifier")) return false;
    if (!nextTokenIs(builder_, "<struct variable modifier>", V_MUT, V_PUB)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_STRUCT_VARIABLE_MODIFIER, "<struct variable modifier>");
    result_ = consumeToken(builder_, V_MUT);
    if (!result_) result_ = parseTokens(builder_, 0, V_PUB, V_MUT, V_MUT);
    if (!result_) result_ = parseTokens(builder_, 0, V_PUB, V_MUT);
    if (!result_) result_ = consumeToken(builder_, V_PUB);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (StructVariableModifier':')? FunctionParameter ('[skip]')?
  public static boolean StructVariablesDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructVariablesDeclaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_STRUCT_VARIABLES_DECLARATION, "<struct variables declaration>");
    result_ = StructVariablesDeclaration_0(builder_, level_ + 1);
    result_ = result_ && FunctionParameter(builder_, level_ + 1);
    result_ = result_ && StructVariablesDeclaration_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (StructVariableModifier':')?
  private static boolean StructVariablesDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructVariablesDeclaration_0")) return false;
    StructVariablesDeclaration_0_0(builder_, level_ + 1);
    return true;
  }

  // StructVariableModifier':'
  private static boolean StructVariablesDeclaration_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructVariablesDeclaration_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = StructVariableModifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('[skip]')?
  private static boolean StructVariablesDeclaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructVariablesDeclaration_2")) return false;
    StructVariablesDeclaration_2_0(builder_, level_ + 1);
    return true;
  }

  // ('[skip]')
  private static boolean StructVariablesDeclaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructVariablesDeclaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "[skip]");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SwitchCaseStatements+ SwitchDefaultStatements
  public static boolean SwitchBlockStatements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SwitchBlockStatements")) return false;
    if (!nextTokenIs(builder_, V_CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = SwitchBlockStatements_0(builder_, level_ + 1);
    result_ = result_ && SwitchDefaultStatements(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_SWITCH_BLOCK_STATEMENTS, result_);
    return result_;
  }

  // SwitchCaseStatements+
  private static boolean SwitchBlockStatements_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SwitchBlockStatements_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = SwitchCaseStatements(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!SwitchCaseStatements(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "SwitchBlockStatements_0", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // case Expression':' Block
  public static boolean SwitchCaseStatements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SwitchCaseStatements")) return false;
    if (!nextTokenIs(builder_, V_CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_CASE);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_COLON);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_SWITCH_CASE_STATEMENTS, result_);
    return result_;
  }

  /* ********************************************************** */
  // default':' Block
  public static boolean SwitchDefaultStatements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SwitchDefaultStatements")) return false;
    if (!nextTokenIs(builder_, V_DEFAULT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, V_DEFAULT, V_COLON);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, V_SWITCH_DEFAULT_STATEMENTS, result_);
    return result_;
  }

  /* ********************************************************** */
  // switch Expression '{' SwitchBlockStatements '}'
  public static boolean SwitchStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SwitchStatement")) return false;
    if (!nextTokenIs(builder_, V_SWITCH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_SWITCH);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_LBRACE);
    result_ = result_ && SwitchBlockStatements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, V_RBRACE);
    exit_section_(builder_, marker_, V_SWITCH_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // PrimitiveType | ArrayType
  public static boolean Type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_TYPE, "<type>");
    result_ = PrimitiveType(builder_, level_ + 1);
    if (!result_) result_ = ArrayType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Expression | ArrayInitializer | IfStatement ElseIfStatement? ElseStatement
  public static boolean VariableInitializer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableInitializer")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_VARIABLE_INITIALIZER, "<variable initializer>");
    result_ = Expression(builder_, level_ + 1);
    if (!result_) result_ = ArrayInitializer(builder_, level_ + 1);
    if (!result_) result_ = VariableInitializer_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // IfStatement ElseIfStatement? ElseStatement
  private static boolean VariableInitializer_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableInitializer_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = IfStatement(builder_, level_ + 1);
    result_ = result_ && VariableInitializer_2_1(builder_, level_ + 1);
    result_ = result_ && ElseStatement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ElseIfStatement?
  private static boolean VariableInitializer_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableInitializer_2_1")) return false;
    ElseIfStatement(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // mut
  public static boolean VariableModifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableModifiers")) return false;
    if (!nextTokenIs(builder_, V_MUT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, V_MUT);
    exit_section_(builder_, marker_, V_VARIABLE_MODIFIERS, result_);
    return result_;
  }

  /* ********************************************************** */
  // VariableModifiers? IDENTIFIER ':=' VariableInitializer
  public static boolean VariableStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableStatement")) return false;
    if (!nextTokenIs(builder_, "<variable statement>", V_IDENTIFIER, V_MUT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, V_VARIABLE_STATEMENT, "<variable statement>");
    result_ = VariableStatement_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, V_IDENTIFIER, V_VAR_ASSIGN);
    result_ = result_ && VariableInitializer(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // VariableModifiers?
  private static boolean VariableStatement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableStatement_0")) return false;
    VariableModifiers(builder_, level_ + 1);
    return true;
  }

}
