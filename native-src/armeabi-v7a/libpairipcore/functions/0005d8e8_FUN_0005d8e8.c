/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005d8e8
 * Address  : 0005d8e8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0005d8e8(uint param_1,int param_2,uint param_3,uint param_4,int *param_5)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int extraout_r1;
  int extraout_r1_00;
  byte *pbVar5;
  uint uVar6;
  int iVar7;
  byte *pbVar8;
  int iVar9;
  int iVar10;
  bool bVar11;
  
  uVar2 = param_1 << 3;
  uVar4 = param_2 << 3 | param_1 >> 0x1d;
  uVar6 = param_3;
  pbVar8 = (byte *)param_5[4];
  do {
    iVar7 = param_5[3];
    iVar10 = *param_5;
    iVar9 = (int)pbVar8 - iVar7;
    pbVar5 = (byte *)param_5[5];
    FUN_000264a4(iVar9,param_5[1] - iVar10,uVar6);
    bVar1 = *(byte *)(iVar10 + extraout_r1) ^
            ((byte)uVar2 & 0x7f | ((uint)(uVar2 < 0x80) <= -uVar4) << 7);
    if (pbVar8 < pbVar5) {
      pbVar5 = pbVar8 + 1;
      *pbVar8 = bVar1;
    }
    else {
      uVar6 = iVar9 + 1;
      if (iVar9 == -2 || (int)uVar6 < -1) goto LAB_0005db28;
      uVar3 = (int)pbVar5 - iVar7;
      if (uVar6 < uVar3 * 2) {
        uVar6 = uVar3 * 2;
      }
      if (0x3ffffffe < uVar3) {
        uVar6 = 0x7fffffff;
      }
      if (uVar6 == 0) {
        iVar10 = 0;
      }
      else {
        iVar10 = FUN_000a0370(uVar6);
      }
      *(byte *)(iVar10 + iVar9) = bVar1;
      __aeabi_memcpy(iVar10,iVar7,iVar9);
      pbVar5 = (byte *)(iVar10 + iVar9) + 1;
      param_5[3] = iVar10;
      param_5[4] = (int)pbVar5;
      param_5[5] = iVar10 + uVar6;
      if (iVar7 != 0) {
        FUN_00023f68(iVar7,uVar3);
      }
    }
    bVar11 = uVar2 < 0x80;
    uVar2 = uVar2 >> 7 | uVar4 << 0x19;
    uVar3 = -uVar4;
    uVar6 = -(uVar4 + !bVar11);
    param_5[4] = (int)pbVar5;
    uVar4 = uVar4 >> 7;
    pbVar8 = pbVar5;
  } while (bVar11 <= uVar3);
  do {
    iVar10 = param_5[3];
    iVar9 = *param_5;
    pbVar8 = (byte *)param_5[5];
    iVar7 = (int)pbVar5 - iVar10;
    FUN_000264a4(iVar7,param_5[1] - iVar9);
    bVar1 = *(byte *)(iVar9 + extraout_r1_00) ^
            ((byte)param_3 & 0x7f | ((uint)(param_3 < 0x80) <= -param_4) << 7);
    if (pbVar5 < pbVar8) {
      pbVar8 = pbVar5 + 1;
      *pbVar5 = bVar1;
    }
    else {
      uVar2 = iVar7 + 1;
      if (iVar7 == -2 || (int)uVar2 < -1) {
LAB_0005db28:
                    /* WARNING: Subroutine does not return */
        FUN_0002d020();
      }
      uVar6 = (int)pbVar8 - iVar10;
      if (uVar2 < uVar6 * 2) {
        uVar2 = uVar6 * 2;
      }
      if (0x3ffffffe < uVar6) {
        uVar2 = 0x7fffffff;
      }
      if (uVar2 == 0) {
        iVar9 = 0;
      }
      else {
        iVar9 = FUN_000a0370(uVar2);
      }
      *(byte *)(iVar9 + iVar7) = bVar1;
      __aeabi_memcpy(iVar9,iVar10,iVar7);
      pbVar8 = (byte *)(iVar9 + iVar7) + 1;
      param_5[3] = iVar9;
      param_5[4] = (int)pbVar8;
      param_5[5] = iVar9 + uVar2;
      if (iVar10 != 0) {
        FUN_00023f68(iVar10,uVar6);
      }
    }
    bVar11 = param_3 < 0x80;
    uVar2 = -param_4;
    iVar7 = param_4 + !bVar11;
    param_5[4] = (int)pbVar8;
    param_3 = param_3 >> 7 | param_4 << 0x19;
    param_4 = param_4 >> 7;
    pbVar5 = pbVar8;
    if (uVar2 < bVar11) {
      return -iVar7;
    }
  } while( true );
}


