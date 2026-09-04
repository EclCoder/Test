/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00026048
 * Address  : 00026048
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_00026048(uint param_1,uint param_2)

{
  uint uVar1;
  uint uVar2;
  
  uVar2 = FUN_00026070((param_1 ^ (int)param_1 >> 0x1f) - ((int)param_1 >> 0x1f),
                       (param_2 ^ (int)param_2 >> 0x1f) - ((int)param_2 >> 0x1f));
  uVar1 = (int)(param_1 ^ param_2) >> 0x1f;
  return (uVar2 ^ uVar1) - uVar1;
}


