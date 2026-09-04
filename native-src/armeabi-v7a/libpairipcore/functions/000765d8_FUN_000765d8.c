/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000765d8
 * Address  : 000765d8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000765d8(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_0007663c + 0x765f4);
  (**(code **)(*param_1 + 0x8c))();
  if (**(int **)(DAT_00076640 + 0x76620) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


