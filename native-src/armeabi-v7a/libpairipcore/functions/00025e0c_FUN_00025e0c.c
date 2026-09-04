/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025e0c
 * Address  : 00025e0c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint FUN_00025e0c(undefined4 *param_1)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  byte *pbVar5;
  byte *pbVar6;
  
  uVar4 = 0;
  uVar3 = 0;
  pbVar6 = (byte *)*param_1;
  do {
    pbVar5 = pbVar6 + 1;
    bVar1 = *pbVar6;
    uVar2 = uVar4 & 0xff;
    uVar4 = uVar4 + 7;
    uVar3 = uVar3 | ((int)(char)bVar1 & 0x7fU) << uVar2;
    pbVar6 = pbVar5;
  } while ((char)bVar1 < 0);
  *param_1 = pbVar5;
  uVar2 = uVar3;
  if (uVar4 < 0x20) {
    uVar2 = uVar3 | -1 << (uVar4 & 0xff);
  }
  if (bVar1 < 0x40) {
    uVar2 = uVar3;
  }
  return uVar2;
}


