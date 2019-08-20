package com.dvd.idea.vlanguage;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.dvd.idea.vlanguage.psi.VElementTypes.*;

%%

%{
  public _VLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _VLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
NUMBER=[0-9]+
LITERAL_STRING=\"[^\"]*\"
COMMENT=("//".+)|("/"\*(.|\n)*\*"/")

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "{"                   { return V_LBRACE; }
  "}"                   { return V_RBRACE; }
  "["                   { return V_LBRACK; }
  "]"                   { return V_RBRACK; }
  "("                   { return V_LPAREN; }
  ")"                   { return V_RPAREN; }
  ":"                   { return V_COLON; }
  ";"                   { return V_SEMICOLON; }
  ","                   { return V_COMMA; }
  "=="                  { return V_EQ; }
  "="                   { return V_ASSIGN; }
  "!="                  { return V_NOT_EQ; }
  "!"                   { return V_NOT; }
  "++"                  { return V_PLUS_PLUS; }
  "+="                  { return V_PLUS_ASSIGN; }
  "+"                   { return V_PLUS; }
  "--"                  { return V_MINUS_MINUS; }
  "-="                  { return V_MINUS_ASSIGN; }
  "-"                   { return V_MINUS; }
  "||"                  { return V_COND_OR; }
  "|="                  { return V_BIT_OR_ASSIGN; }
  "&&"                  { return V_COND_AND; }
  "&="                  { return V_BIT_AND_ASSIGN; }
  "&"                   { return V_BIT_AND; }
  "|"                   { return V_BIT_OR; }
  "<<="                 { return V_SHIFT_LEFT_ASSIGN; }
  "<<"                  { return V_SHIFT_LEFT; }
  "<-"                  { return V_SEND_CHANNEL; }
  "<="                  { return V_LESS_OR_EQUAL; }
  "<"                   { return V_LESS; }
  "^="                  { return V_BIT_XOR_ASSIGN; }
  "^"                   { return V_BIT_XOR; }
  "*="                  { return V_MUL_ASSIGN; }
  "*"                   { return V_MUL; }
  "/="                  { return V_QUOTIENT_ASSIGN; }
  "/"                   { return V_QUOTIENT; }
  "%="                  { return V_REMAINDER_ASSIGN; }
  "%"                   { return V_REMAINDER; }
  ">>="                 { return V_SHIFT_RIGHT_ASSIGN; }
  ">>"                  { return V_SHIFT_RIGHT; }
  ">="                  { return V_GREATER_OR_EQUAL; }
  ">"                   { return V_GREATER; }
  ":="                  { return V_VAR_ASSIGN; }
  "..."                 { return V_TRIPLE_DOT; }
  "."                   { return V_DOT; }
  "?"                   { return V_OPTIONAL; }
  "module"              { return V_MODULE; }
  "import"              { return V_IMPORT; }
  "const"               { return V_CONST; }
  "interface"           { return V_INTERFACE; }
  "enum"                { return V_ENUM; }
  "struct"              { return V_STRUCT; }
  "mut"                 { return V_MUT; }
  "pub"                 { return V_PUB; }
  "fn"                  { return V_FN; }
  "bool"                { return V_BOOL; }
  "string"              { return V_STRING; }
  "byteptr"             { return V_BYTEPTR; }
  "voidptr"             { return V_VOIDPTR; }
  "i8"                  { return V_I8; }
  "i16"                 { return V_I16; }
  "i32"                 { return V_I32; }
  "i64"                 { return V_I64; }
  "u8"                  { return V_U8; }
  "u16"                 { return V_U16; }
  "u32"                 { return V_U32; }
  "u64"                 { return V_U64; }
  "byte"                { return V_BYTE; }
  "int"                 { return V_INT; }
  "rune"                { return V_RUNE; }
  "f32"                 { return V_F32; }
  "f64"                 { return V_F64; }
  "if"                  { return V_IF; }
  "else"                { return V_ELSE; }
  "for"                 { return V_FOR; }
  "switch"              { return V_SWITCH; }
  "case"                { return V_CASE; }
  "default"             { return V_DEFAULT; }
  "return"              { return V_RETURN; }
  "ciaoo"               { return V_CIAOO; }

  {IDENTIFIER}          { return V_IDENTIFIER; }
  {NUMBER}              { return V_NUMBER; }
  {LITERAL_STRING}      { return V_LITERAL_STRING; }
  {COMMENT}             { return V_COMMENT; }

}

[^] { return BAD_CHARACTER; }
