/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00019d6a
 * Address  : 00019d6a
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00019d6a(uint *param_1,int param_2,uint *param_3)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  
  uVar1 = param_2 - (int)param_1 >> 2;
  while (uVar2 = uVar1, uVar2 != 0) {
    bVar3 = param_1[uVar2 >> 1] < *param_3;
    if (bVar3) {
      param_1 = param_1 + (uVar2 >> 1) + 1;
    }
    uVar1 = uVar2 >> 1;
    if (bVar3) {
      uVar1 = uVar2 + ~(uVar2 >> 1);
    }
  }
  return;
}


