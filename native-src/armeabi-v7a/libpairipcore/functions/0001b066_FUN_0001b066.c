/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b066
 * Address  : 0001b066
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001b066(int param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  int local_18;
  undefined1 local_14;
  undefined3 uStack_13;
  
  _local_14 = CONCAT31((int3)((uint)param_4 >> 8),1);
  local_18 = param_1 + 0xc;
  FUN_0001ae24();
  *(uint *)(param_1 + 0x14) = *(uint *)(param_1 + 0x14) | 4;
  FUN_0001add0(param_1 + 0x10);
  FUN_0001ae4a(&local_18);
  return;
}


