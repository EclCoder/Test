/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00076ef8
 * Address  : 00076ef8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00076ef8(int *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 local_30;
  undefined4 local_2c;
  undefined4 local_28;
  int local_24;
  
  local_24 = **(int **)(DAT_00076fb8 + 0x76f18);
  uVar1 = (**(code **)(*param_1 + 0x2ac))(param_1,param_3);
  uVar2 = FUN_000a0398();
  __aeabi_memclr(uVar2,uVar1);
  (**(code **)(*param_1 + 800))(param_1,param_3,0,uVar1,uVar2);
  local_28 = 0;
  local_30 = uVar2;
  local_2c = uVar1;
  FUN_000609b0(&local_30,param_4);
  FUN_00023f74(uVar2);
  if (**(int **)(DAT_00076fbc + 0x76fa0) != local_24) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_24);
  }
  return;
}


