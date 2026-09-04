/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00079d78
 * Address  : 00079d78
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00079d78(int *param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)param_1[6];
  *param_1 = DAT_00079ddc + 0x79d98;
  if (piVar1 == param_1 + 2) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (piVar1 == (int *)0x0) goto LAB_000a0320;
  }
  (**(code **)(*piVar1 + iVar2))();
LAB_000a0320:
  FUN_00023f68(param_1,0x20);
  return;
}


