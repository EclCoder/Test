/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0007a1fc
 * Address  : 0007a1fc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0007a1fc(undefined4 param_1,undefined4 param_2,undefined4 *param_3,int *param_4)

{
  undefined4 *local_1c;
  undefined4 local_18;
  undefined4 local_14;
  undefined4 local_10;
  int local_c;
  
  local_c = **(int **)(DAT_0007a284 + 0x7a214);
  local_1c = param_3 + 2;
  local_10 = *param_3;
  local_18 = param_2;
  local_14 = param_1;
  if (param_4 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_000269a8();
  }
  (**(code **)(*param_4 + 0x18))(param_4,&local_14,&local_10,&local_18,&local_1c);
  if (**(int **)(DAT_0007a288 + 0x7a26c) != local_c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


