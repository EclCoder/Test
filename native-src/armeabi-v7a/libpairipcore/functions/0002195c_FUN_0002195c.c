/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002195c
 * Address  : 0002195c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002195c(int param_1,int param_2)

{
  int iVar1;
  uint uVar2;
  undefined4 uVar3;
  uint uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  
  uVar5 = *(undefined4 *)(param_2 + 0xc);
  uVar6 = *(undefined4 *)(param_2 + 0x10);
  *(undefined4 *)(param_2 + 0xc) = 0xffffffff;
  *(undefined4 *)(param_2 + 0x10) = 0xffffffff;
  uVar3 = *(undefined4 *)(param_2 + 4);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
  uVar2 = *(uint *)(param_2 + 0x10);
  if (uVar2 == 0xffffffff) {
    FUN_0001dcd6(param_2,DAT_000219d4 + 0x21994,3);
  }
  else if (uVar2 == 0) {
    *(undefined4 *)(param_2 + 4) = uVar3;
  }
  else {
    iVar1 = DAT_000219d0 + 0x219a8;
    for (uVar4 = 1; uVar4 < uVar2; uVar4 = uVar4 + 1) {
      FUN_0001dcd6(param_2,iVar1,2);
      uVar3 = *(undefined4 *)(param_1 + 8);
      *(uint *)(param_2 + 0xc) = uVar4;
      FUN_0001bd9c(uVar3,param_2);
    }
  }
  *(undefined4 *)(param_2 + 0xc) = uVar5;
  *(undefined4 *)(param_2 + 0x10) = uVar6;
  return;
}


