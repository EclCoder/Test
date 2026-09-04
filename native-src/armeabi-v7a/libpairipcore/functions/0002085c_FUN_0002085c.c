/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002085c
 * Address  : 0002085c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002085c(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
  FUN_000203aa(uVar1,0x28);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
  FUN_000203fa(param_2,0x29);
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 0x14),*(undefined4 *)(param_1 + 0x18));
  return;
}


