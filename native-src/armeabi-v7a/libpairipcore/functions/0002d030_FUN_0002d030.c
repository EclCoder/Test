/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002d030
 * Address  : 0002d030
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002d030(undefined4 *param_1,int param_2,uint param_3,int param_4)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  
  uVar3 = param_3;
  if (param_3 != 0) {
    do {
      uVar2 = uVar3;
      if (uVar2 == 0) goto LAB_0002d110;
      uVar3 = uVar2 - 1;
    } while (*(char *)(param_2 + uVar2 + -1) != '/');
    if (uVar3 != 0xffffffff) {
      if (param_4 == 1) goto LAB_0002d074;
      if (uVar3 != 0) {
        if (param_3 <= uVar2 - 2) {
          uVar3 = param_3;
        }
        do {
          uVar2 = uVar3;
          if (uVar2 == 0) goto LAB_0002d110;
          uVar4 = uVar2 - 1;
          uVar3 = uVar4;
        } while (*(char *)(param_2 + uVar2 + -1) != '/');
        if (uVar4 != 0xffffffff) {
          if (param_4 == 2) {
LAB_0002d074:
            *param_1 = 0;
            param_1[1] = uVar3;
            *(undefined1 *)(param_1 + 2) = 1;
            return;
          }
          if (uVar4 != 0) {
            uVar3 = param_3;
            if (uVar2 - 2 < param_3) {
              uVar3 = uVar4;
            }
            do {
              if (uVar3 == 0) goto LAB_0002d110;
              iVar1 = param_2 + uVar3;
              uVar3 = uVar3 - 1;
            } while (*(char *)(iVar1 + -1) != '/');
            if (uVar3 != 0xffffffff) goto LAB_0002d074;
          }
        }
      }
    }
  }
LAB_0002d110:
  *(undefined1 *)(param_1 + 1) = 0;
  *param_1 = 2;
  *(undefined1 *)(param_1 + 2) = 0;
  return;
}


