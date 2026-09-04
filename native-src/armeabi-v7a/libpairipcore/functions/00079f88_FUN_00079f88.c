/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00079f88
 * Address  : 00079f88
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00079f88(undefined4 param_1,undefined4 param_2,undefined4 *param_3,int *param_4)

{
  undefined4 uStack_1c;
  undefined4 uStack_18;
  undefined4 *puStack_14;
  undefined4 uStack_10;
  int local_c;
  
  local_c = **(int **)(DAT_0007a004 + 0x79fa0);
  puStack_14 = param_3 + 2;
  uStack_10 = *param_3;
  uStack_1c = param_1;
  uStack_18 = param_2;
  if (param_4 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_000269a8();
  }
  (**(code **)(*param_4 + 0x18))(param_4,&uStack_1c,&uStack_10,&uStack_18,&puStack_14);
  if (**(int **)(DAT_0007a008 + 0x79fec) != local_c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


