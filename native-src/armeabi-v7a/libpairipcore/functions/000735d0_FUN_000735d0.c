/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000735d0
 * Address  : 000735d0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000735d0(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_00073634 + 0x735ec);
  (**(code **)(*param_1 + 0x98))();
  if (**(int **)(DAT_00073638 + 0x73618) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


