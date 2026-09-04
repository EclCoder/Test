/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002220c
 * Address  : 0002220c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002220c(int param_1,int *param_2)

{
  int *piVar1;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0xc);
  *(undefined1 *)(piVar1 + 1) = 4;
  *piVar1 = DAT_00022240 + 0x2222e;
  piVar1[2] = *param_2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}


