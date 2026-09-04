/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001ae70
 * Address  : 0001ae70
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001ae70(int *param_1)

{
  int iVar1;
  
  if (*param_1 == 0) {
    iVar1 = 0x16;
  }
  else {
    iVar1 = FUN_0001ae98(param_1);
    if (iVar1 == 0) {
      *param_1 = 0;
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001ac4c(iVar1,DAT_0001ae94 + 0x1ae90);
}


