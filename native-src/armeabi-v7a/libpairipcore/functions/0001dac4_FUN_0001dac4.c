/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001dac4
 * Address  : 0001dac4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0001dac4(undefined4 *param_1,int *param_2)

{
  byte *pbVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  bool bVar5;
  bool bVar6;
  
  pbVar1 = (byte *)*param_1;
  if ((byte *)param_1[1] == pbVar1) {
    return 1;
  }
  uVar2 = (uint)*pbVar1;
  if (0x2f < uVar2) {
    bVar6 = 0x39 < uVar2;
    bVar5 = uVar2 == 0x3a;
    if (bVar6) {
      uVar2 = uVar2 - 0x41;
      bVar5 = uVar2 == 0x19;
    }
    if ((!bVar6 || uVar2 < 0x19) || bVar5) {
      iVar3 = 0;
      while ((pbVar1 != (byte *)param_1[1] && (uVar2 = (uint)*pbVar1, 0x2f < uVar2))) {
        if (uVar2 < 0x3a) {
          iVar4 = -0x30;
        }
        else {
          if (0x19 < uVar2 - 0x41) break;
          iVar4 = -0x37;
        }
        pbVar1 = pbVar1 + 1;
        *param_1 = pbVar1;
        iVar3 = iVar4 + iVar3 * 0x24 + uVar2;
      }
      *param_2 = iVar3;
      return 0;
    }
  }
  return 1;
}


