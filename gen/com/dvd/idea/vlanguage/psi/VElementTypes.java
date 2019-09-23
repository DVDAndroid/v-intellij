// This is a generated file. Not intended for manual editing.
package com.dvd.idea.vlanguage.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.dvd.idea.vlanguage.psi.impl.*;

public interface VElementTypes {

  IElementType V_ARRAY_INITIALIZER = new VElementType("V_ARRAY_INITIALIZER");
  IElementType V_ARRAY_TYPE = new VElementType("V_ARRAY_TYPE");
  IElementType V_BLOCK = new VElementType("V_BLOCK");
  IElementType V_CONSTANT = new VElementType("V_CONSTANT");
  IElementType V_CONST_DECLARATION = new VElementType("V_CONST_DECLARATION");
  IElementType V_ELSE_IF_STATEMENT = new VElementType("V_ELSE_IF_STATEMENT");
  IElementType V_ELSE_STATEMENT = new VElementType("V_ELSE_STATEMENT");
  IElementType V_ENUM_DECLARATION = new VElementType("V_ENUM_DECLARATION");
  IElementType V_EXPRESSION = new VElementType("V_EXPRESSION");
  IElementType V_FLOATING_POINT_TYPE = new VElementType("V_FLOATING_POINT_TYPE");
  IElementType V_FOR_CLASSIC_STATEMENT = new VElementType("V_FOR_CLASSIC_STATEMENT");
  IElementType V_FOR_STATEMENT = new VElementType("V_FOR_STATEMENT");
  IElementType V_FUNCTION_BODY = new VElementType("V_FUNCTION_BODY");
  IElementType V_FUNCTION_DECLARATION = new VElementType("V_FUNCTION_DECLARATION");
  IElementType V_FUNCTION_HEADER = new VElementType("V_FUNCTION_HEADER");
  IElementType V_FUNCTION_PARAMETER = new VElementType("V_FUNCTION_PARAMETER");
  IElementType V_FUNCTION_PARAMETER_LIST = new VElementType("V_FUNCTION_PARAMETER_LIST");
  IElementType V_FUNCTION_RESULT_TYPE = new VElementType("V_FUNCTION_RESULT_TYPE");
  IElementType V_IF_ELSE_STATEMENT = new VElementType("V_IF_ELSE_STATEMENT");
  IElementType V_IF_STATEMENT = new VElementType("V_IF_STATEMENT");
  IElementType V_IMPORT_DECLARATION = new VElementType("V_IMPORT_DECLARATION");
  IElementType V_INTEGRAL_TYPE = new VElementType("V_INTEGRAL_TYPE");
  IElementType V_INTERFACE_DECLARATION = new VElementType("V_INTERFACE_DECLARATION");
  IElementType V_INTERFACE_FUNCTION = new VElementType("V_INTERFACE_FUNCTION");
  IElementType V_MODULE_DECLARATION = new VElementType("V_MODULE_DECLARATION");
  IElementType V_NUMERIC_TYPE = new VElementType("V_NUMERIC_TYPE");
  IElementType V_PRIMITIVE_TYPE = new VElementType("V_PRIMITIVE_TYPE");
  IElementType V_RETURN_STATEMENT = new VElementType("V_RETURN_STATEMENT");
  IElementType V_STATEMENT = new VElementType("V_STATEMENT");
  IElementType V_STATEMENTS = new VElementType("V_STATEMENTS");
  IElementType V_STRUCT_DECLARATION = new VElementType("V_STRUCT_DECLARATION");
  IElementType V_STRUCT_VARIABLES_DECLARATION = new VElementType("V_STRUCT_VARIABLES_DECLARATION");
  IElementType V_STRUCT_VARIABLE_MODIFIER = new VElementType("V_STRUCT_VARIABLE_MODIFIER");
  IElementType V_SWITCH_BLOCK_STATEMENTS = new VElementType("V_SWITCH_BLOCK_STATEMENTS");
  IElementType V_SWITCH_CASE_STATEMENTS = new VElementType("V_SWITCH_CASE_STATEMENTS");
  IElementType V_SWITCH_DEFAULT_STATEMENTS = new VElementType("V_SWITCH_DEFAULT_STATEMENTS");
  IElementType V_SWITCH_STATEMENT = new VElementType("V_SWITCH_STATEMENT");
  IElementType V_TYPE = new VElementType("V_TYPE");
  IElementType V_VARIABLE_INITIALIZER = new VElementType("V_VARIABLE_INITIALIZER");
  IElementType V_VARIABLE_MODIFIERS = new VElementType("V_VARIABLE_MODIFIERS");
  IElementType V_VARIABLE_STATEMENT = new VElementType("V_VARIABLE_STATEMENT");

  IElementType V_ASSIGN = new VTokenType("=");
  IElementType V_BIT_AND = new VTokenType("&");
  IElementType V_BIT_AND_ASSIGN = new VTokenType("&=");
  IElementType V_BIT_OR = new VTokenType("|");
  IElementType V_BIT_OR_ASSIGN = new VTokenType("|=");
  IElementType V_BIT_XOR = new VTokenType("^");
  IElementType V_BIT_XOR_ASSIGN = new VTokenType("^=");
  IElementType V_BOOL = new VTokenType("bool");
  IElementType V_BYTE = new VTokenType("byte");
  IElementType V_BYTEPTR = new VTokenType("byteptr");
  IElementType V_CASE = new VTokenType("case");
  IElementType V_CIAOO = new VTokenType("ciaoo");
  IElementType V_COLON = new VTokenType(":");
  IElementType V_COMMA = new VTokenType(",");
  IElementType V_COMMENT = new VTokenType("COMMENT");
  IElementType V_COND_AND = new VTokenType("&&");
  IElementType V_COND_OR = new VTokenType("||");
  IElementType V_CONST = new VTokenType("const");
  IElementType V_DEFAULT = new VTokenType("default");
  IElementType V_DOT = new VTokenType(".");
  IElementType V_ELSE = new VTokenType("else");
  IElementType V_ENUM = new VTokenType("enum");
  IElementType V_EQ = new VTokenType("==");
  IElementType V_F32 = new VTokenType("f32");
  IElementType V_F64 = new VTokenType("f64");
  IElementType V_FN = new VTokenType("fn");
  IElementType V_FOR = new VTokenType("for");
  IElementType V_GREATER = new VTokenType(">");
  IElementType V_GREATER_OR_EQUAL = new VTokenType(">=");
  IElementType V_I16 = new VTokenType("i16");
  IElementType V_I32 = new VTokenType("i32");
  IElementType V_I64 = new VTokenType("i64");
  IElementType V_I8 = new VTokenType("i8");
  IElementType V_IDENTIFIER = new VTokenType("IDENTIFIER");
  IElementType V_IF = new VTokenType("if");
  IElementType V_IMPORT = new VTokenType("import");
  IElementType V_INT = new VTokenType("int");
  IElementType V_INTERFACE = new VTokenType("interface");
  IElementType V_LBRACE = new VTokenType("{");
  IElementType V_LBRACK = new VTokenType("[");
  IElementType V_LESS = new VTokenType("<");
  IElementType V_LESS_OR_EQUAL = new VTokenType("<=");
  IElementType V_LITERAL_STRING = new VTokenType("LITERAL_STRING");
  IElementType V_LPAREN = new VTokenType("(");
  IElementType V_MINUS = new VTokenType("-");
  IElementType V_MINUS_ASSIGN = new VTokenType("-=");
  IElementType V_MINUS_MINUS = new VTokenType("--");
  IElementType V_MODULE = new VTokenType("module");
  IElementType V_MUL = new VTokenType("*");
  IElementType V_MUL_ASSIGN = new VTokenType("*=");
  IElementType V_MUT = new VTokenType("mut");
  IElementType V_NOT = new VTokenType("!");
  IElementType V_NOT_EQ = new VTokenType("!=");
  IElementType V_NUMBER = new VTokenType("NUMBER");
  IElementType V_OPTIONAL = new VTokenType("?");
  IElementType V_PLUS = new VTokenType("+");
  IElementType V_PLUS_ASSIGN = new VTokenType("+=");
  IElementType V_PLUS_PLUS = new VTokenType("++");
  IElementType V_PUB = new VTokenType("pub");
  IElementType V_QUOTIENT = new VTokenType("/");
  IElementType V_QUOTIENT_ASSIGN = new VTokenType("/=");
  IElementType V_RBRACE = new VTokenType("}");
  IElementType V_RBRACK = new VTokenType("]");
  IElementType V_REMAINDER = new VTokenType("%");
  IElementType V_REMAINDER_ASSIGN = new VTokenType("%=");
  IElementType V_RETURN = new VTokenType("return");
  IElementType V_RPAREN = new VTokenType(")");
  IElementType V_RUNE = new VTokenType("rune");
  IElementType V_SEMICOLON = new VTokenType(";");
  IElementType V_SEND_CHANNEL = new VTokenType("<-");
  IElementType V_SHIFT_LEFT = new VTokenType("<<");
  IElementType V_SHIFT_LEFT_ASSIGN = new VTokenType("<<=");
  IElementType V_SHIFT_RIGHT = new VTokenType(">>");
  IElementType V_SHIFT_RIGHT_ASSIGN = new VTokenType(">>=");
  IElementType V_STRING = new VTokenType("string");
  IElementType V_STRUCT = new VTokenType("struct");
  IElementType V_SWITCH = new VTokenType("switch");
  IElementType V_TRIPLE_DOT = new VTokenType("...");
  IElementType V_U16 = new VTokenType("u16");
  IElementType V_U32 = new VTokenType("u32");
  IElementType V_U64 = new VTokenType("u64");
  IElementType V_U8 = new VTokenType("u8");
  IElementType V_VAR_ASSIGN = new VTokenType(":=");
  IElementType V_VOIDPTR = new VTokenType("voidptr");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == V_ARRAY_INITIALIZER) {
        return new VArrayInitializerImpl(node);
      }
      else if (type == V_ARRAY_TYPE) {
        return new VArrayTypeImpl(node);
      }
      else if (type == V_BLOCK) {
        return new VBlockImpl(node);
      }
      else if (type == V_CONSTANT) {
        return new VConstantImpl(node);
      }
      else if (type == V_CONST_DECLARATION) {
        return new VConstDeclarationImpl(node);
      }
      else if (type == V_ELSE_IF_STATEMENT) {
        return new VElseIfStatementImpl(node);
      }
      else if (type == V_ELSE_STATEMENT) {
        return new VElseStatementImpl(node);
      }
      else if (type == V_ENUM_DECLARATION) {
        return new VEnumDeclarationImpl(node);
      }
      else if (type == V_EXPRESSION) {
        return new VExpressionImpl(node);
      }
      else if (type == V_FLOATING_POINT_TYPE) {
        return new VFloatingPointTypeImpl(node);
      }
      else if (type == V_FOR_CLASSIC_STATEMENT) {
        return new VForClassicStatementImpl(node);
      }
      else if (type == V_FOR_STATEMENT) {
        return new VForStatementImpl(node);
      }
      else if (type == V_FUNCTION_BODY) {
        return new VFunctionBodyImpl(node);
      }
      else if (type == V_FUNCTION_DECLARATION) {
        return new VFunctionDeclarationImpl(node);
      }
      else if (type == V_FUNCTION_HEADER) {
        return new VFunctionHeaderImpl(node);
      }
      else if (type == V_FUNCTION_PARAMETER) {
        return new VFunctionParameterImpl(node);
      }
      else if (type == V_FUNCTION_PARAMETER_LIST) {
        return new VFunctionParameterListImpl(node);
      }
      else if (type == V_FUNCTION_RESULT_TYPE) {
        return new VFunctionResultTypeImpl(node);
      }
      else if (type == V_IF_ELSE_STATEMENT) {
        return new VIfElseStatementImpl(node);
      }
      else if (type == V_IF_STATEMENT) {
        return new VIfStatementImpl(node);
      }
      else if (type == V_IMPORT_DECLARATION) {
        return new VImportDeclarationImpl(node);
      }
      else if (type == V_INTEGRAL_TYPE) {
        return new VIntegralTypeImpl(node);
      }
      else if (type == V_INTERFACE_DECLARATION) {
        return new VInterfaceDeclarationImpl(node);
      }
      else if (type == V_INTERFACE_FUNCTION) {
        return new VInterfaceFunctionImpl(node);
      }
      else if (type == V_MODULE_DECLARATION) {
        return new VModuleDeclarationImpl(node);
      }
      else if (type == V_NUMERIC_TYPE) {
        return new VNumericTypeImpl(node);
      }
      else if (type == V_PRIMITIVE_TYPE) {
        return new VPrimitiveTypeImpl(node);
      }
      else if (type == V_RETURN_STATEMENT) {
        return new VReturnStatementImpl(node);
      }
      else if (type == V_STATEMENT) {
        return new VStatementImpl(node);
      }
      else if (type == V_STATEMENTS) {
        return new VStatementsImpl(node);
      }
      else if (type == V_STRUCT_DECLARATION) {
        return new VStructDeclarationImpl(node);
      }
      else if (type == V_STRUCT_VARIABLES_DECLARATION) {
        return new VStructVariablesDeclarationImpl(node);
      }
      else if (type == V_STRUCT_VARIABLE_MODIFIER) {
        return new VStructVariableModifierImpl(node);
      }
      else if (type == V_SWITCH_BLOCK_STATEMENTS) {
        return new VSwitchBlockStatementsImpl(node);
      }
      else if (type == V_SWITCH_CASE_STATEMENTS) {
        return new VSwitchCaseStatementsImpl(node);
      }
      else if (type == V_SWITCH_DEFAULT_STATEMENTS) {
        return new VSwitchDefaultStatementsImpl(node);
      }
      else if (type == V_SWITCH_STATEMENT) {
        return new VSwitchStatementImpl(node);
      }
      else if (type == V_TYPE) {
        return new VTypeImpl(node);
      }
      else if (type == V_VARIABLE_INITIALIZER) {
        return new VVariableInitializerImpl(node);
      }
      else if (type == V_VARIABLE_MODIFIERS) {
        return new VVariableModifiersImpl(node);
      }
      else if (type == V_VARIABLE_STATEMENT) {
        return new VVariableStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
