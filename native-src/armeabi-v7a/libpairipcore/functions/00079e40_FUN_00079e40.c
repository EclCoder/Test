/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00079e40
 * Address  : 00079e40
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00079e40(int *param_1)

{
  int *piVar1;
  undefined4 uVar2;
  int iVar3;
  
  piVar1 = (int *)param_1[10];
  *param_1 = DAT_00079e9c + 0x79e60;
  if (piVar1 == param_1 + 6) {
    iVar3 = 0x10;
  }
  else {
    iVar3 = 0x14;
    if (piVar1 == (int *)0x0) goto LAB_00079e88;
  }
  (**(code **)(*piVar1 + iVar3))();
LAB_00079e88:
  uVar2 = FUN_00019df8(param_1);
  FUN_00023f68(uVar2,0x30);
  return;
}


