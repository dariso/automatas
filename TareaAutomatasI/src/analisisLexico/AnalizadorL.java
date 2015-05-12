package analisisLexico;

import java.io.IOException;

/*
 *Clase autogenerada por JFlex, con el cambio de que implementa la interfaz AnalizadorLexico 
*/
@SuppressWarnings({"unused"})
public class AnalizadorL implements AnalizadorLexico {

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
    "\11\0\1\35\1\53\2\0\1\35\22\0\1\35\1\37\1\32\1\0"+
    "\1\40\3\0\1\36\1\45\1\0\1\26\1\50\1\27\1\10\1\0"+
    "\12\34\2\0\1\30\1\25\1\30\1\50\1\0\22\47\1\41\7\47"+
    "\1\51\1\33\1\52\1\33\1\40\1\33\1\3\1\15\1\1\1\22"+
    "\1\12\1\23\1\43\1\6\1\7\1\46\1\16\1\2\1\42\1\14"+
    "\1\21\1\17\1\46\1\11\1\4\1\5\1\13\1\20\1\31\1\46"+
    "\1\24\1\46\1\44\uff84\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\16\2\1\3\3\1\1\2\2\1\1\2"+
    "\1\1\1\4\1\5\1\1\1\6\5\2\3\0\17\2"+
    "\1\1\5\2\4\0\1\7\3\2\1\10\5\2\1\1"+
    "\1\11\1\0\1\7\16\2\2\0\1\7\1\0\2\2"+
    "\1\11\4\2\2\12\1\2\1\13\7\2\1\0\1\7"+
    "\1\2\2\0\1\7\7\2\2\14\1\2\2\0\4\2"+
    "\1\0\1\7\1\11\1\0\3\2\2\15\1\0\1\2"+
    "\10\0\1\16\1\0\1\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[156];
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
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268\0\u0294"+
    "\0\u02c0\0\u02ec\0\u0318\0\u02c0\0\u0344\0\u0370\0\u039c\0\u03c8"+
    "\0\u03f4\0\54\0\54\0\u0420\0\54\0\u044c\0\u0478\0\u04a4"+
    "\0\u04d0\0\u04fc\0\u0528\0\u0420\0\u0554\0\u0580\0\u05ac\0\u05d8"+
    "\0\u0604\0\u0630\0\u065c\0\u0688\0\u06b4\0\u06e0\0\u070c\0\u0738"+
    "\0\u0764\0\u0790\0\u07bc\0\u07e8\0\u0814\0\u0840\0\u086c\0\u0898"+
    "\0\u08c4\0\u08f0\0\u0370\0\u091c\0\u0948\0\u0974\0\u09a0\0\u09cc"+
    "\0\u09f8\0\u0a24\0\u0a50\0\u0a7c\0\u0aa8\0\u0ad4\0\u0b00\0\u0b2c"+
    "\0\u044c\0\u0b58\0\u0b84\0\u0bb0\0\u0bdc\0\u0c08\0\u0c34\0\u0c60"+
    "\0\u0c8c\0\u0cb8\0\u0ce4\0\u0d10\0\u0d3c\0\u0d68\0\u0d94\0\u0dc0"+
    "\0\u0dec\0\u0e18\0\u0e44\0\u0e70\0\u0e9c\0\u09a0\0\u0ec8\0\u0ef4"+
    "\0\u044c\0\u0f20\0\u0f4c\0\u0f78\0\u0fa4\0\u0fd0\0\u0ffc\0\u1028"+
    "\0\u044c\0\u1054\0\u1080\0\u10ac\0\u10d8\0\u1104\0\u1130\0\u115c"+
    "\0\u1188\0\u11b4\0\u11e0\0\u120c\0\u1238\0\u1264\0\u1290\0\u12bc"+
    "\0\u12e8\0\u1314\0\u1340\0\u136c\0\u1398\0\u13c4\0\u13f0\0\u141c"+
    "\0\u1448\0\u1474\0\u14a0\0\u14cc\0\u14f8\0\u1524\0\u1550\0\u157c"+
    "\0\u0420\0\u15a8\0\u15d4\0\u1600\0\u162c\0\u1658\0\u1684\0\u16b0"+
    "\0\u16dc\0\u1708\0\u1734\0\u1760\0\u178c\0\u17b8\0\u17e4\0\u1810"+
    "\0\u183c\0\u1868\0\u1894\0\54";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[156];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\2\1\12\1\13\1\10\1\14\1\15\1\10\1\16"+
    "\2\10\1\17\1\20\1\10\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\2\1\27\3\2\1\30\1\31\2\10"+
    "\1\32\1\33\1\10\1\34\3\2\1\35\55\0\1\36"+
    "\1\37\1\40\2\36\1\41\1\36\1\0\14\36\4\0"+
    "\1\36\2\0\1\42\1\43\2\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\43\1\0\7\36\1\0"+
    "\10\36\1\46\3\36\4\0\1\36\2\0\1\42\1\43"+
    "\2\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\43\1\0\7\36\1\0\4\36\1\47\7\36\4\0"+
    "\1\36\2\0\1\42\1\43\2\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\43\1\0\5\36\1\50"+
    "\1\36\1\0\14\36\4\0\1\36\2\0\1\42\1\43"+
    "\2\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\43\1\0\5\36\1\51\1\36\1\0\1\52\13\36"+
    "\4\0\1\36\2\0\1\42\1\43\2\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\43\1\0\7\36"+
    "\1\0\14\36\4\0\1\36\2\0\1\42\1\43\2\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\43"+
    "\1\0\7\36\1\0\3\36\1\53\6\36\1\54\1\36"+
    "\4\0\1\36\2\0\1\42\1\43\2\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\43\1\0\7\36"+
    "\1\0\1\36\1\55\12\36\4\0\1\36\2\0\1\42"+
    "\1\43\2\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\43\1\0\1\36\1\56\5\36\1\0\14\36"+
    "\4\0\1\36\2\0\1\42\1\43\2\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\43\1\0\7\36"+
    "\1\0\1\36\1\57\12\36\4\0\1\36\2\0\1\42"+
    "\1\43\2\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\43\1\0\7\36\1\0\1\60\7\36\1\61"+
    "\2\36\1\62\4\0\1\36\2\0\1\42\1\43\2\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\43"+
    "\1\0\7\36\1\0\1\63\1\36\1\64\11\36\4\0"+
    "\1\36\2\0\1\42\1\43\2\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\43\1\0\7\36\1\0"+
    "\10\36\1\65\3\36\4\0\1\36\2\0\1\42\1\43"+
    "\2\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\43\1\0\1\36\1\66\1\67\3\36\1\70\1\0"+
    "\10\36\1\71\3\36\4\0\1\36\2\0\1\42\1\43"+
    "\2\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\43\25\0\1\2\54\0\1\2\54\0\1\2\25\0"+
    "\5\36\1\72\1\36\1\0\14\36\4\0\1\36\2\0"+
    "\1\42\1\43\2\0\1\44\3\36\2\0\2\36\1\0"+
    "\1\45\1\0\1\43\1\0\7\73\1\0\14\73\4\0"+
    "\1\73\1\2\2\73\3\0\4\73\2\0\2\73\1\0"+
    "\2\73\35\0\1\27\20\0\7\30\1\0\14\30\4\0"+
    "\1\30\2\0\1\42\1\43\2\0\1\44\3\30\2\0"+
    "\2\30\1\0\1\45\1\0\1\43\1\0\4\44\1\74"+
    "\2\44\1\0\13\44\1\75\4\0\1\44\3\0\1\43"+
    "\2\0\4\44\2\0\2\44\1\0\1\45\1\0\1\43"+
    "\1\0\7\44\1\0\14\44\4\0\1\44\3\0\1\43"+
    "\2\0\4\44\2\0\2\44\1\0\1\45\1\0\1\43"+
    "\1\0\7\36\1\0\14\36\4\0\1\36\2\0\1\42"+
    "\1\76\1\77\1\0\1\44\3\36\2\0\2\36\1\0"+
    "\1\45\1\0\1\76\1\0\2\36\1\100\4\36\1\0"+
    "\14\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\4\36\1\101\2\36\1\0\14\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\2\36\1\102"+
    "\4\36\1\0\14\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\1\0\7\42\1\0\14\42\4\0\1\42"+
    "\2\0\1\42\4\0\3\42\2\0\2\42\41\0\1\43"+
    "\13\0\1\45\1\0\1\43\34\0\1\45\15\0\1\103"+
    "\2\0\7\36\1\0\3\36\1\104\10\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\3\36\1\105"+
    "\3\36\1\0\14\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\1\0\7\36\1\0\10\36\1\106\3\36"+
    "\4\0\1\36\2\0\1\42\1\76\1\77\1\0\1\44"+
    "\3\36\2\0\2\36\1\0\1\45\1\0\1\76\1\0"+
    "\6\36\1\107\1\0\14\36\4\0\1\36\2\0\1\42"+
    "\1\76\1\77\1\0\1\44\3\36\2\0\2\36\1\0"+
    "\1\45\1\0\1\76\1\0\7\36\1\0\2\36\1\110"+
    "\10\36\1\111\4\0\1\36\2\0\1\42\1\76\1\77"+
    "\1\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\76\1\0\4\36\1\112\2\36\1\0\14\36\4\0"+
    "\1\36\2\0\1\42\1\76\1\77\1\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\76\1\0\7\36"+
    "\1\0\14\36\4\0\1\36\2\0\1\42\1\113\1\114"+
    "\1\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\113\1\0\4\36\1\115\2\36\1\0\14\36\4\0"+
    "\1\36\2\0\1\42\1\76\1\77\1\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\76\1\0\3\36"+
    "\1\116\3\36\1\0\14\36\4\0\1\36\2\0\1\42"+
    "\1\76\1\77\1\0\1\44\3\36\2\0\2\36\1\0"+
    "\1\45\1\0\1\76\1\0\7\36\1\0\14\36\4\0"+
    "\1\111\2\0\1\42\1\76\1\77\1\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\76\1\0\7\36"+
    "\1\0\1\36\1\117\12\36\4\0\1\36\2\0\1\42"+
    "\1\76\1\77\1\0\1\44\3\36\2\0\2\36\1\0"+
    "\1\45\1\0\1\76\1\0\7\36\1\0\10\36\1\120"+
    "\3\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\4\36\1\121\2\36\1\0\14\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\6\36\1\122"+
    "\1\0\10\36\1\123\3\36\4\0\1\36\2\0\1\42"+
    "\1\76\1\77\1\0\1\44\3\36\2\0\2\36\1\0"+
    "\1\45\1\0\1\76\1\0\7\36\1\0\4\36\1\124"+
    "\7\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\7\36\1\0\2\36\1\125\11\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\7\36\1\0"+
    "\10\36\1\126\3\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\1\0\1\36\1\127\5\36\1\0\14\36"+
    "\4\0\1\36\2\0\1\42\1\76\1\77\1\0\1\44"+
    "\3\36\2\0\2\36\1\0\1\45\1\0\1\76\1\0"+
    "\7\36\1\0\3\36\1\130\10\36\4\0\1\36\2\0"+
    "\1\42\1\76\1\77\1\0\1\44\3\36\2\0\2\36"+
    "\1\0\1\45\1\0\1\76\1\0\7\36\1\0\1\131"+
    "\13\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\6\36\1\132\1\0\14\36\4\0\1\36\2\0"+
    "\1\42\1\76\1\77\1\0\1\44\3\36\2\0\2\36"+
    "\1\0\1\45\1\0\1\76\1\0\7\44\1\0\1\133"+
    "\13\44\4\0\1\44\3\0\1\43\2\0\4\44\2\0"+
    "\2\44\1\0\1\45\1\0\1\43\1\0\3\44\1\134"+
    "\3\44\1\0\14\44\4\0\1\44\3\0\1\43\2\0"+
    "\4\44\2\0\2\44\1\0\1\45\1\0\1\43\35\0"+
    "\1\76\1\77\12\0\1\45\1\0\1\76\1\0\7\135"+
    "\1\0\14\135\4\0\1\135\3\0\1\136\3\0\3\135"+
    "\2\0\3\135\2\0\1\136\1\0\3\36\1\137\3\36"+
    "\1\0\14\36\4\0\1\36\2\0\1\42\1\76\1\77"+
    "\1\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\76\1\0\1\140\6\36\1\0\14\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\7\36\1\0"+
    "\1\141\13\36\4\0\1\36\2\0\1\42\1\76\1\77"+
    "\1\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\76\51\0\1\45\3\0\7\36\1\0\14\36\4\0"+
    "\1\36\2\0\1\42\1\76\1\77\1\0\1\44\2\36"+
    "\1\141\2\0\2\36\1\0\1\45\1\0\1\76\1\0"+
    "\4\36\1\142\2\36\1\0\14\36\4\0\1\36\2\0"+
    "\1\42\1\76\1\77\1\0\1\44\3\36\2\0\2\36"+
    "\1\0\1\45\1\0\1\76\1\0\7\36\1\0\1\143"+
    "\13\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\3\36\1\144\3\36\1\0\14\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\7\36\1\0"+
    "\1\36\1\111\12\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\1\0\7\36\1\0\1\36\1\145\12\36"+
    "\4\0\1\36\2\0\1\42\1\76\1\77\1\0\1\44"+
    "\3\36\2\0\2\36\1\0\1\45\1\0\1\76\35\0"+
    "\1\113\1\114\12\0\1\45\1\0\1\113\1\0\7\146"+
    "\1\0\14\146\4\0\1\146\2\0\1\147\1\136\1\0"+
    "\2\147\3\146\2\0\2\146\1\135\2\0\1\136\1\0"+
    "\7\36\1\0\2\36\1\150\11\36\4\0\1\36\2\0"+
    "\1\42\1\76\1\77\1\0\1\44\3\36\2\0\2\36"+
    "\1\0\1\45\1\0\1\76\1\0\7\36\1\0\1\36"+
    "\1\151\12\36\4\0\1\36\2\0\1\42\1\76\1\77"+
    "\1\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\76\1\0\2\36\1\152\4\36\1\0\14\36\4\0"+
    "\1\36\2\0\1\42\1\76\1\77\1\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\76\1\0\1\36"+
    "\1\153\5\36\1\0\14\36\4\0\1\36\2\0\1\42"+
    "\1\76\1\77\1\0\1\44\3\36\2\0\2\36\1\0"+
    "\1\45\1\0\1\76\1\0\7\36\1\0\1\36\1\141"+
    "\12\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\7\36\1\0\7\36\1\154\4\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\4\36\1\155"+
    "\2\36\1\0\14\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\1\0\1\36\1\156\5\36\1\0\14\36"+
    "\4\0\1\36\2\0\1\42\1\76\1\77\1\0\1\44"+
    "\3\36\2\0\2\36\1\0\1\45\1\0\1\76\1\0"+
    "\7\36\1\0\4\36\1\157\7\36\4\0\1\36\2\0"+
    "\1\42\1\76\1\77\1\0\1\44\3\36\2\0\2\36"+
    "\1\0\1\45\1\0\1\76\1\0\2\36\1\143\4\36"+
    "\1\0\14\36\4\0\1\36\2\0\1\42\1\76\1\77"+
    "\1\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\76\1\0\3\36\1\110\3\36\1\0\14\36\4\0"+
    "\1\36\2\0\1\42\1\76\1\77\1\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\76\1\0\2\36"+
    "\1\160\4\36\1\0\14\36\4\0\1\36\2\0\1\42"+
    "\1\76\1\77\1\0\1\44\3\36\2\0\2\36\1\0"+
    "\1\45\1\0\1\76\1\0\7\36\1\0\14\36\4\0"+
    "\1\36\2\0\1\42\1\161\1\162\1\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\161\1\0\1\36"+
    "\1\163\5\36\1\0\14\36\4\0\1\36\2\0\1\42"+
    "\1\76\1\77\1\0\1\44\3\36\2\0\2\36\1\0"+
    "\1\45\1\0\1\76\1\0\6\44\1\164\1\0\14\44"+
    "\4\0\1\44\3\0\1\43\2\0\4\44\2\0\2\44"+
    "\1\0\1\45\1\0\1\43\1\0\4\44\1\165\2\44"+
    "\1\0\14\44\4\0\1\44\3\0\1\43\2\0\4\44"+
    "\2\0\2\44\1\0\1\45\1\0\1\43\1\0\7\135"+
    "\1\0\14\135\4\0\1\135\3\0\1\166\3\0\3\135"+
    "\2\0\3\135\2\0\1\166\1\0\3\36\1\111\3\36"+
    "\1\0\14\36\4\0\1\36\2\0\1\42\1\76\1\77"+
    "\1\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\76\1\0\5\36\1\111\1\36\1\0\14\36\4\0"+
    "\1\36\2\0\1\42\1\76\1\77\1\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\76\1\0\7\36"+
    "\1\0\1\167\13\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\1\0\4\36\1\141\2\36\1\0\14\36"+
    "\4\0\1\36\2\0\1\42\1\76\1\77\1\0\1\44"+
    "\3\36\2\0\2\36\1\0\1\45\1\0\1\76\1\0"+
    "\7\36\1\2\14\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\1\0\7\36\1\0\1\170\13\36\4\0"+
    "\1\36\2\0\1\42\1\76\1\77\1\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\76\1\0\7\146"+
    "\1\0\14\146\4\0\1\146\2\0\2\147\1\0\2\147"+
    "\3\146\2\0\2\146\1\135\2\0\1\147\1\0\7\147"+
    "\1\0\14\147\4\0\1\147\2\0\2\147\1\0\5\147"+
    "\2\0\2\147\3\0\1\147\1\0\7\36\1\0\1\171"+
    "\13\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\7\36\1\0\5\36\1\111\6\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\7\36\1\0"+
    "\1\36\1\172\12\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\1\0\2\36\1\173\4\36\1\0\14\36"+
    "\4\0\1\36\2\0\1\42\1\76\1\77\1\0\1\44"+
    "\3\36\2\0\2\36\1\0\1\45\1\0\1\76\1\0"+
    "\7\36\1\0\1\36\1\174\12\36\4\0\1\36\2\0"+
    "\1\42\1\76\1\77\1\0\1\44\3\36\2\0\2\36"+
    "\1\0\1\45\1\0\1\76\1\0\6\36\1\175\1\0"+
    "\14\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\1\36\1\121\5\36\1\0\14\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\1\36\1\111"+
    "\5\36\1\0\14\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\35\0\1\161\1\162\12\0\1\45\1\0"+
    "\1\161\1\0\7\176\1\0\14\176\4\0\1\176\2\0"+
    "\1\177\1\136\2\0\1\177\3\176\2\0\2\176\1\135"+
    "\2\0\1\136\1\0\7\36\1\0\1\36\1\200\12\36"+
    "\4\0\1\36\2\0\1\42\1\76\1\77\1\0\1\44"+
    "\3\36\2\0\2\36\1\0\1\45\1\0\1\76\1\0"+
    "\7\44\1\0\3\44\1\201\10\44\4\0\1\44\3\0"+
    "\1\43\2\0\4\44\2\0\2\44\1\0\1\45\1\0"+
    "\1\43\1\0\7\44\1\0\1\44\1\202\12\44\4\0"+
    "\1\44\3\0\1\43\2\0\4\44\2\0\2\44\1\0"+
    "\1\45\1\0\1\43\35\0\1\166\15\0\1\166\1\0"+
    "\2\36\1\203\4\36\1\0\14\36\4\0\1\36\2\0"+
    "\1\42\1\76\1\77\1\0\1\44\3\36\2\0\2\36"+
    "\1\0\1\45\1\0\1\76\1\0\7\36\1\0\12\36"+
    "\1\204\1\36\4\0\1\36\2\0\1\42\1\76\1\77"+
    "\1\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\76\1\0\7\36\1\0\3\36\1\111\10\36\4\0"+
    "\1\36\2\0\1\42\1\76\1\77\1\0\1\44\3\36"+
    "\2\0\2\36\1\0\1\45\1\0\1\76\1\0\2\36"+
    "\1\205\4\36\1\0\14\36\4\0\1\36\2\0\1\42"+
    "\1\76\1\77\1\0\1\44\3\36\2\0\2\36\1\0"+
    "\1\45\1\0\1\76\1\0\4\36\1\110\2\36\1\0"+
    "\14\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\1\206\6\36\1\0\14\36\4\0\1\36\2\0"+
    "\1\42\1\76\1\77\1\0\1\44\3\36\2\0\2\36"+
    "\1\0\1\45\1\0\1\76\1\0\1\111\6\36\1\0"+
    "\14\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\7\176\1\0\14\176\4\0\1\176\2\0\2\177"+
    "\2\0\1\177\3\176\2\0\2\176\1\135\2\0\1\177"+
    "\1\0\7\177\1\0\14\177\4\0\1\177\2\0\2\177"+
    "\2\0\4\177\2\0\2\177\3\0\1\177\1\0\7\36"+
    "\1\0\14\36\4\0\1\36\2\0\1\42\1\207\1\210"+
    "\1\0\1\44\3\36\2\0\2\36\1\0\1\45\1\0"+
    "\1\207\1\0\7\44\1\0\14\44\4\0\1\44\3\0"+
    "\1\43\2\0\3\44\1\211\2\0\2\44\1\0\1\45"+
    "\1\0\1\43\1\0\7\44\1\0\14\44\4\0\1\44"+
    "\3\0\1\43\2\0\2\44\1\212\1\44\2\0\2\44"+
    "\1\0\1\45\1\0\1\43\1\0\1\213\6\36\1\0"+
    "\14\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\2\36\1\214\4\36\1\0\14\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\7\36\1\0"+
    "\3\36\1\141\10\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\1\0\4\36\1\215\2\36\1\0\14\36"+
    "\4\0\1\36\2\0\1\42\1\76\1\77\1\0\1\44"+
    "\3\36\2\0\2\36\1\0\1\45\1\0\1\76\35\0"+
    "\1\207\1\210\12\0\1\45\1\0\1\207\1\0\7\216"+
    "\1\0\14\216\4\0\1\216\2\0\1\217\1\136\1\0"+
    "\2\217\3\216\2\0\2\216\1\135\2\0\1\136\1\0"+
    "\7\44\1\220\14\44\4\0\1\44\3\0\1\43\2\0"+
    "\4\44\2\0\2\44\1\0\1\45\1\0\1\43\1\0"+
    "\4\36\1\111\2\36\1\0\14\36\4\0\1\36\2\0"+
    "\1\42\1\76\1\77\1\0\1\44\3\36\2\0\2\36"+
    "\1\0\1\45\1\0\1\76\1\0\1\110\6\36\1\0"+
    "\14\36\4\0\1\36\2\0\1\42\1\76\1\77\1\0"+
    "\1\44\3\36\2\0\2\36\1\0\1\45\1\0\1\76"+
    "\1\0\7\36\1\0\1\36\1\221\12\36\4\0\1\36"+
    "\2\0\1\42\1\76\1\77\1\0\1\44\3\36\2\0"+
    "\2\36\1\0\1\45\1\0\1\76\1\0\7\216\1\0"+
    "\14\216\4\0\1\216\2\0\2\217\1\0\2\217\3\216"+
    "\2\0\2\216\1\135\2\0\1\217\1\0\7\217\1\0"+
    "\14\217\4\0\1\217\2\0\2\217\1\0\5\217\2\0"+
    "\2\217\3\0\1\217\21\0\1\222\33\0\7\36\1\0"+
    "\11\36\1\111\2\36\4\0\1\36\2\0\1\42\1\76"+
    "\1\77\1\0\1\44\3\36\2\0\2\36\1\0\1\45"+
    "\1\0\1\76\13\0\1\223\45\0\1\224\56\0\1\225"+
    "\62\0\1\226\45\0\1\227\51\0\1\230\60\0\1\231"+
    "\44\0\1\232\50\0\1\233\65\0\1\234\37\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6336];
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
    "\1\0\1\11\27\1\2\11\1\1\1\11\5\1\3\0"+
    "\25\1\4\0\14\1\1\0\17\1\2\0\1\1\1\0"+
    "\22\1\1\0\2\1\2\0\13\1\2\0\4\1\1\0"+
    "\2\1\1\0\5\1\1\0\1\1\10\0\1\1\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[156];
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
    while (i < 128) {
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
        case 6: 
          { System.out.print(yytext());
          }
        case 15: break;
        case 8: 
          { resultado[9]++;
          }
        case 16: break;
        case 5: 
          { resultado[8]++;
          }
        case 17: break;
        case 4: 
          { resultado[7]++;
          }
        case 18: break;
        case 9: 
          { resultado[6]++;
          }
        case 19: break;
        case 3: 
          { resultado[5]++;
          }
        case 20: break;
        case 14: 
          { resultado[4]++;
          }
        case 21: break;
        case 2: 
          { resultado[11]++;
          }
        case 22: break;
        case 12: 
          { resultado[3]++;
          }
        case 23: break;
        case 7: 
          { resultado[10]++;
          }
        case 24: break;
        case 13: 
          { resultado[2]++;
          }
        case 25: break;
        case 11: 
          { resultado[1]++;
          }
        case 26: break;
        case 10: 
          { resultado[0]++;
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

public String[] getNombreCompLexicos(){
	  String[] nombres = {"IF   ","ELSE   ","WHILE ","FOR  ","IMPRE ",
			  "ASIGN ","TIPO ","BLOQ ","PARAM ","ARREGLO","METHCALLS","IDs  "};
      return nombres;
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
