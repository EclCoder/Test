/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005ceb0
 * Address  : 0005ceb0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005ceb0(int *param_1,uint param_2)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  uint extraout_r1;
  uint extraout_r1_00;
  uint uVar5;
  int *piVar6;
  int *piVar7;
  
  if (param_2 == 0) {
    iVar1 = *param_1;
    *param_1 = 0;
    if (iVar1 != 0) {
      FUN_00023f68(iVar1,param_1[1] << 2);
    }
    param_1[1] = 0;
  }
  else {
    if (0x3fffffff < param_2) {
                    /* WARNING: Subroutine does not return */
      FUN_00026984();
    }
    iVar1 = FUN_000a0370(param_2 << 2);
    iVar2 = *param_1;
    *param_1 = iVar1;
    if (iVar2 != 0) {
      FUN_00023f68(iVar2,param_1[1] << 2);
    }
    uVar4 = 0;
    param_1[1] = param_2;
    do {
      *(undefined4 *)(*param_1 + uVar4 * 4) = 0;
      uVar4 = uVar4 + 1;
    } while (param_2 != uVar4);
    piVar7 = param_1 + 2;
    piVar6 = (int *)*piVar7;
    if (piVar6 != (int *)0x0) {
      uVar4 = piVar6[1];
      uVar3 = param_2 - 1;
      if ((param_2 & uVar3) == 0) {
        *(int **)(*param_1 + (uVar4 & uVar3) * 4) = piVar7;
        uVar4 = uVar4 & uVar3;
        while (piVar7 = piVar6, piVar6 = (int *)*piVar7, piVar6 != (int *)0x0) {
          uVar5 = piVar6[1] & uVar3;
          if (uVar5 != uVar4) {
            iVar1 = *param_1;
            if (*(int *)(iVar1 + uVar5 * 4) == 0) {
              *(int **)(iVar1 + uVar5 * 4) = piVar7;
              uVar4 = uVar5;
            }
            else {
              *piVar7 = *piVar6;
              *piVar6 = **(undefined4 **)(iVar1 + uVar5 * 4);
              **(int **)(iVar1 + uVar5 * 4) = (int)piVar6;
              piVar6 = piVar7;
            }
          }
        }
      }
      else {
        if (param_2 <= uVar4) {
          FUN_000264a4(uVar4,param_2);
          uVar4 = extraout_r1;
        }
        *(int **)(*param_1 + uVar4 * 4) = piVar7;
        while (piVar7 = piVar6, piVar6 = (int *)*piVar7, piVar6 != (int *)0x0) {
          uVar3 = piVar6[1];
          if (param_2 <= uVar3) {
            FUN_000264a4(uVar3,param_2);
            uVar3 = extraout_r1_00;
          }
          if (uVar3 != uVar4) {
            iVar1 = *param_1;
            if (*(int *)(iVar1 + uVar3 * 4) == 0) {
              *(int **)(iVar1 + uVar3 * 4) = piVar7;
              uVar4 = uVar3;
            }
            else {
              *piVar7 = *piVar6;
              *piVar6 = **(int **)(iVar1 + uVar3 * 4);
              **(undefined4 **)(iVar1 + uVar3 * 4) = piVar6;
              piVar6 = piVar7;
            }
          }
        }
      }
    }
  }
  return;
}


