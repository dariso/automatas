package analisisLexico;

import java.io.File;
import java.io.IOException;

public class AnalizadorL {

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
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\11\1\44\2\0\1\11\22\0\1\11\7\0\1\34\1\41"+
    "\2\0\1\43\1\0\1\27\1\0\12\36\1\0\1\42\1\0\1\31"+
    "\1\0\1\43\1\0\22\12\1\24\7\12\1\35\1\12\1\37\3\12"+
    "\1\3\1\7\1\1\1\20\1\16\1\22\1\32\1\21\1\10\2\40"+
    "\1\2\1\26\1\30\1\17\1\5\1\40\1\13\1\4\1\15\1\6"+
    "\1\14\1\23\1\40\1\25\1\40\1\33\uff84\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\14\2\1\1\1\3\1\4\1\5\1\6"+
    "\10\2\1\7\7\2\4\0\10\2\1\10\4\2\1\11"+
    "\1\2\4\0\1\10\6\2\1\1\1\12\2\2\3\0"+
    "\1\13\4\2\1\0\1\2\1\14\2\0\4\2\1\15"+
    "\1\10\2\0\1\2\1\0\1\1\1\2\10\0\1\16"+
    "\1\0\1\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[105];
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
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1\0\u0206\0\45"+
    "\0\45\0\45\0\45\0\u022b\0\u0250\0\u0275\0\u029a\0\u02bf"+
    "\0\u02e4\0\u0309\0\u032e\0\u022b\0\u0353\0\u0378\0\u039d\0\u03c2"+
    "\0\u03e7\0\u040c\0\u0431\0\u0456\0\u047b\0\u04a0\0\u04c5\0\u04ea"+
    "\0\u050f\0\u0534\0\u0559\0\u057e\0\u05a3\0\u05c8\0\u05ed\0\u0612"+
    "\0\u0637\0\u065c\0\u0681\0\u06a6\0\u022b\0\u06cb\0\u06f0\0\u0715"+
    "\0\u073a\0\u075f\0\u022b\0\u0784\0\u07a9\0\u07ce\0\u07f3\0\u0818"+
    "\0\u083d\0\u022b\0\u022b\0\u0862\0\u0887\0\u08ac\0\u08d1\0\u08f6"+
    "\0\45\0\u091b\0\u0940\0\u0965\0\u098a\0\u09af\0\u09d4\0\u022b"+
    "\0\u09f9\0\u0a1e\0\u0a43\0\u0a68\0\u0a8d\0\u0ab2\0\45\0\45"+
    "\0\u0ad7\0\u0afc\0\u0b21\0\u0b46\0\u0b6b\0\u0b90\0\u0bb5\0\u0bda"+
    "\0\u0bff\0\u0c24\0\u0c49\0\u0c6e\0\u0c93\0\u0cb8\0\u0cdd\0\u0d02"+
    "\0\45";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[105];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\5\1\10"+
    "\1\11\2\2\2\5\1\12\1\13\1\5\1\14\1\5"+
    "\1\15\1\16\1\17\2\5\1\2\1\5\1\20\1\5"+
    "\1\21\1\22\3\2\1\5\3\2\1\23\46\0\1\24"+
    "\1\25\6\24\1\0\7\24\1\26\5\24\1\0\1\24"+
    "\1\0\1\24\2\0\1\24\1\0\2\24\5\0\10\24"+
    "\1\0\5\24\1\27\7\24\1\0\1\24\1\0\1\24"+
    "\2\0\1\24\1\0\2\24\5\0\10\24\1\0\15\24"+
    "\1\0\1\24\1\0\1\24\2\0\1\24\1\0\2\24"+
    "\5\0\10\24\1\0\7\24\1\30\5\24\1\0\1\24"+
    "\1\0\1\24\2\0\1\24\1\0\2\24\5\0\5\24"+
    "\1\31\2\24\1\0\1\24\1\32\13\24\1\0\1\24"+
    "\1\0\1\24\2\0\1\24\1\0\2\24\5\0\10\24"+
    "\1\0\5\24\1\33\7\24\1\0\1\24\1\0\1\24"+
    "\2\0\1\24\1\0\2\24\5\0\10\24\1\0\10\24"+
    "\1\34\4\24\1\0\1\35\1\0\1\24\2\0\1\24"+
    "\1\0\2\24\5\0\10\24\1\0\7\24\1\36\5\24"+
    "\1\0\1\24\1\0\1\24\2\0\1\24\1\0\2\24"+
    "\5\0\1\24\1\37\6\24\1\0\15\24\1\0\1\24"+
    "\1\0\1\24\2\0\1\24\1\0\2\24\5\0\10\24"+
    "\1\0\5\24\1\40\7\24\1\0\1\24\1\0\1\24"+
    "\2\0\1\24\1\0\2\24\5\0\1\24\1\41\6\24"+
    "\1\0\5\24\1\42\7\24\1\0\1\24\1\0\1\24"+
    "\2\0\1\24\1\0\2\24\5\0\10\24\1\0\7\24"+
    "\1\43\5\24\1\0\1\24\1\0\1\24\2\0\1\24"+
    "\1\0\2\24\21\0\1\44\7\0\1\45\20\0\10\24"+
    "\1\46\15\24\1\0\1\24\1\0\1\24\1\0\1\47"+
    "\1\24\1\0\2\24\3\0\1\46\1\0\2\24\1\50"+
    "\5\24\1\46\15\24\1\0\1\24\1\0\1\24\1\0"+
    "\1\47\1\24\1\0\2\24\3\0\1\46\1\0\2\24"+
    "\1\51\5\24\1\46\15\24\1\0\1\24\1\0\1\24"+
    "\1\0\1\47\1\24\1\0\2\24\3\0\1\46\1\0"+
    "\10\24\1\46\15\24\1\0\1\52\1\0\1\24\1\0"+
    "\1\47\1\24\1\0\2\24\3\0\1\46\1\0\10\24"+
    "\1\46\5\24\1\53\7\24\1\0\1\24\1\0\1\24"+
    "\1\0\1\47\1\24\1\0\2\24\3\0\1\46\1\0"+
    "\6\24\1\54\1\24\1\46\15\24\1\0\1\24\1\0"+
    "\1\24\1\0\1\47\1\24\1\0\2\24\3\0\1\46"+
    "\1\0\7\24\1\55\1\46\5\24\1\56\7\24\1\0"+
    "\1\24\1\0\1\24\1\0\1\47\1\24\1\0\2\24"+
    "\3\0\1\46\1\0\10\24\1\46\5\24\1\57\7\24"+
    "\1\0\1\24\1\0\1\24\1\0\1\47\1\24\1\0"+
    "\2\24\3\0\1\46\1\0\10\24\1\46\3\24\1\60"+
    "\11\24\1\0\1\24\1\0\1\24\1\0\1\47\1\24"+
    "\1\0\2\24\3\0\1\46\1\0\7\24\1\61\1\46"+
    "\15\24\1\0\1\24\1\0\1\24\1\0\1\47\1\24"+
    "\1\0\2\24\3\0\1\46\1\0\3\24\1\62\4\24"+
    "\1\46\15\24\1\0\1\24\1\0\1\24\1\0\1\47"+
    "\1\24\1\0\2\24\3\0\1\46\1\0\5\24\1\63"+
    "\2\24\1\46\15\24\1\0\1\24\1\0\1\24\1\0"+
    "\1\47\1\24\1\0\2\24\3\0\1\46\1\0\10\24"+
    "\1\46\5\24\1\64\7\24\1\0\1\24\1\0\1\24"+
    "\1\0\1\47\1\24\1\0\2\24\3\0\1\46\1\0"+
    "\10\24\1\46\1\24\1\65\13\24\1\0\1\24\1\0"+
    "\1\24\1\0\1\47\1\24\1\0\2\24\3\0\1\46"+
    "\1\0\7\24\1\66\1\46\15\24\1\0\1\24\1\0"+
    "\1\24\1\0\1\47\1\24\1\0\2\24\3\0\1\46"+
    "\13\0\1\67\35\0\1\70\51\0\1\46\22\0\1\47"+
    "\7\0\1\46\1\0\10\71\1\47\15\71\1\0\1\71"+
    "\1\0\1\71\2\0\1\71\1\0\2\71\1\72\1\0"+
    "\1\71\1\47\1\0\3\24\1\61\4\24\1\46\15\24"+
    "\1\0\1\24\1\0\1\24\1\0\1\47\1\24\1\0"+
    "\2\24\3\0\1\46\1\0\10\24\1\46\1\24\1\73"+
    "\13\24\1\0\1\24\1\0\1\24\1\0\1\47\1\24"+
    "\1\0\2\24\3\0\1\46\1\0\10\24\1\46\15\24"+
    "\1\0\1\24\1\0\1\73\1\0\1\47\1\24\1\0"+
    "\2\24\3\0\1\46\1\0\10\24\1\46\1\24\1\74"+
    "\13\24\1\0\1\24\1\0\1\24\1\0\1\47\1\24"+
    "\1\0\2\24\3\0\1\46\1\0\1\24\1\75\6\24"+
    "\1\46\15\24\1\0\1\24\1\0\1\24\1\0\1\47"+
    "\1\24\1\0\2\24\3\0\1\46\1\0\10\24\1\46"+
    "\2\24\1\76\12\24\1\0\1\24\1\0\1\24\1\0"+
    "\1\47\1\24\1\0\2\24\3\0\1\46\1\0\10\24"+
    "\1\46\3\24\1\77\11\24\1\0\1\24\1\0\1\24"+
    "\1\0\1\47\1\24\1\0\2\24\3\0\1\46\1\0"+
    "\1\24\1\100\6\24\1\46\15\24\1\0\1\24\1\0"+
    "\1\24\1\0\1\47\1\24\1\0\2\24\3\0\1\46"+
    "\1\0\10\24\1\46\15\24\1\0\1\24\1\0\1\24"+
    "\1\0\1\47\1\101\1\0\2\24\3\0\1\46\1\0"+
    "\3\24\1\102\4\24\1\46\15\24\1\0\1\24\1\0"+
    "\1\24\1\0\1\47\1\24\1\0\2\24\3\0\1\46"+
    "\1\0\10\24\1\46\4\24\1\103\10\24\1\0\1\24"+
    "\1\0\1\24\1\0\1\47\1\24\1\0\2\24\3\0"+
    "\1\46\1\0\6\24\1\104\1\24\1\46\15\24\1\0"+
    "\1\24\1\0\1\24\1\0\1\47\1\24\1\0\2\24"+
    "\3\0\1\46\1\0\2\24\1\74\5\24\1\46\15\24"+
    "\1\0\1\24\1\0\1\24\1\0\1\47\1\24\1\0"+
    "\2\24\3\0\1\46\1\0\1\24\1\105\6\24\1\46"+
    "\15\24\1\0\1\24\1\0\1\24\1\0\1\47\1\24"+
    "\1\0\2\24\3\0\1\46\10\0\1\106\51\0\1\107"+
    "\30\0\10\71\1\110\15\71\1\0\1\71\1\0\1\71"+
    "\2\0\1\71\1\0\2\71\1\72\1\0\1\71\1\110"+
    "\11\0\1\72\30\0\1\111\1\0\1\72\1\0\10\24"+
    "\1\46\3\24\1\73\11\24\1\0\1\24\1\0\1\24"+
    "\1\0\1\47\1\24\1\0\2\24\3\0\1\46\1\0"+
    "\7\24\1\112\1\46\15\24\1\0\1\24\1\0\1\24"+
    "\1\0\1\47\1\24\1\0\2\24\3\0\1\46\1\0"+
    "\2\24\1\113\5\24\1\46\15\24\1\0\1\24\1\0"+
    "\1\24\1\0\1\47\1\24\1\0\2\24\3\0\1\46"+
    "\1\0\10\24\1\46\4\24\1\114\10\24\1\0\1\24"+
    "\1\0\1\24\1\0\1\47\1\24\1\0\2\24\3\0"+
    "\1\46\1\0\10\24\1\46\4\24\1\115\10\24\1\0"+
    "\1\24\1\0\1\24\1\0\1\47\1\24\1\0\2\24"+
    "\3\0\1\46\1\0\10\24\1\46\15\24\1\0\1\24"+
    "\1\0\1\24\1\0\1\47\1\24\1\116\2\24\3\0"+
    "\1\46\1\0\1\24\1\117\6\24\1\46\15\24\1\0"+
    "\1\24\1\0\1\24\1\0\1\47\1\24\1\0\2\24"+
    "\3\0\1\46\1\0\10\24\1\46\4\24\1\120\10\24"+
    "\1\0\1\24\1\0\1\24\1\0\1\47\1\24\1\0"+
    "\2\24\3\0\1\46\30\0\1\121\32\0\1\122\37\0"+
    "\1\110\27\0\1\72\2\0\1\110\1\0\1\123\7\24"+
    "\1\46\15\24\1\0\1\24\1\0\1\24\1\0\1\47"+
    "\1\24\1\0\2\24\3\0\1\46\1\0\10\24\1\46"+
    "\3\24\1\124\11\24\1\0\1\24\1\0\1\24\1\0"+
    "\1\47\1\24\1\0\2\24\3\0\1\46\1\0\1\125"+
    "\7\24\1\46\15\24\1\0\1\24\1\0\1\24\1\0"+
    "\1\47\1\24\1\0\2\24\3\0\1\46\1\0\2\24"+
    "\1\126\5\24\1\46\15\24\1\0\1\24\1\0\1\24"+
    "\1\0\1\47\1\24\1\0\2\24\3\0\1\46\36\0"+
    "\1\116\1\127\6\0\10\24\1\46\4\24\1\73\10\24"+
    "\1\0\1\24\1\0\1\24\1\0\1\47\1\24\1\0"+
    "\2\24\3\0\1\46\32\0\1\130\40\0\1\131\17\0"+
    "\10\24\1\132\15\24\1\0\1\24\1\0\1\24\1\0"+
    "\1\47\1\24\1\0\2\24\3\0\1\132\1\0\10\24"+
    "\1\46\4\24\1\123\10\24\1\0\1\24\1\0\1\24"+
    "\1\0\1\47\1\24\1\0\2\24\3\0\1\46\1\0"+
    "\10\24\1\46\3\24\1\133\11\24\1\0\1\24\1\0"+
    "\1\24\1\0\1\47\1\24\1\0\2\24\3\0\1\46"+
    "\1\0\10\24\1\46\15\24\1\0\1\73\1\0\1\24"+
    "\1\0\1\47\1\24\1\0\2\24\3\0\1\46\27\0"+
    "\1\134\16\0\10\135\1\132\15\135\1\0\1\135\1\0"+
    "\1\135\1\0\1\47\1\135\1\0\2\135\3\0\1\132"+
    "\1\0\10\24\1\46\4\24\1\136\10\24\1\0\1\24"+
    "\1\0\1\24\1\0\1\47\1\24\1\0\2\24\3\0"+
    "\1\46\17\0\1\137\26\0\10\135\1\0\15\135\1\0"+
    "\1\135\1\0\1\135\2\0\1\135\1\0\2\135\5\0"+
    "\10\24\1\46\6\24\1\123\6\24\1\0\1\24\1\0"+
    "\1\24\1\0\1\47\1\24\1\0\2\24\3\0\1\46"+
    "\6\0\1\140\53\0\1\141\56\0\1\142\22\0\1\143"+
    "\52\0\1\144\41\0\1\145\64\0\1\146\31\0\1\147"+
    "\31\0\1\150\72\0\1\151\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3367];
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\15\1\4\11\20\1\4\0\17\1\4\0"+
    "\13\1\3\0\1\11\4\1\1\0\2\1\2\0\4\1"+
    "\2\11\2\0\1\1\1\0\2\1\10\0\1\1\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[105];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  int[] resultado = new int[12];


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorL(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AnalizadorL(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 114) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 9: 
          { resultado[3]++;System.out.println("CICLO");
          }
        case 15: break;
        case 6: 
          { System.out.print(yytext());
          }
        case 16: break;
        case 11: 
          { resultado[10]++;System.out.println("METHCALL");
          }
        case 17: break;
        case 3: 
          { resultado[5]++;System.out.println("ASIGNACIONES");
          }
        case 18: break;
        case 8: 
          { resultado[6]++;System.out.println("TIPOS");
          }
        case 19: break;
        case 12: 
          { resultado[2]++;System.out.println("CICLO");
          }
        case 20: break;
        case 5: 
          { resultado[8]++;System.out.println("PARAMS");
          }
        case 21: break;
        case 14: 
          { resultado[4]++;System.out.println("IMPRESIONES");
          }
        case 22: break;
        case 13: 
          { resultado[9]++;System.out.println("ARREGLOS");
          }
        case 23: break;
        case 10: 
          { resultado[1]++;System.out.println("ELSE");
          }
        case 24: break;
        case 2: 
          { resultado[11] ++;System.out.println("IDENTIFICADOR");
          }
        case 25: break;
        case 4: 
          { resultado[7]++;System.out.println("BLOQUES");
          }
        case 26: break;
        case 7: 
          { resultado[0]++;System.out.println("IF");
          }
        case 27: break;
        case 1: 
          { 
          }
        case 28: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  public int[] analyze(){
    while ( !this.zzAtEOF ) {
    	try {
    		this.yylex();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    return resultado;
  }


}
