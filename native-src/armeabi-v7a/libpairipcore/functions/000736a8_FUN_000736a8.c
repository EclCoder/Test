/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000736a8
 * Address  : 000736a8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000736a8(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_0007370c + 0x736c4);
  (**(code **)(*param_1 + 0xec))();
  if (**(int **)(DAT_00073710 + 0x736f0) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


