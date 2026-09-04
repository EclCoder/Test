/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00073780
 * Address  : 00073780
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00073780(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_000737e4 + 0x7379c);
  (**(code **)(*param_1 + 0xd4))();
  if (**(int **)(DAT_000737e8 + 0x737c8) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


