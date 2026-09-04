/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a4c6
 * Address  : 0001a4c6
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001a4c6(int *param_1,undefined4 param_2,uint param_3)

{
  int iVar1;
  
  if (param_3 < 0xfffffff8) {
    if (param_3 < 0xb) {
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
      *(char *)param_1 = (char)(param_3 << 1);
    }
    else {
      iVar1 = FUN_000a0370((param_3 | 7) + 1);
      *param_1 = (param_3 | 7) + 2;
      param_1[1] = param_3;
      param_1[2] = iVar1;
    }
    return param_1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_00019fd0();
}


