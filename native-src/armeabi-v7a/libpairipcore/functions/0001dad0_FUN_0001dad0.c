/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001dad0
 * Address  : 0001dad0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0001dad0(undefined4 *param_1,int *param_2,byte *param_3,byte *param_4)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  bool bVar4;
  bool bVar5;
  
  uVar1 = (uint)*param_4;
  if (0x2f < uVar1) {
    bVar5 = 0x39 < uVar1;
    bVar4 = uVar1 == 0x3a;
    if (bVar5) {
      uVar1 = uVar1 - 0x41;
      bVar4 = uVar1 == 0x19;
    }
    if ((!bVar5 || uVar1 < 0x19) || bVar4) {
      iVar2 = 0;
      while ((param_4 != param_3 && (uVar1 = (uint)*param_4, 0x2f < uVar1))) {
        if (uVar1 < 0x3a) {
          iVar3 = -0x30;
        }
        else {
          if (0x19 < uVar1 - 0x41) break;
          iVar3 = -0x37;
        }
        param_4 = param_4 + 1;
        *param_1 = param_4;
        iVar2 = iVar3 + iVar2 * 0x24 + uVar1;
      }
      *param_2 = iVar2;
      return 0;
    }
  }
  return 1;
}


