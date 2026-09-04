/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000245ac
 * Address  : 000245ac
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4
FUN_000245ac(undefined4 param_1,int param_2,uint param_3,uint param_4,undefined4 *param_5)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 *puVar3;
  
  if (param_2 == 5) {
    if (param_4 != 0 || param_3 != 0) {
      return 2;
    }
    uVar2 = *param_5;
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
      iVar1 = FUN_00024c6c(param_1,param_3 + 0x100,*param_5,param_5[1]);
      goto LAB_0002460c;
    }
    if (param_2 != 0) {
      puVar3 = *(undefined4 **)(DAT_00024638 + 0x2461a);
      fprintf((FILE *)*puVar3,(char *)(DAT_0002463c + 0x24626),DAT_00024640 + 0x24628,
              DAT_00024644 + 0x2462a);
      fflush((FILE *)*puVar3);
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if ((param_4 != 0) || (0xf < param_3)) {
      return 2;
    }
    uVar2 = *param_5;
  }
  iVar1 = FUN_00024bc8(param_1,param_3,uVar2);
LAB_0002460c:
  uVar2 = 0;
  if (iVar1 != 0) {
    uVar2 = 2;
  }
  return uVar2;
}


