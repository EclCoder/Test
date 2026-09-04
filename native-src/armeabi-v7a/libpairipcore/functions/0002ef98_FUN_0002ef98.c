/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002ef98
 * Address  : 0002ef98
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002ef98(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)*(int *)(param_1 + 0xc);
  while (piVar1 != (int *)0x0) {
    iVar2 = *piVar1;
    FUN_00023f68(piVar1,0x18);
    piVar1 = (int *)iVar2;
  }
  iVar2 = *(int *)(param_1 + 4);
  *(undefined4 *)(param_1 + 4) = 0;
  if (iVar2 != 0) {
    FUN_00023f68(iVar2,*(int *)(param_1 + 8) << 2);
  }
  FUN_00023f68(param_1,0x1c);
  return;
}


