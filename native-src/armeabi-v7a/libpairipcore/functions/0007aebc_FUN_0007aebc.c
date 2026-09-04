/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0007aebc
 * Address  : 0007aebc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0007aebc(int param_1)

{
  undefined4 uVar1;
  int *piVar2;
  int iVar3;
  int local_10;
  int local_c;
  
  local_c = **(int **)(DAT_0007af94 + 0x7aed4);
  if ((uint)*(ushort *)(param_1 + 0x32) <
      (uint)(*(int *)(param_1 + 0x40) - *(int *)(param_1 + 0x3c) >> 3)) {
    uVar1 = 0;
    if (*(int *)(param_1 + 0x10) == 0) {
      uVar1 = (**(code **)(**(int **)(param_1 + 4) + 100))
                        (*(int **)(param_1 + 4),
                         *(undefined4 *)
                          (*(int *)(param_1 + 0x3c) + (uint)*(ushort *)(param_1 + 0x32) * 8));
    }
    **(undefined4 **)(param_1 + 8) = uVar1;
  }
  if (*(int *)(param_1 + 0x10) != 0) {
    (**(code **)(**(int **)(param_1 + 4) + 0x34))();
    iVar3 = *(int *)(param_1 + 0x10);
    *(undefined4 *)(param_1 + 0x10) = 0;
    if (iVar3 != 0) {
      piVar2 = *(int **)(param_1 + 0x28);
      local_10 = iVar3;
      if (piVar2 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
        FUN_000269a8();
      }
      (**(code **)(*piVar2 + 0x18))(piVar2,&local_10);
    }
  }
  if (**(int **)(DAT_0007af98 + 0x7af7c) != local_c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


