/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002167c
 * Address  : 0002167c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002167c(int param_1,int param_2)

{
  undefined4 uVar1;
  
  if (*(int *)(param_1 + 0xc) != 0) {
    uVar1 = *(undefined4 *)(param_2 + 0x14);
    *(undefined4 *)(param_2 + 0x14) = 0;
    FUN_0001dcd6(param_2,DAT_00021720 + 0x2169c,1);
    FUN_000205b8(param_1 + 8,param_2);
    FUN_0001dcd6(param_2,DAT_00021724 + 0x216b2,1);
    *(undefined4 *)(param_2 + 0x14) = uVar1;
  }
  if (*(int *)(param_1 + 0x10) != 0) {
    FUN_0001dcd6(param_2,DAT_00021728 + 0x216c4,10);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
    FUN_0001dcd6(param_2,DAT_0002172c + 0x216d8,1);
  }
  FUN_000203aa(param_2,0x28);
  FUN_000205b8(param_1 + 0x14,param_2);
  FUN_000203fa(param_2,0x29);
  if (*(int *)(param_1 + 0x1c) != 0) {
    FUN_0001dcd6(param_2,DAT_00021730 + 0x21702,10);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x1c),param_2);
    return;
  }
  return;
}


