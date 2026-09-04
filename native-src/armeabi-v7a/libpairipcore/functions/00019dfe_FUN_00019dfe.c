/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00019dfe
 * Address  : 00019dfe
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00019dfe(int *param_1)

{
  bool bVar1;
  int *piVar2;
  int iVar3;
  
  DataMemoryBarrier(0x1b);
  if (param_1[2] != 0) {
    piVar2 = param_1 + 2;
    DataMemoryBarrier(0x1b);
    do {
      ExclusiveAccess(piVar2);
      iVar3 = *piVar2;
      bVar1 = (bool)hasExclusiveAccess(piVar2);
    } while (!bVar1);
    *piVar2 = iVar3 + -1;
    DataMemoryBarrier(0x1b);
    if (iVar3 != 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00019e30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x10))();
  return;
}


