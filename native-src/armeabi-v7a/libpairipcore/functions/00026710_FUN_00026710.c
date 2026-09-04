/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00026710
 * Address  : 00026710
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


double FUN_00026710(undefined4 param_1,undefined4 param_2)

{
  uint in_fpscr;
  double dVar1;
  
  dVar1 = (double)VectorSignedToFloat(param_2,(byte)(in_fpscr >> 0x16) & 3);
  return DAT_00026740 + dVar1 * DAT_00026738 + (double)CONCAT44(DAT_00026748,param_1);
}


