/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000734f8
 * Address  : 000734f8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000734f8(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_0007355c + 0x73514);
  (**(code **)(*param_1 + 0xb0))();
  if (**(int **)(DAT_00073560 + 0x73540) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


