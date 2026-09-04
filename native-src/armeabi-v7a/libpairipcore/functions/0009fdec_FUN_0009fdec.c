/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009fdec
 * Address  : 0009fdec
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_0009fdec(int param_1,undefined4 param_2,uint param_3,uint param_4)

{
  bool bVar1;
  int *piVar2;
  uint uVar3;
  uint uVar4;
  uint *puVar5;
  uint uVar6;
  
  uVar6 = *(uint *)(param_1 + 0x14);
  bVar1 = false;
  if (!CARRY4(uVar6,param_4) &&
      !CARRY4(uVar6 + param_4,(uint)CARRY4(*(uint *)(param_1 + 0x10),param_3))) {
    puVar5 = (uint *)(param_1 + 8);
    uVar3 = *puVar5 + param_3;
    uVar4 = *(int *)(param_1 + 0xc) + param_4 + (uint)CARRY4(*puVar5,param_3);
    if (uVar4 < uVar6 || uVar6 - uVar4 < (uint)(uVar3 <= *(uint *)(param_1 + 0x10))) {
      *puVar5 = uVar3;
      *(uint *)(param_1 + 0xc) = uVar4;
      uVar6 = FUN_00019718(0x13,*(undefined4 *)(param_1 + 4),uVar3,0);
      if (0xfffff000 < uVar6) {
        piVar2 = (int *)FUN_00025e6c(DAT_0009fe80 + 0x9fe58);
        *piVar2 = -uVar6;
        uVar6 = 0xffffffff;
      }
      bVar1 = *puVar5 == uVar6 && *(int *)(param_1 + 0xc) == (int)uVar6 >> 0x1f;
    }
  }
  return bVar1;
}


