/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001dc30
 * Address  : 0001dc30
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001dc30(int *param_1,undefined1 param_2,ushort param_3,ushort param_4,short param_5,
                 short param_6)

{
  *(undefined1 *)(param_1 + 1) = param_2;
  *param_1 = DAT_0001dc68 + 0x1dc48;
  *(ushort *)((int)param_1 + 5) =
       param_3 & 0x3f | (param_4 & 3) << 6 | param_5 << 8 | param_6 << 10 |
       *(ushort *)((int)param_1 + 5) & 0xf000;
  return;
}


