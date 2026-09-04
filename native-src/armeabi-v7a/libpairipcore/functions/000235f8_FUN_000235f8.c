/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000235f8
 * Address  : 000235f8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000235f8(int param_1,undefined4 param_2)

{
  uint uVar1;
  
  (**(code **)(**(int **)(param_1 + 0xc) + 0x10))(*(int **)(param_1 + 0xc),param_2);
  uVar1 = *(uint *)(param_1 + 8);
  if ((uVar1 & 1) != 0) {
    FUN_0001dcd6(param_2,DAT_00023648 + 0x2361a,6);
    uVar1 = *(uint *)(param_1 + 8);
  }
  if ((int)(uVar1 << 0x1e) < 0) {
    FUN_0001dcd6(param_2,DAT_0002364c + 0x2362c,9);
    uVar1 = *(uint *)(param_1 + 8);
  }
  if (-1 < (int)(uVar1 << 0x1d)) {
    return;
  }
  FUN_0001dcd6(param_2,DAT_00023650 + 0x23640,9);
  return;
}


