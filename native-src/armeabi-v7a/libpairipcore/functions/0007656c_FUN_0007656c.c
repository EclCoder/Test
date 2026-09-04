/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0007656c
 * Address  : 0007656c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0007656c(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_000765d0 + 0x76588);
  (**(code **)(*param_1 + 0xf8))();
  if (**(int **)(DAT_000765d4 + 0x765b4) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


