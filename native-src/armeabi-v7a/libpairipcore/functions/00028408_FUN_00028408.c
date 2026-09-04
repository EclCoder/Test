/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00028408
 * Address  : 00028408
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00028408(undefined4 *param_1)

{
  byte bVar1;
  byte bVar2;
  byte *pbVar3;
  uint local_11c;
  undefined1 auStack_114 [256];
  int local_14;
  
  local_14 = **(int **)(DAT_000284d4 + 0x2842c);
  for (local_11c = 0; local_11c < 0x100; local_11c = local_11c + 1) {
    pbVar3 = (byte *)FUN_00026f24(param_1[1],local_11c);
    bVar1 = *pbVar3;
    pbVar3 = (byte *)FUN_00026f2c(*param_1,local_11c & 7);
    bVar2 = *pbVar3;
    pbVar3 = (byte *)FUN_00026f34(auStack_114,local_11c);
    *pbVar3 = bVar1 ^ bVar2;
  }
  FUN_000284dc(auStack_114);
  if (**(int **)(DAT_000284d8 + 0x284b4) == local_14) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


