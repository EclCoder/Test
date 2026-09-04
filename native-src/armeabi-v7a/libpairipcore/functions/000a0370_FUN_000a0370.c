/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000a0370
 * Address  : 000a0370
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void * FUN_000a0370(uint param_1)

{
  void *pvVar1;
  code *pcVar2;
  
  if (param_1 < 2) {
    param_1 = 1;
  }
  while( true ) {
    pvVar1 = malloc(param_1);
    if (pvVar1 != (void *)0x0) {
      return pvVar1;
    }
    pcVar2 = (code *)FUN_0001b2fc();
    if (pcVar2 == (code *)0x0) break;
    (*pcVar2)();
  }
  FUN_00023f34();
  return (void *)0x0;
}


