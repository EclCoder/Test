/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b24c
 * Address  : 0001b24c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_0001b24c(void)

{
  int iVar1;
  
  iVar1 = pthread_cond_broadcast((pthread_cond_t *)(DAT_0001b264 + 0x1b25a));
  return iVar1 != 0;
}


