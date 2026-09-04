/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001ade0
 * Address  : 0001ade0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001ade0(pthread_cond_t *param_1,undefined4 *param_2)

{
  int iVar1;
  int iVar2;
  
  if (*(char *)(param_2 + 1) == '\x01') {
    iVar1 = pthread_cond_wait(param_1,(pthread_mutex_t *)*param_2);
    if (iVar1 == 0) {
      return;
    }
    iVar2 = DAT_0001ae0c + 0x1ae02;
  }
  else {
    iVar1 = 1;
    iVar2 = DAT_0001ae08 + 0x1adfc;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001ac4c(iVar1,iVar2);
}


