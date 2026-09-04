/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a96c
 * Address  : 0001a96c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0001a96c(uint param_1,uint param_2)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  
  iVar1 = LZCOUNT(param_1 | 1) + 0x20;
  if (param_2 != 0) {
    iVar1 = LZCOUNT(param_2);
  }
  uVar2 = (0x40 - iVar1) * 0x4d1;
  uVar3 = uVar2 >> 0xc;
  uVar4 = *(uint *)(DAT_0001a9b8 + 0x1a99a + uVar3 * 8 + 4);
  if (param_2 <= uVar4 &&
      (uint)(*(uint *)(DAT_0001a9b8 + 0x1a99a + uVar3 * 8) <= param_1) <= param_2 - uVar4) {
    uVar3 = (uVar2 >> 0xc) - 1;
  }
  return uVar3 + 1;
}


