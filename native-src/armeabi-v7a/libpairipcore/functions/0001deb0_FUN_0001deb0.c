/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001deb0
 * Address  : 0001deb0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001deb0(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  
  if ((*(int *)(param_1 + 8) == 0) ||
     (FUN_0001bd9c(*(int *)(param_1 + 8),param_2), *(int *)(param_1 + 8) == 0)) {
    if (*(char *)(param_1 + 0x10) != '\x01') goto LAB_0001dee0;
    uVar1 = 0x3a;
  }
  else {
    uVar1 = 0x2e;
    if ((*(byte *)(param_1 + 0x10) & 1) != 0) {
      uVar1 = 0x3a;
    }
  }
  FUN_0001bdc8(param_2,uVar1);
LAB_0001dee0:
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0xc),param_2);
  return;
}


