/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001ba82
 * Address  : 0001ba82
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001ba82(int param_1,int param_2,int param_3,int param_4,int param_5,undefined4 param_6)

{
  int iVar1;
  
  iVar1 = FUN_0001b62c(param_1,*(undefined4 *)(param_2 + 8),param_6);
  if (iVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x0001bace. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(**(int **)(param_1 + 8) + 0x14))(*(int **)(param_1 + 8),param_2,param_3,param_4);
    return;
  }
  *(undefined1 *)(param_2 + 0x35) = 1;
  if (param_4 == *(int *)(param_2 + 4)) {
    *(undefined1 *)(param_2 + 0x34) = 1;
    if (*(int *)(param_2 + 0x10) == 0) {
      *(int *)(param_2 + 0x18) = param_5;
      *(undefined4 *)(param_2 + 0x24) = 1;
      *(int *)(param_2 + 0x10) = param_3;
      if (param_5 != 1) {
        return;
      }
      iVar1 = *(int *)(param_2 + 0x30);
    }
    else {
      if (*(int *)(param_2 + 0x10) != param_3) {
        *(int *)(param_2 + 0x24) = *(int *)(param_2 + 0x24) + 1;
        goto LAB_0001b934;
      }
      iVar1 = *(int *)(param_2 + 0x18);
      if (*(int *)(param_2 + 0x18) == 2) {
        *(int *)(param_2 + 0x18) = param_5;
        iVar1 = param_5;
      }
      if (*(int *)(param_2 + 0x30) != 1) {
        return;
      }
    }
    if (iVar1 == 1) {
LAB_0001b934:
      *(undefined1 *)(param_2 + 0x36) = 1;
      return;
    }
  }
  return;
}


