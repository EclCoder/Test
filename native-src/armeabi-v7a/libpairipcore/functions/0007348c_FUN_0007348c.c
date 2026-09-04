/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0007348c
 * Address  : 0007348c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0007348c(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_000734f0 + 0x734a8);
  (**(code **)(*param_1 + 200))();
  if (**(int **)(DAT_000734f4 + 0x734d4) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


