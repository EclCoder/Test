/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005df70
 * Address  : 0005df70
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005df70(uint param_1,int param_2,byte *param_3,uint param_4,int *param_5)

{
  byte bVar1;
  uint uVar2;
  int extraout_r1;
  int extraout_r1_00;
  int extraout_r1_01;
  int iVar3;
  byte *pbVar4;
  byte *pbVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  int iVar9;
  int iVar10;
  uint uVar11;
  bool bVar12;
  
  iVar3 = 2;
  uVar2 = param_1 << 3 | 2;
  uVar7 = param_2 << 3 | param_1 >> 0x1d;
  pbVar5 = (byte *)param_5[4];
  do {
    iVar8 = param_5[3];
    iVar10 = *param_5;
    iVar9 = (int)pbVar5 - iVar8;
    pbVar4 = (byte *)param_5[5];
    FUN_000264a4(iVar9,param_5[1] - iVar10,iVar3);
    bVar1 = *(byte *)(iVar10 + extraout_r1) ^
            ((byte)uVar2 & 0x7f | ((uint)(uVar2 < 0x80) <= -uVar7) << 7);
    if (pbVar5 < pbVar4) {
      pbVar4 = pbVar5 + 1;
      *pbVar5 = bVar1;
    }
    else {
      uVar6 = iVar9 + 1;
      if (iVar9 == -2 || (int)uVar6 < -1) goto LAB_0005e290;
      uVar11 = (int)pbVar4 - iVar8;
      if (uVar6 < uVar11 * 2) {
        uVar6 = uVar11 * 2;
      }
      if (0x3ffffffe < uVar11) {
        uVar6 = 0x7fffffff;
      }
      if (uVar6 == 0) {
        iVar3 = 0;
      }
      else {
        iVar3 = FUN_000a0370(uVar6);
      }
      *(byte *)(iVar3 + iVar9) = bVar1;
      __aeabi_memcpy(iVar3,iVar8,iVar9);
      pbVar4 = (byte *)(iVar3 + iVar9) + 1;
      param_5[3] = iVar3;
      param_5[4] = (int)pbVar4;
      param_5[5] = iVar3 + uVar6;
      if (iVar8 != 0) {
        FUN_00023f68(iVar8,uVar11);
      }
    }
    bVar12 = uVar2 < 0x80;
    uVar2 = uVar2 >> 7 | uVar7 << 0x19;
    uVar6 = -uVar7;
    iVar3 = -(uVar7 + !bVar12);
    param_5[4] = (int)pbVar4;
    uVar11 = param_4;
    uVar7 = uVar7 >> 7;
    pbVar5 = pbVar4;
  } while (bVar12 <= uVar6);
  do {
    iVar9 = param_5[3];
    iVar10 = *param_5;
    iVar8 = (int)pbVar4 - iVar9;
    pbVar5 = (byte *)param_5[5];
    FUN_000264a4(iVar8,param_5[1] - iVar10,iVar3);
    bVar1 = *(byte *)(iVar10 + extraout_r1_00) ^ ((byte)uVar11 & 0x7f | (0x7f < uVar11) << 7);
    if (pbVar4 < pbVar5) {
      pbVar5 = pbVar4 + 1;
      *pbVar4 = bVar1;
    }
    else {
      uVar7 = iVar8 + 1;
      if (iVar8 == -2 || (int)uVar7 < -1) goto LAB_0005e290;
      uVar2 = (int)pbVar5 - iVar9;
      if (uVar7 < uVar2 * 2) {
        uVar7 = uVar2 * 2;
      }
      if (0x3ffffffe < uVar2) {
        uVar7 = 0x7fffffff;
      }
      if (uVar7 == 0) {
        iVar3 = 0;
      }
      else {
        iVar3 = FUN_000a0370(uVar7);
      }
      *(byte *)(iVar3 + iVar8) = bVar1;
      __aeabi_memcpy(iVar3,iVar9,iVar8);
      pbVar5 = (byte *)(iVar3 + iVar8) + 1;
      param_5[3] = iVar3;
      param_5[4] = (int)pbVar5;
      param_5[5] = iVar3 + uVar7;
      if (iVar9 != 0) {
        FUN_00023f68(iVar9,uVar2);
      }
    }
    bVar12 = 0x7f < uVar11;
    iVar3 = -(uint)bVar12;
    param_5[4] = (int)pbVar5;
    uVar11 = uVar11 >> 7;
    pbVar4 = pbVar5;
  } while (bVar12);
  do {
    if (param_4 == 0) {
      return;
    }
    iVar9 = param_5[3];
    iVar8 = *param_5;
    iVar3 = (int)pbVar5 - iVar9;
    pbVar4 = (byte *)param_5[5];
    FUN_000264a4(iVar3,param_5[1] - iVar8);
    bVar1 = *(byte *)(iVar8 + extraout_r1_01) ^ *param_3;
    if (pbVar5 < pbVar4) {
      pbVar4 = pbVar5 + 1;
      *pbVar5 = bVar1;
    }
    else {
      uVar7 = iVar3 + 1;
      if (iVar3 == -2 || (int)uVar7 < -1) {
LAB_0005e290:
                    /* WARNING: Subroutine does not return */
        FUN_0002d020();
      }
      uVar2 = (int)pbVar4 - iVar9;
      if (uVar7 < uVar2 * 2) {
        uVar7 = uVar2 * 2;
      }
      if (0x3ffffffe < uVar2) {
        uVar7 = 0x7fffffff;
      }
      if (uVar7 == 0) {
        iVar8 = 0;
      }
      else {
        iVar8 = FUN_000a0370(uVar7);
      }
      *(byte *)(iVar8 + iVar3) = bVar1;
      __aeabi_memcpy(iVar8,iVar9,iVar3);
      pbVar4 = (byte *)(iVar8 + iVar3) + 1;
      param_5[3] = iVar8;
      param_5[4] = (int)pbVar4;
      param_5[5] = iVar8 + uVar7;
      if (iVar9 != 0) {
        FUN_00023f68(iVar9,uVar2);
      }
    }
    param_3 = param_3 + 1;
    param_5[4] = (int)pbVar4;
    param_4 = param_4 - 1;
    pbVar5 = pbVar4;
  } while( true );
}


