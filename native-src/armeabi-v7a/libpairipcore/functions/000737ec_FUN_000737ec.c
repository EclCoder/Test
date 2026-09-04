/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000737ec
 * Address  : 000737ec
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000737ec(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_00073850 + 0x73808);
  (**(code **)(*param_1 + 0xe0))();
  if (**(int **)(DAT_00073854 + 0x73834) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


