/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a454
 * Address  : 0001a454
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a454(byte *param_1,char *param_2,byte *param_3)

{
  size_t sVar1;
  int iVar2;
  byte *pbVar3;
  uint uVar4;
  byte *pbVar5;
  undefined4 uStack_24;
  
  uStack_24 = &stack0xfffffff8;
  sVar1 = strlen(param_2);
  uVar4 = *(uint *)(param_3 + 4);
  iVar2 = (uint)*param_3 << 0x1f;
  if (iVar2 == 0) {
    uVar4 = (uint)(*param_3 >> 1);
  }
  FUN_0001a4c6(param_1,iVar2,uVar4 + sVar1,(int)&uStack_24 + 3);
  pbVar5 = *(byte **)(param_1 + 8);
  if ((*param_1 & 1) == 0) {
    pbVar5 = param_1 + 1;
  }
  if (sVar1 != 0) {
    __aeabi_memmove(pbVar5,param_2,sVar1);
  }
  if (uVar4 != 0) {
    pbVar3 = *(byte **)(param_3 + 8);
    if ((*param_3 & 1) == 0) {
      pbVar3 = param_3 + 1;
    }
    __aeabi_memmove(pbVar5 + sVar1,pbVar3,uVar4);
  }
  (pbVar5 + sVar1)[uVar4] = 0;
  return;
}


