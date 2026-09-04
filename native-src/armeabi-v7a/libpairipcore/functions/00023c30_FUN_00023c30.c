/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023c30
 * Address  : 00023c30
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023c30(int param_1,undefined4 param_2)

{
  int iVar1;
  
  iVar1 = *(int *)(param_1 + 8);
  if (*(char *)(iVar1 + 4) == '\v') {
    iVar1 = FUN_00023c8c();
    if (iVar1 != 0) {
      return;
    }
    iVar1 = *(int *)(param_1 + 8);
  }
  iVar1 = FUN_0001ead4(iVar1,param_2);
  if ((iVar1 != 0) || (iVar1 = FUN_0001eaf4(*(undefined4 *)(param_1 + 8),param_2), iVar1 != 0)) {
    FUN_0001dcd6(param_2,DAT_00023c78 + 0x23c66,1);
  }
                    /* WARNING: Could not recover jumptable at 0x00023c74. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 8) + 0x14))(*(int **)(param_1 + 8),param_2);
  return;
}


