/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005d2b0
 * Address  : 0005d2b0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005d2b0(int *param_1,int param_2,uint param_3)

{
  longlong lVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  bool bVar9;
  undefined8 uVar10;
  int local_30;
  int local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_0005d4d0 + 0x5d2cc);
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if (param_3 != 0) {
    if ((int)param_3 < 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0002d020();
    }
    iVar3 = FUN_000a0370(param_3);
    param_1[2] = iVar3 + param_3;
    *param_1 = iVar3;
    __aeabi_memclr(iVar3,param_3);
    iVar2 = DAT_0005d4d4;
    param_1[1] = iVar3 + param_3;
    piVar4 = (int *)FUN_00025e6c(iVar2 + 0x5d328);
    uVar6 = 0;
    do {
      uVar8 = 0;
      uVar7 = 0;
      do {
        while( true ) {
          while (uVar5 = FUN_00019718(3,*(undefined4 *)(param_2 + 4),iVar3 + uVar8,param_3 - uVar8),
                0xfffff000 < uVar5) {
            *piVar4 = -uVar5;
            if (uVar5 != 0xfffffffc) goto LAB_0005d3e0;
          }
          if (uVar5 < 0x80000000) break;
          if (*piVar4 != 4) goto LAB_0005d3e0;
        }
        if (uVar5 == 0) break;
        bVar9 = CARRY4(uVar8,uVar5);
        uVar8 = uVar8 + uVar5;
        uVar7 = uVar7 + bVar9;
      } while (uVar7 == 0 && (param_3 <= uVar8) <= uVar7);
    } while ((uVar8 != 0) && (uVar6 = uVar8 + uVar6, uVar6 < param_3));
LAB_0005d3e0:
    if (uVar6 < param_3) {
      uVar7 = FUN_00019718(0x107,0,&local_30);
      if (0xfffff000 < uVar7) {
        *piVar4 = -uVar7;
      }
      uVar5 = 0;
      iVar3 = uVar6 + iVar3;
      lVar1 = (longlong)local_30 * 1000000000 + (longlong)local_2c;
      uVar10 = FUN_00026020((int)lVar1,(int)((ulonglong)lVar1 >> 0x20),1000000,0);
      uVar7 = (uint)uVar10 * 0x10000;
      uVar8 = FUN_00019718(0x14);
      if (0xfffff000 < uVar8) {
        *piVar4 = -uVar8;
        uVar8 = 0xffffffff;
      }
      local_30 = uVar7 + uVar8;
      local_2c = ((int)((ulonglong)uVar10 >> 0x20) << 0x10 | (uint)uVar10 >> 0x10) +
                 ((int)uVar8 >> 0x1f) + (uint)CARRY4(uVar7,uVar8);
      uVar7 = param_3 - uVar6;
      do {
        uVar8 = uVar7;
        if (7 < uVar7) {
          uVar8 = 8;
        }
        __aeabi_memcpy(iVar3,&local_30,uVar8);
        uVar5 = uVar5 + 8;
        iVar3 = iVar3 + uVar8;
        uVar7 = uVar7 - 8;
      } while (uVar5 < param_3 - uVar6);
    }
  }
  if (**(int **)(DAT_0005d4d8 + 0x5d4b8) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


