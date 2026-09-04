/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002737c
 * Address  : 0002737c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002737c(undefined4 param_1,undefined4 *param_2)

{
  byte bVar1;
  byte bVar2;
  byte *pbVar3;
  uint local_38;
  undefined1 auStack_34 [32];
  int local_14;
  
  local_14 = **(int **)(DAT_00027450 + 0x273a4);
  for (local_38 = 0; local_38 < 0x20; local_38 = local_38 + 1) {
    pbVar3 = (byte *)FUN_00027458(param_2[1],local_38);
    bVar1 = *pbVar3;
    pbVar3 = (byte *)FUN_00026f2c(*param_2,local_38 & 7);
    bVar2 = *pbVar3;
    pbVar3 = (byte *)FUN_00027460(auStack_34,local_38);
    *pbVar3 = bVar1 ^ bVar2;
  }
  FUN_00027468(param_1,auStack_34);
  if (**(int **)(DAT_00027454 + 0x27430) == local_14) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


