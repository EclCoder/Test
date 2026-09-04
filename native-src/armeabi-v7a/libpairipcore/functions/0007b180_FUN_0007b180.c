/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0007b180
 * Address  : 0007b180
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0007b180(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0007b1a8 + DAT_0007b1a8;
  piVar1[1] = iVar2;
  return;
}


