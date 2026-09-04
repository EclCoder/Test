/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00022812
 * Address  : 00022812
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00022812(int param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  
  if (*(int *)(param_2 + 0x10) == -1) {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = 0;
    *(undefined4 *)(param_2 + 0xc) = 0;
    *(uint *)(param_2 + 0x10) = uVar2;
  }
  else {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = *(uint *)(param_2 + 0xc);
  }
  if (uVar1 < uVar2) {
    FUN_0001eaae(*(undefined4 *)(*(int *)(param_1 + 8) + uVar1 * 4));
    return;
  }
  return;
}


