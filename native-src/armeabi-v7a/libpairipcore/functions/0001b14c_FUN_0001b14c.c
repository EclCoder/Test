/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b14c
 * Address  : 0001b14c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001b14c(undefined1 *param_1)

{
  byte bVar1;
  int iVar2;
  undefined1 auStack_1c [4];
  
  DataMemoryBarrier(0x1b);
  *param_1 = 1;
  FUN_0001b1dc(auStack_1c,DAT_0001b190 + 0x1b168);
  bVar1 = param_1[1];
  param_1[1] = 1;
  FUN_0001b220();
  if (((int)((uint)bVar1 << 0x1d) < 0) && (iVar2 = FUN_0001b24c(), iVar2 != 0)) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001b194 + 0x1b18c,DAT_0001b198 + 0x1b18e);
  }
  return;
}


