/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009ba5c
 * Address  : 0009ba5c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009ba5c(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_0009bac0 + 0x9ba78);
  (**(code **)(*param_1 + 0x1cc))();
  if (**(int **)(DAT_0009bac4 + 0x9baa4) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


