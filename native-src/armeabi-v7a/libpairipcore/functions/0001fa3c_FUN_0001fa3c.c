/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001fa3c
 * Address  : 0001fa3c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0001fa3c(undefined4 *param_1)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  byte *pbVar6;
  
  pbVar6 = (byte *)*param_1;
  if ((uint)(param_1[1] - (int)pbVar6) < 2) {
    iVar2 = 0;
  }
  else {
    uVar3 = 0;
    iVar2 = DAT_0001fab8 + 0x1fa5e;
    uVar5 = 0x3e;
    while (uVar4 = uVar5, uVar4 != uVar3) {
      uVar5 = uVar4 + uVar3 >> 1;
      bVar1 = *(byte *)(iVar2 + uVar5 * 8);
      if ((bVar1 < *pbVar6) ||
         ((bVar1 == *pbVar6 && (*(byte *)(iVar2 + uVar5 * 8 + 1) < pbVar6[1])))) {
        uVar3 = uVar5 + 1;
        uVar5 = uVar4;
      }
    }
    if ((*(byte *)(iVar2 + uVar3 * 8) == *pbVar6) &&
       (iVar2 = iVar2 + uVar3 * 8, *(byte *)(iVar2 + 1) == pbVar6[1])) {
      *param_1 = pbVar6 + 2;
    }
    else {
      iVar2 = 0;
    }
  }
  return iVar2;
}


