/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024f50
 * Address  : 00024f50
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00024f50(int param_1,uint param_2,undefined4 param_3,undefined4 param_4)

{
  int iVar1;
  undefined4 *puVar2;
  
  iVar1 = DAT_00024fe0;
  if ((param_2 & 0xfffffff0) == 0x110) {
    iVar1 = DAT_00024fe0 + 8;
    if (*(char *)(param_1 + 0x46) == '\0') {
      *(undefined1 *)(param_1 + 0x46) = 1;
      FUN_000256ac(param_1 + 0xd0);
    }
  }
  else {
    if ((param_2 & 0xfffffff0) != 0x100) {
      puVar2 = *(undefined4 **)(DAT_00024fe4 + 0x24fc4);
      fprintf((FILE *)*puVar2,(char *)(DAT_00024fe8 + 0x24fd0),DAT_00024fec + 0x24fd2,
              DAT_00024ff0 + 0x24fd4);
      fflush((FILE *)*puVar2);
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if (*(char *)(param_1 + 0x45) == '\0') {
      *(undefined1 *)(param_1 + 0x45) = 1;
      if (*(char *)(param_1 + 0x44) == '\x01') {
        FUN_000256a4();
      }
      else {
        FUN_0002569c(param_1 + 0x48);
      }
    }
  }
  *(undefined4 *)(param_1 + iVar1 + param_2 * 8) = param_3;
  *(undefined4 *)(param_1 + iVar1 + param_2 * 8 + 4) = param_4;
  return;
}


