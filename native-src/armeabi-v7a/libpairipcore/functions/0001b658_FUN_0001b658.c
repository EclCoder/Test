/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b658
 * Address  : 0001b658
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_0001b658(int param_1,int param_2,int *param_3)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  bool bVar4;
  
  if (*(int *)(param_1 + 4) == *(int *)(param_2 + 4)) {
    bVar4 = true;
  }
  else {
    bVar4 = false;
    piVar3 = (int *)FUN_0001b708(param_2,*(undefined4 *)(DAT_0001b6f4 + 0x1b676),
                                 *(undefined4 *)(DAT_0001b6f8 + 0x1b67c),0);
    if (piVar3 != (int *)0x0) {
      if (*param_3 == 0) {
                    /* WARNING: Subroutine does not return */
        FUN_0001b568(DAT_0001b6fc + 0x1b6ec,DAT_0001b700 + 0x1b6ee,0x1e7,DAT_0001b704 + 0x1b6f0);
      }
      iVar1 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
      iVar2 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
      (**(code **)(*piVar3 + 0x1c))();
      bVar4 = iVar1 == 1;
      if (iVar1 == 1) {
        *param_3 = iVar2;
      }
    }
  }
  return bVar4;
}


