/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001aa74
 * Address  : 0001aa74
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001aa74(undefined4 param_1,undefined4 param_2,int param_3)

{
  undefined4 *puVar1;
  char *pcVar2;
  char *pcVar3;
  undefined4 uVar4;
  char acStack_420 [1024];
  
  pcVar3 = acStack_420;
  puVar1 = (undefined4 *)__errno();
  uVar4 = *puVar1;
  pcVar2 = strerror_r(param_3,acStack_420,0x400);
  if (pcVar2 != (char *)0x0) {
    if (pcVar2 == (char *)0xffffffff) {
      pcVar2 = (char *)*puVar1;
    }
    if (pcVar2 != (char *)0x16) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    pcVar3 = (char *)(DAT_0001aadc + 0x1aaae);
  }
  if (*pcVar3 == '\0') {
    snprintf(acStack_420,0x400,(char *)(DAT_0001aae0 + 0x1aabe),param_3);
    pcVar3 = acStack_420;
  }
  *puVar1 = uVar4;
  FUN_0001a540(param_1,pcVar3);
  return;
}


