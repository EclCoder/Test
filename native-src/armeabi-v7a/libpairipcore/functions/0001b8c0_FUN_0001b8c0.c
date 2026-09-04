/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b8c0
 * Address  : 0001b8c0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001b8c0(int param_1,int param_2,int param_3,undefined4 param_4)

{
  int iVar1;
  bool bVar2;
  
  if (*(int *)(param_1 + 4) != *(int *)(*(int *)(param_2 + 8) + 4)) {
                    /* WARNING: Could not recover jumptable at 0x0001b8da. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(**(int **)(param_1 + 8) + 0x1c))();
    return;
  }
  if (*(int *)(param_2 + 0x24) == 0) {
    *(undefined4 *)(param_2 + 0x18) = param_4;
    *(undefined4 *)(param_2 + 0x24) = 1;
    *(int *)(param_2 + 0x10) = param_3;
    *(undefined4 *)(param_2 + 0x14) = *(undefined4 *)(param_2 + 0x38);
    return;
  }
  iVar1 = *(int *)(param_2 + 0x14);
  bVar2 = iVar1 == *(int *)(param_2 + 0x38);
  if (bVar2) {
    iVar1 = *(int *)(param_2 + 0x10);
  }
  if (bVar2 && iVar1 == param_3) {
    if (*(int *)(param_2 + 0x18) == 2) {
      *(undefined4 *)(param_2 + 0x18) = param_4;
    }
    return;
  }
  *(undefined1 *)(param_2 + 0x36) = 1;
  *(undefined4 *)(param_2 + 0x18) = 2;
  *(int *)(param_2 + 0x24) = *(int *)(param_2 + 0x24) + 1;
  return;
}


