/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00021214
 * Address  : 00021214
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00021214(int *param_1)

{
  int iVar1;
  
  iVar1 = *param_1;
  if ((uint)param_1[1] <= (uint)(*(int *)(iVar1 + 0x150) - *(int *)(iVar1 + 0x14c) >> 2)) {
    *(int *)(iVar1 + 0x150) = *(int *)(iVar1 + 0x14c) + param_1[1] * 4;
    FUN_0001be62(param_1 + 2);
    return param_1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_00021258 + 0x2124c,DAT_0002125c + 0x2124e,0xac7,DAT_00021260 + 0x21250);
}


