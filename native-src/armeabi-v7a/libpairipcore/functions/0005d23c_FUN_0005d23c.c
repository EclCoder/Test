/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005d23c
 * Address  : 0005d23c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005d23c(int param_1)

{
  int iVar1;
  int *piVar2;
  uint uVar3;
  bool bVar4;
  
  if (-1 < *(int *)(param_1 + 4)) {
    piVar2 = (int *)FUN_00025e6c(DAT_0005d2ac + 0x5d25c);
    do {
      uVar3 = FUN_00019718(6,*(undefined4 *)(param_1 + 4));
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
  FUN_00023f68(param_1,0xc);
  return;
}


