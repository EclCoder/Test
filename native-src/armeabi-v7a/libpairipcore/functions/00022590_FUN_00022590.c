/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00022590
 * Address  : 00022590
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00022590(int param_1,int *param_2,undefined1 *param_3,int *param_4)

{
  int *piVar1;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x14);
  *(undefined1 *)(piVar1 + 1) = 0x31;
  *piVar1 = DAT_000225d8 + 0x225ba;
  piVar1[2] = *param_2;
  *(undefined1 *)(piVar1 + 3) = *param_3;
  piVar1[4] = *param_4;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}


