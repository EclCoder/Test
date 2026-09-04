/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020214
 * Address  : 00020214
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00020214(int param_1,int *param_2)

{
  int *piVar1;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0xc);
  *(undefined1 *)(piVar1 + 1) = 0x2a;
  *piVar1 = DAT_00020248 + 0x20236;
  piVar1[2] = *param_2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}


