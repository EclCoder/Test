/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009fd60
 * Address  : 0009fd60
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_0009fd60(int param_1,undefined4 param_2,uint param_3,uint param_4)

{
  uint uVar1;
  int *piVar2;
  bool bVar3;
  
  bVar3 = false;
  if (param_4 < *(uint *)(param_1 + 0x14) ||
      *(uint *)(param_1 + 0x14) - param_4 < (uint)(param_3 <= *(uint *)(param_1 + 0x10))) {
    *(uint *)(param_1 + 8) = param_3;
    *(uint *)(param_1 + 0xc) = param_4;
    uVar1 = FUN_00019718(0x13,*(undefined4 *)(param_1 + 4),param_3,0);
    if (0xfffff000 < uVar1) {
      piVar2 = (int *)FUN_00025e6c(DAT_0009fdd4 + 0x9fda8);
      *piVar2 = -uVar1;
      uVar1 = 0xffffffff;
    }
    bVar3 = *(uint *)(param_1 + 8) == uVar1 && *(int *)(param_1 + 0xc) == (int)uVar1 >> 0x1f;
  }
  return bVar3;
}


