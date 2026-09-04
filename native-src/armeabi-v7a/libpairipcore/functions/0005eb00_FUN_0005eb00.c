/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005eb00
 * Address  : 0005eb00
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


byte FUN_0005eb00(int param_1)

{
  byte bVar1;
  int iVar2;
  
  FUN_0001ae24();
  bVar1 = *(byte *)(param_1 + 8);
  iVar2 = *(int *)(param_1 + 4);
  FUN_0001ae3c(param_1);
  return bVar1 & iVar2 < 1;
}


