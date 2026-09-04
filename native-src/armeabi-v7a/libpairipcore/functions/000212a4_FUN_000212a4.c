/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000212a4
 * Address  : 000212a4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000212a4(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  code *pcVar2;
  
  pcVar2 = (code *)(DAT_000212dc + 0x212bc);
  uVar1 = (*pcVar2)(param_2,DAT_000212d8 + 0x212b8,8);
  uVar1 = (*pcVar2)(uVar1,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
  (*pcVar2)(uVar1,DAT_000212e0 + 0x212ce,1);
  return;
}


