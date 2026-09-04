/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00021b12
 * Address  : 00021b12
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00021b12(int param_1,undefined4 param_2)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = *(int **)(param_1 + 8);
  if (piVar1 != (int *)0x0) {
    iVar2 = (**(code **)(*piVar1 + 0x18))(piVar1,param_2,param_1 + 0xc);
    if (iVar2 != 0) {
      return;
    }
    FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  }
  FUN_0001bdc8(param_2,0x7b);
  FUN_000205b8(param_1 + 0xc,param_2);
  FUN_0001bdc8(param_2,0x7d);
  return;
}


