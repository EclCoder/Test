/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00079d20
 * Address  : 00079d20
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00079d20(int *param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)param_1[6];
  *param_1 = DAT_00079d74 + 0x79d40;
  if (piVar1 == param_1 + 2) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (piVar1 == (int *)0x0) {
      return param_1;
    }
  }
  (**(code **)(*piVar1 + iVar2))();
  return param_1;
}


