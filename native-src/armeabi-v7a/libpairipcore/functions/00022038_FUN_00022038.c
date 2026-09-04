/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00022038
 * Address  : 00022038
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00022038(int param_1,int *param_2)

{
  int *piVar1;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0xc);
  *(undefined1 *)(piVar1 + 1) = 0x2e;
  *piVar1 = DAT_0002206c + 0x2205a;
  piVar1[2] = *param_2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}


