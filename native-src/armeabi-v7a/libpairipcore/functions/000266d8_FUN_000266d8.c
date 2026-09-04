/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000266d8
 * Address  : 000266d8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_000266d8(uint param_1,uint param_2,uint *param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  
  uVar1 = (int)param_1 >> 0x1f;
  uVar3 = FUN_000264b4((param_1 ^ uVar1) - uVar1,
                       (param_2 ^ (int)param_2 >> 0x1f) - ((int)param_2 >> 0x1f));
  uVar2 = (int)(param_1 ^ param_2) >> 0x1f;
  *param_3 = (*param_3 ^ uVar1) - uVar1;
  return (uVar3 ^ uVar2) - uVar2;
}


