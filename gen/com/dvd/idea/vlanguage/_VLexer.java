/* The following code was generated by JFlex 1.7.0-1 tweaked for IntelliJ platform */

package com.dvd.idea.vlanguage;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.dvd.idea.vlanguage.psi.VElementTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-1
 * from the specification file <tt>D:/workspaces/IntelliJ IDEA Projects/vlang/src/grammar/_VLexer.flex</tt>
 */
public class _VLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\3\1\22\0\1\3\1\23\1\6\2\0\1\32\1\27\1\0\1\15\1\16\1\10\1\24"+
    "\1\21\1\25\1\34\1\7\1\5\1\62\1\65\1\64\1\66\1\5\1\63\1\5\1\61\1\5\1\17\1\20"+
    "\1\30\1\22\1\33\1\35\1\0\32\4\1\13\1\0\1\14\1\31\1\4\1\0\1\54\1\55\1\50\1"+
    "\40\1\43\1\53\1\56\1\70\1\44\2\4\1\42\1\36\1\51\1\37\1\45\1\4\1\46\1\52\1"+
    "\47\1\41\1\60\1\67\1\4\1\57\1\4\1\11\1\26\1\12\7\0\1\1\32\0\1\3\337\0\1\3"+
    "\177\0\13\3\35\0\2\1\5\0\1\3\57\0\1\3\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\14\3\1\0\1\34"+
    "\2\0\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\0\3\3\1\61"+
    "\7\3\1\62\1\63\14\3\1\64\5\3\1\65\1\0"+
    "\1\66\1\67\1\70\1\3\1\71\1\3\1\72\1\73"+
    "\1\74\3\3\1\75\1\76\1\77\1\100\1\101\7\3"+
    "\1\102\1\103\1\104\3\3\1\65\2\3\1\105\1\106"+
    "\2\3\1\107\3\3\1\110\3\3\1\111\1\112\6\3"+
    "\1\113\1\114\5\3\1\115\1\3\1\116\1\3\1\117"+
    "\1\120\1\121\1\122\2\3\1\123\1\3\1\124\1\125"+
    "\1\3\1\126";

  private static int [] zzUnpackAction() {
    int [] result = new int[175];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f"+
    "\0\71\0\71\0\71\0\71\0\71\0\71\0\u01c8\0\71"+
    "\0\71\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e\0\u0357"+
    "\0\u0390\0\u03c9\0\u0402\0\u043b\0\71\0\u0474\0\u04ad\0\u04e6"+
    "\0\u051f\0\u0558\0\u0591\0\u05ca\0\u0603\0\u063c\0\u0675\0\u06ae"+
    "\0\u06e7\0\u011d\0\71\0\u0720\0\u0759\0\71\0\71\0\71"+
    "\0\71\0\71\0\71\0\71\0\71\0\71\0\71\0\71"+
    "\0\71\0\71\0\71\0\71\0\u0792\0\71\0\71\0\71"+
    "\0\u07cb\0\u0804\0\u083d\0\u0876\0\u08af\0\253\0\u08e8\0\u0921"+
    "\0\u095a\0\u0993\0\u09cc\0\u0a05\0\u0a3e\0\253\0\253\0\u0a77"+
    "\0\u0ab0\0\u0ae9\0\u0b22\0\u0b5b\0\u0b94\0\u0bcd\0\u0c06\0\u0c3f"+
    "\0\u0c78\0\u0cb1\0\u0cea\0\253\0\u0d23\0\u0d5c\0\u0d95\0\u0dce"+
    "\0\u0e07\0\u0720\0\u0e40\0\71\0\71\0\71\0\u0e79\0\253"+
    "\0\u0eb2\0\253\0\253\0\253\0\u0eeb\0\u0f24\0\u0f5d\0\u0f96"+
    "\0\253\0\253\0\253\0\253\0\u0fcf\0\u1008\0\u1041\0\u107a"+
    "\0\u10b3\0\u10ec\0\u1125\0\253\0\253\0\253\0\u115e\0\u1197"+
    "\0\u11d0\0\u0759\0\u1209\0\u1242\0\253\0\253\0\u127b\0\u12b4"+
    "\0\253\0\u12ed\0\u1326\0\u135f\0\253\0\u1398\0\u13d1\0\u140a"+
    "\0\253\0\u1443\0\u147c\0\u14b5\0\u14ee\0\u1527\0\u1560\0\u1599"+
    "\0\253\0\253\0\u15d2\0\u160b\0\u1644\0\u167d\0\u16b6\0\253"+
    "\0\u16ef\0\253\0\u1728\0\253\0\253\0\253\0\253\0\u1761"+
    "\0\u179a\0\253\0\u17d3\0\253\0\253\0\u180c\0\253";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[175];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\4\1\37\1\40"+
    "\1\4\1\41\1\42\1\43\1\44\1\4\1\45\1\4"+
    "\1\46\1\47\1\4\1\50\2\4\1\51\6\5\2\4"+
    "\72\0\3\3\71\0\2\4\30\0\33\4\5\0\1\5"+
    "\53\0\6\5\2\0\6\52\1\53\62\52\7\0\1\54"+
    "\1\55\11\0\1\56\70\0\1\57\70\0\1\60\70\0"+
    "\1\61\70\0\1\62\70\0\1\63\1\0\1\64\66\0"+
    "\1\65\2\0\1\66\65\0\1\67\3\0\1\70\64\0"+
    "\1\71\4\0\1\72\63\0\1\73\2\0\1\74\2\0"+
    "\1\75\62\0\1\76\70\0\1\77\70\0\1\100\10\0"+
    "\1\101\71\0\1\102\40\0\2\4\30\0\1\4\1\103"+
    "\1\4\1\104\27\4\4\0\2\4\30\0\5\4\1\105"+
    "\25\4\4\0\2\4\30\0\23\4\1\106\1\107\1\110"+
    "\1\111\4\4\4\0\2\4\30\0\4\4\1\112\6\4"+
    "\1\113\17\4\4\0\2\4\30\0\1\114\12\4\1\115"+
    "\1\4\1\116\5\4\1\117\1\120\1\121\1\122\4\4"+
    "\4\0\2\4\30\0\3\4\1\123\27\4\4\0\2\4"+
    "\30\0\3\4\1\124\1\4\1\125\25\4\4\0\2\4"+
    "\30\0\1\4\1\126\4\4\1\127\7\4\1\130\14\4"+
    "\4\0\2\4\30\0\11\4\1\131\17\4\1\132\1\4"+
    "\4\0\2\4\30\0\1\4\1\133\11\4\1\134\11\4"+
    "\1\135\1\136\4\4\4\0\2\4\30\0\1\4\1\137"+
    "\17\4\1\140\11\4\4\0\2\4\30\0\1\4\1\141"+
    "\31\4\1\142\2\0\66\142\1\55\1\0\6\55\1\143"+
    "\60\55\22\0\1\144\70\0\1\145\102\0\1\146\40\0"+
    "\2\4\30\0\2\4\1\147\30\4\4\0\2\4\30\0"+
    "\11\4\1\150\21\4\4\0\2\4\30\0\15\4\1\151"+
    "\15\4\4\0\2\4\30\0\25\4\1\152\5\4\4\0"+
    "\2\4\30\0\30\4\1\153\2\4\4\0\2\4\30\0"+
    "\27\4\1\154\3\4\4\0\2\4\30\0\14\4\1\155"+
    "\16\4\4\0\2\4\30\0\3\4\1\156\27\4\4\0"+
    "\2\4\30\0\7\4\1\157\23\4\4\0\2\4\30\0"+
    "\11\4\1\160\21\4\4\0\2\4\30\0\25\4\1\161"+
    "\5\4\4\0\2\4\30\0\30\4\1\162\2\4\4\0"+
    "\2\4\30\0\27\4\1\163\3\4\4\0\2\4\30\0"+
    "\17\4\1\164\13\4\4\0\2\4\30\0\13\4\1\165"+
    "\17\4\4\0\2\4\30\0\11\4\1\166\21\4\4\0"+
    "\2\4\30\0\13\4\1\167\17\4\4\0\2\4\30\0"+
    "\16\4\1\170\14\4\4\0\2\4\30\0\14\4\1\171"+
    "\16\4\4\0\2\4\30\0\10\4\1\172\22\4\4\0"+
    "\2\4\30\0\6\4\1\173\24\4\4\0\2\4\30\0"+
    "\10\4\1\174\22\4\4\0\2\4\30\0\30\4\1\175"+
    "\2\4\4\0\2\4\30\0\27\4\1\176\3\4\4\0"+
    "\2\4\30\0\1\4\1\177\31\4\4\0\2\4\30\0"+
    "\11\4\1\200\21\4\4\0\2\4\30\0\6\4\1\201"+
    "\24\4\1\55\1\0\5\55\1\202\1\143\60\55\4\0"+
    "\2\4\30\0\3\4\1\203\27\4\4\0\2\4\30\0"+
    "\16\4\1\204\14\4\4\0\2\4\30\0\5\4\1\205"+
    "\25\4\4\0\2\4\30\0\1\206\32\4\4\0\2\4"+
    "\30\0\1\4\1\207\31\4\4\0\2\4\30\0\5\4"+
    "\1\210\25\4\4\0\2\4\30\0\5\4\1\211\25\4"+
    "\4\0\2\4\30\0\3\4\1\212\27\4\4\0\2\4"+
    "\30\0\14\4\1\213\16\4\4\0\2\4\30\0\1\4"+
    "\1\214\31\4\4\0\2\4\30\0\5\4\1\215\25\4"+
    "\4\0\2\4\30\0\3\4\1\216\2\4\1\217\24\4"+
    "\4\0\2\4\30\0\11\4\1\220\21\4\4\0\2\4"+
    "\30\0\4\4\1\221\26\4\4\0\2\4\30\0\5\4"+
    "\1\222\25\4\4\0\2\4\30\0\2\4\1\223\30\4"+
    "\4\0\2\4\30\0\4\4\1\224\26\4\4\0\2\4"+
    "\30\0\3\4\1\225\27\4\4\0\2\4\30\0\10\4"+
    "\1\226\22\4\4\0\2\4\30\0\10\4\1\227\22\4"+
    "\4\0\2\4\30\0\10\4\1\230\22\4\4\0\2\4"+
    "\30\0\11\4\1\231\21\4\4\0\2\4\30\0\1\4"+
    "\1\232\31\4\4\0\2\4\30\0\12\4\1\233\20\4"+
    "\4\0\2\4\30\0\13\4\1\234\17\4\4\0\2\4"+
    "\30\0\12\4\1\235\20\4\4\0\2\4\30\0\7\4"+
    "\1\236\23\4\4\0\2\4\30\0\7\4\1\237\23\4"+
    "\4\0\2\4\30\0\5\4\1\240\25\4\4\0\2\4"+
    "\30\0\4\4\1\241\26\4\4\0\2\4\30\0\11\4"+
    "\1\242\21\4\4\0\2\4\30\0\15\4\1\243\15\4"+
    "\4\0\2\4\30\0\13\4\1\244\17\4\4\0\2\4"+
    "\30\0\11\4\1\245\21\4\4\0\2\4\30\0\20\4"+
    "\1\246\12\4\4\0\2\4\30\0\32\4\1\247\4\0"+
    "\2\4\30\0\11\4\1\250\21\4\4\0\2\4\30\0"+
    "\11\4\1\251\21\4\4\0\2\4\30\0\11\4\1\252"+
    "\21\4\4\0\2\4\30\0\16\4\1\253\14\4\4\0"+
    "\2\4\30\0\10\4\1\254\22\4\4\0\2\4\30\0"+
    "\10\4\1\255\22\4\4\0\2\4\30\0\12\4\1\256"+
    "\20\4\4\0\2\4\30\0\5\4\1\257\25\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6213];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\6\11\1\1\2\11\13\1\1\11"+
    "\14\1\1\0\1\11\2\0\17\11\1\1\3\11\1\1"+
    "\1\0\40\1\1\0\3\11\111\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[175];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _VLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _VLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 87: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 88: break;
          case 3: 
            { return V_IDENTIFIER;
            } 
            // fall through
          case 89: break;
          case 4: 
            { return V_NUMBER;
            } 
            // fall through
          case 90: break;
          case 5: 
            { return V_QUOTIENT;
            } 
            // fall through
          case 91: break;
          case 6: 
            { return V_MUL;
            } 
            // fall through
          case 92: break;
          case 7: 
            { return V_LBRACE;
            } 
            // fall through
          case 93: break;
          case 8: 
            { return V_RBRACE;
            } 
            // fall through
          case 94: break;
          case 9: 
            { return V_LBRACK;
            } 
            // fall through
          case 95: break;
          case 10: 
            { return V_RBRACK;
            } 
            // fall through
          case 96: break;
          case 11: 
            { return V_LPAREN;
            } 
            // fall through
          case 97: break;
          case 12: 
            { return V_RPAREN;
            } 
            // fall through
          case 98: break;
          case 13: 
            { return V_COLON;
            } 
            // fall through
          case 99: break;
          case 14: 
            { return V_SEMICOLON;
            } 
            // fall through
          case 100: break;
          case 15: 
            { return V_COMMA;
            } 
            // fall through
          case 101: break;
          case 16: 
            { return V_ASSIGN;
            } 
            // fall through
          case 102: break;
          case 17: 
            { return V_NOT;
            } 
            // fall through
          case 103: break;
          case 18: 
            { return V_PLUS;
            } 
            // fall through
          case 104: break;
          case 19: 
            { return V_MINUS;
            } 
            // fall through
          case 105: break;
          case 20: 
            { return V_BIT_OR;
            } 
            // fall through
          case 106: break;
          case 21: 
            { return V_BIT_AND;
            } 
            // fall through
          case 107: break;
          case 22: 
            { return V_LESS;
            } 
            // fall through
          case 108: break;
          case 23: 
            { return V_BIT_XOR;
            } 
            // fall through
          case 109: break;
          case 24: 
            { return V_REMAINDER;
            } 
            // fall through
          case 110: break;
          case 25: 
            { return V_GREATER;
            } 
            // fall through
          case 111: break;
          case 26: 
            { return V_DOT;
            } 
            // fall through
          case 112: break;
          case 27: 
            { return V_OPTIONAL;
            } 
            // fall through
          case 113: break;
          case 28: 
            { return V_LITERAL_STRING;
            } 
            // fall through
          case 114: break;
          case 29: 
            { return V_QUOTIENT_ASSIGN;
            } 
            // fall through
          case 115: break;
          case 30: 
            { return V_MUL_ASSIGN;
            } 
            // fall through
          case 116: break;
          case 31: 
            { return V_VAR_ASSIGN;
            } 
            // fall through
          case 117: break;
          case 32: 
            { return V_EQ;
            } 
            // fall through
          case 118: break;
          case 33: 
            { return V_NOT_EQ;
            } 
            // fall through
          case 119: break;
          case 34: 
            { return V_PLUS_ASSIGN;
            } 
            // fall through
          case 120: break;
          case 35: 
            { return V_PLUS_PLUS;
            } 
            // fall through
          case 121: break;
          case 36: 
            { return V_MINUS_ASSIGN;
            } 
            // fall through
          case 122: break;
          case 37: 
            { return V_MINUS_MINUS;
            } 
            // fall through
          case 123: break;
          case 38: 
            { return V_BIT_OR_ASSIGN;
            } 
            // fall through
          case 124: break;
          case 39: 
            { return V_COND_OR;
            } 
            // fall through
          case 125: break;
          case 40: 
            { return V_BIT_AND_ASSIGN;
            } 
            // fall through
          case 126: break;
          case 41: 
            { return V_COND_AND;
            } 
            // fall through
          case 127: break;
          case 42: 
            { return V_LESS_OR_EQUAL;
            } 
            // fall through
          case 128: break;
          case 43: 
            { return V_SEND_CHANNEL;
            } 
            // fall through
          case 129: break;
          case 44: 
            { return V_SHIFT_LEFT;
            } 
            // fall through
          case 130: break;
          case 45: 
            { return V_BIT_XOR_ASSIGN;
            } 
            // fall through
          case 131: break;
          case 46: 
            { return V_REMAINDER_ASSIGN;
            } 
            // fall through
          case 132: break;
          case 47: 
            { return V_GREATER_OR_EQUAL;
            } 
            // fall through
          case 133: break;
          case 48: 
            { return V_SHIFT_RIGHT;
            } 
            // fall through
          case 134: break;
          case 49: 
            { return V_U8;
            } 
            // fall through
          case 135: break;
          case 50: 
            { return V_IF;
            } 
            // fall through
          case 136: break;
          case 51: 
            { return V_I8;
            } 
            // fall through
          case 137: break;
          case 52: 
            { return V_FN;
            } 
            // fall through
          case 138: break;
          case 53: 
            { return V_COMMENT;
            } 
            // fall through
          case 139: break;
          case 54: 
            { return V_SHIFT_LEFT_ASSIGN;
            } 
            // fall through
          case 140: break;
          case 55: 
            { return V_SHIFT_RIGHT_ASSIGN;
            } 
            // fall through
          case 141: break;
          case 56: 
            { return V_TRIPLE_DOT;
            } 
            // fall through
          case 142: break;
          case 57: 
            { return V_MUT;
            } 
            // fall through
          case 143: break;
          case 58: 
            { return V_U16;
            } 
            // fall through
          case 144: break;
          case 59: 
            { return V_U64;
            } 
            // fall through
          case 145: break;
          case 60: 
            { return V_U32;
            } 
            // fall through
          case 146: break;
          case 61: 
            { return V_INT;
            } 
            // fall through
          case 147: break;
          case 62: 
            { return V_I16;
            } 
            // fall through
          case 148: break;
          case 63: 
            { return V_I64;
            } 
            // fall through
          case 149: break;
          case 64: 
            { return V_I32;
            } 
            // fall through
          case 150: break;
          case 65: 
            { return V_PUB;
            } 
            // fall through
          case 151: break;
          case 66: 
            { return V_FOR;
            } 
            // fall through
          case 152: break;
          case 67: 
            { return V_F64;
            } 
            // fall through
          case 153: break;
          case 68: 
            { return V_F32;
            } 
            // fall through
          case 154: break;
          case 69: 
            { return V_ELSE;
            } 
            // fall through
          case 155: break;
          case 70: 
            { return V_ENUM;
            } 
            // fall through
          case 156: break;
          case 71: 
            { return V_RUNE;
            } 
            // fall through
          case 157: break;
          case 72: 
            { return V_CASE;
            } 
            // fall through
          case 158: break;
          case 73: 
            { return V_BOOL;
            } 
            // fall through
          case 159: break;
          case 74: 
            { return V_BYTE;
            } 
            // fall through
          case 160: break;
          case 75: 
            { return V_CONST;
            } 
            // fall through
          case 161: break;
          case 76: 
            { return V_CIAOO;
            } 
            // fall through
          case 162: break;
          case 77: 
            { return V_MODULE;
            } 
            // fall through
          case 163: break;
          case 78: 
            { return V_IMPORT;
            } 
            // fall through
          case 164: break;
          case 79: 
            { return V_RETURN;
            } 
            // fall through
          case 165: break;
          case 80: 
            { return V_STRUCT;
            } 
            // fall through
          case 166: break;
          case 81: 
            { return V_STRING;
            } 
            // fall through
          case 167: break;
          case 82: 
            { return V_SWITCH;
            } 
            // fall through
          case 168: break;
          case 83: 
            { return V_DEFAULT;
            } 
            // fall through
          case 169: break;
          case 84: 
            { return V_BYTEPTR;
            } 
            // fall through
          case 170: break;
          case 85: 
            { return V_VOIDPTR;
            } 
            // fall through
          case 171: break;
          case 86: 
            { return V_INTERFACE;
            } 
            // fall through
          case 172: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
