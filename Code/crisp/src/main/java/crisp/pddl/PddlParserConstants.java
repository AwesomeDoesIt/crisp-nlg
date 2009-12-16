/* Generated By:JavaCC: Do not edit this line. PddlParserConstants.java */
package crisp.pddl;

public interface PddlParserConstants {

  int EOF = 0;
  int SINGLE_LINE_COMMENT = 6;
  int DEFINE = 7;
  int DOMAIN = 8;
  int FUNCTION = 9;
  int REQUIREMENTS = 10;
  int TYPES = 11;
  int CONSTANTS = 12;
  int PREDICATES = 13;
  int PROBLEM = 14;
  int DOMAIN_TAG = 15;
  int OBJECT = 16;
  int GOAL = 17;
  int INIT = 18;
  int METRIC = 19;
  int MAXIMIZE = 20;
  int MINIMIZE = 21;
  int LENGTH = 22;
  int SERIAL = 23;
  int PARALLEL = 24;
  int UPDATE = 25;
  int PROBLEM_TAG = 26;
  int EXEC = 27;
  int FAILURE = 28;
  int GOALADD = 29;
  int GOALDEL = 30;
  int COMMIT = 31;
  int REQUIREMENT = 32;
  int ACTION = 33;
  int DURATIVE_ACTION = 34;
  int VARS = 35;
  int PARAMETERS = 36;
  int DURATION = 37;
  int DURATION_VAR = 38;
  int COST = 39;
  int CONDITION = 40;
  int PRECONDITION = 41;
  int EFFECT = 42;
  int AND = 43;
  int OR = 44;
  int NOT = 45;
  int FORALL = 46;
  int WHEN = 47;
  int EXISTS = 48;
  int EITHER = 49;
  int HARD = 50;
  int SOFT = 51;
  int NUMBER = 52;
  int ASSIGN = 53;
  int INCREASE = 54;
  int DECREASE = 55;
  int SCALEUP = 56;
  int SCALEDOWN = 57;
  int EQ = 58;
  int LT = 59;
  int GT = 60;
  int LTE = 61;
  int GTE = 62;
  int ADD = 63;
  int DASH = 64;
  int MUL = 65;
  int DIV = 66;
  int VAR = 67;
  int NAME = 68;
  int OPENBRACE = 69;
  int CLOSEBRACE = 70;
  int COMMA = 71;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "\"define\"",
    "\"domain\"",
    "\":functions\"",
    "\":requirements\"",
    "\":types\"",
    "\":constants\"",
    "\":predicates\"",
    "\"problem\"",
    "\":domain\"",
    "\":objects\"",
    "\":goal\"",
    "\":init\"",
    "\":metric\"",
    "\"maximize\"",
    "\"minimize\"",
    "\":length\"",
    "\":serial\"",
    "\":parallel\"",
    "\"update\"",
    "\":problem\"",
    "\":exec\"",
    "\":failure\"",
    "\":goal-add\"",
    "\":goal-delete\"",
    "\":commit\"",
    "<REQUIREMENT>",
    "\":action\"",
    "\":durative-action\"",
    "\":vars\"",
    "\":parameters\"",
    "\":duration\"",
    "\"?duration\"",
    "\":cost\"",
    "\":condition\"",
    "\":precondition\"",
    "\":effect\"",
    "\"and\"",
    "\"or\"",
    "\"not\"",
    "\"forall\"",
    "\"when\"",
    "\"exists\"",
    "\"either\"",
    "\"hard\"",
    "\"soft\"",
    "<NUMBER>",
    "<ASSIGN>",
    "<INCREASE>",
    "<DECREASE>",
    "<SCALEUP>",
    "<SCALEDOWN>",
    "\"=\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "<VAR>",
    "<NAME>",
    "\"(\"",
    "\")\"",
    "\",\"",
  };

}