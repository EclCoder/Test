/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002418c
 * Address  : 0002418c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint * FUN_0002418c(void)

{
  int iVar1;
  int iVar2;
  int iVar3;
  
  iVar1 = FUN_0001b400();
  iVar2 = *(int *)(iVar1 + 8);
  if (iVar2 != 0) {
    if ((*(uint *)(iVar2 + 0x28) >> 8 | *(uint *)(iVar2 + 0x2c) << 0x18) == DAT_000241d8 &&
        DAT_000241d4 == *(uint *)(iVar2 + 0x2c) >> 8) {
      iVar3 = *(int *)(iVar2 + 0x24) + -1;
      *(int *)(iVar2 + 0x24) = iVar3;
      if (iVar3 == 0) {
        *(undefined4 *)(iVar1 + 8) = *(undefined4 *)(iVar2 + 0x20);
        *(undefined4 *)(iVar2 + 0x20) = 0;
      }
    }
    else {
      *(undefined4 *)(iVar1 + 8) = 0;
    }
    return (uint *)(iVar2 + 0x28);
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b280();
}


