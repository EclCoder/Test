/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009ff0c
 * Address  : 0009ff0c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


longlong FUN_0009ff0c(int param_1,undefined4 param_2,uint param_3,uint param_4)

{
  bool bVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  
  uVar5 = *(uint *)(param_1 + 0x14);
  uVar2 = (uint)CARRY4(param_4,(uint)CARRY4(uVar5,param_3));
  if (uVar2 != 0) {
    return (ulonglong)uVar2 << 0x20;
  }
  uVar2 = *(uint *)(param_1 + 8);
  uVar3 = uVar2 + param_3;
  iVar4 = *(int *)(param_1 + 0xc) + param_4 + (uint)CARRY4(uVar2,param_3);
  bVar1 = (uint)-iVar4 < (uint)(uVar3 <= uVar5);
  if (bVar1) {
    *(uint *)(param_1 + 8) = uVar3;
    *(int *)(param_1 + 0xc) = iVar4;
  }
  return CONCAT44(-(iVar4 + (uint)(uVar3 > uVar5)),(uint)bVar1);
}


