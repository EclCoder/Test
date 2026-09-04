/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024084
 * Address  : 00024084
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_00024084(int param_1,undefined4 param_2,undefined4 param_3)

{
  undefined4 uVar1;
  undefined4 uVar2;
  
  *(undefined4 *)(param_1 + -0x7c) = 0;
  uVar2 = FUN_0001b268();
  *(undefined4 *)(param_1 + -0x70) = uVar2;
  uVar2 = FUN_0001b2bc();
  *(undefined4 *)(param_1 + -0x6c) = uVar2;
  uVar1 = DAT_000240cc;
  uVar2 = DAT_000240c8;
  *(int *)(param_1 + -0x50) = DAT_000240d0 + 0x240b2;
  *(undefined4 *)(param_1 + -0x58) = uVar1;
  *(undefined4 *)(param_1 + -0x54) = uVar2;
  *(undefined4 *)(param_1 + -0x78) = param_2;
  *(undefined4 *)(param_1 + -0x74) = param_3;
  return param_1 + -0x80;
}


