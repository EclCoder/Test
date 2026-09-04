/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001afe8
 * Address  : 0001afe8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 * FUN_0001afe8(undefined4 *param_1)

{
  undefined4 *puVar1;
  
  puVar1 = (undefined4 *)FUN_000a0370(0x18);
  puVar1[5] = 0;
  *param_1 = puVar1;
  *puVar1 = 0;
  puVar1[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar1[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar1[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar1[4] = 0;
  return param_1;
}


