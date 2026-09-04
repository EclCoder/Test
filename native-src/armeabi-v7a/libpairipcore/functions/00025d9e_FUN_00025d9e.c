/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025d9e
 * Address  : 00025d9e
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint FUN_00025d9e(undefined4 *param_1)

{
  char cVar1;
  uint uVar2;
  uint uVar3;
  char *pcVar4;
  uint uVar6;
  char *pcVar5;
  
  uVar6 = 0;
  uVar3 = 0;
  pcVar5 = (char *)*param_1;
  do {
    pcVar4 = pcVar5 + 1;
    cVar1 = *pcVar5;
    uVar2 = uVar6 & 0xff;
    uVar6 = uVar6 + 7;
    uVar3 = uVar3 | ((int)cVar1 & 0x7fU) << uVar2;
    pcVar5 = pcVar4;
  } while (cVar1 < 0);
  *param_1 = pcVar4;
  return uVar3;
}


