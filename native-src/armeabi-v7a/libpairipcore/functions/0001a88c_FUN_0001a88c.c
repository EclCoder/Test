/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a88c
 * Address  : 0001a88c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a88c(int *param_1,int param_2,int param_3)

{
  uint uVar1;
  char *pcVar2;
  
  uVar1 = param_3 - param_2;
  if (uVar1 < 0xfffffff8) {
    if (uVar1 < 0xb) {
      pcVar2 = (char *)((int)param_1 + 1);
      *(char *)param_1 = (char)uVar1 * '\x02';
    }
    else {
      pcVar2 = (char *)FUN_000a0370((uVar1 | 7) + 1);
      *param_1 = (uVar1 | 7) + 2;
      param_1[1] = uVar1;
      param_1[2] = (int)pcVar2;
    }
    param_3 = param_3 - param_2;
    if (param_3 != 0) {
      __aeabi_memmove(pcVar2,param_2,param_3);
    }
    pcVar2[param_3] = '\0';
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_00019fd0();
}


