/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00079ea0
 * Address  : 00079ea0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00079ea0(int param_1)

{
  int *piVar1;
  int iVar2;
  undefined4 local_10;
  int local_c;
  
  local_c = **(int **)(DAT_00079f3c + 0x79eb8);
  piVar1 = *(int **)(param_1 + 0x28);
  local_10 = *(undefined4 *)(param_1 + 0x10);
  if (piVar1 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_000269a8();
  }
  (**(code **)(*piVar1 + 0x18))(piVar1,&local_10);
  piVar1 = *(int **)(param_1 + 0x28);
  if (piVar1 == (int *)(param_1 + 0x18)) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (piVar1 == (int *)0x0) goto LAB_00079f14;
  }
  (**(code **)(*piVar1 + iVar2))();
LAB_00079f14:
  if (**(int **)(DAT_00079f40 + 0x79f24) == local_c) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


