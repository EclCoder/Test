/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000214f8
 * Address  : 000214f8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000214f8(int param_1,undefined4 param_2)

{
  int iVar1;
  
  (**(code **)(**(int **)(param_1 + 0xc) + 0x10))(*(int **)(param_1 + 0xc),param_2);
  iVar1 = FUN_0001eaae(*(undefined4 *)(param_1 + 0xc),param_2);
  if (iVar1 != 0) {
    return;
  }
  FUN_0001dcd6(param_2,DAT_00021528 + 0x21520,1);
  return;
}


