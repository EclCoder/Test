/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00079de0
 * Address  : 00079de0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00079de0(int *param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)param_1[10];
  *param_1 = DAT_00079e3c + 0x79e00;
  if (piVar1 == param_1 + 6) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (piVar1 == (int *)0x0) goto LAB_000a0360;
  }
  (**(code **)(*piVar1 + iVar2))();
LAB_000a0360:
  FUN_00019df8(param_1);
  return;
}


