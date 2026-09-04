/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00026c9c
 * Address  : 00026c9c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00026c9c(int *param_1)

{
  int iVar1;
  int *piVar2;
  uint uVar3;
  bool bVar4;
  
  if (-1 < *param_1) {
    piVar2 = (int *)FUN_00025e6c(DAT_00026d04 + 0x26cbc);
    do {
      uVar3 = FUN_00019718(6,*param_1);
      if (0xfffff000 < uVar3) {
        iVar1 = -uVar3;
        bVar4 = uVar3 != 0xfffffffc;
        uVar3 = 0;
        if (bVar4) {
          uVar3 = 0xffffffff;
        }
        *piVar2 = iVar1;
      }
    } while ((0x7fffffff < uVar3) && (*piVar2 == 4));
  }
  return param_1;
}


