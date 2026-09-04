/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00073564
 * Address  : 00073564
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00073564(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_000735c8 + 0x73580);
  (**(code **)(*param_1 + 0x74))();
  if (**(int **)(DAT_000735cc + 0x735ac) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


