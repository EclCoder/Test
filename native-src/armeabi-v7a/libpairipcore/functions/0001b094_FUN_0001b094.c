/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b094
 * Address  : 0001b094
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Removing unreachable block (ram,0x0001b0c6) */
/* WARNING: Removing unreachable block (ram,0x0001b0ce) */
/* WARNING: Removing unreachable block (ram,0x0001b12a) */
/* WARNING: Removing unreachable block (ram,0x0001b106) */

undefined4 FUN_0001b094(char *param_1)

{
  undefined4 uVar1;
  byte *pbVar2;
  uint uVar3;
  undefined1 auStack_14 [4];
  
  uVar1 = 0;
  pbVar2 = (byte *)(param_1 + 1);
  DataMemoryBarrier(0x1b);
  if (*param_1 == '\0') {
    FUN_0001b1dc(auStack_14,DAT_0001b140 + 0x1b0be);
    while( true ) {
      uVar3 = (uint)*pbVar2;
      if (-1 < (int)(uVar3 << 0x1e)) break;
      *pbVar2 = *pbVar2 | 4;
      pthread_cond_wait((pthread_cond_t *)(DAT_0001b148 + 0x1b0f8),
                        (pthread_mutex_t *)(DAT_0001b148 + 0x1b0f4));
    }
    if (uVar3 != 1) {
      *pbVar2 = 2;
    }
    FUN_0001b220(auStack_14);
    uVar1 = 0;
    if (uVar3 != 1) {
      uVar1 = 1;
    }
  }
  return uVar1;
}


