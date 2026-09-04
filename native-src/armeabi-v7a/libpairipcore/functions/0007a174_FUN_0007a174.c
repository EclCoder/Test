/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0007a174
 * Address  : 0007a174
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0007a174(undefined4 param_1,undefined4 param_2,undefined4 *param_3,int *param_4)

{
  undefined4 uStack_1c;
  undefined4 *puStack_18;
  undefined4 uStack_14;
  undefined4 local_10;
  int local_c;
  
  local_c = **(int **)(DAT_0007a1f4 + 0x7a18c);
  puStack_18 = param_3 + 2;
  uStack_14 = *param_3;
  uStack_1c = param_2;
  local_10 = param_1;
  if (param_4 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_000269a8();
  }
  (**(code **)(*param_4 + 0x18))(param_4,&local_10,&uStack_14,&uStack_1c,&puStack_18);
  if (**(int **)(DAT_0007a1f8 + 0x7a1dc) != local_c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


