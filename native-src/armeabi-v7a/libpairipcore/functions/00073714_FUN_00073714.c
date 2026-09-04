/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00073714
 * Address  : 00073714
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00073714(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_00073778 + 0x73730);
  (**(code **)(*param_1 + 0xbc))();
  if (**(int **)(DAT_0007377c + 0x7375c) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


