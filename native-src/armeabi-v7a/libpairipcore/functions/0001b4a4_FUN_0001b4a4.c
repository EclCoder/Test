/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b4a4
 * Address  : 0001b4a4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001b4a4(int *param_1)

{
  bool bVar1;
  int iVar2;
  uint *puVar3;
  uint uVar4;
  
  iVar2 = *param_1;
  DataMemoryBarrier(0x1b);
  puVar3 = (uint *)(iVar2 + -4);
  do {
    ExclusiveAccess(puVar3);
    uVar4 = *puVar3;
    bVar1 = (bool)hasExclusiveAccess(puVar3);
  } while (!bVar1);
  *puVar3 = uVar4 - 1;
  DataMemoryBarrier(0x1b);
  if (0x7fffffff < uVar4 - 1) {
    FUN_00023f5c(iVar2 + -0xc);
  }
  return param_1;
}


