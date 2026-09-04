/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005db2c
 * Address  : 0005db2c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005db2c(uint param_1,int param_2,int *param_3,int *param_4)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  int extraout_r1;
  int extraout_r1_00;
  int extraout_r1_01;
  int extraout_r1_02;
  byte *pbVar8;
  byte *pbVar9;
  byte *pbVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  int iVar14;
  bool bVar15;
  uint local_38;
  uint local_34;
  byte *local_30;
  int local_28;
  
  uVar12 = 0;
  local_28 = **(int **)(DAT_0005df68 + 0x5db54);
  local_34 = 0;
  local_38 = 0;
  local_30 = (byte *)0x0;
  FUN_0001a07c(&local_38,param_3[4] - param_3[3]);
  iVar2 = param_3[3];
  iVar7 = param_3[4];
  if (iVar7 != iVar2) {
    do {
      if ((uint)(param_3[4] - param_3[3]) <= uVar12) {
                    /* WARNING: Subroutine does not return */
        FUN_0005d684();
      }
      iVar14 = *param_3;
      bVar1 = *(byte *)(param_3[3] + uVar12);
      FUN_000264a4(uVar12,param_3[1] - iVar14);
      FUN_0001a2cc(&local_38,*(byte *)(iVar14 + extraout_r1) ^ bVar1);
      uVar12 = uVar12 + 1;
    } while (iVar7 - iVar2 != uVar12);
  }
  pbVar8 = local_30;
  uVar12 = local_34;
  uVar13 = local_38;
  uVar3 = local_38 & 0xff;
  uVar4 = param_1 << 3 | 2;
  uVar6 = param_2 << 3 | param_1 >> 0x1d;
  pbVar10 = (byte *)param_4[4];
  do {
    iVar7 = param_4[3];
    iVar2 = *param_4;
    pbVar9 = (byte *)param_4[5];
    iVar14 = (int)pbVar10 - iVar7;
    FUN_000264a4(iVar14,param_4[1] - iVar2);
    bVar1 = *(byte *)(iVar2 + extraout_r1_00) ^
            ((byte)uVar4 & 0x7f | ((uint)(uVar4 < 0x80) <= -uVar6) << 7);
    if (pbVar10 < pbVar9) {
      pbVar9 = pbVar10 + 1;
      *pbVar10 = bVar1;
    }
    else {
      uVar11 = iVar14 + 1;
      if (iVar14 == -2 || (int)uVar11 < -1) goto LAB_0005df60;
      uVar5 = (int)pbVar9 - iVar7;
      if (uVar11 < uVar5 * 2) {
        uVar11 = uVar5 * 2;
      }
      if (0x3ffffffe < uVar5) {
        uVar11 = 0x7fffffff;
      }
      if (uVar11 == 0) {
        iVar2 = 0;
      }
      else {
        iVar2 = FUN_000a0370(uVar11);
      }
      *(byte *)(iVar2 + iVar14) = bVar1;
      __aeabi_memcpy(iVar2,iVar7,iVar14);
      pbVar9 = (byte *)(iVar2 + iVar14) + 1;
      param_4[3] = iVar2;
      param_4[4] = (int)pbVar9;
      param_4[5] = iVar2 + uVar11;
      if (iVar7 != 0) {
        FUN_00023f68(iVar7,uVar5);
      }
    }
    bVar15 = uVar4 < 0x80;
    uVar4 = uVar4 >> 7 | uVar6 << 0x19;
    uVar5 = -uVar6;
    uVar11 = uVar6 + !bVar15;
    param_4[4] = (int)pbVar9;
    uVar6 = uVar6 >> 7;
    pbVar10 = pbVar9;
  } while (bVar15 <= uVar5);
  uVar6 = uVar12;
  if ((uVar13 & 1) == 0) {
    uVar12 = uVar3 >> 1;
    uVar6 = uVar12;
  }
  do {
    iVar14 = param_4[3];
    iVar2 = *param_4;
    pbVar10 = (byte *)param_4[5];
    iVar7 = (int)pbVar9 - iVar14;
    FUN_000264a4(iVar7,param_4[1] - iVar2,-uVar11);
    bVar1 = *(byte *)(iVar2 + extraout_r1_01) ^ ((byte)uVar12 & 0x7f | (0x7f < uVar12) << 7);
    if (pbVar9 < pbVar10) {
      pbVar10 = pbVar9 + 1;
      *pbVar9 = bVar1;
    }
    else {
      uVar3 = iVar7 + 1;
      if (iVar7 == -2 || (int)uVar3 < -1) goto LAB_0005df60;
      uVar4 = (int)pbVar10 - iVar14;
      if (uVar3 < uVar4 * 2) {
        uVar3 = uVar4 * 2;
      }
      if (0x3ffffffe < uVar4) {
        uVar3 = 0x7fffffff;
      }
      if (uVar3 == 0) {
        iVar2 = 0;
      }
      else {
        iVar2 = FUN_000a0370(uVar3);
      }
      *(byte *)(iVar2 + iVar7) = bVar1;
      __aeabi_memcpy(iVar2,iVar14,iVar7);
      pbVar10 = (byte *)(iVar2 + iVar7) + 1;
      param_4[3] = iVar2;
      param_4[4] = (int)pbVar10;
      param_4[5] = iVar2 + uVar3;
      if (iVar14 != 0) {
        FUN_00023f68(iVar14,uVar4);
      }
    }
    bVar15 = 0x7f < uVar12;
    uVar12 = uVar12 >> 7;
    uVar11 = (uint)bVar15;
    param_4[4] = (int)pbVar10;
    pbVar9 = pbVar10;
  } while (bVar15);
  if ((uVar13 & 1) == 0) {
    pbVar8 = (byte *)((uint)&local_38 | 1);
  }
  do {
    if (uVar6 == 0) {
      if ((local_38 & 1) != 0) {
        FUN_00023f68(local_30,local_38 & 0xfffffffe);
      }
      if (**(int **)(DAT_0005df6c + 0x5de70) == local_28) {
        return;
      }
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    iVar14 = param_4[3];
    iVar7 = *param_4;
    iVar2 = (int)pbVar10 - iVar14;
    pbVar9 = (byte *)param_4[5];
    FUN_000264a4(iVar2,param_4[1] - iVar7);
    bVar1 = *(byte *)(iVar7 + extraout_r1_02) ^ *pbVar8;
    if (pbVar10 < pbVar9) {
      pbVar9 = pbVar10 + 1;
      *pbVar10 = bVar1;
    }
    else {
      uVar12 = iVar2 + 1;
      if (iVar2 == -2 || (int)uVar12 < -1) {
LAB_0005df60:
                    /* WARNING: Subroutine does not return */
        FUN_0002d020();
      }
      uVar13 = (int)pbVar9 - iVar14;
      if (uVar12 < uVar13 * 2) {
        uVar12 = uVar13 * 2;
      }
      if (0x3ffffffe < uVar13) {
        uVar12 = 0x7fffffff;
      }
      if (uVar12 == 0) {
        iVar7 = 0;
      }
      else {
        iVar7 = FUN_000a0370(uVar12);
      }
      *(byte *)(iVar7 + iVar2) = bVar1;
      __aeabi_memcpy(iVar7,iVar14,iVar2);
      pbVar9 = (byte *)(iVar7 + iVar2) + 1;
      param_4[3] = iVar7;
      param_4[4] = (int)pbVar9;
      param_4[5] = iVar7 + uVar12;
      if (iVar14 != 0) {
        FUN_00023f68(iVar14,uVar13);
      }
    }
    pbVar8 = pbVar8 + 1;
    param_4[4] = (int)pbVar9;
    uVar6 = uVar6 - 1;
    pbVar10 = pbVar9;
  } while( true );
}


