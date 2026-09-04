/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023768
 * Address  : 00023768
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023768(int param_1,int *param_2,int *param_3)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  *(undefined1 *)(piVar1 + 1) = 0x1d;
  iVar2 = *param_3;
  *piVar1 = DAT_000237a0 + 0x2378e;
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}


