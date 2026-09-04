/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009fbc0
 * Address  : 0009fbc0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_0009fbc0(int param_1,undefined4 param_2,uint param_3,uint param_4)

{
  int *piVar1;
  bool bVar2;
  uint uVar3;
  uint uVar4;
  
  uVar4 = *(uint *)(param_1 + 0x10);
  bVar2 = false;
  uVar3 = *(uint *)(param_1 + 0x14);
  if (param_4 < uVar3 || uVar3 - param_4 < (uint)(param_3 <= uVar4)) {
    *(uint *)(param_1 + 8) = uVar4 - param_3;
    *(uint *)(param_1 + 0xc) = uVar3 - (param_4 + (uVar4 < param_3));
    uVar3 = FUN_00019718(0x13,*(undefined4 *)(param_1 + 4),uVar4 - param_3,0);
    if (0xfffff000 < uVar3) {
      piVar1 = (int *)FUN_00025e6c(DAT_0009fc40 + 0x9fc14);
      *piVar1 = -uVar3;
      uVar3 = 0xffffffff;
    }
    bVar2 = *(uint *)(param_1 + 8) == uVar3 && *(int *)(param_1 + 0xc) == (int)uVar3 >> 0x1f;
  }
  return bVar2;
}


