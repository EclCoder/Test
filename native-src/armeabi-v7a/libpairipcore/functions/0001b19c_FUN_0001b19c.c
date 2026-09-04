/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b19c
 * Address  : 0001b19c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001b19c(int param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  byte bVar1;
  int iVar2;
  undefined4 uStack_14;
  
  uStack_14 = param_4;
  FUN_0001b1dc(&uStack_14,DAT_0001b1d0 + 0x1b1aa,param_3,param_4,param_3);
  bVar1 = *(byte *)(param_1 + 1);
  *(undefined1 *)(param_1 + 1) = 0;
  FUN_0001b220();
  if (((int)((uint)bVar1 << 0x1d) < 0) && (iVar2 = FUN_0001b24c(), iVar2 != 0)) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001b1d4 + 0x1b1ca,DAT_0001b1d8 + 0x1b1cc);
  }
  return;
}


