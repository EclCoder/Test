/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024514
 * Address  : 00024514
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_00024514(undefined4 param_1,int param_2,uint param_3,uint param_4,undefined4 param_5)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 *puVar3;
  
  if (param_2 == 5) {
    if (param_4 != 0 || param_3 != 0) {
      return 2;
    }
    param_3 = 0x8f;
  }
  else {
    if (param_2 == 1) {
      if ((param_4 & 0xfffffffb) != 1) {
        return 2;
      }
      if (param_4 == 1) {
        if (0xf < param_3) {
          return 2;
        }
        FUN_00024cd8(param_1);
      }
      else if (0x1f < param_3) {
        return 2;
      }
      iVar1 = FUN_00024c40(param_1,param_3 + 0x100,param_5);
      goto LAB_00024570;
    }
    if (param_2 != 0) {
      puVar3 = *(undefined4 **)(DAT_0002459c + 0x2457e);
      fprintf((FILE *)*puVar3,(char *)(DAT_000245a0 + 0x2458a),DAT_000245a4 + 0x2458c,
              DAT_000245a8 + 0x2458e);
      fflush((FILE *)*puVar3);
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if ((param_4 != 0) || (0xf < param_3)) {
      return 2;
    }
  }
  iVar1 = FUN_00024b9c(param_1,param_3,param_5);
LAB_00024570:
  uVar2 = 0;
  if (iVar1 != 0) {
    uVar2 = 2;
  }
  return uVar2;
}


