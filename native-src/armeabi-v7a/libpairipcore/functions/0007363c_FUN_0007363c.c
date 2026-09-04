/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0007363c
 * Address  : 0007363c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0007363c(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_000736a0 + 0x73658);
  (**(code **)(*param_1 + 0xa4))();
  if (**(int **)(DAT_000736a4 + 0x73684) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


