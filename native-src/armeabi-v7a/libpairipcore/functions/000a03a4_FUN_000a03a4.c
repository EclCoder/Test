/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000a03a4
 * Address  : 000a03a4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_000a03a4(uint param_1,uint param_2)

{
  int iVar1;
  code *pcVar2;
  
  if (param_2 < 5) {
    param_2 = 4;
  }
  if (param_1 < 2) {
    param_1 = 1;
  }
  while( true ) {
    iVar1 = FUN_00023f80(param_2,param_1);
    if (iVar1 != 0) {
      return iVar1;
    }
    pcVar2 = (code *)FUN_0001b2fc();
    if (pcVar2 == (code *)0x0) break;
    (*pcVar2)();
  }
  FUN_00023f34();
  return 0;
}


