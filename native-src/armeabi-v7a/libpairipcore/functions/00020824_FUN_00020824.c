/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020824
 * Address  : 00020824
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00020824(int *param_1,int param_2,int param_3,int param_4,ushort param_5)

{
  *(undefined1 *)(param_1 + 1) = 0x3c;
  param_1[2] = param_2;
  param_1[3] = param_3;
  param_1[4] = param_4;
  param_1[5] = 0;
  param_1[6] = 0;
  *param_1 = DAT_00020858 + 0x20848;
  *(ushort *)((int)param_1 + 5) =
       (param_5 & 0x3f) + (*(ushort *)((int)param_1 + 5) & 0xf000) + 0x540;
  return;
}


