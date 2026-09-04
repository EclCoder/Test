/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001ddac
 * Address  : 0001ddac
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0001ddac(undefined4 *param_1,int *param_2)

{
  undefined4 uVar1;
  byte *pbVar2;
  byte *pbVar3;
  int iVar4;
  
  *param_2 = 0;
  pbVar3 = (byte *)*param_1;
  pbVar2 = (byte *)param_1[1];
  if (pbVar2 != pbVar3) {
    if ((*pbVar3 < 0x30) || (0x39 < *pbVar3)) {
      uVar1 = 1;
    }
    else {
      iVar4 = 0;
      while ((pbVar3 != pbVar2 && (*pbVar3 - 0x30 < 10))) {
        *param_1 = pbVar3 + 1;
        *param_2 = iVar4 * 10;
        iVar4 = (uint)*pbVar3 + iVar4 * 10 + -0x30;
        *param_2 = iVar4;
        pbVar3 = pbVar3 + 1;
      }
      uVar1 = 0;
    }
    return uVar1;
  }
  return 1;
}


