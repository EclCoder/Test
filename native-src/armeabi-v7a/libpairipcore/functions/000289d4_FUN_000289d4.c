/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000289d4
 * Address  : 000289d4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000289d4(int *param_1,undefined4 param_2,uint param_3)

{
  int iVar1;
  
  if (param_3 < 0xb) {
    *(char *)param_1 = (char)(param_3 << 1);
    __aeabi_memmove((undefined1 *)((int)param_1 + 1),param_2,param_3 + 1);
    return;
  }
  if (param_3 < 0xfffffff8) {
    iVar1 = FUN_000a0370((param_3 | 7) + 1);
    param_1[2] = iVar1;
    *param_1 = (param_3 | 7) + 2;
    param_1[1] = param_3;
    __aeabi_memmove(iVar1,param_2,param_3 + 1);
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_00026b08();
}


