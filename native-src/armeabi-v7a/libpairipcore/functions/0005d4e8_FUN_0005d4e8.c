/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005d4e8
 * Address  : 0005d4e8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005d4e8(int *param_1,undefined4 param_2,uint param_3)

{
  longlong lVar1;
  uint uVar2;
  int *piVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  undefined8 uVar7;
  int local_30;
  int local_2c;
  int local_24;
  
  iVar5 = 0;
  local_24 = **(int **)(DAT_0005d664 + 0x5d508);
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if (param_3 != 0) {
    if ((int)param_3 < 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0002d020();
    }
    iVar5 = FUN_000a0370(param_3);
    param_1[2] = iVar5 + param_3;
    *param_1 = iVar5;
    __aeabi_memclr(iVar5,param_3);
    param_1[1] = iVar5 + param_3;
  }
  uVar2 = FUN_00019718(0x107,0,&local_30);
  if (0xfffff000 < uVar2) {
    piVar3 = (int *)FUN_00025e6c(DAT_0005d668 + 0x5d580);
    *piVar3 = -uVar2;
  }
  lVar1 = (longlong)local_30 * 1000000000 + (longlong)local_2c;
  uVar7 = FUN_00026020((int)lVar1,(int)((ulonglong)lVar1 >> 0x20),1000000,0);
  uVar2 = (uint)uVar7 * 0x10000;
  uVar4 = FUN_00019718(0x14);
  if (0xfffff000 < uVar4) {
    piVar3 = (int *)FUN_00025e6c(DAT_0005d66c + 0x5d5dc);
    *piVar3 = -uVar4;
    uVar4 = 0xffffffff;
  }
  local_30 = uVar2 + uVar4;
  local_2c = ((int)((ulonglong)uVar7 >> 0x20) << 0x10 | (uint)uVar7 >> 0x10) + ((int)uVar4 >> 0x1f)
             + (uint)CARRY4(uVar2,uVar4);
  if (param_3 != 0) {
    uVar4 = 0;
    uVar2 = param_3;
    do {
      uVar6 = uVar2;
      if (7 < uVar2) {
        uVar6 = 8;
      }
      __aeabi_memcpy(iVar5,&local_30,uVar6);
      uVar4 = uVar4 + 8;
      iVar5 = iVar5 + uVar6;
      uVar2 = uVar2 - 8;
    } while (uVar4 < param_3);
  }
  if (**(int **)(DAT_0005d670 + 0x5d64c) != local_24) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


