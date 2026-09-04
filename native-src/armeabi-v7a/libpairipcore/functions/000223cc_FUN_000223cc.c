/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000223cc
 * Address  : 000223cc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000223cc(int *param_1,int param_2)

{
  int iVar1;
  
  FUN_0002249c();
  if (1 < *(uint *)(param_2 + 8)) {
    iVar1 = FUN_0001d2b8(*param_1,param_1[1],DAT_00022410 + 0x223ea,6);
    if (iVar1 == 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b568(DAT_00022414 + 0x2240a,DAT_00022418 + 0x2240c,0x6be,DAT_0002241c + 0x2240e);
    }
    *param_1 = *param_1 + 6;
    param_1[1] = param_1[1] + -6;
  }
  return;
}


