/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a584
 * Address  : 0001a584
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0001a584(undefined4 param_1,int param_2,undefined1 *param_3)

{
  undefined4 uVar1;
  
  if (param_2 == 0) {
    return 0;
  }
  uVar1 = (*(code *)PTR_memchr_000a5eb8)(param_1,*param_3,param_2);
  return uVar1;
}


