/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000267c8
 * Address  : 000267c8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_000267c8(uint param_1,uint param_2)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  longlong lVar5;
  
  if (param_1 == 0 && param_2 == 0) {
    return DAT_00026888;
  }
  uVar1 = (int)param_2 >> 0x1f;
  uVar2 = (param_1 ^ uVar1) - uVar1;
  iVar3 = ((param_2 ^ uVar1) - uVar1) - (uint)((param_1 ^ uVar1) < uVar1);
  uVar4 = LZCOUNT(uVar2) + 0x20;
  if (iVar3 != 0) {
    uVar4 = LZCOUNT(iVar3);
  }
  if (uVar4 < 0x28) {
    if (uVar4 != 0x26) {
      if (uVar4 == 0x27) {
        uVar2 = uVar2 * 2;
      }
      else {
        lVar5 = FUN_0002688c(uVar2,iVar3,uVar4 + 0x1a);
        uVar2 = FUN_000268ae(uVar2,iVar3,0x26 - uVar4);
        uVar2 = uVar2 | lVar5 != 0;
      }
    }
    uVar2 = ((uVar2 & 7) >> 2 | uVar2) + 1;
    if ((int)(uVar2 * 0x20) < 0) {
      uVar2 = uVar2 >> 3;
      iVar3 = 0x40;
      goto LAB_00026866;
    }
    uVar2 = uVar2 >> 2;
  }
  else {
    uVar2 = FUN_0002688c(uVar2,param_2,uVar4 - 0x28);
  }
  iVar3 = 0x3f;
LAB_00026866:
  return ((uVar2 & 0x7fffff) + (uVar1 & 0x80000000) | (iVar3 - uVar4) * 0x800000) + 0x3f800000;
}


